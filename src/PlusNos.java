/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pragati Gusain
 */
class Add
{
  int a,b,c;
  Add()
  {
      a=10;
      b=20;
  }
  Add(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
  void sum()
  {
      c=a+b;
  }
  void display()
  {
      System.out.print("Sum is:"+c);
  }
}
public class PlusNos 
{
 public static void main(String []args)
 {
  Add obj=new Add(20,30);
  obj.sum();
  obj.display();
  
 }
}
