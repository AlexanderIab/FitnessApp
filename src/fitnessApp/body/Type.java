package fitnessApp.body;

import java.time.LocalTime;

public enum Type {
    SINGLE(new Zone[]{Zone.POOL, Zone.GYM}, LocalTime.of(8, 0), LocalTime.of(22, 0)),
    DAYTIME(new Zone[]{Zone.GYM, Zone.GROUP}, LocalTime.of(8, 0), LocalTime.of(16, 0)),
    FULL(new Zone[]{Zone.GROUP, Zone.GYM, Zone.POOL}, LocalTime.of(8, 00), LocalTime.of(22, 0));
    private LocalTime start;
    private LocalTime end;
    private Zone[] zones;

    Type(Zone[] zones, LocalTime start, LocalTime end) {
        this.zones = zones;
        this.start = start;
        this.end = end;
    }

    public Zone[] getZones() {
        return zones;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }
}


