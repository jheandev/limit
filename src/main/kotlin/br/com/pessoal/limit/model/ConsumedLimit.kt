package br.com.pessoal.limit.model

import jakarta.persistence.*

@Entity
@Table(name = "consumed_limits")
data class ConsumedLimit(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val ownerId: Long,

    @Column(nullable = false)
    val transactionId: Long,


)