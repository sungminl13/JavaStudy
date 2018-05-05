package Line_tst;

//4. list �� �� �˰��ִ��� Ȯ���ϴ� �����ε�. �Ʒ� ���� Ǯ�ٰ� �߰��� �����س����ſ���. 

//   ���� ó������ �־����  : remove �Ҷ� list�� null�� ��� exception ���.
//
//*****input ��
//add 2
//add 5
//add 7    ->> 2,5,7
//min       ->> 2
//remove -> 5,7
//exit        -> 5,7 
//*****

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class java_10 {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;

		LinkedHashMap <Integer, Integer> resultMap = new LinkedHashMap <Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<>();

		while ((input = br.readLine()) != null) {
			String[] inputArr = input.split(" ");

			if (inputArr[0].equals("add")) {
				add(resultMap,Integer.parseInt(inputArr[1]),Integer.parseInt(inputArr[2]));
			} else if (inputArr[0].equals("get")) {
				get(result,resultMap,Integer.parseInt(inputArr[1]));
			} else if (inputArr[0].equals("evict")) {
				evict(resultMap);
			} else if (inputArr[0].equals("remove")) {
				remove(result,resultMap,Integer.parseInt(inputArr[1]));
			} else if (inputArr[0].equals("exit")) {
				exit(result);
				break;
			}
		}

	}

	public static void evict(LinkedHashMap<Integer, Integer> resultMap) {
		

	}

	public static LinkedHashMap<Integer, Integer> add(LinkedHashMap<Integer, Integer> resultMap, int key, int value) {
		resultMap.put(key, value);
		return resultMap;
	}

	public static void remove(ArrayList<Integer> result, LinkedHashMap<Integer, Integer> resultMap, int Key) {
		int resultValue = 0;
		try {
			resultValue = resultMap.get(Key);
			resultMap.remove(Key);
		}catch(Exception e){
			resultValue=  -1;
		}finally{
			result.add(resultValue);
		}
	}

	public static void get(ArrayList<Integer> result, LinkedHashMap<Integer, Integer> resultMap, int key) {
		int resultValue = 0;
		try {
			resultValue = resultMap.get(key);
		}catch(Exception e){
			resultValue=  -1;
		}finally{
			result.add(resultValue);
		}
		
	}

	public static void exit(ArrayList<Integer> result) {// ��ü ��� ���
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}