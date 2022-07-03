package com.scriptwritr.model;

public class TimePeriod {

    private int timePeriodID;
    private int period;

    public TimePeriod(int timePeriodID, int period) {
        this.timePeriodID = timePeriodID;
        this.period = period;
    }

    public int getTimePeriodID() {
        return timePeriodID;
    }

    public void setTimePeriodID(int timePeriodID) {
        this.timePeriodID = timePeriodID;
    }

    public int getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return Integer.toString(period);
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
