package com.inaranirattisai.ninetyNineProblems

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by inaraniratti on Oct, 2017
  */

class P21_30Test extends FunSuite with Matchers{

  test("[P21]") {
    val p = new P21[Symbol]
    p.insertAt('new, 1, List('a, 'b, 'c, 'd)) should equal(List('a, 'new, 'b, 'c, 'd))
  }

  test("[P22]") {
    val p = new P22
    p.range(4, 9) should equal(List(4, 5, 6, 7, 8, 9))
  }

  test("[P23]") {
    val p = new P23[Symbol]
    (new P04[Symbol]).length(p.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))) should equal(3)
  }

  test("[P24]"){
    val p = new P24
    (new P04[Int]).length(p.lotto(6, 49)) should equal(6)
  }

  test("[P25]"){
    val p = new P25[Symbol]
    (new P04[Symbol]).length(p.randomPermute(List('a,'f))) should equal((new P04[Symbol]).length(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

  test("[P26]"){
    val p = new P26[Symbol]
//    println(p.combinations(2, List('a, 'b, 'c)))
//    println(p.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))
//    println((new P04).length(p.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l))))
    p.combinations(2, List('a, 'b, 'c)) should be(List(
      List('a, 'b), List('a, 'c), List('b, 'c)
    ))
    (new P04).length(p.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l))) should be(500)
  }

//  test("[P27]"){
//
//  }
//
//  test("[P28]"){
//
//  }
//
//  test("[P29]"){
//
//  }
//
//  test("[P30]"){
//
//  }

}
