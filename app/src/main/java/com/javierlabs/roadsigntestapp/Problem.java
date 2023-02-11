package com.javierlabs.roadsigntestapp;

//model component. here is where quiz logic will be.

public class Problem {
    public static String choice[][] = {
            {"Stop Sign", "Pedestrian Sign", "Entering Roadway Merge(Right) Sign", "Truck Escape Ramp Sign"}, //question 1 bank
            {"Deer Crossing Sign", "Low Clearance Ahead Sign", "Signal Ahead Sign", "No Commercial Vehicles Sign"}, //question 2 bank
            {"No Passing Zone Sign", "Two Way Traffic Sign", "Yield Ahead", "Pedestrian Sign"}, //question 3 bank
            {"Fire Station Sign", "Fork Sign", "Slippery When Wet Sign", "Workers Ahead Sign"} //question 4 bank
    };

    public static String answer[] = {
            "Stop Sign",
            "No Commercial Vehicles Sign",
            "Pedestrian Sign",
            "Fork Sign"
    };

    public static int question[] = {
            R.drawable.stop_sign, //image for question 1
            R.drawable.no_commercial_vehicles_sign, //image for question 2
            R.drawable.pedestrian_sign, //image for question 3
            R.drawable.fork_sign //image for question 4
    };
}
