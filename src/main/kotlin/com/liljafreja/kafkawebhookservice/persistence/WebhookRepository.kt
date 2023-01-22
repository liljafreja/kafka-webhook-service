package com.liljafreja.kafkawebhookservice.persistence

import com.liljafreja.kafkawebhookservice.controller.WebhookRequest
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface WebhookRepository : CrudRepository<WebhookRequest, UUID>