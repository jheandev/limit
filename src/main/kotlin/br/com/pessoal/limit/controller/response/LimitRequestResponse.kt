package br.com.pessoal.limit.controller.response

import br.com.pessoal.limit.enums.LimitRequestStatus
import br.com.pessoal.limit.enums.LimitType
import br.com.pessoal.limit.enums.Period
import java.time.LocalDateTime

data class LimitRequestResponse (
    val id: Long,
    val ownerId: Long,
    val period: Period,
    val limitType: LimitType,
    val amount: Long,
    val status: LimitRequestStatus,
    val createdAt: LocalDateTime

)

//3-Listar Solicitação Limites