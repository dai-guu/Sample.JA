package practice;

import java.util.ArrayList;
import java.util.List;

public class HpSample {
	public static void main(String[] args) {
		List<Character> party = new ArrayList<Character>();

		HpSample.partyAttack(party);
	}

	public static void partyAttack(List<Character> party) {
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント：" + hp);
		}
	}
}
