package Line_tst;

import java.util.ArrayList;
import java.util.Scanner;

//3. �ڷᱸ�� - �׷��� ���� :: ��Ȯ�ϰ� ����� �ȳ��µ� �̷� �����̿���. 
//�׷��� (�Է°��� �Ʒ��Ͱ��� �������� ���� )
//  1,2
//  1,3
//  1,4
//  2,1
//  3,1
//  4,3
//===>>> 1<->2 , 1 <->3 , 1<->4 , 4 ->3 �̷������� �����
//
//�̶� ����� 3�� ���ü� �ִ��� ������ Ȯ��? (������ 3���� ����� �� �ִ� ��찡 �ִ���?) 
//-> (1,4) -> (4,3)-> (3,1)  �� ���̽��� �����Ƿ� ����� true
//
//
//
//** �׷��� ���� Ǯ��� ���� ���� �ɰͰ��ƿ� 


class Edge <W, V> {  // Edge�� �ϳ��� Ŭ������ ǥ���Ͽ� �Է� ����
private W weight; // edge�� �ο��� ����ġ 
private V v; // edge �� �κп� �ִ� vertex�� ��ȣ

public void set_Edge(W weight, V v){ // edge�� �� setting�ϴ� �Լ�
    this.weight = weight;
    this.v = v;
    }

}



public class Test_3 {

		
//		// ���� �׷���
//	    static int nV;  // �� vertex ���� 
//	    static int nE;  // �� edge ��
//	 
//	    public static void main(String[] args) {
//	        
//	        Scanner scan = new Scanner(System.in);
//	        
//	        nV = scan.nextInt();
//	        nE = scan.nextInt();
//	        ArrayList<ArrayList<Integer>> ad = new <ArrayList<Integer>> ArrayList(); // ���� ����Ʈ �ʱ�ȭ
//	        
//	        
//	        for(int i = 0; i < nV; i++){
//	            ad.add(new<Integer> ArrayList());  //ad ����Ʈ�� ���� ����Ʈ �ʱ�ȭ
//	        }
//	        
//	        for(int i = 0; i < nE; i++){
//	            int t1, t2;         // vertex �� �� �Է� �ޱ�
//	            t1 = scan.nextInt();
//	            t2 = scan.nextInt();
//	            
//	            ad.get(t1).add(t2);   // ����� �׷����̹Ƿ�, vertex 1, 2 �� �ʱ�ȭ 
//	            ad.get(t2).add(t1);
//	        }
//	        
//	    }
	
	
//	// ������ ���� �׷���
//    static int nV;
//    static int nE;
//        
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Test_3 hello = new Test_3();
//        
//        nV = scan.nextInt();  // ��ü Vertex ���� �ޱ�
//        nE = scan.nextInt();  // ��ü Edge ���� �ޱ�
//        
//        ArrayList<Edge> ad = new <Edge> ArrayList();
//        Edge <Integer, Integer>ed = new  <Integer, Integer> Edge();
//        
//        for(int i = 0; i < nV; i++)
//            ad.add(new <Integer, Integer> Edge()); //edge �ʱ�ȭ (�޸� �Ҵ�)
//    
//        for(int i = 0; i < nE; i++){
//            int t1 = scan.nextInt(); // ���� vertex �Է� �ޱ�
//            int t2 = scan.nextInt(); // �� vertex �Է� �ޱ�
//            int t3 = scan.nextInt(); // weight �Է� �ޱ�
//            
//            ad.get(t1).set_Edge(t2, t3);
//            ad.get(t2).set_Edge(t1, t3);
//        }
//    }


//    // ���� ��� ����
//    static int nE;
//    static int nV;
// 
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        nV = scan.nextInt();
//        nE = scan.nextInt();
//        int[][] ad = new int[nV+1][nV+1]; // Vertex�� �̸��� �״�� ����ϱ� ���� (nV+1)(nV+1)����ŭ �迭 ����
//        
//        for(int i = 0; i < nE; i++){
//            int t1 = scan.nextInt();
//            int t2 = scan.nextInt();
//            ad[t1][t2] = ad[t2][t1] = 1;  // 1��� ����ġ�� ������ ����ġ �׷��� 
//        }
//    }


	 

	
	
}
