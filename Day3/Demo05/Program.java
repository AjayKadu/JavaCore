public class Program{
   
	public static void main(String[] args){
	
	  int total =0;

            for(int i=0; i<args.length; i++){

		   String str = args[i];
		   int num = Integer.parseInt(str);
		   total = total+num;
		}
		
		   System.out.println("total : "+total);
          
	}    

}