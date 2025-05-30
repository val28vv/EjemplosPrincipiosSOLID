public class EjemploComoNoOpenClose {
    private String figura1;
    private String figura2;

    public EjemploComoNoOpenClose(String figura1, String figura2) {
        this.figura1 = figura1;
        this.figura2 = figura2;
    }

    public String jugar() {
        if (figura1.equals("papel") && figura2.equals("papel")) {
            return "Empate";
        } else if (figura1.equals("papel") && figura2.equals("tijera")) {
            return "Ganó " + figura2;
        } else if (figura1.equals("papel") && figura2.equals("piedra")) {
            return "Ganó " + figura1;
        } else if (figura1.equals("tijera") && figura2.equals("tijera")) {
            return "Empate";
        } else if (figura1.equals("tijera") && figura2.equals("piedra")) {
            return "Ganó " + figura1;
        } else if (figura1.equals("tijera") && figura2.equals("papel")) {
            return "Ganó " + figura1;
        } else if (figura1.equals("piedra") && figura2.equals("piedra")) {
            return "Empate";
        } else if (figura1.equals("piedra") && figura2.equals("papel")) {
            return "Ganó " + figura2;
        } else if (figura1.equals("piedra") && figura2.equals("tijera")) {
            return "Ganó " + figura1;
        } else {
            return "Figura no válida";
        }
    }
}
