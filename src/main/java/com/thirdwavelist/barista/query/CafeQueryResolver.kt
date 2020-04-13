package com.thirdwavelist.barista.query

import com.thirdwavelist.barista.entity.Cafe
import com.thirdwavelist.barista.service.CafeService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Service

@Service
class CafeQueryResolver(private val cafeService: CafeService) : GraphQLQueryResolver {

    fun cafe(id: String?): Collection<Cafe> {
        return if (!id.isNullOrBlank()) {
            cafeService.getById(id)
        } else {
            cafeService.getAll()
        }
    }

}