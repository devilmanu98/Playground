#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++) 
  {
    for(int j=1;j<=n;j++) 
    {
      if(((i%2==0)&&(j==1))||((i%2==1)&&(j==n))) 
      {
        printf("%d",i+1);
      }
      else
      {
        printf("%d",i);
      }
    }
      printf("\n");
    }
	return 0;
}