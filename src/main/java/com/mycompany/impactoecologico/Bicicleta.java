public class Bicicleta implements ImpactoEcologico {
    private boolean esElectrica;

    public Bicicleta(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    public boolean esElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double valorImpactoBicicletaElectrica = 0.5; // Valor simbólico
        double valorImpactoBicicletaMecanica = 0.1; // Valor simbólico
        return esElectrica ? valorImpactoBicicletaElectrica : valorImpactoBicicletaMecanica;
    }
}
