package Lab03;

public class Lab03 {
    public static void main(String[] args) {

        int miliseconds = 10000123;
        int seconds = 10000;
        int hours = seconds/3600;
        int minutes = seconds%3600/60;
        int seconds2 = seconds%60;
        int miliseconds2 = seconds%1000;



        System.out.println("Starting miliseconds: \t " + miliseconds);
        System.out.println("Hours: \t\t\t\t " + hours);
        System.out.println("Minutes: \t\t\t " + minutes);
        System.out.println("Seconds: \t\t\t " + seconds2);
        System.out.println("Miliseconds2: \t\t\t " + miliseconds2);





    }

}
