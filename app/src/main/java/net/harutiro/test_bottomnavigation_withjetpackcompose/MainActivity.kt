package net.harutiro.test_bottomnavigation_withjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import net.harutiro.test_bottomnavigation_withjetpackcompose.ui.theme.TestBottomNavigationwithJetPackCOmposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestBottomNavigationwithJetPackCOmposeTheme {
                MainScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestBottomNavigationwithJetPackCOmposeTheme {
        MainScreen()
    }
}