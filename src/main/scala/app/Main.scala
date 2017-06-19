package app

import org.slf4j.LoggerFactory

object Main {
  val log = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    log.info("Started.")
    println("++++++++++++")
    log.info("Finished.")
  }
}
