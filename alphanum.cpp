 using namespace std;
#include<iostream>
#include<string.h>
#include<conio.h>
int main()
{
char a;
cout<<"enter the character/number : ";
cin>>a;
if((a>='a' && a<='z')|| (a>='A' && a<='Z'))
{
    cout<<a<<" is alphabet";
}
else{
 cout<<a<<" is not a alphabet"   ;
}
return 0;
}
