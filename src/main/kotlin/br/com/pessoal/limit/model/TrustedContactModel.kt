package br.com.pessoal.limit.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity(name = "TrustedContact")
data class TrustedContactModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var document: String,

    @Column
    var name: String,

    @Column(name = "is_active")
    var isActive: Boolean,   //ativo

    @Column(name = "owner_id")
    var ownerId: Long,

    @Column(name = "request_trust_contact_id")
    var requestTrustContactId: Long,    //contato de confiança

    @Column(name = "created_at")
    var createdAt: LocalDateTime,

    @Column(name = "update_at")
    var updateAt: LocalDateTime


)
