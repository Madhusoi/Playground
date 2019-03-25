#include<stdio.h>
int main()
{
  int n,sum,num1,num2;
  scanf("%d",&n);
  num1=n/100;
  num2=n%10;
  sum=num1+num2;
  printf("%d",sum);
  //Type your code here
  return 0;
}