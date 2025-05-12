class Animal {
	public void sound() {
		System.out.println("The animal makes a sound");
	}
}

class Bird extends Animal {
	public void sound() {
		System.out.println("The bird whistles");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("The cat meows");
	}
}

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal();
		Bird b = new Bird();
		Cat c = new Cat();
		
		a.sound();
		b.sound();
		c.sound();
	}
}