/*
假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入
一个两位数，然后按照下面的规则判定用户是否能赢。
1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
提示：使用(int)(Math.random() * 90 + 10)产生随机数。
Math.random() : [0,1) * 90 ?[0,90) + 10 ?[10,100) ? [10,99]

*/
import java.util.Scanner;
class caipiao  
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int luck = scan.nextInt();
		int random = (int)(Math.random() * 90 + 10);
		System.out.println(random);
		int luckshi = luck / 10;
		int luckge = luck % 10;
		int randomshi = random / 10;
		int randomge = random % 10;
		if (luck == random)
		{
			System.out.println("你中大奖了！");
		}else if ()
		{
		}
		System.out.println("谢谢惠顾");
	}
}
