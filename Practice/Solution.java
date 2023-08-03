package programms;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird(); 
		   bird.walk(); 
		   bird.fly();
		   bird.sing();
		   System.out.println(" ");
		   
		Adder adder = new Adder();
		adder.a = 22;
		adder.b = 20;
		System.out.println(adder.a + " " + adder.b + " " + adder.add(22, 20));
	}

}
