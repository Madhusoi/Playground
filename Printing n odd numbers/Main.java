#include <stdio.h>
int main() {
  int i,n,j;
  scanf("%d",&n);
  for(j=1,i=1;j<=n;i=i+2,j++)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
    }
  }
	//Type your code
	return 0;
}