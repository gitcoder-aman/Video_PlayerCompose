package com.tech.videoplayer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tech.videoplayer.screens.AllVideoFolder
import com.tech.videoplayer.screens.AllVideoScreen

@Composable
fun SetupNavigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = allVideoFolderScreen ){
        composable(allVideoFolderScreen){
            AllVideoFolder(navController)
        }
        composable(allVideoScreen){
            AllVideoScreen(navController)
        }
    }


}
const val allVideoScreen = "all_video_screen"
const val allVideoFolderScreen = "all_video_folder_screen"