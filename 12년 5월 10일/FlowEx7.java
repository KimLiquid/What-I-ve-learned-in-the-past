class FlowEx7
{
      public static void main(String[] args)
      {
            char ch=(char)(Math.random()*4+'A');
            int score=0;
            switch(ch)
            {
            case 'A':
                  score=90;
                  break;
            case 'B':
                  score=80;
                  break;
            case 'C':
                  score=70;
                  break;
            case 'D':
                  score=60;
                  break;
           }
           System.out.println("당신의점수는 "+ score +"이상이네요.");
      }
}