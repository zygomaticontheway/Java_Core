package taskNoteBookConstructor;

public class NoteBookInnerClassConstructor {

    private String model;
    private String manufacturer;
    private Monitor monitor;
    private HDD hdd;


    public NoteBookInnerClassConstructor(String model, String manufacturer, int diagonal, int hddVolume) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.monitor = new Monitor(diagonal);
        this.hdd = new HDD(hddVolume);

    }

    public class Monitor {
        private int diagonal;

        public Monitor(int diagonal) {
            this.diagonal = diagonal;
        }

        public void brightnessUp(){
           System.out.println("Monitor got brighter");
       }

        public void brightnessDown(){
            System.out.println("Monitor got darker");
        }
   }
    public class HDD {
        private int hddVolume;

        public HDD(int hddVolume) {
            this.hddVolume = hddVolume;
        }

        public void readData(){
            System.out.println("HDD is reading data. Bzzzhhhh");
        }

        public void writeData(){
            System.out.println("HDD is writing data. Tzk bzhh tzck");
        }
    }

    @Override
    public String toString() {
        return "NoteBookInnerClassConstructor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", monitor=" + monitor +
                ", hdd=" + hdd +
                '}';
    }
}
