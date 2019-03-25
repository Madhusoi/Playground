#include<stdio.h>
int main()
{
  int n,sum,digit,m;
  scanf("%d",&n);
  while(n!=0)
  {
  digit=n%10;
sum=sum+digit;
  n=n/10;
  }
 
  printf("%d",sum);
  //Type your code here
  return 0;
}