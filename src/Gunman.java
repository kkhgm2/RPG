public class Gunman extends Character{
	public Gunman(String name, int hp, int mp) {
		super(name, hp *= 1.1 , mp *= 1.1);
	}

	@Override
	public void introduce() {
		System.out.println("私は " + name + " 戦士だ！　だから力が強いぞ！！");
		super.introduce();
	}

	@Override
	public void attack(Character c) {
		fire(c);
	}

	public void fire(Character c) {
		System.out.println(this.name + "の銃攻撃！");
		if(c instanceof Magician) {
			System.out.println(c.name + "は魔法使いだ！　チャンス！！");
			c.damage((int)Math.floor(this.mp * 1.5));
		}else {
			c.damage((int)Math.floor(this.mp ));
		}
	}
}