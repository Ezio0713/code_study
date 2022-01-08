package qizengxin;

public class Customerview {
	CustomerList list1 = new CustomerList(80);
		public void mainmenu(){
			
			Customer example = new Customer("祁增新",'男',23,"16623027713","915712276@qq.com");
			list1.addCustomer(example);
			boolean flag = true;
			while(flag == true){
			//主界面
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出");
			System.out.println("                   请选择(1-5)");
			int key = CMUtility.readInt();
			switch(key){
			case 1:
				addCustomer();
				break;
			case 2:
				replaceCustomer();
				break;
			case 3: 
				delate();
				break;
			case 4:
				getlist();
				break;
			case 5:
				System.out.println("是否确定退出？(y/n)");
				char isout = CMUtility.readChar();
				if (isout == 'y') {
					flag = false;
					System.out.println("已退出");
				}
			}
			}
		}
		//前端增加用户操作
public void addCustomer(){
	System.out.println("---------------------添加客户---------------------");
	System.out.println("姓名： ");
	String name = CMUtility.readString(10);
	System.out.println("性别： ");
	char gender = CMUtility.readChar();
	System.out.println("年龄： ");
	int age = CMUtility.readInt();
	System.out.println("电话： ");
	String phone = CMUtility.readString(100);
	System.out.println("邮箱： ");
	String email = CMUtility.readString(100);
	Customer customer = new Customer(name,gender,age,phone,email);
	boolean isadd = list1.addCustomer(customer);
	if (isadd) {
		System.out.println("添加成功");
	}
	
	
}
//修改操作
public void  replaceCustomer(){
	System.out.println("---------------------修改客户---------------------");
	System.out.println("请选择待修改客户编号(-1退出)：");
	int position = CMUtility.readInt();
	if (position == -1) {
		System.out.println("已退出");
		return;}
	if (position > list1.getTotal() || position <= 0) {
		System.out.println("该用户不存在");
	}
	System.out.println("姓名： " + list1.getCustomers()[position - 1].getName());
	String name = CMUtility.readString(10, list1.getCustomers()[position - 1].getName());
	System.out.println("性别： " + list1.getCustomers()[position - 1].getGender());
	char gender = CMUtility.readChar(list1.getCustomers()[position - 1].getGender());
	System.out.println("年龄： " + list1.getCustomers()[position - 1].getAge());
	int age = CMUtility.readInt(list1.getCustomers()[position - 1].getAge());
	System.out.println("电话： " + list1.getCustomers()[position - 1].getPhone());
	String phone = CMUtility.readString(111, list1.getCustomers()[position - 1].getPhone());
	System.out.println("邮箱： " + list1.getCustomers()[position - 1].getEmail());
	String email = CMUtility.readString(100, list1.getCustomers()[position - 1].getEmail());
	Customer cust = new Customer(name,gender,age,phone,email);
	boolean isre = list1.replaceCustomer(position, cust);
	if (isre) {
		System.out.println("修改成功");
		
	}
	
}
//查询操作
public void getlist(){
	if (list1.getTotal() == 0) {
		System.out.println("没有数据！");
		return;
	}else{
	System.out.println("---------------------------客户列表---------------------------");
	System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
	Customer[] cust1 = list1.getCustomers();
	for (int i = 0; i < list1.getTotal(); i++) {
		int j = i+1;
		System.out.println(j + "\t" + cust1[i].getDetails());
	}
	System.out.println("-------------------------客户列表完成-------------------------");
	}
}
//删除操作
public void delate(){
	System.out.println("---------------------删除客户---------------------");
	System.out.println("请选择待删除客户编号(-1退出)：");
	int nu = CMUtility.readInt();
	boolean isde = list1.deleteCustomer(nu);
	if (isde) {
		System.out.println("删除成功！");
		return;
	}
		System.out.println("删除失败！");
}

public static void main(String[] args){
Customerview view = new Customerview();	
view.mainmenu();
}
}
