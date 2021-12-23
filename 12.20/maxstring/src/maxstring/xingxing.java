/*
		*
		**
		***
		****
		*****
		****
		***
		**
		*
的实现
		*/
package maxstring;
class XingTirangle 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <=5 ;i++ ){
			for (int j = 1;j <= i ;j++ )
				{
				System.out.print('*');
				}
			System.out.println();
		}
		for (int i = 1;i <= 4 ;i++ )
		{	for (int j = 1;j <= 5-i ;j++ )
			{
			System.out.print('*');
			}
			System.out.println();
		}
/*
----* 
---* * 
--* * * 
-* * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    *
	的实现
	*/
	for (int i = 1;i <=5 ;i++ ){
			for (int k = 1;k <= 5-i ;k++ )
					{
					System.out.print(' ');
					}
			for (int j = 1;j <= i ;j++ )
				{ 
				System.out.print('*');
				System.out.print(' ');
				}
			System.out.println();
		}
	for (int i = 1;i <= 4 ;i++ )
		{
		for (int k = 1;k <= i ;k++ ){
					System.out.print(' ');
					}
		for (int j = 1;j <= 5-i ;j++ ){ 
					System.out.print('*');
					System.out.print(' ');
					}
			System.out.println();
		}		


	}
}
