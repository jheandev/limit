package br.com.pessoal.limit.controller

import br.com.pessoal.limit.controller.request.CheckLimitRequest
import br.com.pessoal.limit.controller.response.CheckLimitResponse
import br.com.pessoal.limit.enums.Period
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

//6-Check Limit

@RestController
@RequestMapping("/owner/{ownerId}/consumed_limits/check_limit")
class CheckLimitController {
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun check(@PathVariable ownerId: Long, @RequestBody request: CheckLimitRequest): CheckLimitResponse {
        println("ownerId: ${ownerId}")
        println("request: ${request}")

        return CheckLimitResponse(
            validLimit = 100,
            limitId = 1,
            period = Period.DAYTIME,
            limitType = request.limitType

        )
   }
}