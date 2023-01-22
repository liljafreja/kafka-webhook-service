package com.liljafreja.kafkawebhookservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaWebhookServiceApplication

fun main(args: Array<String>) {
	runApplication<KafkaWebhookServiceApplication>(*args)
}
