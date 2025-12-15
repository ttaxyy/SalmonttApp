# SalmontApp

El proyecto muestra la herencia de clases, el uso de interfaces y una interfaz gráfica en Java.

## Paquetes

Se incluyen tres paquetes en `src`:

* `ui`:  Incluye la clase `Main`. Esta crea 5 objetos y los muestra en consola, y luego abre la interfaz gráfica de creación de unidades..
* `model`: Incluye las clases `UnidadOperativa`, `CentroCultivo` y `PlantaProceso`. Establece los atributos nombre 
y comuna en común, y toneladas producidas y capacidad de proceso dependiendo de la subclase. Ambas subclases implementan 
la interfaz `Registrable`.
* `data`: Incluya las clases `GestorUnidades`, `Formulario` y la interfaz `Registrable`.
La primera clase crea objetos para cada subclase y los agrega a un ArrayList, la segunda se encarga de manejar el panel gráfico
y la creación de unidades, y la interfaz declara el método `mostrarResumen()` que devuelve un String con información de los objetos.

## Ejecución

En la terminal, navegar a la ruta:

    .../out/production/SalmontApp

Luego ejecutar:

    java ui.Main
