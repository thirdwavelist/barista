package com.thirdwavelist.barista.service

import com.thirdwavelist.barista.entity.Cafe
import com.thirdwavelist.barista.repository.CafeRepository
import org.springframework.stereotype.Service

@Service
class CafeService(private val cafeRepository: CafeRepository) {
    fun getAll(): Collection<Cafe> {
        return cafeRepository.getAll()
    }

    fun getById(id: String): Collection<Cafe> {
        return cafeRepository.getById(id)
    }
}