package com.example.netflixclone.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.netflixclone.R
import com.example.netflixclone.models.ProfileData

@Composable
fun ProfileSelection(navController: NavHostController) {
    Column() {
        Header()
    }

}


@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween, // Aligns one item to the end
        verticalAlignment = Alignment.CenterVertically // Aligns items vertically to the center
    ) {
        Spacer(modifier = Modifier.width(8.dp)) //
        Spacer(modifier = Modifier.width(8.dp)) //

        val painter = painterResource(id = R.drawable.logos_netflix)
        Image(
            painter, contentDescription = "header_logo",
            modifier = Modifier.size(width = 100.dp, height = 100.dp)

        )
        Spacer(modifier = Modifier.width(8.dp)) // Adds spacing between items
        Image(
            painterResource(id = R.drawable.edit_icon), contentDescription = "edit_icon",
            modifier = Modifier.size(width = 15.dp, 15.dp)

        )
    }
}

@Composable
fun ProfileGrid() {
    val drawableList = listOf(
        ProfileData("Emenalo", R.drawable.profile1),
        ProfileData("Onyeka", R.drawable.profile2),
        ProfileData("Thela", R.drawable.profile3),
        ProfileData("Kids", R.drawable.profile4),
        ProfileData("Add Profile", R.drawable.add_icon)

    )
}
