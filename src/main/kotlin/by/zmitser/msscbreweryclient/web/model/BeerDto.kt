package by.zmitser.web.model

import java.util.*

data class BeerDto(val id:UUID?, val beerName:String?, val beerStyle:String?, val upc:Long?){

    constructor(): this(null, null, null, null)
    constructor(id: UUID?,  beerName: String?, beerStyle: String?): this(id, beerName, beerStyle, null)
}