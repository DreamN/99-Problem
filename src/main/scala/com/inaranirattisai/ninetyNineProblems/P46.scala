package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

trait Output {
  def print(s: String) = Console.println(s)
}

class P46 extends Output{
  def table2(f:(Boolean, Boolean) => Boolean): Unit = {
    print("A\t\tB\t\tresult")
    print(s"true\ttrue\t${f(true, true)}")
    print(s"true\tfalse\t${f(true, false)}")
    print(s"false\ttrue\t${f(false, true)}")
    print(s"false\tfalse\t${f(false, false)}")

  }
}
