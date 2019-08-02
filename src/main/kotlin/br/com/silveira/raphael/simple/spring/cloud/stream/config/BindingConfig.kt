package br.com.silveira.raphael.simple.spring.cloud.stream.config

import br.com.silveira.raphael.simple.spring.cloud.stream.messaging.stream.SimpleStream
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.context.annotation.Configuration

@Configuration
@EnableBinding(SimpleStream::class)
class BindingConfig