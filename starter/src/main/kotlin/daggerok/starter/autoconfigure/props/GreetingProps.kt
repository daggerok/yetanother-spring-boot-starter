package daggerok.starter.autoconfigure.props

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@ConstructorBinding
@ConfigurationProperties("greeting.prefix")
data class GreetingProps(
    val defaultValue: String = "Hello",
)

@Configuration
@ConditionalOnMissingClass
@EnableConfigurationProperties(GreetingProps::class)
class GreetingPropsAutoConfiguration
