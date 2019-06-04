package com.gilcu2.cat

import com.gilcu2.printable.Printable
import com.gilcu2.printable.PrintableInstances._

case class Cat(name:String,age:Int)

object Cat {

  implicit val catPrintable = new Printable[Cat] {
    def format (cat: Cat):String = {
      val name=Printable.format(cat.name)
      val age=Printable.format(cat.age)
      s"Cat $name is $age years old"
    }
  }

}
