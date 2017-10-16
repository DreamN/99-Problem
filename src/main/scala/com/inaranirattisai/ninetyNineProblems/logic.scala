package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

object logic {
  def not(x: Boolean) = if(x) true else false
  def and(x: Boolean, y: Boolean):Boolean = x match {
    case true => y
    case false => false
  }
  def or(x: Boolean, y: Boolean) = x match {
    case true => true
    case false => and(y, true)
  }
  def nand(x: Boolean, y: Boolean) = not(and(x, y))
  def nor(x: Boolean, y: Boolean) = not(orX(x, y))
  def equ(x: Boolean, y: Boolean) = nor(and(x, not(y)), and(not(x), y))
  def xor(x: Boolean, y: Boolean) = not(equ(x, y))
  def imp(x: Boolean, y: Boolean) = (x, y) match {
    case (true, false) => false
    case (_, _) => true
  }
}
