class ObjectOrientedAndFunctional(val name: String) { //note immutability

  def concatenateToName(surname: String): ObjectOrientedAndFunctional ={
    new ObjectOrientedAndFunctional(name + surname) //note return of immutability
  }

}

object ObjectOrientedAndFunctional {
  def apply(arg1: String): ObjectOrientedAndFunctional ={
    new ObjectOrientedAndFunctional(arg1) // companion object creation
  }
}
