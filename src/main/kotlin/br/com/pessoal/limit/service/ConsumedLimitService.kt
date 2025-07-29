package br.com.pessoal.limit.service

import br.com.pessoal.limit.controller.request.ConsumeLimitRequest
import br.com.pessoal.limit.model.ConsumedLimit
import org.springframework.stereotype.Service
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.server.ResponseStatusException
import org.springframework.http.HttpStatus

@Service
class ConsumedLimitService(
    private val repository: ConsumedLimitRepository
) {

    @Transactional
    fun createConsumedLimit(ownerId: Long, request: ConsumeLimitRequest) {
        // Simplificação: Criamos e salvamos o objeto em uma única linha.
        // Não há necessidade de uma variável intermediária aqui.
        repository.save(
            ConsumedLimit(
                ownerId = ownerId,
                transactionId = request.transactionId
            )
        )
    }

    @Transactional
    fun deleteByTransactionId(ownerId: Long, transactionId: Long) {
        // Este método já está bem limpo e idiomático em Kotlin.
        // A lógica "encontre ou lance uma exceção" é muito clara.
        val consumedLimit = repository.findByOwnerIdAndTransactionId(ownerId, transactionId)
            ?: throw ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Transação não encontrada para o owner informado"
            )

        repository.delete(consumedLimit)
    }
}

interface ConsumedLimitRepository : JpaRepository<ConsumedLimit, Long> {
    fun findByOwnerIdAndTransactionId(ownerId: Long, transactionId: Long): ConsumedLimit?
}