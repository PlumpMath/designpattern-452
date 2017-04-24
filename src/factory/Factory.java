package factory;

public class Factory {
	public Human getHuman(String name) {
		if (name.equals("C")) {
			return new Chinese();

		} else if (name.equals("A")) {
			return new American();

		} else {
			throw new IllegalArgumentException("参数不正确");
		}
	}

}
