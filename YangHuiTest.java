class YangHuiTest {
	public static void main(String[] args) {

		//������ά�������������
		int [][] yangHui = new int[10][];

		//�����������
		/*
		for(int i = 1; i <= yangHui.length; i++){
			yangHui[i-1] = new int[i];
			//ÿһ�еĵ�һ�����Ķ���1
			yangHui[i-1][0] = 1;
			yangHui[i-1][yangHui[i-1].length - 1] = 1;
			//��ÿһ�е�����Ԫ�ظ�ֵ
			for(int j = 1;j < yangHui[i-1].length - 1;j++ ){
				yangHui[i-1][j] = yangHui[i-2][j] + yangHui[i-2][j-1];
			}
		}*/

		for(int i = 0; i < yangHui.length; i++){
			yangHui[i] = new int[i+1];
			//ÿһ�еĵ�һ�����Ķ���1
			yangHui[i][0] = yangHui[i][yangHui[i].length - 1] = 1;
			//��ÿһ�е�����Ԫ�ظ�ֵ
			for(int j = 1;j < yangHui[i].length - 1;j++ ){
				yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
			}
		}

		//��ӡ�������
		for(int [] subarr : yangHui){
			for(int i : subarr){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
