package br.com.pessoal.limit.controller

import br.com.pessoal.limit.controller.response.TrustedContactResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.time.Instant


//7-Buscar contato confiável

@RestController
@RequestMapping("/owner/{ownerId}/trusted_contact")
class TrustedContactController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun list(@PathVariable ownerId: Long): List<TrustedContactResponse> {
        return listOf(TrustedContactResponse(
            id        = 1L,
            ownerId   = ownerId,
            name      = "Jhean carlos",
            document  = "000.000.000-00",
            createdAt = Instant.now()

            ))
    }
}