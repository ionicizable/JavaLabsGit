import mobile.Mobile;
import mobilecomponent.Battery;
import mobilecomponent.CPU;

public class Main {
    public static void main(String[] args){
        CPU cpu = new CPU("Kirin", 8, 2400){
            public String toString() {
                return "CPU{" +
                        "\n\tmodel='" + getModel() + '\n' +
                        "\tamountKernels=" + getAmountKernels() + '\n' +
                        "\tclockFrequency=" + getClockFrequency() + '\n' +
                        '}';
            }
        };
        Battery battery = new Battery(4200);
        Mobile mobile = new Mobile("Huawei", "P30 Pro", cpu, battery);
        Mobile.MemoryCard.save();
        System.out.println(mobile.toString());
    }


}
