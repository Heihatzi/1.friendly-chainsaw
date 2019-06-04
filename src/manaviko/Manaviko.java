package manaviko;

import java.util.ArrayList;
import java.util.List;

public class Manaviko {

    public static void main(String[] args) {

//        Apple apple = new Apple(1.5, 'A');
//        Orange orange = new Orange(2.0, 'B');
//        Milk milk = new Milk(5.0, 'C');
//        
//        int a = 4;  // PLITHOS MHLWN
//        
//        int b = 3;  //PLITHOS PORTOKALIWN
//        
//        int c = 1;  //PLITHOS KOYTIWN GALAKTOS
//        
//        double total = a*apple.getPrice() + b*orange.getPrice() + c*milk.getPrice();
//        
//        System.out.println("total is " + total);


Apple a1 = new Apple();
Apple a2 = new Apple();
Apple a3 = new Apple();
Apple a4 = new Apple();

Orange o1 = new Orange();
Orange o2 = new Orange();
Orange o3 = new Orange();

Milk m1 = new Milk();

List<Products> bag = new ArrayList();

bag.add(a1);
bag.add(a2);
bag.add(a3);
bag.add(a4);
bag.add(o1);
bag.add(o2);
bag.add(o3);
bag.add(m1);


double total = 0.0;

for (Products p : bag){
    total += p.getPrice();    
}
        System.out.println("total is " + total);
    }

}
