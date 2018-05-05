package Line_tst;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//문제
//직사각형의 가로의 길이와 세로의 길이가 주어 졌을 때 해당 사각형의 넓이를 출력하는 프로그램을 작성하시오
//
//입력
//입력의 첫 줄에는 사각형의 가로와 세로가 주어집니다. 가로와 세로는 공백으로 구분 되며  0 ~ 1024 사이의 임의의 정수가 주어집니다.
//
//4 3
//출력
//출력의 첫줄에 사각형의 넓이를 출력 합니다.
//
//12

public class Test_9 {

	public static void main(String[] args) throws java.lang.Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        String axixArray[] = new String[2];
        axixArray =  input.split(" ");
        int area = 0;
        int horizontal = Integer.parseInt(axixArray[0]);
        int Vertical = Integer.parseInt(axixArray[1]);
        
        
        if(horizontal<0||horizontal>1024){
        	throw new NumberFormatException();
        }else if(Vertical<0||Vertical>1024){
        	throw new NumberFormatException();
        }else{
        	area = Integer.parseInt(axixArray[0]) * Integer.parseInt(axixArray[1]);
        	System.out.println(area);
        }
        
        
	}

}
