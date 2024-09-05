package sunbeam.geometry;

import sunbeam.geometry.dim3;

public class Program{

   public static void main(String[] args){

     Box b1 = new Box(10,8,15);
	
     System.out.println("Result ="+ b1.calcVolume());

	}
}
