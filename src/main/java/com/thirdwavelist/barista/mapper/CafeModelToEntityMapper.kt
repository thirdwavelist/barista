package com.thirdwavelist.barista.mapper

import com.thirdwavelist.barista.entity.Cafe
import com.thirdwavelist.barista.model.CafeFirebase

fun CafeFirebase.mapToEntity(): Cafe? {
    return if (isValid()) Cafe(
            id!!,
            name!!,
            cityObj!!.mapToEntity()!!,
            address!!,
            instagramId,
            googlePlaceId,
            location!!.mapToEntity()
    ) else null
}

fun CafeFirebase.isValid() =
        id.isNullOrBlank().not() &&
                name.isNullOrBlank().not() &&
                cityObj != null && cityObj!!.isValid() &&
                address.isNullOrBlank().not() &&
                location != null
