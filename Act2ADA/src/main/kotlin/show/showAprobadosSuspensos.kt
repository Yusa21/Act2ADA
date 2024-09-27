package show

import model.Alumno;
import java.nio.file.Files
import java.nio.file.Path

fun showNota(notas: Map<String, Alumno>) {

    println("APROBADOS:")
    println("Apellido; Nombre")
    notas.forEach { entry ->
        if (entry.value.notaFinal >= 5 && entry.value.finalTeoria1 >= 4 && entry.value.finalTeoria2 >= 4 && entry.value.finalPractica >= 4 && entry.value.asistencia >= 75) {
            println("${entry.value.apellido};${entry.value.nombre};${entry.value.finalTeoria1};${entry.value.finalTeoria2};${entry.value.finalPractica};${entry.value.notaFinal}")
        }
    }
    println("SUSPENSOS:")
    println("Apellido; Nombre")
    notas.forEach { entry ->
        if (entry.value.notaFinal < 5 || entry.value.finalTeoria1 < 4 || entry.value.finalTeoria2 < 4 || entry.value.finalPractica < 4 || entry.value.asistencia < 75) {
            println("${entry.value.apellido};${entry.value.nombre};${entry.value.finalTeoria1};${entry.value.finalTeoria2};${entry.value.finalPractica};${entry.value.notaFinal}")
        }
    }
}