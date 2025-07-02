package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	Map<String,String> choice = new HashMap<>();
	
	public Jyanken_Chapter28(){
		choice.put("r","グー");
		choice.put("s","チョキ");
		choice.put("p","パー");
		}
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("自分のじゃんけんの手を入力しましょう\r\nグーはrockのrを入力しましょう\r\nチョキはscissorsのsを入力しましょう\r\nパーはpaperのpを入力しましょう");
		String input = scanner.nextLine();
		if(input.equals("r") || input.equals("s") || input.equals("p")) {
			return input;			
		} else {
			System.out.println("無効な入力です");
			return getMyChoice();
		}
	}
	
	public String getRandom(){
		String[] hands = {"r","p","s"};
		
		int index = (int)(Math.floor(Math.random() * 3));
		
		String cpuKey = hands[index];
		
		return cpuKey;
	}

	
	public void playGame(String input, String cpuKey) {
		if(input.equals(cpuKey)){
			System.out.println("自分の手は" + choice.get(input) + ",対戦相手の手は" + choice.get(cpuKey));
			System.out.println("あいこです");
		}else if(input.equals("r") && cpuKey.equals("s")) {
			System.out.println("自分の手は" + choice.get(input) + ",対戦相手の手は" + choice.get(cpuKey));
			System.out.println("自分の勝ちです");
		}else if(input.equals("s") && cpuKey.equals("p")) {
			System.out.println("自分の手は" + choice.get(input) + ",対戦相手の手は" + choice.get(cpuKey));
			System.out.println("自分の勝ちです");
		}else if(input.equals("p") && cpuKey.equals("r")) {
			System.out.println("自分の手は" + choice.get(input) + ",対戦相手の手は" + choice.get(cpuKey));
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の手は" + choice.get(input) + ",対戦相手の手は" + choice.get(cpuKey));
			System.out.println("自分の負けです");
		}
	}
}
