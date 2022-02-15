package daggerok.app

import daggerok.starter.services.GreetingServices
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DefaultsTest(@Autowired val greetingServices: GreetingServices) {

    @Test
    fun `should use default values for prefix and name`() {
        assertThat(greetingServices.greet()).isEqualTo("Privet, Maksimko!")
    }
}
