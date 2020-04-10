package com.thirdwavelist.barista.entity;

import com.google.cloud.firestore.annotation.DocumentId;
import org.springframework.cloud.gcp.data.firestore.Document;

@Document(collectionName = "cafe")
public class CafeDto {
    @DocumentId
    private String id;
    private String name;

    CafeDto() {

    }

    public CafeDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
