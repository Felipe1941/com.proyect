public class SmartWatch extends SmartDevice{

    int modelo;

    public SmartWatch(){

    }

    public SmartWatch(boolean wifi, String sistemaOperativo, int memoria, int year, boolean bluetooh, int modelo) {
        super(wifi, sistemaOperativo, memoria, year, bluetooh);
        this.modelo = modelo;
    }
}
