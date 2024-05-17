class ArrayEx6
{
public static void main(String[] args)
{
int[] n=new int[10];
int[] c=new int[10];
for(int i=0; i<n.length;i++)
{
System.out.print(n[i]=(int)(Math.random()*10));
}
System.out.println();
for (int i=0;i<n.length;i++)
{
c[n[i]]++;
}
for(int i=0; i<n.length;i++)
{
System.out.println(i+"ÀÇ °³¼ö="+c[i]);
}
}
}