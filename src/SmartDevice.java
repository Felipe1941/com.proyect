public class SmartDevice {

    boolean wifi;
    String sistemaOperativo;
    int memoria;
    int year; //año de lanzamiento
    boolean bluetooh;

    public SmartDevice(){

    }

    public SmartDevice(boolean wifi, String sistemaOperativo, int memoria, int year, boolean bluetooh) {
        this.wifi = wifi;
        this.sistemaOperativo = sistemaOperativo;
        this.memoria = memoria;
        this.year = year;
        this.bluetooh = bluetooh;
    }


    public void capacidadMemoria (int memoriaExterna){
        this.memoria += memoriaExterna;
        if (memoria >= 128){
            System.out.println("Se excedio la capacidad de memoria");
        }
    }
}
