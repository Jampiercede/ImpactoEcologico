import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(100); // 100 metros cuadrados
        Auto auto = new Auto(15000, 0.2); // 15000 kilómetros, 0.2 kg CO2/km
        Bicicleta bicicleta = new Bicicleta(false); // Bicicleta mecánica

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println("Impacto Ecológico: " + objeto.obtenerImpactoEcologico() + " kg de CO2");
            if (objeto instanceof Edificio) {
                System.out.println("Edificio - Área Construida: " + ((Edificio) objeto).getAreaConstruida() + " m²");
            } else if (objeto instanceof Auto) {
                System.out.println("Auto - Kilómetros Recorridos: " + ((Auto) objeto).getKilometrosRecorridos() + " km");
            } else if (objeto instanceof Bicicleta) {
                System.out.println("Bicicleta - Eléctrica: " + ((Bicicleta) objeto).esElectrica());
            }
        }
    }
}

