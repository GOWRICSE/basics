#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b;
    printf("enter the number:");
    scanf("%d",&a);
    b=a%2;
    if(b==0)
    {
        printf("%d is even number",a);
    }
    else{
        printf("%d id odd number",a);
    }
    getch();
}
