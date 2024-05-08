import kotlin.properties.Delegates

interface ValueChangeListener {

    class Holder(number: Int) {

        var number: Int = number
        set(value) {
            listener?.onNewValue(value)
            field = value
        }

        var listener: ValueChangeListener? = null

        companion object {
            fun createHolder(number: Int): Holder {
                return Holder(number=number)
            }

            const val DEFAULT_NUMBER : Int = 9;
        }
    }

    fun onNewValue(number: Int){
        println("New value is $number")
    }
}
