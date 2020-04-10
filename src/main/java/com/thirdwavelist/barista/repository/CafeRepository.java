package com.thirdwavelist.barista.repository;

import com.thirdwavelist.barista.entity.CafeDto;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;

public interface CafeRepository extends FirestoreReactiveRepository<CafeDto> {
}