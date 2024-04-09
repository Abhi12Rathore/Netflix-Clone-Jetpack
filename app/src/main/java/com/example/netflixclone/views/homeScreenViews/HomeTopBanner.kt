package com.example.netflixclone.views.homeScreenViews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.netflixclone.R

@Composable
fun HomeTopBanner() {
    Image(
        painterResource(id = R.drawable.home_banner),
        contentDescription = "home_banner",
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.Crop,
    )
}