public class Cat extends Animal {
	
	private int weight;
	
	public Cat(String name, String color, int points, int weight){
		super(name, color, points);
		this.weight = weight;
	}
	
	public String toString(){
	    String str = super.toString() + " - WEIGHT : " + this.weight + " Kg";
	    return str;
	}
	
}
