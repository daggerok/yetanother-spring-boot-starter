package daggerok.starter.services

import daggerok.starter.autoconfigure.props.GreetingProps
import daggerok.starter.autoconfigure.props.NameProps

class GreetingServices(private val greetingProps: GreetingProps, private val nameProps: NameProps) {

    fun greet(greeting: String = greetingProps.defaultValue, name: String = nameProps.defaultValue) =
        "$greeting, $name!"
}
