/*
1.猜数字游戏
任意输入一个数字，程序判断输入的数字与生成的随机数比较
如果大了，输入大了，如果小了，输出小了
直到猜中为止。程序停止
分析

*/
import java.util.Scanner;
class caishuzi 
{
	public static void main(String[] args) {
		int random2 = (int)(Math.random() * 100);	//使用math类下的random功能生成一个[0.0,1.0）的随机数，并转换为[0，100）.
	
	while (true)
	{
		System.out.println("请输入一个数字");
		Scanner scan = new Scanner(System.in);//实例化Scanner
		int luck = scan.nextInt();//让scan方法接收一个int类型数值
		if ( luck != random2){
			if (luck > random2){
				System.out.println("大了");
				}else{
					System.out.println("小了");
					}


		}else{
			System.out.println("bingo");
			return;
			}

	}
	}
}
