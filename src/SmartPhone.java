public class SmartPhone extends SmartDevice{

    int calidadCamara; //pixeles
    boolean cargaRapida;

    public SmartPhone(){

    }

    public SmartPhone(boolean wifi, String sistemaOperativo, int memoria, int year, boolean bluetooh, int calidadCamara, boolean cargaRapida) {
        super(wifi, sistemaOperativo, memoria, year, bluetooh);
        this.calidadCamara = calidadCamara;
        this.cargaRapida = cargaRapida;
    }
}
