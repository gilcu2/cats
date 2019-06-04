package com.gilcu2.printable

object PrintableInstances {

  implicit val stringPrintable = new Printable[String] {
    def format (input: String) = input
  }

  implicit val intPrintable = new Printable[Int] {
    def format (input: Int) = input.toString
  }

}
