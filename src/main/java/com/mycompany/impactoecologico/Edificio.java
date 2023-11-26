public class Edificio implements ImpactoEcologico {
    private double areaConstruida; // Metros cuadrados

    public Edificio(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double factorEmisionesPorMetroCuadrado = 2.0; // Valor hipotético
        return areaConstruida * factorEmisionesPorMetroCuadrado;
    }
}
