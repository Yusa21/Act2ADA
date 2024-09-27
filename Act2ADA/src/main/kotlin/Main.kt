import calcularNotas.calcularNotaFinal
import read.readNotas
import show.showNota
import java.io.BufferedReader
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.exists

fun main() {
    // Añade la ruta correcta del fichero
    val raiz = Path.of("src");
    val rutaFichero = raiz.resolve("main").resolve("resources").resolve("calificaciones.csv");

    // Verificar que el fichero existe
    if (!rutaFichero.exists()) {
        println("El fichero no existe: $rutaFichero")
        return
    }
    val fichero: BufferedReader = Files.newBufferedReader(rutaFichero);


    // Leer y procesar el fichero
    val notas = readNotas(rutaFichero.toString())
    val notas2=calcularNotaFinal(notas)
    showNota(notas)
}