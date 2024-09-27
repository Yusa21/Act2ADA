package model

class Alumno(
    val apellido: String,
    val nombre: String,
    val asistencia: Float,
    val par1: Float?,
    val par2: Float?,
    val ord1: Float?,
    val ord2: Float?,
    val pract: Float?,
    val ordPract: Float?,
    var finalTeoria1: Float = 0.0f,
    var finalTeoria2: Float = 0.0f,
    var finalPractica: Float = 0.0f,
    var notaFinal: Float = 0.0f
) {
}