package by.zmitser.msscbrewery.client

import by.zmitser.web.client.BeerClient
import by.zmitser.web.model.BeerDto
import io.micronaut.http.HttpResponse
import io.micronaut.test.annotation.MicronautTest

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import java.util.UUID.randomUUID

@MicronautTest
class BeerClientTest(private val client: BeerClient) {


    @Test
    fun findOneTest() {
        val findOne: HttpResponse<BeerDto> = client.findOne(randomUUID())
        assertNotNull(findOne)
    }
}