package com.thirdwavelist.barista.check

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator
import org.springframework.stereotype.Component

@Component
class CustomHealthIndicator : HealthIndicator {
    private val isHealthy = true
    override fun health(): Health {
        return if (isHealthy) Health.up().build() else Health.down().build()
    }
}