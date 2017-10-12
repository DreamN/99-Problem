package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P06 (*) Find out whether a list is a palindrome.
//Example:
//scala> isPalindrome(List(1, 2, 3, 2, 1))
//res0: Boolean = true

class P06[T] {
  def isPalindrome(list: List[T]): Boolean = {
    def compareIter(list: List[T], r: List[T]): Boolean = {
      if(list == Nil && r == Nil) true
      else if(list.head == r.head) compareIter(list.tail, r.tail)
      else false
    }
    compareIter(list, (new P05[T]).reverse(list))
  }
}
