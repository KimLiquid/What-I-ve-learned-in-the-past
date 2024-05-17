class ArrayEx10
{
public static void main(String[] args)
{
int[][] s={{100,100,100}
               ,{20,20,20}
               ,{30,30,30}
               ,{40,40,40}
               ,{50,50,50}};
int K=0;
int E=0;
int M=0;
System.out.println("¹ø ±¹ ¿µ ¼ö ÃÑ Æò");
System.out.println("======================");
for(int i=0;i<s.length;i++)
{
int m=0;
K+=s[i][0];
E+=s[i][1];
M+=s[i][2];
System.out.println(" "+(i+1)+" ");
for(int j=0;j<s[i].length;j++)
{
m+=s[i][j];
System.out.print(s[i][j]+" ");
}
System.out.println(m+" "+m/(float)s[i].length);
}
System.out.println("ÃÑÁ¡="+K+" "+E+" "+M);
}
}