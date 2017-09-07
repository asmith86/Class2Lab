/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author alexsmith
 */
public class WelcomeService {
    private Calendar now = Calendar.getInstance();
   
    private String getTimeOfDay(){
        int currentHour = now.get(Calendar.HOUR_OF_DAY);
        String timeOfDay;

        if (currentHour >= 5 && currentHour < 12) {
            timeOfDay = "Morning";

        } else if (currentHour >= 12 && currentHour < 19) {
            timeOfDay = "Afternoon";
        } else {
            timeOfDay = "Evening";
        }

        return timeOfDay;
    }
    
    public String getGreeting(String name){
        String greeting = "Good " + getTimeOfDay() + " " + name + "!";
        
        return greeting;
    }
}
