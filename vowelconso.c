#include<stdio.h>
#include<conio.h>
int main()
{
 char a;
 printf("enter the character:");
 scanf("%s",&a);
 if( a=='a' || a=='e' || a=='i' || a=='o' || a=='u' )
 {
     printf("%c is vowel",a);
 }
    else
    {
        printf("%c is not a vowel",a);
    }
return 0;
}
