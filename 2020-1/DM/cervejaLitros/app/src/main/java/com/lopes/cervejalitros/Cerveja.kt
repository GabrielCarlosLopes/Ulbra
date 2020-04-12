package com.lopes.cervejalitros

import android.os.Parcel
import android.os.Parcelable

class Cerveja(val marca: String?, val mls: Double, val preco: Double, val valorMls: Double = (mls/preco)) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }



    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(marca)
        parcel.writeDouble(mls)
        parcel.writeDouble(preco)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cerveja> {
        override fun createFromParcel(parcel: Parcel): Cerveja {
            return Cerveja(parcel)
        }

        override fun newArray(size: Int): Array<Cerveja?> {
            return arrayOfNulls(size)
        }
    }

}
