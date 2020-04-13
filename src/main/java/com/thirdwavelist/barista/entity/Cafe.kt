package com.thirdwavelist.barista.entity

data class Cafe(val id: String,
           val name: String,
           val city: City,
           val address: String,
           val instagramId: String?,
           val googlePlaceId: String?,
           val location: Location)