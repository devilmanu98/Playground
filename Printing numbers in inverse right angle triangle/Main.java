#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int val=n;
  for(int i=1;i<=n;i++)
  {
    for(int j=val;j>=1;j--)
    {
      printf("%d",j);
    }
    val--;
    printf("\n");
  }
	return 0;
}