package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random random = new Random();
		//ランダムに数字を出すシステムを初期化
		Scanner scanner = new Scanner(System.in);
		//ユーザーの入力を受けるスキャナーを初期化
		System.out.println("商品名を『』で区切って入力してください");
		//入力方を表示
		while (true) {
			//無限ループにすることで入力回数の縛りを無くす
			String input = scanner.nextLine();
			//ユーザーの入力した値をinput変数に代入
			String[] products = input.split("、");
			//ユーザーの入力を,で分割しproducts変数に配列として代入
			for (String product : products) {
				//入力された商品毎に処理を行う拡張for文を作成
				//先ほど作成した配列をproduct変数に順番に代入し下記の処理を行う
				String message;
				switch (product) {
				//変数productに代入された値でswitch文を開始
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
				case "テレビ":
				case "ディスプレイ":
					int count = random.nextInt(12);
					//変数countに０〜１１のランダムな整数を代入
					message = product + "の残り台数は" + count + "台です";
					//変数massageに代入
					break;
					//上記が実行されればここで処理終了
				default:
				//どのcaseとも一致しなければ下記が実行される
					message = product + "は指定の商品ではありません";
				}
				System.out.println(message);
				//変数messageを表示
			}
		}
	}
}
