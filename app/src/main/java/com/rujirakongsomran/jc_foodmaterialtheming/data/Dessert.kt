package com.rujirakongsomran.jc_foodmaterialtheming.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.rujirakongsomran.jc_foodmaterialtheming.R

data class Dessert(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val num: Int
)

val desserts = listOf(
    Dessert(R.drawable.dessert_icon_1, R.string.dessert_name_1, R.string.dessert_id_1),
    Dessert(R.drawable.dessert_icon_2, R.string.dessert_name_2, R.string.dessert_id_2)
)
