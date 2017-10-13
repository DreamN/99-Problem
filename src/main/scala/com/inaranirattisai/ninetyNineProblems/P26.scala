package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
//In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
//  Example:
//
//  scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
//res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...

class P26[T] {

  def length(xs: List[T]): Int = {
    (new P04).length(xs)
  }

  def rm(pos: Int, xs: List[T]): List[T] = {
    (new P17).split(pos, xs)._1
  }

  def combinations(amount: Int, ls: List[T]): List[List[T]] = {
    def iter(cnt: Int, xs: List[T], out: List[T]): List[List[T]] = {
      if (cnt == 1) (0 to length(xs)-1).toList.map(i => xs(i) +: out)
      else (0 to length(xs)-1).toList.flatten(i => iter(cnt-1, rm(i, xs), xs(i) +: out))
    }
    iter(amount, ls, List.empty)
  }
}
