package com.thirdwavelist.barista.query

import com.thirdwavelist.barista.entity.City
import com.thirdwavelist.barista.service.CityService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Service

@Service
class CityQueryResolver(private val cityService: CityService) : GraphQLQueryResolver {

    fun city(id: String?): Collection<City> {
        return if (!id.isNullOrBlank()) {
            cityService.getById(id)
        } else {
            cityService.getAll()
        }
    }

}
