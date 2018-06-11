/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisiontree;

/**
 * Name: Mariella Massuh
 * PID: 1568535
 * 
 * Name: Fernando Serrano
 * PID: 5642858
 * 
 * Name: Cristina Villarroel
 * PID:
 * 
 * Name: Adam Torres
 * PID: 
 */

import java.util.*;

public class DataSet {
    private HashMap<String, String> data_set;
    
    public DataSet(String age, String income, String student, String credit_rating, String buys_computer){
        data_set = new HashMap<> ();
        data_set.put("age", age);
        data_set.put("income", income);
        data_set.put("student", student);
        data_set.put("credit_rating", credit_rating);
        data_set.put("buys_computer", buys_computer);
    }
    
    /*** Getters ***/
    
    /*** Setter ***/
}
