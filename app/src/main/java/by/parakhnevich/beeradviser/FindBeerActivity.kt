package by.parakhnevich.beeradviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView

class FindBeerActivity : AppCompatActivity() {
    private var beerExpert = BeerExpert()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.find_beer_activity)
    }

    fun onClick(view: View) {
        val brands = findViewById<TextView>(R.id.brands)
        val color = findViewById<Spinner>(R.id.color)

        val selectedItem = color.selectedItem.toString()
        brands.setText(beerExpert.getBrands(selectedItem).joinToString("\n"))
    }
}