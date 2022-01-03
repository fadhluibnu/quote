package com.example.quote

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Profil(
    val quote: String
): Parcelable
