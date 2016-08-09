package io.khasang.incubator.SpringTrafficLights.model.Lighting;

import java.util.List;

public class SequentialLightingProgram implements LightingProgram {
    private List<Lighting> lightingList;
    private long cycleTime;

    public SequentialLightingProgram(final List<Lighting> lightingList) {
        this.lightingList = lightingList;
        this.cycleTime = calculateCycleTime(lightingList);
    }

    @Override
    public Lighting getLightingAt(long time) {
        int lightingIndex = getLightingIndexAt(time);
        return (lightingIndex < 0) ? null : lightingList.get(lightingIndex);
    }

    @Override
    public Lighting getNextLighting(long time) {
        int lightingIndex = getLightingIndexAt(time);
        if (lightingIndex < 0) {
            return null;
        }
        int nextIndex = (lightingIndex == lightingList.size() - 1) ? 0 : lightingIndex;
        return lightingList.get(nextIndex);
    }

    @Override
    public long cycleTime() {
        return cycleTime;
    }

    @Override
    public int numberOfCycleSteps() {
        return lightingList.size();
    }

    private int getLightingIndexAt(long time) {
        for (int i = 0; i < lightingList.size(); i++) {
            if (lightingList.get(i).isTurnedOnAt(time)) {
                return i;
            }
        }
        return -1;
    }

    private long calculateCycleTime(final List<Lighting> lightingList) {
        long cycleDuration = 0;
        for (Lighting lighting : lightingList) {
            cycleDuration += lighting.duration();
        }
        return cycleDuration;
    }
}
