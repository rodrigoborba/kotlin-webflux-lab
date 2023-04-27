package com.borba.reactive.repository

import com.borba.reactive.model.Indication
import org.springframework.data.mongodb.repository.Query
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface IndicationRepository : ReactiveMongoRepository<Indication, String> {

    @Query("{uri: ?0")
    fun findIndicationByUri(uri: String): Flux<Indication>

}