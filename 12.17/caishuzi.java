/*
1.��������Ϸ
��������һ�����֣������ж���������������ɵ�������Ƚ�
������ˣ�������ˣ����С�ˣ����С��
ֱ������Ϊֹ������ֹͣ
����

*/
import java.util.Scanner;
class caishuzi 
{
	public static void main(String[] args) {
		int random2 = (int)(Math.random() * 100);	//ʹ��math���µ�random��������һ��[0.0,1.0�������������ת��Ϊ[0��100��.
	
	while (true)
	{
		System.out.println("������һ������");
		Scanner scan = new Scanner(System.in);//ʵ����Scanner
		int luck = scan.nextInt();//��scan��������һ��int������ֵ
		if ( luck != random2){
			if (luck > random2){
				System.out.println("����");
				}else{
					System.out.println("С��");
					}


		}else{
			System.out.println("bingo");
			return;
			}

	}
	}
}
