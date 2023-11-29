package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i <= 9; i++) {
		//変数iに１〜９の整数を順に代入
			for(int j = 1; j <= 9; j++) {
			//変数jに１〜９の整数を代入
				int m = i*j;
				//変数mにiかけるjを代入
				String formatted = String.format("%02d",m);
				//変数mの値を2桁に変換
				System.out.print(" "+"0"+i+" "+"*"+" "+"0"+j+" "+"="+" "+formatted);
				if(j < 9) {
				//jの値が９より小さい時に下記を表示する
					System.out.print(" "+"||");
				}
			}
			System.out.println();
			//改行 
		}
	}
}
