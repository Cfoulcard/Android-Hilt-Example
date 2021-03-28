package com.example.hilt_example.bowstuff

import javax.inject.Inject

class LongBow
@Inject
constructor(): BowData {
    override fun bowType(): String {
        return "Metal".toLowerCase()
    }

    override fun bowLength(): Int {
        return 28
    }

    override fun bowDurability(): Int {
        return 150
    }

    override fun bowArrowType(): String {
        return "Steel"
    }

    override fun arrowsLeft(): Int {
        return 10
    }
}