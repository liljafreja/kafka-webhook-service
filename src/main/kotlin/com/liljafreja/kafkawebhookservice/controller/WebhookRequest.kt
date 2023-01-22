package com.liljafreja.kafkawebhookservice.controller

import java.net.URL

data class WebhookRequest(
    val kafkaTopic: String,
    val url: URL
)