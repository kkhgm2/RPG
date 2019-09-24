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
		System.out.println("HPは" + hp + "です");
		System.out.println("MPは" + mp + "です");
	}

	public void damage(int at) {
		this.hp -= at;
		System.out.println(this.name + "は、" + at + "のダメージを受けた。");
		System.out.println("残りのHP は" + this.hp + "だ。");
	}

	public void attack(Character c) {
		System.out.println(this.name + "の攻撃！");
		c.damage(this.hp);
	}
}
