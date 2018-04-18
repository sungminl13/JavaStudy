package Line_tst;

public class Test_1 {
 // �簢�� ���� ���ϴ� ����
	public static void main(String[] args) {
        //String [] s = {"0.0 0.0 4.0 4.0", "1.0 1.0 3.0 3.0"};
        String [] s = {"1.0 0.0 5.0 2.0", "2.0 0.0 4.0 5.0", "0.0 1.0 6.0 3.0", "10.0 10.0 12.0 12.0"};

        Float [] xPositions = new Float[2*s.length];
        Float [] yPositions = new Float[2*s.length];

        Float tmp    = 0.0f;
        Float result = 0.0f;

        //�Էµ� ��ġ������ x, y �迭�� ���� ���
        for(int i=0 ; i<s.length ; i++) {
            xPositions[2*i]   = Float.parseFloat(s[i].split(" ")[0]);
            yPositions[2*i]   = Float.parseFloat(s[i].split(" ")[1]);
            xPositions[2*i+1] = Float.parseFloat(s[i].split(" ")[2]);
            yPositions[2*i+1] = Float.parseFloat(s[i].split(" ")[3]);
        }
        //���� ���� ����� ���� x, y ��ǥ�� ����
        Float [] xPositionsInput = xPositions.clone();
        Float [] yPositionsInput = yPositions.clone();

        //x�迭�� ������������ ����
        for(int i=0 ; i<xPositions.length ; i++){
            for( int j=i ; j<xPositions.length ; j++){
                if(xPositions[i] > xPositions[j]){
                    tmp = xPositions[i];
                    xPositions[i] = xPositions[j];
                    xPositions[j] = tmp;
                }
            }
        }
        //y�迭�� ������������ ����
        for(int i=0 ; i<yPositions.length ; i++){
            for( int j=i ; j<yPositions.length ; j++){
                if(yPositions[i] > yPositions[j]){
                    tmp = yPositions[i];
                    yPositions[i] = yPositions[j];
                    yPositions[j] = tmp;
                }
            }
        }

        // ���ĵ� x, y �迭�� �Էµ� �簢������ ��ġ�� ��ġ�� �������� ��� �ɰ��� ������ ��ġ������ �����ϰ� ����
        // �� ������ �������� �Էµ� �簢������ �ϳ����� ���Եȴٸ� ���̿� ���ϸ� ��
        // ������ �����ص� PositionsInput �迭�� �Էµ� �簢�� ��ġ���� Ȯ��
        for(int x=0 ; x<xPositions.length-1 ; x++){
            for(int y=0 ; y<yPositions.length-1 ; y++){
                for(int cnt=0 ; cnt<s.length ; cnt++){

                    //System.out.println("��ġ = x : "+x+" y : "+y);
                    //System.out.println("������ = "+ xPositions[x]+", "+yPositions[y]);
                    //System.out.println("���� =   "+ xPositions[x+1]+", "+yPositions[y+1]);

                    if( xPositions[x] >= xPositionsInput[2*cnt] && xPositions[x+1] <= xPositionsInput[2*cnt+1] &&
                        yPositions[y] >= yPositionsInput[2*cnt] && yPositions[y+1] <= yPositionsInput[2*cnt+1]) {
                        result += (xPositions[x+1] - xPositions[x]) * (yPositions[y+1] - yPositions[y]);
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
