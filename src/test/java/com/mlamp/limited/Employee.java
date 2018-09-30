package com.mlamp.limited;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<? super Manager> list = new ArrayList<Employee>();
        //list.add(new Employee());
        list.add(new Manager());
        list.add(new CEO());

    }
}

class Manager extends Employee {


}

class CEO extends Manager {

}



