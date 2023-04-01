public class Juego {
    Integer niveles;
    Integer puntos;

    public void setNiveles(Integer niveles) {
        this.niveles = niveles;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getNiveles() {
        return niveles;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public Juego (int niveles, int puntos) {
        this.niveles= niveles;
        this.puntos= puntos;
    }

}
