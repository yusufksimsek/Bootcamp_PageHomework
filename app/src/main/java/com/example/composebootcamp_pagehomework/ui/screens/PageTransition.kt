package com.example.composebootcamp_pagehomework.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PageTransition(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "anasayfa"){
        composable("anasayfa"){
            Anasayfa(navController)
        }
        composable("sayfa_a"){
            SayfaA(navController)
        }
        composable("sayfa_b"){
            SayfaB(navController)
        }
        composable("sayfa_x"){
            SayfaX(navController = navController)
        }
        composable("sayfa_y"){
            SayfaY()
        }
    }
}