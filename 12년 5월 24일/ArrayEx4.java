class ArrayEx4
{
public static void main(String[] args)
{
int[] b=new int[45];
for(int i=0; i<b.length;i++)
b[i]=i+1;
int t=0;
int j=0;
for(int i=0;i<100;i++)
{
j=(int)(Math.random()*45);
t=b[0];
b[0]=b[j];
b[j]=t;
}
for(int i=0; i<6;i++)
System.out.print(b[i]+" ");
}
}