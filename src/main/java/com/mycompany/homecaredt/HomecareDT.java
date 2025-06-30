/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homecaredt;

/**
 *
 * @author <Panagiotis Beligiannis at HOU>
 */

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class HomecareDT {
    
    public static void main(String[] args) {
        Person amea = new Person("Alex", "alex@anymail.com", "6912345678");
        Person frontistis = new Person("John", "john@anymail.com", "6912345679");
        Person doctor = new Person("Dr Robert", "robert@anymail.com", "6923456780");
        String msg = "";
        Communication com = new Communication(null,null,null,null);
        String PROMPT = "-> ";
        int answer = -1;
        do {
            System.out.println("=============== MENU ===============");
            System.out.println("== 1.   Time/Financial Management ==");
            System.out.println("== 2.   SmartHome ==================");
            System.out.println("== 3.   Medication =================");
            System.out.println("== 4.   Mutrition ==================");
            System.out.println("== 5.   Health Monitoring ==========");
            System.out.println("== 6.   Communication ==============");
            System.out.println("== 7.   Transportation =============");
            System.out.println("== 8.   Emergency ==================");
            System.out.println("== 9.   Life Space Organization ====");
            System.out.println("== 10.  Hygiene ====================");
            System.out.println("== 11.  Travel =====================");
            System.out.println("====================================");
            System.out.println("== 0.   Exit =======================");
            System.out.println("====================================");
            System.out.print(PROMPT);
            Scanner IN = new Scanner(System.in);
            try {
                answer = Integer.parseInt(IN.nextLine());
            } catch (NumberFormatException e) {
                answer = -1;
            }
            switch (answer) {
                case 1 -> {
                    System.out.println("== 1.   Time/Financial Management ==");
                    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
                    Runnable task = () -> System.out.println("Current Time: " + LocalTime.now());
                    // Schedule task to run every 5 seconds
                    // scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
                    System.out.println("Current Time: " +  LocalDateTime.now().toString());
                }
                case 2 -> {
                    System.out.println("== 2.   SmartHome ==================");
                    IoTDeviceMonitor monitor = new IoTDeviceMonitor();
                    try {
                        monitor.startMonitoring();
                    }catch (Exception e) {
                        System.out.println("Exception " + e);
                    }
                        System.out.println("IoT Device Monitor Started...");
                }
                case 3 -> {
                    System.out.println("== 3.   Medication =================");
                    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
                    Runnable task = () -> System.out.println("Current Time: " + LocalTime.now());
                    // Schedule task to run every 5 seconds
                    // scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
                    System.out.println("Current Time: " + LocalDateTime.now().toString());
                }
                case 4 -> {                 
                    System.out.println("== 4.   Mutrition ==================");
                    System.out.println("");
                    
                    Nutrition n = new Nutrition(false,false,false,false);
                    int ans = -1;
                    do {
                        System.out.println("== 1. Breakfast");
                        System.out.println("== 2. Meal");
                        System.out.println("== 3. Dinner");
                        System.out.println("== 4. Snack");
                        System.out.println("== 0. Exit");
                        System.out.print(PROMPT);
                        try {
                            ans = Integer.parseInt(IN.nextLine());
                        } catch (NumberFormatException e) {
                            ans = -1;
                        }
                        switch (ans) {
                        case 1 ->{
                            n.setBreakfast(true); 
                            ans = 0;
                        }                    
                        case 2 ->{
                            n.setMeal(true);
                            ans = 0;
                        }  
                        case 3 ->{
                            n.setDinner(true); 
                            ans = 0;
                        }      
                        case 4 ->{
                            n.setSnack(true);
                            ans = 0;
                        } 
                        case 0 -> System.out.println("Exit Nutrition Menu");
                        default -> System.out.println("Invalid choice, please try again."); 
                        }
                    } while (ans != 0);
                        System.out.println(n.prepareMessage());
                        com.setFromPerson(amea);
                        com.setToPerson(frontistis);
                        com.setMessage(n.prepareMessage());
                        com.setTimestamp(LocalDateTime.now().toString());  
                        System.out.println(com.toString());
                    }
                case 5 -> {
                    System.out.println("== 5.   Health Monitoring ==========");
                    IoTDeviceMonitor monitor = new IoTDeviceMonitor();
                    try {
                        monitor.startMonitoring();
                    }catch (Exception e) {
                        // System.out.println("Exception " + e);
                    }
                        System.out.println("IoT Device Monitor Started...");
                }
                case 6 -> {                      
                    System.out.println("== 6.   Communication ==============");
                    System.out.println("not uploaded yet...");
                }
                case 7 -> {
                    System.out.println("== 7.   Transportation =============");
                    msg = "I want to move. Please help me!";
                    Communication t = new Communication(amea,
                            frontistis,msg,LocalDateTime.now().toString());
                    System.out.println(t.toString());
                }
                case 8 -> {
                    System.out.println("== 8.   Emergency ==================");
                    msg = "Please I need help immediately!";
                    Communication em = new Communication(amea,
                            frontistis,msg,LocalDateTime.now().toString());
                    System.out.println(em.toString());
                }
                case 9 -> {
                    System.out.println("== 9.   Life Space Organization ====");
                     msg = "Could you please come and make my day? Some things must be arranged here :)";
                    Communication lso = new Communication(amea,
                            frontistis,msg,LocalDateTime.now().toString());
                    System.out.println(lso.toString());
                }
                case 10 -> {
                    System.out.println("== 10.  Hygiene ==================");
                    System.out.println("");

                    int answ;
                    Hygiene h = new Hygiene(false, false, false); // Create the Hygiene object before the loop

                    do {
                        System.out.println("== 1. Wash");
                        System.out.println("== 2. Bath");
                        System.out.println("== 3. Toilet");
                        System.out.println("== 0. Exit");
                        System.out.print(PROMPT);
                        try {
                            answ = Integer.parseInt(IN.nextLine());
                        } catch (NumberFormatException e) {
                            answ = -1; // Invalid input, stay in loop
                        }
                        switch (answ) { // Move the switch inside the loop
                            case 1 -> {
                                h.setWash(true);
                                answ = 0;
                            }    
                            case 2 ->  {
                                h.setBath(true);
                                answ = 0;
                            }  
                            case 3 ->  {
                                h.setToilet(true);
                                answ = 0;
                            } 
                            case 0 -> System.out.println("Exiting Hygiene menu...");
                            default -> System.out.println("Invalid choice, please try again.");
                        }
                    } while (answ != 0);
                    System.out.println(h.SendMessage());
                    com.setFromPerson(amea);
                    com.setToPerson(frontistis);
                    com.setMessage(h.SendMessage());
                    com.setTimestamp(LocalDateTime.now().toString()); 
                    System.out.println(com.toString());
                }
                case 11 -> {
                    System.out.println("== 11.  Travel =====================");
                    msg = "Could you call me a taxi please? ";
                    Communication t = new Communication(amea,
                            frontistis,msg,LocalDateTime.now().toString());
                    System.out.println(t.toString());
                }
                case 0 -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }
        } while (answer != 0);
    }   
}
