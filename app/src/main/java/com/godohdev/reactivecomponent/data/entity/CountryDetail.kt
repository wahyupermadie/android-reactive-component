package com.godohdev.reactivecomponent.data.entity

import com.squareup.moshi.Json

/**
 *
 * Created by Wahyu Permadi on 14/05/20.
 * Android Engineer
 *
 **/

data class CountryDetail(

    @Json(name="pattern")
    val pattern: String? = null,

    @Json(name="example")
    val example: String? = null
)