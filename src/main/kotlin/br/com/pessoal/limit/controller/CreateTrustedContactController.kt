package br.com.pessoal.limit.controller

import br.com.pessoal.limit.controller.request.CreateTrustedContactRequest
import br.com.pessoal.limit.controller.response.TrustedContactRequestResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

//8-Criar Contato Confiável

@RestController
@RequestMapping("/owner/{owner_id}/trusted_contact/request")
class CreateTrustedContactController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@PathVariable("owner_id") ownerId: Long, @RequestBody request: CreateTrustedContactRequest
    ) {
        println("ownerId: $ownerId")
        println("request: $request")
    }




//9-Listar contato confiavel

    @GetMapping
    fun listByOwner(@PathVariable("owner_id") ownerId: Long): List<TrustedContactRequestResponse> {
        return listOf(
            TrustedContactRequestResponse(
                id = 1,
                ownerId = ownerId,
                trustContactId = null,
                name = "Jhean carlos",
                status = "IN_ANALYSIS",
                createdAt = Instant.parse("2025-07-23T15:15:00Z")
            )
        )
    }
}





