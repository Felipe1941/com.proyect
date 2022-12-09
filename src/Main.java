public class Main {
    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice(true, "windows", 10, 2010, true);
        System.out.println(smartDevice.wifi + " " + smartDevice.sistemaOperativo + " "+ smartDevice.memoria+ " "+ smartDevice.year+ " "+ smartDevice.bluetooh );
        smartDevice.capacidadMemoria(50);
        System.out.println(smartDevice.wifi + " " + smartDevice.sistemaOperativo + " "+ smartDevice.memoria+ " "+ smartDevice.year+ " "+ smartDevice.bluetooh );

        SmartPhone smartPhone = new SmartPhone(true, "android", 50, 2018, true, 50, true);
        System.out.println(smartPhone);

        SmartWatch smartWatch = new SmartWatch(false, "ios", 64, 2020, true, 1515);





    }
}