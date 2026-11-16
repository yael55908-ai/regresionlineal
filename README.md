# Regresión Lineal por Mínimos Cuadrados en Java

Práctica de la Unidad 5, SCC-1017 Métodos Numéricos
Instituto Tecnológico Superior de Xalapa, Ingeniería en Sistemas Computacionales

**Alumno:** Yael Aminadab Hernández Reyes
**Grupo:** A
**Docente:** Víctor Hugo Vásquez Herrera

Programa en Java que calcula una regresión lineal simple con mínimos cuadrados, junto con el coeficiente de correlación de Pearson (r) y el coeficiente de determinación (r²).

## Requisitos

- Git
- JDK 11 o superior (para revisar: `java -version` y `javac -version`)

## Cómo clonar

```bash
git 
cd 
```

## Cómo compilar

```bash
mkdir out
javac -d out src/Ajuste_de_Funciones/*.java
```

## Cómo ejecutar

```bash
java -cp out Ajuste_de_Funciones.Main
```

También se puede abrir en IntelliJ IDEA y ejecutar la clase `Main` con el botón Run.

## Salida esperada

```
--- RESULTADOS DE MINIMOS CUADRADOS Y CORRELACION ---
Sumatorias: n=8, X= 36.0, Y= 538.0, X2= 204.0, Y2= 37096.0, XY= 2616.0
Pendiente (beta1): 4.6429
Ordenada al origen (beta0): 46.3571
Modelo obtenido: Y = 46.3571 + 4.6429X
Coeficiente de Pearson (r): 0.9944
Coeficiente de Determinacion (r2): 0.9889
Prediccion para X = 9.0 -> Y = 88.1429
```

## Estructura del proyecto

```
src/
└── Ajuste_de_Funciones/
    ├── RegresionLineal.java
    └── Main.java
README.md
```