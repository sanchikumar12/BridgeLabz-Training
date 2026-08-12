package Day_08_Classroom;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Subset
{
   public static List<ArrayList<Integer>> l;
    public static void main(String[] args) {
        l=new ArrayList<>();
        int [] e =new int[]{1,2,3,4};
         rec(e,0,new ArrayList<>());
         
         for(int i=0;i<l.size();i++){
             System.out.println(l.get(i));
         }
        
        
        
        
    }
    
    public static void rec(int [] e,int idx,ArrayList<Integer> list){
        
        if(idx>=e.length){
            l.add(new ArrayList<>(list));
            return ;
            
        }
        
        //include
        list.add(e[idx]);
        //call recursion forward
        
         rec(e,idx+1,list);
        
        //undo
        list.remove(list.size()-1);
        
        //Again Do recursion
         rec(e,idx+1,list);
        
        
    }
}