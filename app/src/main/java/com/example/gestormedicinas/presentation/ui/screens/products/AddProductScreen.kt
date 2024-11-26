package com.example.gestormedicinas.presentation.ui.screens.products


// Definimos la clase de datos para los productos
data class Product(
    val id: Int,
    val name: String,
    val presentacionMg: Double,
    val description: String
)

fun main() {
    // Creamos una lista de productos
    val products = listOf(
        Product(1, "Ibuprofeno", 600.0, "Antiinflamatorio"),
        Product(2, "Pregabalina", 100.0, "Anticonvulsivante y modulador del dolor neuropático"),
        Product(3, "Lotensil", 10.0, "Hipertensión y presión alta"),
        Product(4, "Sintrom", 4.0, "Anticoagulante"),
        Product(5, "Dexametasona", 4.0, "Corticoide"),
        Product(6, "Paracetamol", 1000.0, "Analgésico y antipirético")
    )

    // Imprimimos los productos
    products.forEach { product ->
        println("ID: ${product.id}, Nombre: ${product.name}, Precio: ${product.presentacionMg}, Descripción: ${product.description}")
    }
}
