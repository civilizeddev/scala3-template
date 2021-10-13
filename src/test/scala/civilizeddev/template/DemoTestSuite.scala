package civilizeddev.template

import org.slf4j.LoggerFactory

class DemoTestSuite extends munit.FunSuite:
  val logger = LoggerFactory.getLogger(classOf[DemoTestSuite])

  test("demo") {
    assertEquals(1 + 1, 2)
  }
end DemoTestSuite
