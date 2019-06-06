package com.gilcu2.catsShow

import com.gilcu2.cat.Cat
import org.scalatest.{FlatSpec, Matchers}
import cats.implicits._
import CatWithCatsShow._

class CatWithCatsShowTest extends FlatSpec with Matchers {

  behavior of "CatWithCatsShow"

  it should "print a cat using cats" in {
    val cat = Cat("juan", 24)

    cat.show shouldBe s"Cat ${cat.name} is ${cat.age} year old"
  }

}
