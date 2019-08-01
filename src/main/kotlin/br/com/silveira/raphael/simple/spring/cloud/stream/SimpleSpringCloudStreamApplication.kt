package br.com.silveira.raphael.simple.spring.cloud.stream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleSpringCloudStreamApplication

fun main(args: Array<String>) {
    runApplication<SimpleSpringCloudStreamApplication>(*args)
}
