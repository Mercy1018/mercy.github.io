import java.util.Scanner;
class HomeWork {
	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		//���������ųɼ�
		int [] scores = new int[5];
		//ѭ�����ܿ���̨����
		int totalScore = 0;
		for(int i =0; i < scores.length;i++){
			do{
				System.out.print("�������"+(i+1)+"��ѧ���ĳɼ�[0 100]:");
				int score = scanner.nextInt();
				if(score >= 0 && score <= 100){
					scores[i] = score;
					//�ۼӽ��ܷ���
					totalScore += score;
					break;	
				}else{
					System.out.println("�ɼ����Ϸ�[0 -100]");
				}
				
			}while(true);
		}

		//���ƽ����
		int avgScore = totalScore / scores.length;

		//�������ƽ���ֵ�����
		int count = 0;
		for(int score : scores){
			if(score < avgScore) count++;
		}

		System.out.println("����ƽ���ֵ�����:"+count);
		*/
		//��ɫ
		String [] types = {"����","����","��Ƭ","÷��"};
		//����
		String [] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//�������������˿�
		String [] cards = new String [54];
		int index = 0;
		for(String type : types){
			for(String number : numbers){
				cards[index++] = type + number;
			}
		}
		cards[cards.length - 2] = "С��";
		cards[cards.length - 1] = "����";
		//ϴ��
		String [] shuffledCards = new String [54];

		//�ѳ�ȡ�Ƶ�����
		int [] extracted = new int[54];
		for(int i = 0;i < extracted.length;i++){
			extracted[i] = -1;
		}

		for(int i = 0; i < shuffledCards.length;i++){
			do{
				int randomNumber = (int)(Math.random()*54);
				//�ж�����������Ƿ��Ѿ���ȡ����
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
		
		//����
		for(String card : shuffledCards){
			System.out.println(card);
		}
	}
}
