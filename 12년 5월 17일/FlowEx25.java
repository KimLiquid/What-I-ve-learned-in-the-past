class FlowEx25
{
 public static void main(String[] args)
 {
  int a=0;
  int b=1;
  while(true)
  {
   if(a>100)
   break;
   a+=b;
   b++;
  }
  System.out.println("b="+b);
  System.out.println("a="+a);
 }
}