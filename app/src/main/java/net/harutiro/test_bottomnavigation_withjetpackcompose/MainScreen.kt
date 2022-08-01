package net.harutiro.test_bottomnavigation_withjetpackcompose

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {

    val navControler = rememberNavController()

    Scaffold (
        bottomBar = {}
    ){

    }
}