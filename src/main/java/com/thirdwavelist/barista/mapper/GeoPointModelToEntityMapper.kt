package com.thirdwavelist.barista.mapper

import com.google.cloud.firestore.GeoPoint
import com.thirdwavelist.barista.entity.Location

fun GeoPoint.mapToEntity() = Location(
        this.latitude,
        this.longitude
)