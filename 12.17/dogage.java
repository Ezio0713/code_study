/*
�ҼҵĹ�5���ˣ�5��Ĺ��൱���������أ���ʵ������ǰ����ÿ
һ���൱�������10.5�֮꣬��ÿ����һ����������ꡣ��ô5��Ĺ�
�൱��������������أ�Ӧ���ǣ�10.5 + 10.5 + 4 + 4 + 4 = 33�ꡣ
*/
import java.util.Scanner;
class ifgym2 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��ҹ����");
		double age = scan.nextDouble();
		String result = (age >= 2.0)? ("��ҹ��൱�������" + (21 + (age - 2.0) * 4.0) + "��" ) : ("��ҹ��൱�������" + (age * (10.5)) + "��");
		System.out.println(result);
		
	}
	public void method1(){
		System.out.println("��ҹ����");
	}
	
}
