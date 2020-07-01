package com.lopes.asgerenciadordeinvestimentos.Obejtos

import android.os.Parcel
import android.os.Parcelable

data class CoinHttp(
    var high: String,
    var low: String,
    var vol: String,
    var last: String,
    var buy: String,
    var sell: String?
) {

}