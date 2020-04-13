package com.thirdwavelist.barista.model

import com.google.cloud.firestore.GeoPoint
import com.google.cloud.firestore.annotation.DocumentId
import com.google.cloud.firestore.annotation.IgnoreExtraProperties
import org.springframework.cloud.gcp.data.firestore.Document

@Document(collectionName = "city")
@IgnoreExtraProperties
data class CityFirebase(
        @DocumentId
        var cityName: String? = null,
        var country_code: String? = null,
        var location: GeoPoint? = null
)