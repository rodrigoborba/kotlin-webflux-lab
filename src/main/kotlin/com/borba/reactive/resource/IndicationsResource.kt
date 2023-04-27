package com.borba.reactive.resource

import com.borba.reactive.model.Indication
import com.borba.reactive.service.IndicationsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping
class IndicationsResource (
    private val indicationsService: IndicationsService
){

    @GetMapping
    fun getIndications() : Flux<Indication> {
        return indicationsService.getIndications()
    }


}