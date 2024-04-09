package com.example.netflixclone.views.homeScreenViews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclone.R


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
        Text(text = "TV Shows", fontSize = 17.2.sp, color = Color.White)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Movies", fontSize = 17.2.sp, color = Color.White)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "My List", fontSize = 17.2.sp, color = Color.White)
    }
}