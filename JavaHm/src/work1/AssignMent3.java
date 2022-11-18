package work1;

public class AssignMent3 {

	public static void main(String[] args) {
/* Math.random() = 난수를 생성하는 방법 코드 > 그대로 출력 시 0.0과 같거나 크고 1.0보다 작은 값을 출력한다. (double인 실수가 나옴)
0.0<=Math.random() <1.0 1.0은 포함되지 않음

각 변에 범위 수를 곱하여 범위 내에 속하는 하나의 double타입 값을 얻음
0.0*6<=Math.random() <1.0*6

실수를 정수로 바꿔주기 위해 int를 사용해야함
(int)0.0*6<=(int)Math.random() <(int)1.0*6


각 변에 1을 더햐여 1~6까지 정수 중에서 하나의 정수를 얻을 수 있음
0+1<=Math.random() +1 < 6+1

*6을 하는 이유 = Math.random()은 소수점 0~1사이를 출력하기에 *6을 해야하고 +1을 해야지만 1~6의 숫자가 출력된다.

	 */
			
		int num1 = 0;
		int num2 = 0;
		while (num1 + num2 !=5) {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + ", " + num2 + " )");
			
		}
	}
}


