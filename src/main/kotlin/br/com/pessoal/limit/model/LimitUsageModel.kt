package br.com.pessoal.limit.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime


@Entity(name = "LimitUsage")
data class LimitUsageModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name = "limit_id")
    var limitId: Long,  //limite

    @Column(name = "owner_id")
    var ownerId: Long, //proprietario

    @Column(name = "transaction_id")
    var transactionId: Long, //função

    @Column
    var amount: Long, //quantia

    @Column
    var status: String,  //status

    @Column(name = "created_at")
    var createdAt: LocalDateTime,   //criada

    @Column(name = "update_at")
    var updateAt: LocalDateTime  //atualizar



)
