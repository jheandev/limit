package br.com.pessoal.limit.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime


@Entity(name = "Limit_usage")
data class Limit_usageModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name = "limit_id")
    var limitId: Long,

    @Column(name = "owner_id")
    var ownerId: Long,

    @Column(name = "transaction_id")
    var transactionId: Long,

    @Column
    var amount: Long,

    @Column
    var status: String,

    @Column(name = "created_at")
    var createdAt: LocalDateTime,

    @Column(name = "update_at")
    var updateAt: LocalDateTime,



)
