package com.inaranirattisai.ninetyNineProblems

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by inaraniratti on Oct, 2017
  */

class P11_20Test extends FunSuite with Matchers{

  test("[P11] modified run-length encoding") {
    val p = new P11[Symbol]
    p.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

  test("[P12] return decoded a run-length encoded list") {
    val p = new P12[Symbol]
    p.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should equal(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

  test("[P13] Run-length encoding of a list (direct solution)") {
    val p = new P13[Symbol]
    p.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  test("[P14]") {
    val p = new P14[Symbol]
    p.duplicate(List('a, 'b, 'c, 'c, 'd)) should equal(List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

  test("[P15]") {
    val p = new P15[Symbol]
//    println(p.duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    p.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should be(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

  test("[P16]") {
    val p = new P16[Symbol]
//    println(p.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    p.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

  test("[P17]") {
    val p = new P17[Symbol]
    p.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be((List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  test("[P18]") {
    val p = new P18[Symbol]
    p.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g))
  }

  test("[P19]") {
    val p = new P19[Symbol]
    p.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
    p.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }

  test("[P20]") {
    val p = new P20[Symbol]
    p.removeAt(1, List('a, 'b, 'c, 'd)) should be((List('a, 'c, 'd),'b))
  }

}
