package org.pantalasa

import org.scalatest.funsuite.AnyFunSuite

class GreeterSpec extends AnyFunSuite {
  test("greets by name") {
    assert(Greeter.greet("Bender") == "Hello, Bender!")
  }
}
