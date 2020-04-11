package com.thirdwavelist.barista.service;

import com.thirdwavelist.barista.entity.Cafe;
import com.thirdwavelist.barista.repository.CafeRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CafeService {
    private final CafeRepository cafeRepository;

    public CafeService(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }

    public Collection<Cafe> getAll() {
        return cafeRepository.getAll();
    }

    public Collection<Cafe> getCafe(String id) {
        return cafeRepository.getById(id);
    }
}