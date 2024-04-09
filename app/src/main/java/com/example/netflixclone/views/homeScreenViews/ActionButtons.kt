package com.example.netflixclone.views.homeScreenViews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclone.R
import com.example.netflixclone.ui.theme.PlayButtonBackground


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