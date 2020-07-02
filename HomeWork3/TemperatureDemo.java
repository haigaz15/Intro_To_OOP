
public class TemperatureDemo{
    public static void main(String[] args){
		Temperature temp = new Temperature();
    int[] arraytemp = temp.inputArray();
    int maxTemp = temp.maxTemp(arraytemp);
		System.out.println("The hottest day of the month: " + maxTemp + " celsius");
		System.out.println();
		int miniTemp = temp.miniTemp(arraytemp);
		System.out.println("The coldest day of the month: "+ miniTemp + " celsius");
		System.out.println();
		int averageTemp = temp.average(arraytemp);
		System.out.println("The average temperature of the month: " + averageTemp);
		System.out.println();
		System.out.println("The diffrence between the hottest and the coldest days: " + (maxTemp - miniTemp));
    }
}