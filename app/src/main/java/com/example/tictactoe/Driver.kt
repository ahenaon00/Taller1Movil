package com.example.tictactoe

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Driver(
    val fullName: String,
    val countryCode: String,
    val nameAcronym: String,
    val teamName: String,
    val teamColor: String,
    val headShotURL: String
) : Parcelable