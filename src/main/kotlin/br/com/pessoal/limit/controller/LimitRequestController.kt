package br.com.pessoal.limit.controller

import br.com.pessoal.limit.controller.request.CreateLimitRequest
import br.com.pessoal.limit.controller.response.LimitRequestResponse
import br.com.pessoal.limit.enums.LimitRequestStatus
import br.com.pessoal.limit.enums.LimitType
import br.com.pessoal.limit.enums.Period
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime


//2-Solicitar novo limites

@RestController
@RequestMapping("/")
class LimitRequestController {

    @PostMapping("limit/request/owner/{ownerId}")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@PathVariable ownerId: Long, @RequestBody request: CreateLimitRequest) {
        println("ownerId: ${ownerId}")
        println("request: ${request}")
    }



    /*3-Listar Solicitação Limites*/

        @GetMapping("/limits/owner/{ownerId}")
        fun listByOwner(@PathVariable ownerId: Long): List<LimitRequestResponse> {
            return listOf(
                LimitRequestResponse(
                    id = 1,
                    ownerId = ownerId,
                    period = Period.DAYTIME,
                    limitType = LimitType.INDIVIDUAL,
                    amount = 10,
                    status = LimitRequestStatus.IN_ANALYSIS,
                    createdAt = LocalDateTime.now()
                )
            )
        }
    }


