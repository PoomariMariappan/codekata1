#include<stdio.h>
int rev(int n)
{
int i,rem,r;
while(n!=0)
{
rem=n%10;
r=r*10+rem;
n=n/10;
}
return r;
}
main()
{
int n;
scanf("%d",&n);
printf("%d",r);
}
