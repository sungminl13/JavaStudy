package Line_tst;

//4. list 를 잘 알고있는지 확인하는 문제인듯. 아래 제가 풀다가 중간에 복사해놓은거예요. 
//   예외 처리로직 있어야함  : remove 할때 list가 null인 경우 exception 출력.
//
//*****input 값
//add 2
//add 5
//add 7    ->> 2,5,7
//min       ->> 2
//remove -> 5,7
//exit        -> 5,7 
//*****

 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Test_4 {
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String input ;
          ArrayList<Integer> arr = new ArrayList<>();
          ArrayList<Integer> result = new ArrayList<>();
    try{
     while( (input = br.readLine())!=null){
         String[] inputArr = input.split(" ");
        
         if( inputArr[0].equals("add")){
           add(arr , Integer.parseInt(inputArr[1]));
         } else if(inputArr[0].equals("min")){
               result.add(min(arr));
         }else if(inputArr[0].equals("remove")){
              result.add(remove(arr ));
         }else if(inputArr[0].equals("exit")){
              exit(result);
         }
     }
    } catch (NumberFormatException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
    } catch (IOException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
    }
   }
     
   public static ArrayList<Integer> add(ArrayList<Integer> arr , int input){ 
        arr.add( input );
        return arr;
   }
   public static int min(ArrayList<Integer> arr){  
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(arr);
        Collections.sort(temp);
        return temp.get(0);
        
   }
   public static int remove(ArrayList<Integer> arr){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(arr);
        arr.remove(0);
        return temp.get(0);
      }
   public static void exit(ArrayList<Integer> arr){//전체 결과 출력 
        for(int i = 0 ; i < arr.size();i++){
           System.out.println(arr.get(i));  
        }
    } 
}