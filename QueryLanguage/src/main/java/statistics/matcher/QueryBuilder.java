/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import java.util.LinkedList;
import statistics.Player;

/**
 *
 * @author pullis
 */
public class QueryBuilder {
    
    Matcher m;
    
    public QueryBuilder() {
    }
    
    public QueryBuilder playsIn (String team){
        this.m = new PlaysIn(team);
        return this;
    } 
    public QueryBuilder and (Matcher... matchers){
        this.m = new And(matchers);
        return this;
    } 
    public QueryBuilder or (Matcher... matchers){
        this.m = new Or(matchers);
        return this;
    } 
    public QueryBuilder not (Matcher... matchers){
        this.m = new Not(matchers);
        return this;
    }
    public QueryBuilder hasAtLeast (int value, String category){
        this.m = new HasAtLeast(this.m, value, category);
        return this;
    } 
    public QueryBuilder hasFewerThan (int value, String category){
        this.m = new HasFewerThan(this.m, value, category);
        return this;
    } 
    public Matcher build() {
        return this.m;
    }
}


