package mpp.k0219.problem02;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    /* Expected output:
              [Mary, Steve, Bob]
    */
    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Bob", "2nd", "Fairfield", "IA", "52556", 50000));
        list.add(new Employee("Andy", "3rd", "Fairfield", "IA", "52557", 80000));
        list.add(new Employee("Mary", "4th", "San Francisco", "CA", "94019", 150000));
        list.add(new Employee("Joe", "5th", "San Francisco", "CA", "94016", 75000));
        list.add(new Employee("Zoe", "6th", "San Francisco", "CA", "94016", 56000));
        list.add(new Employee("Steve", "8th", "New York City", "NY", "10007", 630000));
        System.out.println(thinOutList(list));
    }

    /** Returns a list of Employees which contains just one Employee from each city
     *  found in the original list.
     *
     *  You MUST use a HashMap in your implementation
     */
    public static List<Employee> thinOutList(List<Employee> list){
        HashMap<String, Employee> result = new HashMap<>();

        for (Employee e: list) {
            result.put(e.getCity(), e);
        }

        return new ArrayList<>(result.values());
    }
}
