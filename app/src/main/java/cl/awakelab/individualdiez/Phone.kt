package cl.awakelab.individualdiez

open class Phone(var isScreenLightOn: Boolean = false) {
    //Encender telefono
    open fun switchOn() {
        //Pantalla encendida
        isScreenLightOn = true
    }
    //Apagar telefono
    fun switchOff() {
        //Pantalla apagada
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}