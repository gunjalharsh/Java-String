public class string12{
      public static void main(String[] args) {
            String s = "harshal abc";
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i < s.length();i++){
                  char c = s.charAt(i);
                  if(c%2 != 0){
                        c = (char)(c+1);
                        sb.append(c);
                  }
                  else
                        sb.append(c);
            }
      System.out.println(sb.toString());
      }
}