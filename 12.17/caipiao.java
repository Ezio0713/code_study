/*
�������뿪��һ�����Ʊ����Ϸ����������ز���һ����λ���Ĳ�Ʊ����ʾ�û�����
һ����λ����Ȼ��������Ĺ����ж��û��Ƿ���Ӯ��
1)����û��������ƥ���Ʊ��ʵ��˳�򣬽���10 000��Ԫ��
2)����û��������������ƥ���Ʊ���������֣���˳��һ�£����� 3 000��Ԫ��
3)����û������һ�����ֽ�����˳�������ƥ���Ʊ��һ�����֣�����1 000��Ԫ��
4)����û������һ�����ֽ������˳�������ƥ���Ʊ��һ�����֣�����500��Ԫ��
5)����û����������û��ƥ���κ�һ�����֣����Ʊ���ϡ�
��ʾ��ʹ��(int)(Math.random() * 90 + 10)�����������
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
			System.out.println("���д��ˣ�");
		}else if ()
		{
		}
		System.out.println("лл�ݹ�");
	}
}
