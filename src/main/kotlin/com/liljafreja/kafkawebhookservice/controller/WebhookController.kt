package com.liljafreja.kafkawebhookservice.controller

import com.liljafreja.kafkawebhookservice.persistence.WebhookRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/create-webhook")
class WebhookController(private val repository: WebhookRepository) {

    @PostMapping
    fun createWebhookRequest(@RequestBody webhookRequest: WebhookRequest) {

    }
}