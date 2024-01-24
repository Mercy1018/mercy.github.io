/*
	1.数组查找(判断某个元素是否存在于数组中)
	--数组无序(线性查找):int [] arr = {1,200,19,84,23,350,2000,23,167,666};
	--数组有序(二分查找):int [] arr = {1,19,23,32,84,167,200,350,666,2000};
		
*/
class BinarySearchTest {
	public static void main(String[] args) {
		int [] arr = {1,19,23,32,84,167,200,350,666,2000};

		//使用二分查找23
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
			System.out.println("元素不存在 "+flag);
		}else{
			System.out.println("元素存在 " + flag);
		}
		
	}
}
