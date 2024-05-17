class FlowEx23
{
 public static void main(String[] args)
 {
  int E=0;
  int i=0;
  while(E+i<=100)
  {
   E+=++i;
   System.out.println(i+"-"+E);
  }
 }
}