package com.thirdwavelist.barista.mapper

import com.thirdwavelist.barista.entity.City
import com.thirdwavelist.barista.model.CityFirebase

fun CityFirebase.mapToEntity(): City? {
    return if (isValid()) City(
            cityName!!,
            country_code!!,
            location!!.mapToEntity()
    ) else null
}

fun CityFirebase.isValid() =
    cityName.isNullOrBlank().not() && country_code.isNullOrBlank().not() && location != null