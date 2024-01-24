import java.util.Scanner;
class HomeWork {
	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		//创建数组存放成绩
		int [] scores = new int[5];
		//循环接受控制台输入
		int totalScore = 0;
		for(int i =0; i < scores.length;i++){
			do{
				System.out.print("请输入第"+(i+1)+"名学生的成绩[0 100]:");
				int score = scanner.nextInt();
				if(score >= 0 && score <= 100){
					scores[i] = score;
					//累加进总分中
					totalScore += score;
					break;	
				}else{
					System.out.println("成绩不合法[0 -100]");
				}
				
			}while(true);
		}

		//算出平均分
		int avgScore = totalScore / scores.length;

		//算出低于平均分的人数
		int count = 0;
		for(int score : scores){
			if(score < avgScore) count++;
		}

		System.out.println("低于平均分的人数:"+count);
		*/
		//花色
		String [] types = {"红桃","黑桃","方片","梅花"};
		//数字
		String [] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//定义数组生成扑克
		String [] cards = new String [54];
		int index = 0;
		for(String type : types){
			for(String number : numbers){
				cards[index++] = type + number;
			}
		}
		cards[cards.length - 2] = "小王";
		cards[cards.length - 1] = "大王";
		//洗牌
		String [] shuffledCards = new String [54];

		//已抽取牌的索引
		int [] extracted = new int[54];
		for(int i = 0;i < extracted.length;i++){
			extracted[i] = -1;
		}

		for(int i = 0; i < shuffledCards.length;i++){
			do{
				int randomNumber = (int)(Math.random()*54);
				//判断随机的数组是否已经抽取过了
				int flag = 0;
				for(int j = 0; j < extracted.length;j++){
					if(extracted[j] == randomNumber){
						flag = -1;
						break;
					}
				}
				if(flag == 0){
					extracted[i] = randomNumber;
					shuffledCards[i] = cards[randomNumber];
					break;
				}
			}while(true);	
		}
		
		//遍历
		for(String card : shuffledCards){
			System.out.println(card);
		}
	}
}
