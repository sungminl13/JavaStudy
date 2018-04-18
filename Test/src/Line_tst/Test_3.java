package Line_tst;

import java.util.ArrayList;
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


class Edge <W, V> {  // Edge를 하나의 클래스로 표현하여 입력 받음
private W weight; // edge에 부여된 가중치 
private V v; // edge 끝 부분에 있는 vertex의 번호

public void set_Edge(W weight, V v){ // edge에 값 setting하는 함수
    this.weight = weight;
    this.v = v;
    }

}



public class Test_3 {

		
//		// 인접 그래프
//	    static int nV;  // 총 vertex 개수 
//	    static int nE;  // 총 edge 개
//	 
//	    public static void main(String[] args) {
//	        
//	        Scanner scan = new Scanner(System.in);
//	        
//	        nV = scan.nextInt();
//	        nE = scan.nextInt();
//	        ArrayList<ArrayList<Integer>> ad = new <ArrayList<Integer>> ArrayList(); // 인접 리스트 초기화
//	        
//	        
//	        for(int i = 0; i < nV; i++){
//	            ad.add(new<Integer> ArrayList());  //ad 리스트에 담을 리스트 초기화
//	        }
//	        
//	        for(int i = 0; i < nE; i++){
//	            int t1, t2;         // vertex 두 개 입력 받기
//	            t1 = scan.nextInt();
//	            t2 = scan.nextInt();
//	            
//	            ad.get(t1).add(t2);   // 양방향 그래프이므로, vertex 1, 2 값 초기화 
//	            ad.get(t2).add(t1);
//	        }
//	        
//	    }
	
	
//	// 가중지 인접 그래프
//    static int nV;
//    static int nE;
//        
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Test_3 hello = new Test_3();
//        
//        nV = scan.nextInt();  // 전체 Vertex 개수 받기
//        nE = scan.nextInt();  // 전체 Edge 개수 받기
//        
//        ArrayList<Edge> ad = new <Edge> ArrayList();
//        Edge <Integer, Integer>ed = new  <Integer, Integer> Edge();
//        
//        for(int i = 0; i < nV; i++)
//            ad.add(new <Integer, Integer> Edge()); //edge 초기화 (메모리 할당)
//    
//        for(int i = 0; i < nE; i++){
//            int t1 = scan.nextInt(); // 시작 vertex 입력 받기
//            int t2 = scan.nextInt(); // 끝 vertex 입력 받기
//            int t3 = scan.nextInt(); // weight 입력 받기
//            
//            ad.get(t1).set_Edge(t2, t3);
//            ad.get(t2).set_Edge(t1, t3);
//        }
//    }


//    // 인접 행렬 구현
//    static int nE;
//    static int nV;
// 
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        nV = scan.nextInt();
//        nE = scan.nextInt();
//        int[][] ad = new int[nV+1][nV+1]; // Vertex의 이름을 그대로 사용하기 위해 (nV+1)(nV+1)개만큼 배열 생성
//        
//        for(int i = 0; i < nE; i++){
//            int t1 = scan.nextInt();
//            int t2 = scan.nextInt();
//            ad[t1][t2] = ad[t2][t1] = 1;  // 1대신 가중치를 넣으면 가중치 그래프 
//        }
//    }


	 

	
	
}
