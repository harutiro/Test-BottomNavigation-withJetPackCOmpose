package net.harutiro.test_bottomnavigation_withjetpackcompose

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val navControler = rememberNavController()

    Scaffold (
        bottomBar = {}
    ){

    }
}