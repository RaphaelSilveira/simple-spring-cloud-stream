package br.com.silveira.raphael.simple.spring.cloud.stream.messaging.stream

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.SubscribableChannel

const val SIMPLE_STREAM_RABBIT = "simple-stream-rabbit"

interface SimpleStream {

    @Input(SIMPLE_STREAM_RABBIT)
    fun simpleStreamRabbit(): SubscribableChannel
}