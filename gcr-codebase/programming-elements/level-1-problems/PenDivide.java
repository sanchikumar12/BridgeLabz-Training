import java.util.*;
public class  PenDivide{

public static void main(String[] agrs){
  

        int pen = 14;
        int students = 3;

        int result = (pen/students);
        int remain =(pen%students);

        System.out.println(
             "The Pen Per Student is "+ result + " and the remaining pen not distributed is" + remain
         );
  

}

}