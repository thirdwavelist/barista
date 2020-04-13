package com.thirdwavelist.barista.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

@Configuration
open class JacksonConfig {
    @Primary
    @Bean
    open fun jacksonObjectMapper(builder: Jackson2ObjectMapperBuilder): ObjectMapper {
        return builder.build()
    }
}