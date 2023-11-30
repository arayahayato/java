package curriculum_B;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		//scannerオブジェクトを作成しユーザーに名前を入力させる
		System.out.println("名前を入力してください");
		String name = scanner.nextLine();
		//ユーザーが入力した名前を変数nameに格納
		if (name.length() > 10) {
			//名前が10文字以上の際に下記の表示
			System.out.println("名前を10文字以内にしてください");
		} else if (name == null || name.isEmpty()) {
			//名前がnullもしくは空白の際に下記の表示
			System.out.println("名前を入力してください");
		} else if (!name.matches("^[A-Za-z0-9]+$")) {
			//半角英数字以外の入力の際に下記の表示
			System.out.println("半角英数字のみで名前を入力してください");
		} else {
			//それ以外は下記の表示
			System.out.println("ユーザー名「" + name + "」を登録しました");
			startRockPeperScissors(name);
			//RockPeperScissorsメソッドを開始　変数のnameをこのメソッドでも使用するために格納
		}
		scanner.close();
	}

	private static void startRockPeperScissors(String name) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		//変数scannerにユーザーが入力した値を格納
		System.out.println("ジャンケンするよ グーは：０　チョキは：１　パーは：２を入力してね");
		int janken_num = 0;
		//変数janken_numを宣言してじゃんけんの回数を格納する場所を作る
		int janken_win = 0;
		//変数janken_winを宣言してジャンケンに勝った回数を格納する場所を作る
		while (true) {
			//returnまで無限ループ
			try {
				long input = scanner.nextInt();
				janken_num++;
				//ユーザーの入力を変数inputに格納
				if (input == 0) {
					System.out.println(name + "の手はグー");
				} else if (input == 1) {
					System.out.println(name + "の手はチョキ");
				} else if (input == 2) {
					System.out.println(name + "の手はパー");
				} else {
					System.out.println("無効な入力です");
					continue;
					//0.1.２以外が入力された際にエラー文を表示してループを継続
				}

				Random rand = new Random();
				//Randamクラス（ランダムにしてくれる）を使用し変数randに格納
				int computer = rand.nextInt(3);
				//randインスタンスを使用して０~２の範囲でランダムな整数を生成し変数computerに格納
				if (computer == 0) {
					System.out.println("相手の手はグー");
				} else if (computer == 1) {
					System.out.println("相手の手はチョキ");
				} else if (computer == 2) {
					System.out.println("相手の手はパー");
				}
				;
				if ((input == 0) && (computer == 1) || (input == 1) && (computer == 2)
						|| (input == 2) && (computer == 0)) {
					//コンピューターがユーザーに負けると下記を表示
					System.out.println("やるやん\n次は俺にリベンジさせて");
					janken_win++;
					//勝利した回数をカウント
				} else if ((input == 1) && (computer == 0)) {
					//ユーザーがグーに負けると下記を表示
					System.out.println("俺の勝ち\n負けは次につながるチャンスです！\nネバーギブアップ");
				} else if ((input == 0) && (computer == 2)) {
					//ユーザーがパーに負けると下記を表示
					System.out.println("俺の勝ち\nなんで負けたか、明日まで考えといてください。\nそしたら何か見えてくるはずです");
				} else if ((input == 2) && (computer == 1)) {
					//ユーザーがチョキに負けると下記を表示
					System.out.println("俺の勝ち！\nたかがジャンケンじゃん、そう思ってないですか？\nそれやったら、次も俺が勝つよ");
				} else {
					//それ以外（あいこ）の場合は下記を表示
					System.out.println("DRAW あいこもう一回しましょ");
				}
				;
				if (janken_win >= 1) {
					//ジャンケンに１回かつと下記を表示しループを終了
					System.out.println("勝つまでにかかった回数は" + janken_num + "回です");
					scanner.close();
					return;
					//ここまで到達で無限ループ終了
				}
			} catch (InputMismatchException e) {
				System.out.println("無効な入力です");
				//エラーが発生した際に出力
				scanner.next();
				//再度入力を促す
			}

		}
	}
}
