package by.zmitser.msscbrewery.client

import by.zmitser.msscbreweryclient.web.client.CustomerClient
import by.zmitser.web.model.CustomerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus.CREATED
import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import java.util.UUID.randomUUID

@MicronautTest
class CustomerClientTest(private val client: CustomerClient) {

    @Test
    fun findOneTest() {
        val findOne: HttpResponse<CustomerDto> = client.findOne(randomUUID())
        assertNotNull(findOne)
    }

    @Test
    fun saveTest() {
        val beer = CustomerDto(randomUUID(), "Pale Ale")
        val savedCustomer = client.save(beer)
        assertNotNull(savedCustomer)
        assertEquals(savedCustomer.status, CREATED)
    }

    @Test
    fun updateTest() {
        val beer = CustomerDto(randomUUID(), "Pale Ale")
        client.update(randomUUID(), beer)
    }

    @Test
    fun deleteTest() {
        client.delete(randomUUID())
    }
}