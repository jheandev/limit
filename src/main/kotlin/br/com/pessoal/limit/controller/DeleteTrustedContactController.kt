package br.com.pessoal.limit.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//10-Delete contato confiável

@RestController
@RequestMapping("/owner/{owner_id}/trusted_contact")
class DeleteTrustedContactController {

    @DeleteMapping("/{trustContactId}")
    fun delete(@PathVariable("owner_id") ownerId: Long, @PathVariable trustContactId: Long): ResponseEntity<Void>
    {
        println("Deletendo contato: $trustContactId : $ownerId")
        return ResponseEntity.ok().build()
    }
}