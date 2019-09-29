public class Knight extends Character{
	public Knight(String name, int hp, int mp) {
		super(name, hp *= 1.2 , mp *= 0.8);
	}

	@Override
	public void introduce() {
		System.out.println("私は " + name + " 戦士だ！　だから力が強いぞ！！");
		super.introduce();
	}

	@Override
	public void attack(Character c) {
		blade(c);
	}

	public void blade(Character c) {
		System.out.println(this.name + "の剣攻撃！");
		if(c instanceof Gunman) {
			System.out.println(c.name + "はガンマンだ！　チャンス！！");
			c.damage((int)Math.floor(this.hp * 0.5));
		}else {
			c.damage((int)Math.floor(this.hp * 0.3));
		}
	}
}
