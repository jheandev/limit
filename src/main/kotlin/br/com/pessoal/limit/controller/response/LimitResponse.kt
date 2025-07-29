package br.com.pessoal.limit.controller.response

import br.com.pessoal.limit.enums.LimitType
import br.com.pessoal.limit.enums.Period

data class LimitResponse (
    val id: Long,
    val ownerId: Long,
    val period: Period,
    val limitType: LimitType,
    val currentAmount: Long)

//1-List limits