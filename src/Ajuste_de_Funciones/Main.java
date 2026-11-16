package Ajuste_de_Funciones;

public class Main {
    public static void main(String[] args) {
        // Datos de prueba: horas de estudio (x) y calificacion obtenida (y)
        double[] horas = {1, 2, 3, 4, 5, 6, 7, 8};
        double[] calificacion = {52, 55, 61, 64, 70, 72, 79, 85};

        double[] resultados = RegresionLineal.calcularMinimosCuadrados(horas, calificacion);

        // Prediccion con el modelo obtenido
        double xNuevo = 9;
        double yEstimado = RegresionLineal.predecir(resultados[0], resultados[1], xNuevo);
        System.out.printf("Prediccion para X = %.1f -> Y = %.4f%n", xNuevo, yEstimado);
    }
}