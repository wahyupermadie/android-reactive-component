package com.godohdev.reactivecomponent.di

import android.os.SystemClock
import com.godohdev.reactivecomponent.BuildConfig.BASE_URL
import com.godohdev.reactivecomponent.data.network.ApiService
import okhttp3.Dispatcher
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 *
 * Created by Wahyu Permadi on 14/05/20.
 * Android Engineer
 *
 **/

val networkModule = module {
    single { createOkHttpClient() }
    factory { apiService<ApiService>(get()) }
}

fun createOkHttpClient() : OkHttpClient {
    val httpInterceptor = HttpLoggingInterceptor()
    val dispatcher = Dispatcher()
    dispatcher.maxRequests = 1

    val interceptor = Interceptor { chain ->
        SystemClock.sleep(1000)
        chain.proceed(chain.request())
    }

    httpInterceptor.level = HttpLoggingInterceptor.Level.BASIC

    return OkHttpClient.Builder().addInterceptor(httpInterceptor)
        .addNetworkInterceptor(interceptor)
        .dispatcher(dispatcher)
        .build()
}

inline fun <reified T> apiService(okHttpClient: OkHttpClient) : T {
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    return retrofit.create(T::class.java)
}