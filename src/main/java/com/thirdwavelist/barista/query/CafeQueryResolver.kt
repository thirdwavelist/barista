package com.thirdwavelist.barista.query

import com.thirdwavelist.barista.entity.Cafe

import com.thirdwavelist.barista.service.CafeService

import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Service

@Service
class CafeQueryResolver(private val cafeService: CafeService) : GraphQLQueryResolver {
    fun cafe(): Collection<Cafe> {
        return cafeService.all
    }

    fun cafe(id: String): Collection<Cafe> {
        return cafeService.getCafe(id)
    }
}