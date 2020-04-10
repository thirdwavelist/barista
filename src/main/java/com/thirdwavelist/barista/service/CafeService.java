package com.thirdwavelist.barista.service;

import com.thirdwavelist.barista.entity.Cafe;
import com.thirdwavelist.barista.repository.CafeRepository;
import org.springframework.stereotype.Service;

@Service
public class CafeService {
    private final CafeRepository cafeRepository;

    public CafeService(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }

    public Cafe getCafe(String id) {
        return cafeRepository.findById(id).map(it ->
                new Cafe(it.getId(),
                        it.getName())
        ).block();
    }
}