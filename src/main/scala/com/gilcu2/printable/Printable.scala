package com.gilcu2.printable

trait Printable[A] {
  def format (value: A): String
}

object Printable {

  def format[A](input:A)(implicit p:Printable[A]):String=p.format(input)

}