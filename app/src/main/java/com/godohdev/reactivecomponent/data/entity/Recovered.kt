package com.godohdev.reactivecomponent.data.entity

import com.squareup.moshi.Json

/**
 *
 * Created by Wahyu Permadi on 14/05/20.
 * Android Engineer
 *
 **/

data class Recovered(

    @Json(name="detail")
    val detail: String? = null,

    @Json(name="value")
    val value: Int? = null
)