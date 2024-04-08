package com.example.hamburgueseria.data

object DataSource {
    val productos = arrayListOf<Producto>(
        Producto("Hambuerguesa simple", 3, listOf(Ingredientes("Carne"), Ingredientes("Pan"), Ingredientes("Ketchup"))),
        Producto("Hamburguesa con queso", 5, listOf(Ingredientes("Carne"), Ingredientes("Pan"), Ingredientes("Ketchup"), Ingredientes("Queso"), Ingredientes("Pepinillos"))),
        Producto("Hamburguesa completa", 8, listOf(Ingredientes("Carne"), Ingredientes("Pan"), Ingredientes("Salsa Especial"), Ingredientes("Queso"), Ingredientes("Pepinillos"), Ingredientes("Lechuga"), Ingredientes("Tomate"), Ingredientes("Bacon"))),
        Producto("Patatas normales", 3, listOf(Ingredientes("Papas"))),
        Producto("Patatas de gajo", 4, listOf(Ingredientes("Papas especiales"), Ingredientes("Pimienta"), Ingredientes("Sazonado Especial"))),
        Producto("Refresco",2, listOf(Ingredientes("Sabor"))),
        Producto("Helado", 1, listOf(Ingredientes("Leche"), Ingredientes("Sabor"))),
    )
}