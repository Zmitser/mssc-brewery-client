package by.zmitser.msscbrewery.client

import by.zmitser.msscbreweryclient.web.client.BeerClient
import by.zmitser.msscbreweryclient.web.model.BeerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.HttpStatus.*
import io.micronaut.test.annotation.MicronautTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals

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

    @Test
    fun saveTest() {
        val beer = BeerDto("New Beer for me", "Pale Ale")
        val savedBeer = client.save(beer)
        assertNotNull(savedBeer)
        assertEquals(savedBeer.status, CREATED)
    }

    @Test
    fun updateTest() {
        val beer = BeerDto("Updated Beer for me", "Pale Ale")
        client.update(randomUUID(), beer)
    }
}