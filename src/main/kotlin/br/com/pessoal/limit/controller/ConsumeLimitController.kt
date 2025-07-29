package br.com.pessoal.limit.controller

import br.com.pessoal.limit.controller.request.ConsumeLimitRequest
import br.com.pessoal.limit.service.ConsumedLimitService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

//4-Consume Limits

@RestController
@RequestMapping("/consumed_limits/owner/{ownerId}")
class ConsumeLimitController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@PathVariable ownerId: Long, @RequestBody request: ConsumeLimitRequest
    ) {

        println("ownerId: $ownerId")
        println("consume request: $request")

    }



//5-Delete consumo limite

    @DeleteMapping("/transaction/{transactionId}")
    fun deleteConsumedLimit(@PathVariable ownerId: Long, @PathVariable transactionId: Long): ResponseEntity<Void>
    {
        println("ownerId para delete: $ownerId")
        println("transactionId para delete: $transactionId")


        return ResponseEntity.ok().build()
    }
}