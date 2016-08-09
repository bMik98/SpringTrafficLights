package io.khasang.incubator.SpringTrafficLights.controller;

import io.khasang.incubator.SpringTrafficLights.model.TrafficLights.TrafficLights;
import io.khasang.incubator.SpringTrafficLights.view.ConsoleView;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrafficLightsSimulator {
    private ConsoleView consoleView;

    public static void main(String[] args) {
        new TrafficLightsSimulator().run();
    }

    public void run() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        TrafficLights trafficLights = (TrafficLights) context.getBean("trafficLights");
        consoleView = new ConsoleView(trafficLights);
        runLog(0, 50);
    }

    public void runLog(long start, long stop) {
        for (long i = start; i <= stop; i++) {
            consoleView.showLightAt(i);
        }
    }
}
