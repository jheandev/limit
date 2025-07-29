package br.com.pessoal.limit.controller.response

import java.time.Instant

data class TrustedContactRequestResponse (
    val id: Long,
    val ownerId: Long,
    val trustContactId: Long?,
    val name: String,
    val status: String,
    val createdAt: Instant
)

//9-Listar contato confiavel