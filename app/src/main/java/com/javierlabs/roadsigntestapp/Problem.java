package com.javierlabs.roadsigntestapp;

//model component. here is where quiz logic will be.

public class Problem {
    public static String choice[][] = {
            {"Stop Sign", "Pedestrian Sign", "Entering Roadway Merge(Right) Sign", "Truck Escape Ramp Sign"}, //question 1 bank
            {"Deer Crossing Sign", "Low Clearance Ahead Sign", "Signal Ahead Sign", "No Commercial Vehicles Sign"}, //question 2 bank
            {"No Passing Zone Sign", "Two Way Traffic Sign", "Yield Ahead Sign", "Pedestrian Sign"}, //question 3 bank
            {"Fire Station Sign", "Fork Sign", "Slippery When Wet Sign", "Workers Ahead Sign"}, //question 4 bank
            {"Pedestrian Sign", "Two Way Traffic Sign", "Dead End Sign", "Yield Ahead Sign"}, //question 5 bank
            {"Slippery Road Sign", "Entering Roadway Merge(Right) Sign", "Two Way Traffic Sign", "Low Clearance Ahead Sign"}, //question 6 bank
            {"Fork Sign", "Workers Ahead Sign", "Traffic Light Warning Sign", "Deer Crossing Sign"}
    };

    public static String answer[] = {
            "Stop Sign", //answer 1
            "No Commercial Vehicles Sign", //answer 2
            "Pedestrian Sign", //answer 3
            "Fork Sign", //answer 4
            "Dead End Sign", //answer 5
            "Slippery Road Sign", //answer 6
            "Traffic Light Warning Sign" //answer 7
    };

    public static int question[] = {
            R.drawable.stop_sign, //image for question 1
            R.drawable.no_commercial_vehicles_sign, //image for question 2
            R.drawable.pedestrian_sign, //image for question 3
            R.drawable.fork_sign, //image for question 4
            R.drawable.dead_end_sign, //image for question 5
            R.drawable.slippery_road_sign, //image for question 6
            R.drawable.traffic_light_warning_sign //image for question 7

    };
}
