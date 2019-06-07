package com.gilcu2.cat

import org.scalatest.{FlatSpec, GivenWhenThen, Matchers}
import com.gilcu2.printable.Printable
import com.gilcu2.printable.PrintableSyntax._
import cats.instances.option._

class CatTest extends FlatSpec with GivenWhenThen with Matchers with cats.tests.StrictCatsEquality {

  behavior of "Cat"

  it should "format a cat using Printable" in {
    val cat = Cat("juan", 24)

    Printable.format(cat) shouldBe s"Cat ${cat.name} is ${cat.age} years old"
  }

  it should "format a cat directly" in {
    val cat = Cat("juan", 24)

    cat.format shouldBe s"Cat ${cat.name} is ${cat.age} years old"
  }

  it should "compare to cats" in {
    val cat1 = Cat("juan", 24)
    val cat2 = cat1.copy()
    val possibleCat2 = Option(cat2)
    val cat3 = Cat("pedro", 24)


    cat1 === cat2 shouldBe true
    Some(cat1) === possibleCat2 shouldBe true
    cat1 === cat3 shouldBe false
  }

}
