class FlowEx24
{
 public static void main(String[] args) throws java.io.IOException
 {
  int ��=0;
  System.out.println("�������Է��Ͻÿ�.");
  System.out.println("�Է�����ġ���� x �� ġ�ʽÿ�.");
  do
  {
   ��=System.in.read();
   System.out.print((char)��);
  }
  while(��!=-1&&��!='x');
 }
}