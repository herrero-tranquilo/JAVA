import java.util.*;

public class InputTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�¾ �ظ� �Է� �� �ּ���");
		int num = scanner.nextInt();
		System.out.printf("%d ���Դϴ�.",new Date().getYear()- num+1);
	}

}
