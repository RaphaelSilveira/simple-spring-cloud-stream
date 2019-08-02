package br.com.silveira.raphael.simple.spring.cloud.stream.messaging.consumer

import br.com.silveira.raphael.simple.spring.cloud.stream.messaging.stream.SIMPLE_STREAM_RABBIT
import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux

@Component
class SimpleStreamRabbitConsumer {

    @StreamListener
    fun consume(@Input(SIMPLE_STREAM_RABBIT) message: Flux<String>) {
        message.log().subscribe()
    }

}