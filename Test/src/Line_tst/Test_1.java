package Line_tst;

public class Test_1 {
 // 사각형 넓이 구하는 문제
	public static void main(String[] args) {
        //String [] s = {"0.0 0.0 4.0 4.0", "1.0 1.0 3.0 3.0"};
        String [] s = {"1.0 0.0 5.0 2.0", "2.0 0.0 4.0 5.0", "0.0 1.0 6.0 3.0", "10.0 10.0 12.0 12.0"};

        Float [] xPositions = new Float[2*s.length];
        Float [] yPositions = new Float[2*s.length];

        Float tmp    = 0.0f;
        Float result = 0.0f;

        //입력된 위치정보를 x, y 배열로 각각 등록
        for(int i=0 ; i<s.length ; i++) {
            xPositions[2*i]   = Float.parseFloat(s[i].split(" ")[0]);
            yPositions[2*i]   = Float.parseFloat(s[i].split(" ")[1]);
            xPositions[2*i+1] = Float.parseFloat(s[i].split(" ")[2]);
            yPositions[2*i+1] = Float.parseFloat(s[i].split(" ")[3]);
        }
        //나중 넓이 계산을 위해 x, y 좌표를 복사
        Float [] xPositionsInput = xPositions.clone();
        Float [] yPositionsInput = yPositions.clone();

        //x배열을 오름차순으로 정렬
        for(int i=0 ; i<xPositions.length ; i++){
            for( int j=i ; j<xPositions.length ; j++){
                if(xPositions[i] > xPositions[j]){
                    tmp = xPositions[i];
                    xPositions[i] = xPositions[j];
                    xPositions[j] = tmp;
                }
            }
        }
        //y배열을 오름차순으로 정렬
        for(int i=0 ; i<yPositions.length ; i++){
            for( int j=i ; j<yPositions.length ; j++){
                if(yPositions[i] > yPositions[j]){
                    tmp = yPositions[i];
                    yPositions[i] = yPositions[j];
                    yPositions[j] = tmp;
                }
            }
        }

        // 정렬된 x, y 배열은 입력된 사각형들을 겹치는 위치를 기준으로 모두 쪼개서 각각의 위치정보를 저장하고 있음
        // 이 각각의 조각들이 입력된 사각형들중 하나에라도 포함된다면 넓이에 합하면 됨
        // 위에서 복사해둔 PositionsInput 배열로 입력된 사각형 위치정보 확인
        for(int x=0 ; x<xPositions.length-1 ; x++){
            for(int y=0 ; y<yPositions.length-1 ; y++){
                for(int cnt=0 ; cnt<s.length ; cnt++){

                    //System.out.println("위치 = x : "+x+" y : "+y);
                    //System.out.println("시작점 = "+ xPositions[x]+", "+yPositions[y]);
                    //System.out.println("끝점 =   "+ xPositions[x+1]+", "+yPositions[y+1]);

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
