package com.lopes.asgerenciadordeinvestimentos.Obejtos

import android.os.Parcel
import android.os.Parcelable

data class CoinHttp (
    var high: Double,
    var low: Double,
    var vol: Double,
    var last: Double,
    var buy: Double,
    var sell: Double
) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeDouble(high)
        parcel.writeDouble(low)
        parcel.writeDouble(vol)
        parcel.writeDouble(last)
        parcel.writeDouble(buy)
        parcel.writeDouble(sell)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CoinHttp> {
        override fun createFromParcel(parcel: Parcel): CoinHttp {
            return CoinHttp(parcel)
        }

        override fun newArray(size: Int): Array<CoinHttp?> {
            return arrayOfNulls(size)
        }
    }
}