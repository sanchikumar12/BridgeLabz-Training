package Day_07_Classwork;

public class Reverse {

    public static void main(String[] args) {
        String s ="Sanchit";
        
        System.out.println(reverse(s,new StringBuilder() ,s.length()-1));
        
  }
  
  public static String reverse(String ss,StringBuilder builder,int i){
      if(i<0){
          return builder.toString();
      }
        char _c=ss.charAt(i);
        builder.append(_c);
      return reverse(ss,builder,i-1);
  }

}
