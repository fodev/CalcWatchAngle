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
		
		final int WATCH_ANGLE=360;//�ð��� �� ����
		final int hourPerAngle=WATCH_ANGLE/12;//1�ð��� ���� 
		final int minutePerAngle=WATCH_ANGLE/60;//1�д� ����
		
		//60�д� ��ħ�� 30�� �� �̵� 1�д� 0.5���̵�
		double totalHourAngle=hourPerAngle*hour+(minute*0.5);
		double totalMinuteAngle=minutePerAngle*minute;
		
		System.out.println(Math.abs(totalHourAngle-totalMinuteAngle));//���� ���� ���� ������.
	}
}

