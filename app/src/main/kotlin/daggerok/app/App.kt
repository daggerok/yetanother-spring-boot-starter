package daggerok.app

import daggerok.starter.services.GreetingServices
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class App

fun main(args: Array<String>) {
    val applicationContext = runApplication<App>(*args)
    val greetingServices = applicationContext.getBean<GreetingServices>()
    println(greetingServices.greet())
    println(greetingServices.greet(name = "Max"))
    println(greetingServices.greet(greeting = "Hey"))
    println(greetingServices.greet(greeting = "Hey", name = "Max"))
}
