package javabasic;

public class BattingAvg {

	public static void main(String[] args) 
	{
		int Totalmatches = 100, totalruns = 3500, Innings = 80, notout = 1;
        double avg;
        avg = totalruns / (Innings - notout);
        System.out.println("batting average=" + avg);


        }
}

