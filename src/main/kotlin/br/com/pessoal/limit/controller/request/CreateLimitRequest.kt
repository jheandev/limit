package br.com.pessoal.limit.controller.request

import br.com.pessoal.limit.enums.LimitType
import br.com.pessoal.limit.enums.Period

data class CreateLimitRequest (
    val period: Period,
    val limitType: LimitType,
    val amount: Long
)

//2-Solicitar novo limites