package com.gilcu2.cat

import org.scalatest.{FlatSpec, GivenWhenThen, Matchers}
import com.gilcu2.printable.Printable
import com.gilcu2.printable.PrintableSyntax._

class CatTest extends FlatSpec with GivenWhenThen with Matchers {

  behavior of "Cat"

  it should "format a cat using Printable" in {
    val cat = Cat("juan", 24)

    Printable.format(cat) shouldBe s"Cat ${cat.name} is ${cat.age} years old"
  }

  it should "format a cat directly" in {
    val cat = Cat("juan", 24)

    cat.format shouldBe s"Cat ${cat.name} is ${cat.age} years old"
  }

}
