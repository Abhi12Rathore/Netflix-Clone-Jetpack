package com.example.netflixclone.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.netflixclone.R
import com.example.netflixclone.models.ProfileData
import com.example.netflixclone.utils.NavConstants

@Composable
fun ProfileSelection(navController: NavHostController) {
    Column() {
        Spacer(modifier = Modifier.height(10.dp))
        Header()
        Spacer(modifier = Modifier.height(10.dp))
        ProfileGrid(navController)
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
            modifier = Modifier.size(width = 120.dp, height = 120.dp)

        )
        Spacer(modifier = Modifier.width(8.dp)) // Adds spacing between items
        Image(
            painterResource(id = R.drawable.edit_icon), contentDescription = "edit_icon",
            modifier = Modifier.size(width = 15.dp, 15.dp)

        )
    }
}

@Composable
fun ProfileGrid(navController: NavHostController) {
    val drawableList = listOf(
        ProfileData("Emenalo", R.drawable.profile1),
        ProfileData("Onyeka", R.drawable.profile2),
        ProfileData("Thela", R.drawable.profile3),
        ProfileData("Kids", R.drawable.profile4),
        ProfileData("Add Profile", R.drawable.add_icon)

    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2), contentPadding = PaddingValues(70.dp),
    ) {
        items(drawableList.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .clickable {
                        if(it!=drawableList.size-1){
                            navController.navigate(NavConstants.HOME_SCREEN)
                        }
                    },

                ) {
                Image(
                    painterResource(id = drawableList[it].image),
                    modifier = if (it == drawableList.size - 1) {
                        Modifier
                            .height(35.dp)
                            .width(35.dp)
                    } else {
                        Modifier
                            .height(100.dp)
                            .width(100.dp)
                    },
                    contentDescription = "profile_icon_$it",
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "  ${drawableList[it].name}", fontSize = 13.25.sp)
            }
        }
    }
}


