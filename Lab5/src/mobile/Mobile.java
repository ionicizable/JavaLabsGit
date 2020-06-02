package mobile;

import mobilecomponent.Battery;
import mobilecomponent.CPU;

public class Mobile {
    private String company;
    private String model;
    private CPU cpu;
    private Battery battery;
    private static MemoryCard memoryCard;

    public static class MemoryCard {
        public static void save(){
            System.out.println("Info saved");
        }
    }


    public Mobile(){
        company = null;
        cpu = new CPU();
        battery = new Battery();
    }

    public Mobile(String company, String model, CPU cpu, Battery battery){
        this.company = company;
        this.model = model;
        this.cpu = cpu;
        this.battery = battery;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "mobile.Mobile{" +
                "\n\tcompany=" + company + '\n' +
                cpu.toString()+'\n'+
                "\tbattery=" + battery.getCapacity() + '\n' +
                '}';
    }
}
