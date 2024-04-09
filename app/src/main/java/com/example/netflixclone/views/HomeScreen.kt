package com.example.netflixclone.views

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclone.R
import com.example.netflixclone.ui.theme.PlayButtonBackground

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            HomeTopBanner()
            Column() {
                Spacer(modifier = Modifier.height(30.dp))
                TopRow()
            }
        }

        ActionButtons()
    }

}

@Composable
@Preview
fun ViewTopRow() {
    ActionButtons()
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
        Text(text = "TV Shows", fontSize = 17.2.sp, color = Color.White)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Movies", fontSize = 17.2.sp, color = Color.White)
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "My List", fontSize = 17.2.sp, color = Color.White)
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

@Composable
fun ActionButtons() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 5.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painterResource(id = R.drawable.add_icon_no_background),
                contentDescription = "add_no_background",
                modifier = Modifier
                    .size(20.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))

            Text(text = "My List", fontSize = 18.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.width(50.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(PlayButtonBackground),
            shape = RoundedCornerShape(4.dp)
        ) {
            Text(
                text = "Play", fontSize = 18.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.width(50.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painterResource(id = R.drawable.info_icon),
                contentDescription = "info_icon",
                modifier = Modifier
                    .size(20.dp)

            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "Info", fontSize = 18.sp, color = Color.White)
        }
    }
}



