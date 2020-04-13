package com.thirdwavelist.barista.service

import com.thirdwavelist.barista.entity.City
import com.thirdwavelist.barista.repository.CityRepository
import org.springframework.stereotype.Service

@Service
class CityService(private val cityRepository: CityRepository) {
    fun getAll(): Collection<City> {
        return cityRepository.getAll()
    }

    fun getById(id: String): Collection<City> {
        return cityRepository.getById(id)
    }
}