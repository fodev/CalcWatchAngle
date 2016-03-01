import java.util.Scanner;

/**
 * 
 * @author sb
 * date : 16/02/29
 * AnalogueWatch
 * 
 */


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hour : ");
		int hour=sc.nextInt();
		System.out.print("Minute : ");
		int minute=sc.nextInt();
		
		final int WATCH_ANGLE=360;//시계의 총 각도
		final int hourPerAngle=WATCH_ANGLE/12;//1시간당 각도 
		final int minutePerAngle=WATCH_ANGLE/60;//1분당 각도
		
		//60분당 시침이 30도 씩 이동 1분당 0.5도이동
		double totalHourAngle=hourPerAngle*hour+(minute*0.5);
		double totalMinuteAngle=minutePerAngle*minute;
		
		System.out.println(Math.abs(totalHourAngle-totalMinuteAngle));//절대 값을 통해 결과계산.
	}
}

