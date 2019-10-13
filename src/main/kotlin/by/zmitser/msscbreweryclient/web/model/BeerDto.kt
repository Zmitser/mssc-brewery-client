package by.zmitser.msscbreweryclient.web.model

import java.util.*

data class BeerDto(val id:UUID?, val beerName:String?, val beerStyle:String?, val upc:Long?){

    constructor(): this(null, null, null, null)
    constructor(beerName: String?, beerStyle: String?): this(null, beerName, beerStyle, null)
}