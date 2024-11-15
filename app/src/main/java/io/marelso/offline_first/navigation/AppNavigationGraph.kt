package io.marelso.offline_first.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.marelso.offline_first.ui.home.HomeScreenHoisting

@Composable
fun AppNavigationGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Routes.Home.route) {
        composable(route = Routes.Home.route) {
            HomeScreenHoisting()
        }
    }
}