#include<stdio.h>
#include<math.h>

int main()
{
int c=0,i,j,n;
scanf("%d",&n);
for(i=2;i<n;i++)
{
for(j=2;j<=i;j++)
{
if(i==j)
c++;
else if(i%j==0)
break;
}
}
printf("%d",c);
}
