package com.hspedu.encap;

public class Computer {
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk){
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails() {
        return "CPU: " + cpu + ", Memory: " + memory + " GB, Hard Disk: " + disk + " GB";
    }

    public String getCpu() {
        return cpu;
    }

    public int getDisk() {
        return disk;
    }

    public int getMemoryl() {
        return memory;
    }

}
