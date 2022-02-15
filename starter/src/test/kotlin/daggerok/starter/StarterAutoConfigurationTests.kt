package daggerok.starter

import daggerok.starter.services.GreetingServices
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest

@SpringBootApplication
internal class TestApplication

@SpringBootTest
class StarterAutoConfigurationTests(@Autowired val greetingServices: GreetingServices) {

    @Test
    fun `should use default values for prefix and name`() {
        assertThat(greetingServices.greet()).isEqualTo("Hello, Anonymous!")
        assertThat(greetingServices.greet(name = "Max")).isEqualTo("Hello, Max!")
        assertThat(greetingServices.greet(greeting = "Hey")).isEqualTo("Hey, Anonymous!")
        assertThat(greetingServices.greet(greeting = "Hey", name = "Max")).isEqualTo("Hey, Max!")
    }
}
