package kadai_028;

public class JyankenExec_Chapter28 extends Jyanken_Chapter28{
	public static void main(String[] args) {
		JyankenExec_Chapter28 janken = new JyankenExec_Chapter28();
		
		String input = janken.getMyChoice();
		String cpuKey = janken.getRandom();
		
		janken.playGame(input, cpuKey);
		
	}
}
