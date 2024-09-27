package read

import model.Alumno;
import java.io.File

// Función que recibe la ruta del fichero y devuelve un Map con los objetos Cotizador
fun readNotas(rutaFichero: String): Map<String, Alumno> {
    val notas = mutableMapOf<String, Alumno>()
    // Leer el archivo línea por línea
    val lineas = File(rutaFichero).readLines()

    // Saltar la primera línea que contiene los encabezados
    for (linea in lineas.drop(1)) {
        // Dividir la línea por ";"
        val datos = linea.split(";")

        // Convertir cada valor a su tipo correspondiente y tener en cuenta los decimales con coma
        val apellido = datos[0]
        val nombre = datos[1]
        val asistencia = datos[2].replace("%", "").toFloat()
        val parcial1 = datos[3].replace(".", "").replace(",", ".").toFloatOrNull()
        val parcial2 = datos[4].replace(".", "").replace(",", ".").toFloatOrNull()
        val ordinario1 = datos[5].replace(".", "").replace(",", ".").toFloatOrNull()
        val ordinario2 = datos[6].replace(".", "").replace(",", ".").toFloatOrNull()
        val practicas = datos[7].replace(".", "").replace(",", ".").toFloatOrNull()
        val ordinariopracticas = datos[8].replace(".", "").replace(",", ".").toFloatOrNull()

        //Comentario para comprobar si funciona la lectura de datos, solo para debug no usar
        //println("$apellido $nombre $asistencia $parcial1 $parcial2 $ordinario1 $ordinario2 $practicas $ordinariopracticas")
        // Crear el objeto Cotizador
        val alumno = Alumno(
            apellido,
            nombre,
            asistencia,
            parcial1,
            parcial2,
            ordinario1,
            ordinario2,
            practicas,
            ordinariopracticas
        )

        // Añadirlo al diccionario usando el nombre como clave
        notas[apellido] = alumno
    }

    return notas
}