package main;

import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int timeToWait=1;
        int maxNumber=3;
        Interface proxy = new Proxy(maxNumber);

        while(true) {
            try {
                Thread.sleep(timeToWait*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            double a = ThreadLocalRandom.current().nextDouble(-5, 10);
            System.out.print("Sent "+ a +" at time "+Calendar.HOUR_OF_DAY+":"+Calendar.getInstance().getTime().getMinutes()+":"+Calendar.getInstance().getTime().getSeconds()+"\n");
            proxy.send(a);

        }
    }

}
