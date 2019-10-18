package by.zmitser.msscbreweryclient.web.client

import by.zmitser.web.model.CustomerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client
import java.util.*

@Client(value = "\${brewery.client.customer.url}", path = "\${brewery.client.customer.path}")
interface CustomerClient {

    @Get("/{id}")
    fun findOne(@PathVariable id: UUID): HttpResponse<CustomerDto>

    @Post
    fun save(customer: CustomerDto): HttpResponse<CustomerDto>

    @Put("/{id}")
    fun update(@PathVariable id: UUID, customer: CustomerDto)

    @Delete("/{id}")
    fun delete(@PathVariable id: UUID)
}