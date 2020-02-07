package variables

import org.scalatest.FunSuite

class ValuesTest extends FunSuite {

  test("should not allow to modify val") {
    val a = "something"

//    a = "other" //compile error
  }

  test("should allow to modify var") {
    var a = "something"

    //when
    a = "other"

    assert(a.equals("other"))

  }

  test("should defer init of lazy") {
    lazy val a = { println("init"); 10 }

    println("not initialized yet")

    assert(a.equals(10)) //init will happen before it
  }

  test("should use def for function") {
    def add(a: Int, b: Int) = a + b

    assert(add(1,2).equals(3))
  }

  test("should use val for function") {
    val add = (a: Int, b: Int) => a + b

    assert(add(1,2).equals(3))
  }

}
