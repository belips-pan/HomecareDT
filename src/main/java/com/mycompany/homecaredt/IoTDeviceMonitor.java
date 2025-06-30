/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homecaredt;

/**
 *
 * @author <Panagiotis Beligiannis at HOU>
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class IoTDeviceMonitor {
    private static final String DEVICE_IP = "192.168.1.7";
    private static final int INTERVAL_SECONDS = 5;
    private final ScheduledExecutorService scheduler;
    private boolean isRunning = true; // Flag to track status

    public IoTDeviceMonitor() {
        scheduler = Executors.newScheduledThreadPool(1);
    }

    public void startMonitoring() {
        scheduler.scheduleAtFixedRate(this::fetchData, 0, INTERVAL_SECONDS, TimeUnit.SECONDS);
    }

    private void fetchData() {
        if (!isRunning) return; // Stop execution if monitoring is stopped

        try {
            String urlString = "http://" + DEVICE_IP + "/data";
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println("Received Data: " + response);
            } else {
                System.err.println("Failed to fetch data. Response Code: " + responseCode);
                stopMonitoring(); // Stop only this class
            }

        } catch (Exception e) {
            System.err.println("Error fetching data: " + e.getMessage());
            stopMonitoring(); // Stop only this class
        }
    }

    public void stopMonitoring() {
        System.out.println("Stopping IoT Device Monitor...");
        isRunning = false; // Set flag to false to stop execution
        scheduler.shutdown(); // Stop scheduled tasks
    }
}
