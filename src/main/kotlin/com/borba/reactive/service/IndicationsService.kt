package com.borba.reactive.service

import com.borba.reactive.model.Indication
import com.borba.reactive.repository.BookRepository
import com.borba.reactive.repository.IndicationRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class IndicationsService (
        private val indicationRepository: IndicationRepository,
        private val bookRepository: BookRepository
    ){

    fun getIndications(): Flux<Indication> {
        return indicationRepository.findIndicationByUri("test")
    }




}
