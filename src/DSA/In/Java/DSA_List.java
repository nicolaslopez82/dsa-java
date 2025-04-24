package DSA.In.Java;

import java.util.ArrayList;
import java.util.List;

public class DSA_List {
    List<Object> list = new ArrayList<>();

    public List<Object> getList() {
        return list;
    }

    public void setList(Integer n) {
        this.list.add(n);
    }

    public static void main(String[] args) {
        DSA_List dsa = new DSA_List();
        dsa.setList(1);
        dsa.setList(2);
        dsa.setList(3);
        dsa.setList(4);
        dsa.setList(5);

        for (Object o : dsa.getList()) {
            System.out.println(o);
        }
        int size = dsa.list.size()/2;
        size++;
        System.out.println("size: "+size);
    }
}
