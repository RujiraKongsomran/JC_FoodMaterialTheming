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
    Dessert(R.drawable.dessert_icon_2, R.string.dessert_name_2, R.string.dessert_id_2),
    Dessert(R.drawable.dessert_icon_3, R.string.dessert_name_3, R.string.dessert_id_3),
    Dessert(R.drawable.dessert_icon_4, R.string.dessert_name_4, R.string.dessert_id_4),
    Dessert(R.drawable.dessert_icon_5, R.string.dessert_name_5, R.string.dessert_id_5),
    Dessert(R.drawable.dessert_icon_6, R.string.dessert_name_6, R.string.dessert_id_6),
    Dessert(R.drawable.dessert_icon_7, R.string.dessert_name_7, R.string.dessert_id_7),
    Dessert(R.drawable.dessert_icon_8, R.string.dessert_name_8, R.string.dessert_id_8),
    Dessert(R.drawable.dessert_icon_9, R.string.dessert_name_9, R.string.dessert_id_9),
    Dessert(R.drawable.dessert_icon_10, R.string.dessert_name_10, R.string.dessert_id_10),
    Dessert(R.drawable.dessert_icon_11, R.string.dessert_name_11, R.string.dessert_id_11),
    Dessert(R.drawable.dessert_icon_12, R.string.dessert_name_12, R.string.dessert_id_12),
)
