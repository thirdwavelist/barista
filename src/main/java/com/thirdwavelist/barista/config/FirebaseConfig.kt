package com.thirdwavelist.barista.config

import com.google.auth.oauth2.GoogleCredentials
import com.google.cloud.firestore.Firestore
import com.google.cloud.firestore.FirestoreOptions
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import java.io.IOException

@Configuration
open class FirebaseConfig {
    @Value("\${firebase.databaseUrl}")
    lateinit var firebaseDatabaseUrl: String

    @Primary
    @Bean
    @Throws(IOException::class)
    open fun firebaseInit() {
        val options = FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.getApplicationDefault())
                .setDatabaseUrl(firebaseDatabaseUrl)
                .build()
        if (FirebaseApp.getApps().isEmpty()) {
            FirebaseApp.initializeApp(options)
        }
    }

    @Throws(IOException::class)
    @Bean
    open fun getFirebaseDatabase(): Firestore = FirestoreOptions.newBuilder()
            .setCredentials(GoogleCredentials.getApplicationDefault())
            .build()
            .service
}