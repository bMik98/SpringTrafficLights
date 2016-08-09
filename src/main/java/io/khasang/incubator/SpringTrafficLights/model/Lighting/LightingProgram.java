package io.khasang.incubator.SpringTrafficLights.model.Lighting;

public interface LightingProgram {
    public Lighting getLightingAt(long time);

    public Lighting getNextLighting(long time);

    public long cycleTime();

    public int numberOfCycleSteps();
}
