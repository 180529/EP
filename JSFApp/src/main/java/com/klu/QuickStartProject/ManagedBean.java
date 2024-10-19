package com.klu.QuickStartProject;

@ManagedBean(name="calc", eager=true)
public class ManagedBean {
  
  int a;
  int b;
  int c;
  public int getA() {
    return a;
  }
  public void setA(int a) {
    this.a = a;
  }
  public int getB() {
    return b;
  }
  public void setB(int b) {
    this.b = b;
  }
  public int getC() {
    return c;
  }
  public void setC(int c) {
    this.c = c;
  }
  
  public void add()
  {
    c=a+b;
  }
  public void sub()
  {
    c=a-b;
  }
  public void mul()
  {
    c=a*b;
  }

}
