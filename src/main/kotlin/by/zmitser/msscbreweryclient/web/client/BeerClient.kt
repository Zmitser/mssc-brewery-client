package by.zmitser.msscbreweryclient.web.client

import by.zmitser.msscbreweryclient.web.model.BeerDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import io.micronaut.http.client.annotation.Client
import java.util.*

@Client(value = "\${brewery.client.beer.url}", path = "\${brewery.client.beer.path}")
interface BeerClient {

    @Get("/{id}")
    fun findOne(id: UUID): HttpResponse<BeerDto>

    @Post
    fun save(beer: BeerDto): HttpResponse<BeerDto>

    @Put("/{id}")
    fun update(@PathVariable id: UUID, beer: BeerDto):HttpResponse<Any>


}