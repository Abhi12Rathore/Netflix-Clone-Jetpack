package com.example.netflixclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.netflixclone.ui.theme.NetflixCloneTheme
import com.example.netflixclone.utils.NavConstants
import com.example.netflixclone.utils.NavConstants.Companion.HOME_SCREEN
import com.example.netflixclone.views.HomeScreen
import com.example.netflixclone.views.ProfileSelection
import com.example.netflixclone.views.SplashScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            NetflixCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavConstants.SPLASH_SCREEN){
        composable(route = NavConstants.SPLASH_SCREEN){
            SplashScreen(navController)
        }

        composable(route=NavConstants.USER_NAME){
            ProfileSelection(navController)
        }

        composable(route=HOME_SCREEN){
            HomeScreen(navController)
        }

    }
}




