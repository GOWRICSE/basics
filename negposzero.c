#include<stdio.h>
#include<conio.h>
void main()
{
    int i;
    printf("enter a number :");
    scanf("%d",&i);
    if(i!=0)
    {
        if(i<0)
        {
            printf("\n the %d is negative number",i);
        }
        else{
            printf("\n the %d is positive number",i);
        }
    }
    else{
        printf(" the given number is zero");
    }
    getch();

}
