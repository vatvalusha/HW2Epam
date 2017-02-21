package HW2.task10;

/**
 * Created by vatva on 20.02.2017.
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




    static class Winchester extends Part {
        private int memory;

        public Winchester(int memory) {
            this.memory = memory;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        @Override
        public String toString() {
            return "Winchester{" +
                    "memory=" + memory +
                    '}';
        }
    }


    @Override
    public void switchStatusPC() {
        super.switchStatusPC();
        ram.switchStatusPC();
        winchester.switchStatusPC();
        drive.switchStatusPC();
        cpu.switchStatusPC();

    }



    public void memoryPC() {
        System.out.println("Memory on PC is " + winchester.getMemory() + " Gb");
    }

    class RAM extends Part {
        private int volume;

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public RAM(int volume) {
            this.volume = volume;
        }
    }


    class Drive extends Part {

        private boolean isBusy;
    }

    static class CPU extends Part {
        private double speed;

        public CPU(double speed) {
            this.speed = speed;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
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
