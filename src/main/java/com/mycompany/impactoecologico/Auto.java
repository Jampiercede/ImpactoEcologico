public class Auto implements ImpactoEcologico {
    private double kilometrosRecorridos;
    private double emisionesPorKilometro; // Emisiones de CO2 eq por kilómetro

    public Auto(double kilometrosRecorridos, double emisionesPorKilometro) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.emisionesPorKilometro = emisionesPorKilometro;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getEmisionesPorKilometro() {
        return emisionesPorKilometro;
    }

    public void setEmisionesPorKilometro(double emisionesPorKilometro) {
        this.emisionesPorKilometro = emisionesPorKilometro;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return kilometrosRecorridos * emisionesPorKilometro;
    }
}
