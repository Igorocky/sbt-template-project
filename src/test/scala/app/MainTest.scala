package app

import org.scalatest.{FlatSpec, Matchers}

class MainTest extends FlatSpec with Matchers {

  "2+1" should "be 3" in {
    (2+1) should be(3)
  }

}
