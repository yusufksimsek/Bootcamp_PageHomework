package com.example.composebootcamp_pagehomework.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Anasayfa(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Anasayfa", fontSize = 40.sp)

        Button(onClick = {
            navController.navigate("sayfa_a")
        }) {
            Text(text = "A sayfasına git")
        }

        Button(onClick = {
            navController.navigate("sayfa_x")
        }) {
            Text(text = "X sayfasına git")
        }
    }
}