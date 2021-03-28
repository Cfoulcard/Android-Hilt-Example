package com.example.hilt_example.bowstuff

import javax.inject.Inject

class Bow
@Inject
constructor() : BowData {

    override fun bowType(): String {
        return "Normal".toLowerCase()
    }

    override fun bowLength(): Int {
        return 21
    }

    override fun bowDurability(): Int {
        return 100
    }

    override fun bowArrowType(): String {
        return "Wood"
    }

    override fun arrowsLeft(): Int {
        return 7
    }
}