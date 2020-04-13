package com.thirdwavelist.barista.repository;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import com.thirdwavelist.barista.entity.Cafe;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@Repository
public class CafeRepository {

    public CafeRepository() {

    }

    public Collection<Cafe> getById(String id) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        try {
            DocumentReference docRef = dbFirestore.collection("cafe").document(id);
            ApiFuture<DocumentSnapshot> future = docRef.get();
            DocumentSnapshot document = future.get();

            if (document.exists()) {
                return Collections.singletonList(document.toObject(Cafe.class));
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public Collection<Cafe> getAll() {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        try {
            ApiFuture<QuerySnapshot> query = dbFirestore.collection("cafe").get();
            List<QueryDocumentSnapshot> documents = query.get().getDocuments();
            ArrayList<Cafe> results = new ArrayList<>(documents.size());
            for (DocumentSnapshot document : documents) {
                if (document.exists()) {
                    results.add(document.toObject(Cafe.class));
                }
            }
            return results;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}