package br.com.pessoal.limit.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.apache.commons.logging.Log
import java.time.LocalDateTime
import kotlin.math.log

@Entity(name = "Limit_request")
data class Limit_requestModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    var id: Int? = null,

    @Column(name = "owner_id")
    var ownerId: Long,

    @Column
    var period: String,

    @Column
    var amount: Long,

    @Column(name = "limit_category")
    var limitCategory: String,

    @Column(name = "created_at")
    var createdAt: LocalDateTime,

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime,

    @Column
    var status: String


)
