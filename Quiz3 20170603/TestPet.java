public class TestPet {
    public static void main(String[] args) {
        Pet[] pets = new Pet[3];
        pets[0] = new Dog();
        pets[1] = new Cat();
        pets[2] = new GuineaPig();
        for (int i = 0; i < pets.length; i++)
            pets[i].makeNoise();
    }
}

class Pet {
	Pet(){
		
	}
	public void makeNoise()
	{
	}
	public String bark(){
		return "";
	}
	
	
}

class Dog extends Pet {
	Dog(){
		
		
	}
	
	
	public void makeNoise()
	{
		System.out.println("Woof! Woof!");
	}
	@Override public String bark(){
		return "Woof! Woof!";
	}
	
}

class Cat extends Pet {
	Cat(){}
	
	public void makeNoise()
	{
		System.out.println("Meow! Meow!");
	}
	public String bark(){
		return "Meow! Meow!";
	}
}

class GuineaPig extends Pet {
	GuineaPig(){}
	
	public void makeNoise()
	{
		System.out.println("Zii! Zii!");
	}
	public String bark(){
		return "Zii! Zii!";
	}
	
}