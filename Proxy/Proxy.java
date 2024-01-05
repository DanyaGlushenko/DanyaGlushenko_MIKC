package main;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Interface{
    private static Server serv;
    int max_size = 10;
    List<Double> list = new ArrayList<Double>();
    public Proxy(int a) {
        max_size = a;
        if (serv==null)
            serv = new Server();
    }

    public void send(double a) {
        list.add(a);
        if(list.size()==max_size) {
            double temp=0;
            for(int i = 0 ; i<list.size();i++) {
                temp+=list.get(i);
            }
            temp/=list.size();
            serv.send(temp);
            list.clear();
        }
    }

}
