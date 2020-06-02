package mobilecomponent;

public class CPU {
    private String model;
    private int amountKernels;
    private double clockFrequency;

    public CPU(){
        model = null;
        amountKernels = 0;
        clockFrequency = 0;
    }

    public CPU(String model, int amountKernels, double clockFrequency){
        this.model = model;
        this.amountKernels = amountKernels;

        this.clockFrequency = clockFrequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAmountKernels() {
        return amountKernels;
    }

    public void setAmountKernels(int amountKernels) {
        this.amountKernels = amountKernels;
    }

    public double getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }


}
