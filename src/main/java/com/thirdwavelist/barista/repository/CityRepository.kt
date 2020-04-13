package com.thirdwavelist.barista.repository

import com.google.firebase.cloud.FirestoreClient
import com.thirdwavelist.barista.entity.City
import com.thirdwavelist.barista.mapper.mapToEntity
import com.thirdwavelist.barista.model.CityFirebase
import org.springframework.stereotype.Repository
import java.lang.Exception
import java.util.ArrayList
import java.util.concurrent.ExecutionException

@Repository
open class CityRepository {

    fun getById(id: String): Collection<City> {
        val dbFirestore = FirestoreClient.getFirestore()
        try {
            val document = dbFirestore.collection(COLLECTION_NAME).document(id).get().get()
            if (document.exists()) {
                val obj = document.toObject(CityFirebase::class.java)
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

    fun getAll(): Collection<City> {
        val dbFirestore = FirestoreClient.getFirestore()
        try {
            val query = dbFirestore.collection(COLLECTION_NAME).get()
            val documents = query.get().documents
            val results = ArrayList<City>(documents.size)
            for (document in documents) {
                if (document.exists()) {
                    val obj = document.toObject(CityFirebase::class.java)
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

    internal companion object {
        const val COLLECTION_NAME = "city"
    }
}