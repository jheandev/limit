package br.com.pessoal.limit.controller.response

import br.com.pessoal.limit.enums.LimitType
import br.com.pessoal.limit.enums.Period

data class CheckLimitResponse(
    val validLimit: Int,
    val limitId: Long,
    val period: Period,
    val limitType: LimitType
)
//6-Check Limit