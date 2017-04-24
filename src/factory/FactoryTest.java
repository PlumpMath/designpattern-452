package factory;

import org.junit.Test;

public class FactoryTest {
	@Test
	public void factoryTest() {
		Human human = null;
		human = new Factory().getHuman("C");
		human.eat();
		human.walk();
		human = new Factory().getHuman("A");
		human.eat();
		human.walk();
	}

}
