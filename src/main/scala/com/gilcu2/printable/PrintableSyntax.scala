package com.gilcu2.printable

object PrintableSyntax {

  implicit class PrintableOps[A](a: A) {

    def format(implicit pa: Printable[A]): String = pa.format(a)

  }

}
