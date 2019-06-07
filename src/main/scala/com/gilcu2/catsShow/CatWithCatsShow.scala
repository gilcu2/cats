package com.gilcu2.catsShow

import com.gilcu2.cat.Cat
import cats._
import cats.instances.all._
import cats.syntax.all._

object CatWithCatsShow {
  implicit val catShow = Show.show[Cat] {
    cat =>
      val name = cat.name.show
      val age = cat.age.show
      s"Cat $name is $age year old"
  }
}


object CatWithCatsShowSimple {

  implicit val dateShow: Show[Cat] = Show.show(date => "Cat $name is $age year old")

}