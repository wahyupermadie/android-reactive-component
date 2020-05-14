package com.godohdev.reactivecomponent.data.entity

import com.squareup.moshi.Json

data class ResponseGlobalCase(

	@Json(name="dailyTimeSeries")
	val dailyTimeSeries: DailyTimeSeries? = null,

	@Json(name="image")
	val image: String? = null,

	@Json(name="recovered")
	val recovered: Recovered? = null,

	@Json(name="dailySummary")
	val dailySummary: String? = null,

	@Json(name="lastUpdate")
	val lastUpdate: String? = null,

	@Json(name="countryDetail")
	val countryDetail: CountryDetail? = null,

	@Json(name="source")
	val source: String? = null,

	@Json(name="countries")
	val countries: String? = null,

	@Json(name="confirmed")
	val confirmed: Confirmed? = null,

	@Json(name="deaths")
	val deaths: Deaths? = null
)
