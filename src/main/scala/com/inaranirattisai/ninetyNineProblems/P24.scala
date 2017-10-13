package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P24 (*) Lotto: Draw N different random numbers from the set 1..M.
//Example:
//scala> lotto(6, 49)
//res0: List[Int] = List(23, 1, 17, 33, 21, 37)

class P24 {
  def lotto(amount: Int, stop: Int):List[Int] = {
    (new P23[Int]).randomSelect(amount, (1 to stop).toList)
  }
}
