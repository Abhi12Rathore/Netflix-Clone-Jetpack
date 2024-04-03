package com.example.netflixclone.views

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclone.R

@Composable
fun HomeScreen(navController: NavHostController) {
    Box {
        HomeTopBanner()
        Column() {
            Spacer(modifier = Modifier.height(30.dp))
            TopRow()
        }

    }
}

@Composable
fun TopRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(start = 5.dp, end = 10.dp)
    ) {
        Image(
            painterResource(id = R.drawable.home_netflix_logo),
            contentDescription = "",
            modifier = Modifier
                .height(50.dp)
                .width(60.dp)
        )

        Spacer(modifier = Modifier.width(50.dp))
        Text(text = "TV Shows", fontSize = 17.2.sp)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Movies", fontSize = 17.2.sp)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "My List", fontSize = 17.2.sp)
    }
}

@Composable
fun HomeTopBanner() {
    Image(
        painterResource(id = R.drawable.home_banner),
        contentDescription = "home_banner",
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.Crop,
    )
}

@Preview
@Composable
fun PreviewBanner() {
    TopRow()
}

