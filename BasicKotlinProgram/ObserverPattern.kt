import kotlin.properties.Delegates

fun main(args: Array<String>) {
    val chemical = Chemical()
    chemical.observer = LogChemicalColorObserver()
    chemical.color = "Red"
    chemical.color = "Green"
    chemical.color = "Yellow"
}

class Chemical {
    var observer: ChemicalColorObserver? = null
    var color: String by Delegates.observable(" ") { property , oldValue, newValue ->
        observer?.onColorChange(newValue)
    }
}

interface ChemicalColorObserver {
    fun onColorChange(newColor: String)
}

class LogChemicalColorObserver : ChemicalColorObserver {
    override fun onColorChange(newColor: String) {
        println("Look chemical color changes to new color $newColor")
    }
}
