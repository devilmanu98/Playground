#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%400==0) 
    printf("Leap year\n");
  
   else if(n%100== 0) 
     
           printf("Not Leap year\n");
  else if(n%4==0) 
    printf("Leap year\n");
  else 
    printf("Not Leap year\n");
  //Type your code here
  
  return 0;
}