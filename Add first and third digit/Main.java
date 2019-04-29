#include<stdio.h>
int main()
{
  int n1,d,l,m;
  scanf("%d",&n1);
  d=n1%10;
  l=n1/100;
  m=d+l;
  printf("%d",m);
  return 0;
}