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

}
