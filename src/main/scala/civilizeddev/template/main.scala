package civilizeddev.template

import org.slf4j.LoggerFactory

@main
def main(): Unit =
  val logger = LoggerFactory.getLogger(this.getClass())
  logger.info("Hello, World!")
end main
