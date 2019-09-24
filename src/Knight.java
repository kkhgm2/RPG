
public class Knight extends Character{
	public Knight(String name, int hp, int mp) {
		super(name, hp *= 1.2 , mp *= 0.8);
	}

	@Override
	public void introduce() {
		System.out.println("私は " + name + " 戦士だ！　だから力が強いぞ！！");
		System.out.println("HPは" + hp + "です");
		System.out.println("MPは" + mp + "です");
	}

}
