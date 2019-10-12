package by.zmitser.web.client

import by.zmitser.web.model.BeerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import java.util.*

@Client(value = "\${brewery.client.beer.url}", path = "\${brewery.client.beer.path}")
interface BeerClient {

    @Get("/{id}")
    fun findOne(id: UUID): HttpResponse<BeerDto>
}