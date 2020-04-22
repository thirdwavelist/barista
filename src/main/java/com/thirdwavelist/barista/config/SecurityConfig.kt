package com.thirdwavelist.barista.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableWebSecurity
@Configuration
open class SecurityConfig : WebSecurityConfigurerAdapter() {
    @Value("\${webSecurity.requireSsl}")
    private val requireHttps: Boolean = false

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        if (requireHttps) {
            http.requiresChannel().anyRequest().requiresSecure()
        }
    }
}