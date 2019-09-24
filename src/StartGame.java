public class StartGame {
	public static void  main(String[] args) {
		Character c1 = new Knight("ドラえもん", 20, 20);
		Character c2 = new Character("のび太", 10, 10);
		Character c3 = new Character("ジャイアン", 30, 10);
		Character c4 = new Character("スネ夫", 15, 15);
		Character c5 = new Magician("しずか", 10, 20);
		Character c6 = new Character("出木杉", 30, 30);

		c1.introduce();
		c1.attack(c5);
		c5.introduce();
	}
}
