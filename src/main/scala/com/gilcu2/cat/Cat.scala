package com.gilcu2.cat


import com.gilcu2.printable.Printable
import com.gilcu2.printable.PrintableInstances._
import cats.Eq
import cats.instances.int._
import cats.instances.string._
import cats.syntax.eq._

case class Cat(name: String, age: Int)

object Cat {

  implicit val catPrintable = new Printable[Cat] {
    def format(cat: Cat): String = {
      val name = Printable.format(cat.name)
      val age = Printable.format(cat.age)
      s"Cat $name is $age years old"
    }
  }

  implicit val catEq: Eq[Cat] = Eq.instance[Cat] {
    (cat1, cat2) => cat1.name === cat2.name && cat1.age === cat2.age
  }

}
