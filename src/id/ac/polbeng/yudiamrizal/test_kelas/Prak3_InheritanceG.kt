package id.ac.polbeng.yudiamrizal.test_kelas

open class Base(val name: String) {
    init {
        println("Initializing Base")
    }
    open val size: Int = name.length.also {
        println("Initializing size in Base: $it")
    }
}
class Derived(name: String, val lastName: String) :
    Base(name.capitalize().also { println("Argument for Base: $it") }) {
    init {
        println("Initializing Derived")
    }
    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in Derived: $it")
    }
}
fun main(){
    val turunan = Derived("Depandi", "Enda")
    turunan.size
}