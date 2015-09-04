public class Cyclometer {
    public static void main (String [] args){
        int seconds1 = 480;
        int seconds2 = 3220;
        double rotations1 = 1561;
        double rotations2 = 9037;
        double radius = 13.5;
        double pi = 3.14159;
        double distance1 = radius*2*pi*rotations1/12/5280;
        double distance2= radius*2*pi*rotations2/12/5280;
        System.out.println("The number of minutes for trip 1 was: "+(seconds1/60)+" minutes");
        System.out.println("The number of rotations for trip 1 was: "+rotations1);
        System.out.println("The number of miles for trip 1  was: "+distance1+" miles");
        System.out.println("The number of minutes for trip 2 was: "+(seconds2/60)+" minutes");
        System.out.println("The number of rotations for trip 2 was: "+rotations2);
        System.out.println("The number of miles for trip 2 was: "+distance2+" miles");
        System.out.println("The Total combined distance was: "+(distance1+distance2)+" miles");
    }
}