package br.com.pessoal.limit.controller

import br.com.pessoal.limit.controller.response.LimitResponse
import br.com.pessoal.limit.enums.LimitType
import br.com.pessoal.limit.enums.Period
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//1-List limits

@RestController
@RequestMapping("/owner/{owner_id}/limits")
class LimitQueryController {

    @GetMapping
    fun listAllByOwner(@PathVariable("owner_id") ownerId: Long): List<LimitResponse> {
        return listOf(LimitResponse(
            id = 1,
            ownerId = ownerId,
            period = Period.DAYTIME,
            limitType = LimitType.INDIVIDUAL,
            currentAmount = 10000
        ))
    }

}