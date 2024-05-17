class FlowEx6
{
      public static void main(String[] args)
      {
            int score=(int)(Math.random()*10)+1;
            switch(score*100)
            {
            case 100:
                    System.out.println("당신의점수는100이고 상품은 10000원짜리 자전거입니다.");
                    break;
            case 200:
                    System.out.println("당신의점수는200이고 상품은 100만원짜리 스마트TV입니다.");
                    break;
            case 300:
                    System.out.println("당신의점수는300이고 상품은 500만원짜리 노트북입니다.");
                    break;
            case 400:
                    System.out.println("당신의점수는400이고 상품은 람브로기니 자동차입니다.");
                    break;
            default:
                    System.out.println("유감스럽게도 상품이없으니 다음기회를 기다리세요.");
            }
      }
}
            