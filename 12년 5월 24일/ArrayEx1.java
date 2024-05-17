class ArrayEx1
{
public static void main(String[] args)
{
int S=0;
float A=0f;
int []C={100,88,100,100,90};
for (int i=0; i<C.length;i++)
{
S+=C[i];
}
A=S/(float)C.length;
System.out.println("ÃÑÁ¡="+S);
System.out.println("Æò±Õ="+A);
}
}