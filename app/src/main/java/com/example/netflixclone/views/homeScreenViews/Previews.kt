package com.example.netflixclone.views.homeScreenViews

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclone.R

@Composable
fun Previews() {
    Column(modifier = Modifier.padding(15.dp)) {
        Text(
            text = "Previews",
            color = Color.White,
            fontSize = 26.75.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(5.dp))
        PreviewSlider()
    }
}


@Composable
fun PreviewSlider() {
    val imageList = listOf<Int>(
        R.drawable.preview1,
        R.drawable.preview2,
        R.drawable.preview3,
        R.drawable.preview1,
        R.drawable.preview2,
    )

    LazyRow() {
        items(imageList.size) {
            Image(
                painterResource(id = imageList[it]),
                contentDescription = "imageList$it",
                modifier = Modifier
                    .padding(start = 10.dp, end = 5.dp)
                    .height(80.dp)
                    .width(80.dp)
                    .clickable {

                    },

                )
        }
    }
}

@Composable
@Preview
fun ViewTopRow() {
    Previews()
}
