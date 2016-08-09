package io.khasang.incubator.SpringTrafficLights.model.TrafficLights;

import io.khasang.incubator.SpringTrafficLights.model.Light.Light;
import io.khasang.incubator.SpringTrafficLights.model.Lighting.LightingProgram;

public class SimpleTrafficLights implements TrafficLights {
    private final LightingProgram lightingProgram;
    private final String name;

    public SimpleTrafficLights(final String name, final LightingProgram lightingProgram) {
        this.name = name;
        this.lightingProgram = lightingProgram;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Light getLightAt(long time) {
        long cycleTime = calculateCycleTime(time);
        return lightingProgram.getLightingAt(cycleTime).getLight();
    }

    @Override
    public Light getNextLight(long time) {
        long cycleTime = calculateCycleTime(time);
        return lightingProgram.getNextLighting(cycleTime).getLight();
    }

    private long calculateCycleTime(long time) {
        return (time > 0) ? time % lightingProgram.cycleTime() : 0;
    }
}
