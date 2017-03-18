package com.github.mcbeelen.fp.oo

import io.kotlintest.specs.ShouldSpec

class GreeterTest : ShouldSpec() {
    init {
        should("say Hello World") {
            Greeter().greet("Hello", "World") shouldBe "Hello, World!"
        }
    }
}