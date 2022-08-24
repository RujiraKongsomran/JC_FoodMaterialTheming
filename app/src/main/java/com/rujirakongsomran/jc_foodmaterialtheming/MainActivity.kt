package com.rujirakongsomran.jc_foodmaterialtheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_foodmaterialtheming.data.Dessert
import com.rujirakongsomran.jc_foodmaterialtheming.data.desserts
import com.rujirakongsomran.jc_foodmaterialtheming.ui.theme.JC_FoodMaterialThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_FoodMaterialThemingTheme {
                DessertApp()
            }
        }
    }
}

@Composable
fun DessertApp() {
    LazyColumn(
        modifier = Modifier.background(MaterialTheme.colors.background)
    ) {
        items(desserts) {
            DessertItem(dessert = it)
        }
    }
}

@Composable
fun DessertItem(dessert: Dessert, modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(8.dp)) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            DessertIcon(dessertIcon = dessert.imageResourceId)
            DessertInfo(dessertName = dessert.name, dessertId = dessert.num)
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
            .clip(RoundedCornerShape(50)),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun DessertInfo(
    @StringRes dessertName: Int,
    @StringRes dessertId: Int,
    modifier: Modifier = Modifier
) {

    Column {
        Text(
            text = stringResource(dessertName),
            modifier = modifier
                .padding(top = 8.dp),
        )
        Text(
            text = "ID: ${stringResource(dessertId)}",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_FoodMaterialThemingTheme(darkTheme = false) {
        //DessertIcon(dessertIcon = R.drawable.dessert_icon1_apam_balik
        DessertApp()
    }
}