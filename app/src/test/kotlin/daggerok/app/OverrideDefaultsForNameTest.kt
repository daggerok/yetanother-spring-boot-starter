package daggerok.app

import daggerok.starter.services.GreetingServices
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(properties = [
    "greeting.name.default-value=Max",
])
class OverrideDefaultsForNameTest(@Autowired val greetingServices: GreetingServices) {

    @Test
    fun `should override name`() {
        assertThat(greetingServices.greet()).isEqualTo("Privet, Max!")
    }
}
