import java.util.Random;

public class StartGame {
	public static void  main(String[] args) {
		Character[] teamA = new Character[3];
		Character[] teamB = new Character[3];

		teamA[0] = new Knight("ドラえもん", 120, 120);
		teamB[0] = new Gunman("のび太", 110, 110);
		teamA[1] = new Character("ジャイアン", 130, 110);
		teamB[1] = new Magician("スネ夫", 115, 115);
		teamA[2] = new Magician("しずか", 110, 120);
		teamB[2] = new Character("出木杉", 130, 130);

		for(int i = 0; i < 3; i++) {
			Random r = new Random();
			int noA = r.nextInt(3);
			int noB = r.nextInt(3);

//			対戦相手がHP０の時、選び直す！
			while(teamA[noA].hp <= 0 || teamB[noB].hp <= 0) {
				if(teamA[noA].hp <= 0 ) {
					noA = r.nextInt(3);
				}
				if(teamB[noB].hp <= 0 ) {
					noB = r.nextInt(3);
				}
			}

			System.out.println((i + 1) + "回戦 : " + teamA[noA].name + "VS" +teamB[noB].name);
			while(teamA[noA].hp > 0 && teamB[noB].hp > 0) {

				teamA[noA].attack(teamB[noB]);
				judge(noA, noB, teamA, teamB);
				if(teamA[noA].hp <= 0 || teamB[noB].hp <= 0) break;

				teamB[noB].attack(teamA[noA]);
				judge(noA, noB, teamA, teamB);
				if(teamA[noA].hp <= 0 || teamB[noB].hp <= 0) break;
			}
		}
	}

	public static void judge(int noA,int noB, Character[] teamA, Character[] teamB) {
		String winner = null;
		if(teamA[noA].hp <= 0 || teamB[noB].hp <= 0) {
			if(teamA[noA].hp < 0 ) {
				winner = teamB[noB].name;
			}else {
				winner = teamA[noA].name;
			}
			System.out.println("勝者" + winner + "です");
			System.out.println();
		}
	}
}
