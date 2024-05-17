class Example3
{

      public static void main(String[] args)
      {
            int a=1;
            int b=2;
            boolean result;

            result = a>b; // 1이 2보다 큼?
            System.out.println("result="+ result);
            result = a==b; // 1과 2가 같음?
            System.out.println("result="+ result);
            result = a!=b; // 1이 2와 같지않음?
            System.out.println("result="+ result);
            result = a<=(b-1); // 1이 2-1 보다 작거나 같음?
            System.out.println("result="+ result);
     }
}