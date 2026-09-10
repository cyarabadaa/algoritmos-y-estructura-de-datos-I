public class MedicionesTemperaturasTest {
    public static void main(String[] args) {
        MedicionesTemperaturas medicion = new MedicionesTemperaturas(1, 2);
        medicion.agregarRegistro(-1);
        medicion.agregarRegistro(3);
        medicion.agregarRegistro(8);
        medicion.agregarRegistro(15);
        medicion.agregarRegistro(12);
        medicion.agregarRegistro(6);
        medicion.agregarRegistro(6);
        medicion.agregarRegistro(2);
        medicion.imprimirTemperaturas();
    }
}