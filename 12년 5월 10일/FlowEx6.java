class FlowEx6
{
      public static void main(String[] args)
      {
            int score=(int)(Math.random()*10)+1;
            switch(score*100)
            {
            case 100:
                    System.out.println("�����������100�̰� ��ǰ�� 10000��¥�� �������Դϴ�.");
                    break;
            case 200:
                    System.out.println("�����������200�̰� ��ǰ�� 100����¥�� ����ƮTV�Դϴ�.");
                    break;
            case 300:
                    System.out.println("�����������300�̰� ��ǰ�� 500����¥�� ��Ʈ���Դϴ�.");
                    break;
            case 400:
                    System.out.println("�����������400�̰� ��ǰ�� ����α�� �ڵ����Դϴ�.");
                    break;
            default:
                    System.out.println("���������Ե� ��ǰ�̾����� ������ȸ�� ��ٸ�����.");
            }
      }
}
            