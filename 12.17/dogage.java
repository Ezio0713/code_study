/*
我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每
一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
*/
import java.util.Scanner;
class ifgym2 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("你家狗多大？");
		double age = scan.nextDouble();
		String result = (age >= 2.0)? ("你家狗相当于人类的" + (21 + (age - 2.0) * 4.0) + "岁" ) : ("你家狗相当于人类的" + (age * (10.5)) + "岁");
		System.out.println(result);
		
	}
	public void method1(){
		System.out.println("你家狗多大？");
	}
	
}
