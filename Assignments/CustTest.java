package Assignments;

import static org.junit.Assert.*;
import java.util.TreeSet;
import org.junit.Test;

public class CustTest {

    @Test
    public void test() {
         TreeSet<Cust> set = new TreeSet<Cust>();
         int Dimond=1,Platinum=2,Gold=3,Silver=4;

         Cust c1 = new Cust("apple",Platinum,"2-2-2022",2000);
         Cust c2 = new Cust("ball", Dimond, "24-4-2020",1500);
         Cust c3 = new Cust("cat", Silver, "3-10-2021",1000);
         Cust c4 = new Cust("mango",Gold, "21-3-2020",1200);
         Cust c5 = new Cust("super",Platinum,"13-3-2020",1000);
         Cust c6 = new Cust("papaya", Silver, "26-3-2020",1000);
         Cust c7 = new Cust("pumpkin", Platinum, "23-3-2019",1000);
         Cust c8 = new Cust("cucumber",Silver, "21-3-2022",1000);
         Cust c9 = new Cust("orange", Gold, "24-3-2020",1000);
         Cust c10 = new Cust("grapes", Dimond, "24-4-2020",2000);
         
         set.add(c1);
         set.add(c2);
         set.add(c3);
         set.add(c4);
         set.add(c5);
         set.add(c6);
         set.add(c7);
         set.add(c8);
         set.add(c9);
         set.add(c10);

     System.out.println("Sorted List");
     
     int count=0;
 
     for (Cust s : set) {     

    	 System.out.println(convert(s.type) + " " + s.name + " "+ s.joinDate+  " "+s.value);
    	 count++;
    	 
     }
 
     assertEquals(count, set.size());

    }


    public String convert(int a) {

    	switch(a) {
    	case 1:
    		return "Dimond";
    		case 2:
    			return "Platinum";
    			case 3:
    				return "Gold";
    				case 4:
    					return "Silver";
    					}
    	return "null";       
     }
}
