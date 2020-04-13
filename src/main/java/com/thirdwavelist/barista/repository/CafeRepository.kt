package com.thirdwavelist.barista.repository

import com.google.cloud.firestore.DocumentReference
import com.google.firebase.cloud.FirestoreClient
import com.thirdwavelist.barista.entity.Cafe
import com.thirdwavelist.barista.mapper.mapToEntity
import com.thirdwavelist.barista.model.CafeFirebase
import com.thirdwavelist.barista.model.CityFirebase
import org.springframework.stereotype.Repository
import java.lang.Exception
import java.util.*
import java.util.concurrent.ExecutionException

@Repository
open class CafeRepository {

    fun getById(id: String): Collection<Cafe> {
        val dbFirestore = FirestoreClient.getFirestore()
        try {
            val document = dbFirestore.collection(COLLECTION_NAME).document(id).get().get()
            if (document.exists()) {
                val obj = document.toObject(CafeFirebase::class.java)
                if (obj != null) {
                    obj.mapToEntity()?.let {
                        return listOf(it)
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } catch (e: ExecutionException) {
            e.printStackTrace()
        }
        return emptyList()
    }

    fun getAll(): Collection<Cafe> {
        val dbFirestore = FirestoreClient.getFirestore()
        try {
            val query = dbFirestore.collection(COLLECTION_NAME).get()
            val documents = query.get().documents
            val results = ArrayList<Cafe>(documents.size)
            for (document in documents) {
                if (document.exists()) {
                    val obj = document.toObject(CafeFirebase::class.java)
                    obj.cityObj = fetchCityForGiven(obj.city!!)
                    obj.mapToEntity()?.let {
                        results.add(it)
                    }
                }
            }
            return results
        } catch (e: InterruptedException) {
            e.printStackTrace()
        } catch (e: ExecutionException) {
            e.printStackTrace()
        }
        return emptyList()
    }

    private fun fetchCityForGiven(cityDocumentReference: DocumentReference): CityFirebase? {
        val dbFirestore = FirestoreClient.getFirestore()
        try {
            val documentFuture = dbFirestore
                    .collection(CityRepository.COLLECTION_NAME)
                    .document(cityDocumentReference.id)
                    .get()
            val document = documentFuture.get()
            if (document.exists()) {
                return document.toObject(CityFirebase::class.java)
            }
        } catch (e: InterruptedException) {
            e.printStackTrace()
        } catch (e: ExecutionException) {
            e.printStackTrace()
        }
        return null
    }

    internal companion object {
        const val COLLECTION_NAME = "cafe"
    }
}