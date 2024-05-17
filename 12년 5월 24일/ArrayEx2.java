class ArrayEx2
{
public static void main(String[] args)
{
int[] S={79,88,33,100,95};
int X=S[0];
int M=S[0];
for(int i=1;i<S.length;i++)
{
if(S[i]>X)
{
X=S[i];
}
if(S[i]<M)
{
M=S[i];
}
}
System.out.println("최대="+X);
System.out.println("최소="+M);
}
}