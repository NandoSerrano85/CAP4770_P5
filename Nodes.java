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
 * PID: 5923243
 * 
 * Name: Adam Torres
 * PID: 4709314
 */

import java.util.*;

public class Nodes {
    private ArrayList<DataSet> record;
    private String best_attr;
    private Nodes parent;
    private Nodes[] child;
    private String node_class;
    private LinkedHashSet<DataSet> table;
    
    public Nodes(){
        record = new ArrayList<>();
        setParent(null);
        setChild(null);
    }
    /*** Setters ***/
    
    public void setRecord(ArrayList<DataSet> data ){
        record = data;
    }
    public void setBestAttribute(String ba){
        best_attr = ba;
    }
    public void setParent(Nodes p){
        parent = p;
    }
    public void setChild(Nodes[] c){
        child = c;
    }
    public void setNodeClass(String nc){
        node_class = nc;
    }
    public void setTable(LinkedHashSet<DataSet> t){
        table = t;
    }
    
    /*** Getters ***/
    public ArrayList<DataSet> getRecord(){
        return record;
    }
    public String getBestAttribute(){
        return best_attr;
    }
    public Nodes getParent(){
        return parent;
    }
    public Nodes[] getChild(){
        return child;
    }
    public String getNodeClass(){
        return node_class;
    }
    public LinkedHashSet<DataSet> getTable(){
        return table;
    }
}
