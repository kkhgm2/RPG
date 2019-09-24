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

	public void damage(double at) {
		this.hp -= at;
		System.out.println(this.name + "は、" + at + "の攻撃を受けた。");
		System.out.println("残りのHP は" + this.hp + "だ。");
	}

	public void attack(Character c) {
		System.out.println(this.name + "の攻撃！");
		c.damage(Math.floor(this.hp*0.25));
	}

	public static void  main(String[] args) {
		Character c1 = new Knight("ドラえもん", 20, 20);
		Character c2 = new Character("のび太", 10, 10);
		Character c3 = new Character("ジャイアン", 30, 10);
		Character c4 = new Character("スネ夫", 15, 15);
		Character c5 = new Character("しずか", 10, 20);
		Character c6 = new Character("出木杉", 30, 30);

		c1.introduce();
		c1.attack(c2);
		c2.introduce();
	}
}
