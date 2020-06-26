package com.lopes.asgerenciadordeinvestimentos

import android.os.Parcel
import android.os.Parcelable

data class Ativo(var id: Int?, val data: String?,
                 val quantidade: Int?,
                 val valorMoeda: Double?,
                 val tipoMoeda: String?): Parcelable{

    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(data)
        parcel.writeValue(quantidade)
        parcel.writeValue(valorMoeda)
        parcel.writeString(tipoMoeda)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Ativo> {
        override fun createFromParcel(parcel: Parcel): Ativo {
            return Ativo(parcel)
        }

        override fun newArray(size: Int): Array<Ativo?> {
            return arrayOfNulls(size)
        }
    }


}