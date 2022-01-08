package qizengxin;

public class CustomerList {
		private Customer[] customers;
		int total = 0;
		public CustomerList(int length){
			customers = new Customer[length];
		}
		//增加功能（后端）
		public boolean addCustomer(Customer cust){
			if(total >= customers.length){
				return false;
			}
			customers[total++] = cust;
			return true;
		}
		//删除功能（后端）
		public boolean deleteCustomer(int index){
			if(index > total || index < -1 || index ==0){
				return false;
			}
			for(int i = index - 1;i <= total - i -1;i++){
				customers[i] = customers[i+1];
				customers[--total] = null;
			}
			return true;
		}
		//修改功能（后端）
		public boolean replaceCustomer(int index,Customer cust1){
			if(index > total || index < -1 || index ==0){
				return false;
			}
			customers[index - 1] = cust1;
			return true;
		}
		//查看功能
		public Customer[] getCustomers() {
			return customers;
		}
		//get总数
		public int getTotal() {
			return total;
		}
}
