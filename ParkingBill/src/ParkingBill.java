import java.util.Scanner;

public class ParkingBill {
    public static void main(String[] args){
        System.out.print("Masukkan durasi parkir : ");

        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("Tagihan : $" + count(in.nextInt()));
    }

    public static float count(int duration){
        int firstDuration = duration - 24;
        float secondDuration = duration - 5;
        float sisaDuration = 0;
        float cost = 0;

        if(firstDuration >= 0){
            sisaDuration = (float) (firstDuration * 0.5);
            cost = 15 + sisaDuration;
        } else if (duration>5 && duration<24){
            cost = (float) (5 + (secondDuration * 0.5));
        } else if (duration <= 5){
            cost = duration * 1;
        }

        return cost;
    }
}