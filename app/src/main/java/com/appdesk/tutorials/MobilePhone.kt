package com.appdesk.tutorials

fun main(){
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val onePLus = MobilePhone("Android", "Oppo", "OnePlus 9")
    iphone.chargeBattery(20)
    galaxyS20.chargeBattery(10)
    onePLus.chargeBattery(30)
}

class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone '$model' from '$brand' uses '$osName' as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}



