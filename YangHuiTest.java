class YangHuiTest {
	public static void main(String[] args) {

		//声明二维数组存放杨辉三角
		int [][] yangHui = new int[10][];

		//生成杨辉三角
		/*
		for(int i = 1; i <= yangHui.length; i++){
			yangHui[i-1] = new int[i];
			//每一行的第一和最后的都是1
			yangHui[i-1][0] = 1;
			yangHui[i-1][yangHui[i-1].length - 1] = 1;
			//给每一行的其他元素赋值
			for(int j = 1;j < yangHui[i-1].length - 1;j++ ){
				yangHui[i-1][j] = yangHui[i-2][j] + yangHui[i-2][j-1];
			}
		}*/

		for(int i = 0; i < yangHui.length; i++){
			yangHui[i] = new int[i+1];
			//每一行的第一和最后的都是1
			yangHui[i][0] = yangHui[i][yangHui[i].length - 1] = 1;
			//给每一行的其他元素赋值
			for(int j = 1;j < yangHui[i].length - 1;j++ ){
				yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
			}
		}

		//打印杨辉三角
		for(int [] subarr : yangHui){
			for(int i : subarr){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
