/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj4;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author rafiu
 */
public class TriageSimulator {

    Queue<String> priorityQueueOne = new LinkedList<>();
    Queue<String> priorityQueueTwo = new LinkedList<>();
    Queue<String> priorityQueueThree = new LinkedList<>();
    

    public void add(String lineFromFile) throws FileNotFoundException{
        
        String[] arrayData = lineFromFile.split(" ");
        String fileDataArray = arrayData[0] + " " + arrayData[1];    
    
        switch (arrayData[2]) {
            case "AL": priorityQueueOne.add(fileDataArray); break;
            case "HA": priorityQueueOne.add(fileDataArray); break;
            case "ST": priorityQueueOne.add(fileDataArray); break;
            case "BL": priorityQueueTwo.add(fileDataArray); break;
            case "SF": priorityQueueTwo.add(fileDataArray); break;
            case "IW": priorityQueueTwo.add(fileDataArray); break;
            case "KS": priorityQueueTwo.add(fileDataArray); break;
            case "OT": priorityQueueTwo.add(fileDataArray); break;
            case "HN": priorityQueueThree.add(fileDataArray); break;
        }
    }    

    public String remove(){
        
        if(!priorityQueueOne.isEmpty()){
            
           return(priorityQueueOne.poll());
           
        } else if(!priorityQueueTwo.isEmpty()){
            
           return(priorityQueueTwo.poll());
           
        } else if(!priorityQueueThree.isEmpty()){
            
            return(priorityQueueThree.poll());
        }
        return null;
    }   

    public boolean isEmpty(){
        
        return priorityQueueOne.isEmpty() && priorityQueueTwo.isEmpty() && priorityQueueThree.isEmpty() ;
    }
    
    public String fileList(){
        
        System.out.println("List in Queue one (high priority) : " + priorityQueueOne);
        System.out.println("List in Queue Two (medium priority): " + priorityQueueTwo);
        System.out.println("List in Queue Three(low priority): " + priorityQueueThree);
        
        return "";
    } 
    
}
