package com.Maven_OOP;

import java.util.Scanner;

import com.Maven_OOP.Newyeargift;

public class App implements Newyeargift 
{
 int cost;
 public void chocolates(int c)
 {
	 cost=c;
 }
 public void biscuits(int c)
 {
	 cost=c;
 }
 public static void main(String[] args) 
 {
  // TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of chocolates");
  int c=sc.nextInt();
  App c1[]=new App[c];
  for(int i=0;i<c;i++)
  {
	  c1[i]=new App();
  }
  System.out.println("Enter the cost of chocolates");
  for(int i=0;i<c;i++)
  {
	  int cos=sc.nextInt();
      c1[i].chocolates(cos);
  }
  System.out.println("Enter the number of biscuits");
  int b=sc.nextInt();
  App b1[]=new App[b];
  for(int i=0;i<b;i++)
  {
	   b1[i]=new App();
  }
  System.out.println("Enter the cost of biscuits");
  for(int i=0;i<b;i++)
  {
	  int cost=sc.nextInt();
      b1[i].biscuits(cost);
  }
  for(int i=0;i<c;i++)
  {
	  for(int j=1;j<c-i;j++)
      {
		  if(c1[j-1].cost > c1[j].cost)
		  {  
            int temp;
            temp =c1[j-1].cost ;  
            c1[j-1].cost = c1[j].cost;  
            c1[j].cost = temp;  
          }  
      } 
  }
  for(int i=0;i<c;i++)
	  System.out.println(c1[i].cost);
  System.out.println("Enter a range");
  int a=sc.nextInt();
  //int b2=sc.nextInt();
  for(int i=0;i<b;i++)
  {
	  if(b1[i].cost>=a && b1[i].cost<=b)
        System.out.println("candie="+(i+1));
  }
  sc.close();
 }
public void sweets(int c) {
	// TODO Auto-generated method stub
	
}

}


/*

The Output of the program was as follows:

Enter the number of chocolates
2
Enter the cost of chocolates
1
2
Enter the number of biscuits
8
Enter the cost of biscuits
0
2
3
4
5
6
7
1
1
2
Enter a range
1
candie=2
candie=3
candie=4
candie=5
candie=6
candie=7
candie=8


*/