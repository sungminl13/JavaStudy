package Line_tst;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//����
//���簢���� ������ ���̿� ������ ���̰� �־� ���� �� �ش� �簢���� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//
//�Է�
//�Է��� ù �ٿ��� �簢���� ���ο� ���ΰ� �־����ϴ�. ���ο� ���δ� �������� ���� �Ǹ�  0 ~ 1024 ������ ������ ������ �־����ϴ�.
//
//4 3
//���
//����� ù�ٿ� �簢���� ���̸� ��� �մϴ�.
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
