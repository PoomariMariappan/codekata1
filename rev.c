#include<stdio.h>
int reverse(int);
main()
{
  int n;
scanf("%d",&n);
printf("%d",reverse(n));
}
int reverse(int n)
{
int re,r;
while(n!=0)
{
re=n%10;
r=r*10+re;
n=n/10;
}
return r;
}

