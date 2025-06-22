package br.com.pessoal.limit.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "customer")
data class LimitModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    var id: Int? = null,

    @Column(name = "owner_id")
    var ownerId: Long

)

//@Entity(name = "customer")
//data class CustomerModel (
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY )
//    var id: Int? = null,
//
//    @Column
//    var name: String,
//
//    @Column
//    var email: String
//
//)