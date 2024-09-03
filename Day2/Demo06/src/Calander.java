import java.util.Calendar;

public class Calander {

	public static void main(String[] args) {
	
		int Day;
		int Month;
		int Year;
		
	Calendar b = Calendar.getInstance();
	Day = b.get(Calendar.DATE);
	Month = b.get(Calendar.MONTH)+1;
	Year = b.get(Calendar.YEAR);
	
	System.out.println(Day+ "/"+Month+"/"+Year);

	}

}
