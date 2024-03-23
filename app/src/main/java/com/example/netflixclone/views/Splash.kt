package com.example.netflixclone.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.netflixclone.R
import com.example.netflixclone.utils.NavConstants
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(true) {
        delay(2000)
        navController.navigate(NavConstants.USER_NAME)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        val painter = painterResource(id = R.drawable.logos_netflix)
        Image(
            painter, contentDescription = "splash_logo",
            modifier = Modifier
                .aspectRatio(painter.intrinsicSize.width / painter.intrinsicSize.height),
            contentScale = ContentScale.Fit

        )
    }
}