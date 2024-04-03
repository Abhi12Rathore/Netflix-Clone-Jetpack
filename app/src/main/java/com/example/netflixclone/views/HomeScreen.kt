package com.example.netflixclone.views

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.netflixclone.R

@Composable
fun HomeScreen(navController: NavHostController) {
    Box {
        HomeTopBanner()
    }
}

@Composable
fun HomeTopBanner(){
    Image(
        painterResource(id = R.drawable.home_banner),
        contentDescription = "home_banner"

    )
}

@Preview
@Composable

