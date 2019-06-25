import org.scalatest._

class maintest extends FlatSpec with Matchers {
  // scalastyle: off 
  "TestIt" should "return a test value" in {
    HelloWorld.func should be(1)
  }
}