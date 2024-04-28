package com.example.netflixclone.views

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.netflixclone.views.homeScreenViews.ActionButtons
import com.example.netflixclone.views.homeScreenViews.Carousal
import com.example.netflixclone.views.homeScreenViews.HomeTopBanner
import com.example.netflixclone.views.homeScreenViews.Previews
import com.example.netflixclone.views.homeScreenViews.TopRow

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
        Spacer(modifier = Modifier.height(10.dp))
        Previews()
        Carousal()
    }

}











