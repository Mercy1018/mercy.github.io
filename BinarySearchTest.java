/*
	1.�������(�ж�ĳ��Ԫ���Ƿ������������)
	--��������(���Բ���):int [] arr = {1,200,19,84,23,350,2000,23,167,666};
	--��������(���ֲ���):int [] arr = {1,19,23,32,84,167,200,350,666,2000};
		
*/
class BinarySearchTest {
	public static void main(String[] args) {
		int [] arr = {1,19,23,32,84,167,200,350,666,2000};

		//ʹ�ö��ֲ���23
		int low = 0;
		int high = arr.length - 1;
		int flag = - 1;
		while(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] > 200){
				high = mid - 1;
			}else if(arr[mid] < 200){
				low =  mid + 1;
			}else{
				flag = mid;
				break;
			}
		}
	
		if(flag == -1){
			System.out.println("Ԫ�ز����� "+flag);
		}else{
			System.out.println("Ԫ�ش��� " + flag);
		}
		
	}
}
