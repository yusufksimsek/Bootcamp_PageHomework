package com.example.composebootcamp_pagehomework.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composebootcamp_pagehomework.ui.screens.Anasayfa
import com.example.composebootcamp_pagehomework.ui.screens.SayfaA
import com.example.composebootcamp_pagehomework.ui.screens.SayfaB
import com.example.composebootcamp_pagehomework.ui.screens.SayfaX
import com.example.composebootcamp_pagehomework.ui.screens.SayfaY

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