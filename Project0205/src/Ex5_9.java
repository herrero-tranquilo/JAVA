import java.io.PrintStream;

public class Ex5_9 {

	public static void main(String[] args) {
		int[][] score= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
	};
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		System.out.println("��ȣ ���� ���� ���� ���� ���");

		for (int i =0 ; i<score.length;i++) {
			int sum =0;
			float avg = 0.0f;
			 korTotal += score[i][0];
			 engTotal += score[i][1];
			 mathTotal+= score[i][2];
			 
		}
}

}
