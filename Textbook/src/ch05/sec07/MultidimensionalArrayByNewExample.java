package ch05.sec07;

public class MultidimensionalArrayByNewExample {
	public static void main(String[] args) {
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
		//배열 항목 초기값 출력
		for (int i = 0; i < mathScores.length; i++) {			//반의 수만큼 반복
			for (int k = 0; k < mathScores[i].length; k++) {	//해당 반의 학생 수만큼 반복
				System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
			}
		}
	System.out.println();
	}


}
