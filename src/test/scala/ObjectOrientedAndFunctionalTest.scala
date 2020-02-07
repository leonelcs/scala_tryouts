import org.scalatest.FunSuite

class ObjectOrientedAndFunctionalTest extends FunSuite {

  test("Should create a new instance") {

    val o = ObjectOrientedAndFunctional("a-name")

    val res = o.concatenateToName("surname")

    assert(res.name.equals("a-namesurname"))

  }

}
