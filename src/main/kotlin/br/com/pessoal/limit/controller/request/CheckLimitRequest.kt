package br.com.pessoal.limit.controller.request

import br.com.pessoal.limit.enums.LimitType

data class CheckLimitRequest(
    val limitType: LimitType,
    val creditorDocument: String
)

//6-Check Limit