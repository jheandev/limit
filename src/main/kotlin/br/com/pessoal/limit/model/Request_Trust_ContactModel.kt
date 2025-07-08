package br.com.pessoal.limit.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime


@Entity(name = "Request_Trust_Contact")
data class Request_Trust_ContactModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    var id: Int? = null,

    @Column(name = "owner_id")
    var ownerId: Long,

    @Column
    var document: String,

    @Column
    var name: String,

    @Column(name = "created_at")
    var createdAt: LocalDateTime,

    @Column(name = "update_at")
    var updateAt: LocalDateTime,

    @Column
    var status: String

)









