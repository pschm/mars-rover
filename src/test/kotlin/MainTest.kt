import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.core.spec.style.StringSpec

class MainTest: StringSpec({

    "your code should not break the system ;)" {
        shouldNotThrow<Exception> {
            main()
        }
    }
})
