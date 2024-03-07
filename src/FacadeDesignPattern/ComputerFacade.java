package FacadeDesignPattern;

public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade(CPU processor, Memory ram, HardDrive hd) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
    }

    public CPU getProcessor() {
        return processor;
    }

    public void setProcessor(CPU processor) {
        this.processor = processor;
    }

    public Memory getRam() {
        return ram;
    }

    public void setRam(Memory ram) {
        this.ram = ram;
    }

    public HardDrive getHd() {
        return hd;
    }

    public void setHd(HardDrive hd) {
        this.hd = hd;
    }
    public void start(){
        processor.freeze();
        ram.load(132, hd.read(3456,89));
        processor.jump(132);
        processor.execute();
    }
}
