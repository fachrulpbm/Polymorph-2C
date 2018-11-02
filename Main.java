public class Main{

	public static void main(String[] args) {
		Holiday day = new IdlFitri();
		day.showHoliday(); // IdlFitri
		day.hallo();

		((IdlFitri)day).baru();

		Holiday day2 = new Holiday();
		day2.showHoliday();
	}


}