package calcularNotas

import model.Alumno

fun calcularNotaFinal(notas: Map<String, Alumno>): Map<String, Alumno> {
    notas.forEach({ nota ->
        val parcial1: Float?
        val parcial2: Float?
        val practicas: Float?

        if (nota.value.ord1 != null) {
            parcial1 = nota.value.ord1
        } else if (nota.value.par1 != null) {
            parcial1 = nota.value.par1

        } else {
            parcial1 = 0f
        }

        if (nota.value.ord2 != null) {
            parcial2 = nota.value.ord2
        } else if (nota.value.par2 != null) {
            parcial2 = nota.value.par2
        } else {
            parcial2 = 0f;
        }

        if (nota.value.ordPract != null) {
            practicas = nota.value.ordPract
        } else if (nota.value.pract != null) {
            practicas = nota.value.pract
        } else {
            practicas = 0f;
        }

        if (parcial1 != null && parcial2 != null && practicas != null) {
            val notaFinal = ((parcial1 * 0.3f) + (parcial2 * 0.3f) + (practicas * 0.4f))
            nota.value.notaFinal = notaFinal
            nota.value.finalTeoria1 = parcial1;
            nota.value.finalTeoria2 = parcial2;
            nota.value.finalPractica = practicas;

        } else {
            println("Uno de las notas en null")
        }


    })
    return notas
}