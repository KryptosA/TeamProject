/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import java.sql.*;
import java.util.*;
/**
 *
 * @author Chase Sparks
 */
public class Punch {
        
        private String badgeid;
        private int punchtype;
        private int terminal;
        private int id;
        private Timestamp timeStamp;
        GregorianCalendar gcal;
        
        //private Time original_timestamp;
          Punch(int id, Badge badge, int terminalid, Timestamp timeStamp, int punchtypeid){
               this.badgeid = badge.getID();
               this.punchtype = punchtypeid;
               this.timeStamp = timeStamp;
               this.id = id;
               this.terminal = terminalid;
               
          }
          
          public String printOriginalTimestamp(){
              String punch = null;
              gcal = new GregorianCalendar();
              if (punchtype == 0){
              punch = "#"+badgeid+"CLOCKED OUT: "+gcal.getTime();
              }
              if (punchtype == 1){
              punch = "#"+badgeid+" CLOCKED IN: "+gcal.getTime();
              }
              if (punchtype == 2){
              punch = "#"+badgeid+"TIMED OUT: "+gcal.getTime();
              }
              return punch;
          }
}
