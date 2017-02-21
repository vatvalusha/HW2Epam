package HW2.PC;

/**
 * Created by vatva on 13.02.2017.
 */
public class Computer extends Part {

    private CPU cpu;
    private Drive drive;
    private RAM ram;
    private Winchester winchester;
    private String name;

    public Computer(String name, double speed, int ramVolume, int hddVolume) {
        this.name = name;
        this.cpu = new CPU(speed);
        this.drive = new Drive();
        this.ram = new RAM(ramVolume);
        this.winchester = new Winchester(hddVolume);
    }

    @Override
    public void switchStatus() {
        super.switchStatus();
        cpu.switchStatus();
        ram.switchStatus();
        winchester.switchStatus();
        drive.switchStatus();
    }

    public void memoryPC() {
        System.out.println("Memory on PC is " + winchester.getMemory() +" Gb");
    }

    boolean scanViruses() {
        if (!isStatus()) throw new IllegalStateException("Turn computer on");

        final int scanTime = 500;
        final double scanPropability = 0.1;

        try {
            Thread.sleep(scanTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Math.random() < scanPropability;

    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Winchester getWinchester() {
        return winchester;
    }

    public void setWinchester(Winchester winchester) {
        this.winchester = winchester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", drive=" + drive +
                ", ram=" + ram +
                ", winchester=" + winchester +
                ", name='" + name + '\'' +
                '}';
    }
}
