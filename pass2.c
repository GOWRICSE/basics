#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
struct estab
{
	char csname[10];
	int csaddr;
	char symname[5][10];
	int symaddr[5];
	int cslen;
}es[10];

void main()
{
	FILE *f1,*f2;
	char ch,drec[60],line[60];
	int prgaddr,staddr,nof_sym[10],i=0,j,essize=0;
	f1=fopen("dll1in.c","r");
	f2=fopen("drec.c","w+");
	printf("\n Enter the program starting address");
	scanf("%x",&prgaddr);
	es[i].csaddr=prgaddr;
	do 	{
		ch=fgetc(f1);
		switch(ch)
		{
			case 'H':
				fscanf(f1,"%s%x%x",es[i].csname,&staddr, &es[i].cslen);
				break;
			case 'D':
				f2=fopen("drec.c","w+");
				fgets(drec,60,f1);
				fputs(drec,f2);
				j=0;
				rewind(f2);
				while(!feof(f2))
				{
					fscanf(f2,"%s%x",es[i].symname[j], &es[i].symaddr[j]);
					es[i].symaddr[j]=es[i].csaddr+ es[i].symaddr[j];
					j++;
				}
				nof_sym[i]=j-1;
				i++; fclose(f2);
			case 'R':
			case 'M':
			case 'T':
				fgets(line,60,f1);
				break;
			case 'E':
				es[i].csaddr=es[i-1].csaddr+es[i-1].cslen;
				break;
		}
	} while(!feof(f1));
	essize=i-1;
	printf("\n CSNAME\tSYMNAME\tADDRESS\tLENGTH");
	for(i=0;i<=essize;i++)
	{
		printf("\n%s\t\t%x\t%x",es[i].csname,es[i].csaddr, es[i].cslen);
		for(j=0;j<nof_sym[i];j++)
			printf("\n\t%s\t%x",es[i].symname[j], es[i].symaddr[j]);
		printf("\n");
	}
	getch();
}

