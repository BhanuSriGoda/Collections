import java.util.*;  
public class HashSet2{  
 public static void main(String args[]){  
    
    HashSet<Integer> set=new HashSet();  
           set.add(5);    
           set.add(2);    
           set.add(1);   
           set.add(8);  
           set.add(5);
           set.add(3); 
           set.add(2); 
           Iterator<Integer> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
} 