package com.inaranirattisai.ninetyNineProblems

import org.scalatest.{FunSuite, Matchers}
import logic._

/**
  * Created by inaraniratti on Oct, 2017
  */

trait MockOutput extends Output {
  var messages: Seq[String] = Seq()

  override def print(s: String) = messages = messages :+ s
}

class P41_50Test extends FunSuite with Matchers {
  test("[46]"){
    val p = new P46() with MockOutput
    p.table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
//    println(p.messages.toString().filter(_ >= ' '))
    p.messages.toString().filter(_ >= ' ') should be("List(ABresult, truetruetrue, truefalsetrue, falsetruefalse, falsefalsefalse)")
  }
}
