public class Character {
	public String name;
	public int hp;
	public int mp;

	public Character(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public void introduce() {
		System.out.println("私は" + name);
		System.out.println("HPは" + hp + "です");
		System.out.println("MPは" + mp + "です");
	}

	public static void  main(String[] args) {
		Character c1 = new Character("ドラえもん", 20, 20);
		Character c2 = new Character("のび太", 10, 10);
		Character c3 = new Character("ジャイアン", 30, 10);
		Character c4 = new Character("スネ夫", 15, 15);
		Character c5 = new Character("しずか", 10, 20);
		Character c6 = new Character("出木杉", 30, 30);

		c1.introduce();
		c2.introduce();
		c3.introduce();
	}
}
