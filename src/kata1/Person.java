/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Usuario
 */
public class Person {
    private final String name;
    private final LocalDate fn;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.fn = birthdate;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return fn;
    }
    
    public LocalDate getDate() {
        return LocalDate.now();
    }
    
    public int getAge() {
        return Period.between(fn, getDate()).getYears();
    }
}
