# SalmontApp
El proyecto muestra la herencia de clases, usando UnidadOperativa como superclase, y CentroCultivo y PlantaProceso como subclases. 
Los objetos son creados en GestorUnidades para luego ser llamados en Main.

Se incluyen tres paquetes en src:

-ui: Incluye la clase Main. Muestra los objetos creados.

-model: Incluye las clases UnidadOperativa, CentroCultivo y PlantaProceso. Establece los atributos nombre y comuna en común, y toneladas producidas y capacidad de proceso dependiendo de la subclase.

-data: Incluya la clase GestorUnidades, que crea objetos para cada subclase y los agrega a un ArrayList.

Para ejecutar en la terminal:

Navegar a la ruta:

    .../out/production/SalmontApp

Luego ejecutar:

    java ui.Main
