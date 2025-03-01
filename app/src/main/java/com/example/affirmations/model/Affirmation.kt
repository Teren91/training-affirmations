package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    //La anotación @StringRes indica que el parámetro stringResourceId es un recurso de cadena
    @StringRes val stringResourceId: Int,
    //La anotación @DrawableRes indica que el parámetro imageResourceId es un recurso de
    //  elementos de diseño
    @DrawableRes val imageResourceId: Int
)
