package com.thirdwavelist.barista.query

import com.thirdwavelist.barista.model.Cafe

import com.thirdwavelist.barista.service.CafeService

import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class CafeQueryResolver(private val cafeService: CafeService) : GraphQLQueryResolver {
    fun cafe(): Collection<Cafe> {
        return cafeService.cafe
    }

    fun cafe(guidLiteral: String): Collection<Cafe> {
        return cafeService.getCafe(UUID.fromString(guidLiteral))
    }
}