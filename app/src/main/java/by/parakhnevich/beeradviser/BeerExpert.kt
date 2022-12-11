package by.parakhnevich.beeradviser

class BeerExpert {
    fun getBrands(color: String): List<String> {
        return when (color.lowercase()) {
            "amber" -> listOf("Jack Amber", "Red Moose")
            else -> listOf("Jail Pale Ale", "Gout Stout")
        }
    }
}