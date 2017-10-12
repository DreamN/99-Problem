package com.inaranirattisai.ninetyNineProblems

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by inaraniratti on Oct, 2017
  */

class P01_10Test extends FunSuite with Matchers{

  test("[P01] return the last element of a list") {
    val p = new P01[Int]
    p.last(List(1, 1, 2, 3, 5, 8)) should equal(Some(8))
    p.last(List(26)) should equal(Some(26))
    p.last(List.empty) should equal(None)
  }

  test("[P02] return the last but one element of a list") {
    val p = new P02[Int]
    p.penultimate(List(1, 1, 2, 3, 5, 8)) should equal(Some(5))
    p.penultimate(List(26)) should equal(None)
    p.penultimate(List.empty) should equal(None)
  }

  test("[P03] return the Kth element of a list") {
    val p = new P03[Int]
    p.nth(2, List(1, 1, 2, 3, 5, 8)) should equal(Some(2))
    p.nth(5, List(1, 1, 2, 3, 5, 8)) should equal(Some(8))
    p.nth(1, List(1, 1, 2, 3, 5, 8)) should equal(Some(1))
    p.nth(-1, List(1, 1, 2, 3, 5, 8)) should equal(None)
    p.nth(6, List(1, 1, 2, 3, 5, 8)) should equal(None)
    p.nth(2, List.empty) should equal(None)
  }

  test("[P04] the number of elements of a list") {
    val p = new P04[Int]
    p.length(List(1, 1, 2, 3, 5, 8)) should equal(6)
    p.length(List.empty) should equal(0)
    p.length(List('A')) should equal(1)
  }

  test("[P05] return the reversed a list") {
    val p = new P05[Int]
    p.reverse(List(1, 1, 2, 3, 5, 8)) should equal(List(8, 5, 3, 2, 1, 1))
    p.reverse(List.empty) should equal(List.empty)
  }

  test("[P06] find out whether a list is a palindrome.") {
    val p = new P06[Int]
    p.isPalindrome(List(1, 2, 3, 2, 1)) should equal(true)
    p.isPalindrome(List(1, 2, 3, 3, 2, 1)) should equal(true)
    p.isPalindrome(List(1, 2, 3, 2, 1, 2)) should equal(false)
    p.isPalindrome(List(1, 2, 3, 2, 3)) should equal(false)
    p.isPalindrome(List.empty) should equal(true)
  }

  test("[P07] return flatten a nested list structure.") {
    val p = new P07[Int]
    p.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should equal(List(1, 1, 2, 3, 5, 8))
    p.flatten(List.empty) should equal(List.empty)
    val p2 = new P07[Char]
    p.flatten(List('A', List('B', 'A', 'R'), 'B', List('A', 'B', List('O')))) should equal(List('A', 'B', 'A', 'R', 'B', 'A', 'B', 'O'))
  }

  test("[P08] eliminate consecutive duplicates of list elements and then return") {
    val p = new P08[Symbol]
    p.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List('a, 'b, 'c, 'a, 'd, 'e))
  }

  test("[P09] Pack consecutive duplicates of list elements into sublists") {
    val p = new P09[Symbol]
    p.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  test("[P10] return run-length encoding of a list") {
    val p = new P10[Symbol]
    p.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

//
//  test("[P0X] .....") {
//    val p = new P0X[Int]
//  }
}
