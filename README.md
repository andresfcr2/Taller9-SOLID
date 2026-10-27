# Proyecto SOLID — Parqueadero

Sistema de cobro mensual de un parqueadero: mensualistas, vehículos que pagan por minuto o por día, bicicletas y casilleros para cascos.

Cada carpeta es una versión completa y ejecutable del mismo proyecto. Si alguien se atrasa o su código no compila, copia la carpeta del paso anterior y sigue desde ahí.

| Carpeta | Estado |
|---|---|
| 00-inicio | Proyecto de partida. Viola los cinco principios a propósito. |
| 01-responsabilidad-unica | GestorParqueadero dividido: ExportadorCSV y NotificadorSMS. |
| 02-abierto-cerrado | Vehiculo abstracta, subclases por modelo de cobro, sin switch. Se agrega VehiculoPorDia. Main trae comentado el bloque que provoca el error del paso L. |
| 03-sustitucion-liskov | Interfaz Fidelizable. Bicicleta extiende Vehiculo directamente. |
| 04-segregacion-interfaces | ServicioParqueadero dividida en ConMinutos, ConSeguro y ConLavado. |
| 05-inversion-dependencias | Interfaz RepositorioCobros. GestorParqueadero recibe el repositorio por constructor. RepositorioEnMemoria para probar. |

Las líneas que cambian en cada paso llevan un comentario que empieza con `// Paso`.

## Qué viola cada principio en 00-inicio

- **S**: `GestorParqueadero` calcula, guarda en la base de datos, exporta el CSV y envía el SMS.
- **O**: `calcularCobro` usa un `switch` sobre el texto `tipo`; cada modelo de cobro nuevo obliga a modificarlo.
- **L**: `Bicicleta` hereda `calcularPuntos()` y lanza una excepción.
- **I**: `ServicioParqueadero` obliga a `Casillero` a escribir `calcularSeguro()` y `solicitarLavados()` vacíos.
- **D**: `GestorParqueadero` crea con `new` un `RepositorioMySQL`.

## Ejecutar cualquier versión
```
cd 00-inicio
javac *.java && java Main
```

## Pendiente para el reto
En 05, GestorParqueadero todavía crea con `new` el exportador y el notificador. El reto (enviar el recibo por WhatsApp o por correo sin modificar GestorParqueadero) consiste en aplicarles lo mismo que al repositorio.
