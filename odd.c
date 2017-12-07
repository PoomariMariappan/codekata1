#include<stdio.h>
#include<math.h>

int main()
{
int c=0,i,j,n;
char a[20],t;
scanf("%s",a);
n=strlen(a);
for(i=0;i<n;i=i+2)
{
  t=a[i];
a[i]=a[i+1];
a[i+1]=t;

  
}
printf("%s",a);
}
