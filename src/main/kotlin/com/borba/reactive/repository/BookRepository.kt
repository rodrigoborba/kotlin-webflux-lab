package com.borba.reactive.repository

import com.borba.reactive.model.Book
import org.springframework.data.mongodb.repository.Query
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface BookRepository : ReactiveMongoRepository<Book, String> {

    @Query("{name: ?0")
    fun findByName(name: String): Mono<Book>

}