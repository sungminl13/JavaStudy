package Line_tst;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//3. 자료구조 - 그래프 문제 :: 정확하게 기억은 안나는데 이런 유형이였음. 
//그래프 (입력값이 아래와같은 유형으로 나옴 )
//  1,2
//  1,3
//  1,4
//  2,1
//  3,1
//  4,3
//===>>> 1<->2 , 1 <->3 , 1<->4 , 4 ->3 이런식으로 연결됨
//
//이때 결과가 3이 나올수 있는지 없는지 확인? (간선이 3개로 연결될 수 있는 경우가 있는지?) 
//-> (1,4) -> (4,3)-> (3,1)  이 케이스가 있으므로 결과는 true
//
//
//
//** 그래프 문제 풀어보심 도움 많이 될것같아요 


//class Edge <W, V> {  // Edge를 하나의 클래스로 표현하여 입력 받음
//private W weight; // edge에 부여된 가중치 
//private V v; // edge 끝 부분에 있는 vertex의 번호
//
//public void set_Edge(W weight, V v){ // edge에 값 setting하는 함수
//    this.weight = weight;
//    this.v = v;
//    }
//
//}



public class Test_3 {



 
    public static void main(String[] args) throws java.lang.Exception {
    	
        int nodeE = 0;
        int nodeV = 0;
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        nodeE = Integer.parseInt(input);

        
        
        
//        int[][] ad = new int[nV+1][nV+1]; // Vertex의 이름을 그대로 사용하기 위해 (nV+1)(nV+1)개만큼 배열 생성
//        
//        for(int i = 0; i < nE; i++){
//            int t1 = scan.nextInt();
//            int t2 = scan.nextInt();
//            ad[t1][t2] = ad[t2][t1] = 1;  // 1대신 가중치를 넣으면 가중치 그래프 
//        }
    }


	 

	
	
}
