package br.com.pessoal.limit.controller.response

import java.time.Instant

data class TrustedContactResponse(
    val id: Long,
    val ownerId: Long,
    val name: String,
    val document: String,
    val createdAt: Instant
)

//7-Buscar contato confiável