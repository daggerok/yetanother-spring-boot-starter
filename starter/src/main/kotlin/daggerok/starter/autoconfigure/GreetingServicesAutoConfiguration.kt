package daggerok.starter.autoconfigure

import daggerok.starter.autoconfigure.props.GreetingProps
import daggerok.starter.autoconfigure.props.NameProps
import daggerok.starter.services.GreetingServices
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnMissingClass
@ComponentScan(basePackageClasses = [GreetingServices::class])
class GreetingServicesAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    fun greetingServices(greetingProps: GreetingProps, nameProps: NameProps) =
        GreetingServices(greetingProps, nameProps)
}
