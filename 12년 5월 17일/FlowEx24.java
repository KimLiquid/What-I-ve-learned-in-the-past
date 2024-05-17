class FlowEx24
{
 public static void main(String[] args) throws java.io.IOException
 {
  int 가=0;
  System.out.println("문장을입력하시요.");
  System.out.println("입력을마치려면 x 를 치십시요.");
  do
  {
   가=System.in.read();
   System.out.print((char)가);
  }
  while(가!=-1&&가!='x');
 }
}