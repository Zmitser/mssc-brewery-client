package by.zmitser

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("by.zmitser")
                .mainClass(Application.javaClass)
                .start()
    }
}