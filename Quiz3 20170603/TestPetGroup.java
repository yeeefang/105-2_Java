public class TestPetGroup {
    public static void main(String[] args) {
        Pet d = new Dog();
        Pet c = new Cat();
        Pet g = new GuineaPig();
        PetGroup pg1 = new PetGroup();
        System.out.println("A simple run:");
        pg1.add(d);
        pg1.add(c);
        pg1.add(g);
        pg1.makeNoise();
        System.out.println("\nA bit involved run:");
        pg1.remove(d);
        PetGroup pg2 = new PetGroup();
        pg2.add(pg1);
        pg2.add(c);
        pg2.makeNoise();
    }
}

class PetGroup extends Pet{
	Pet arr[] = new Pet[3];
	PetGroup(){
		
	}
	@Override public void makeNoise()
	{
		for(int i=0;i<3;i++){
			System.out.println(arr[i].bark());
		}
	}
	public void add(Pet p)
	{
		for(int i=0;i<3;i++){
			if(arr[i] == null){
				arr[i] = p;
				break;
			}
		}
	}
	
	public void remove(Pet p)
	{
		Pet arr1[] = new Pet[3];
		for(int i=0;i<3;i++){
			if(arr[i] != p){
				arr1[i] = p;
				arr = arr1;
				break;
			}
		}
		
	}
	
	public void add(PetGroup p)
	{
		Pet c = new Cat();
		Pet g = new GuineaPig();
		arr[0] = c;
		arr[1] = g;
	}
	
	
	
	
}