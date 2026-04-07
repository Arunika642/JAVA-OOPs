package Practice.singleInheritance;

import java.time.LocalDate;

public class Main 
{
    public static void main(String[] args) {
        
        Auto_Policy ap = new Auto_Policy();
        ap.setStartDate(LocalDate.now());

        System.out.println(ap.getStartDate());

        Auto_Policy ap2 = new Auto_Policy();
        ap2.setStartDate(LocalDate.now());
        System.out.println(ap2.getStartDate());

        Auto_Policy ap3 = new Auto_Policy();
        ap3.setStartDate(LocalDate.now());
        ap3.setEndDate(LocalDate.of(2027,2 , 14));

        System.out.println(ap3.isActive());
    }

}
