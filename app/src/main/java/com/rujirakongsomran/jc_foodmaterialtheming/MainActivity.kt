package com.rujirakongsomran.jc_foodmaterialtheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_foodmaterialtheming.ui.theme.JC_FoodMaterialThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_FoodMaterialThemingTheme {

            }
        }
    }
}

@Composable
fun DessertIcon(@DrawableRes dessertIcon: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(dessertIcon),
        contentDescription = null,
        modifier = modifier
            .size(64.dp)
            .padding(8.dp)
    )
}

@Composable
fun DessertInfo(@StringRes dessertName: Int, dessertId: Int, modifier: Modifier = Modifier) {

    Column {
        Text(
            text = stringResource(dessertName),
            modifier = modifier
                .padding(top = 8.dp)
        )
        Text(
            text = stringResource(R.string.dessert_id, dessertId)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_FoodMaterialThemingTheme(darkTheme = false) {
        //DessertIcon(dessertIcon = R.drawable.dessert_icon1_apam_balik)
        DessertInfo(dessertId = 53049, dessertName = R.string.dessert_name_1)
    }
}