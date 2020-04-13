package com.thirdwavelist.barista.model

import com.google.cloud.firestore.DocumentReference
import com.google.cloud.firestore.GeoPoint
import com.google.cloud.firestore.annotation.DocumentId
import com.google.cloud.firestore.annotation.Exclude
import com.google.cloud.firestore.annotation.IgnoreExtraProperties
import org.springframework.cloud.gcp.data.firestore.Document

@Document(collectionName = "cafe")
@IgnoreExtraProperties
data class CafeFirebase(
        @DocumentId
        var id: String? = null,
        var name: String? = null,
        var city: DocumentReference? = null,
        var address: String? = null,
        var instagramId: String? = null,
        var googlePlaceId: String? = null,
        var location: GeoPoint? = null,
        @Exclude
        var cityObj: CityFirebase? = null
)