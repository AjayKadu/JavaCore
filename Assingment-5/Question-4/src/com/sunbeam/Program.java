package com.sunbeam;

import java.util.Scanner;

public class Program {

	enum TrafficLight {
		RED(30), GREEN(40), YELLOW(10);

		int duration;

		TrafficLight(int duration) {
			this.duration = duration;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

	}

	public static void main(String[] args) {

		TrafficLight[] light = TrafficLight.values();
		for (TrafficLight tL : light) {
			System.out.println( tL.name() +" "+ tL.getDuration());
		}

	}

}
