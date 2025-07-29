package br.com.pessoal.limit.controller.request

import br.com.pessoal.limit.enums.LimitType

data class ConsumeLimitRequest (
    val transactionId: Long,
    val amount: Long,
    val creditorDocument: String,
    val limitType: LimitType
)

//4-Consume Limits