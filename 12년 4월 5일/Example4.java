class Example4
{

      public static void main(String[] args)
      {
            char ch = 'A';    // char ch = '\u0041';로 바꿔써도 같음.
            int code = (int)ch; // ch에 저장된 값을 int형으로 변환하여 저장함
            System.out.println(ch);
            System.out.println(code);
      }
}