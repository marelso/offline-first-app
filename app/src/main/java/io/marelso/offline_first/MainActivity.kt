package io.marelso.offline_first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import io.marelso.offline_first.navigation.AppNavigationGraph
import io.marelso.offline_first.ui.theme.OfflinefirstTheme

class MainActivity : ComponentActivity() {

    private var navHostController: NavHostController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            OfflinefirstTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    navHostController = rememberNavController()
                    navHostController?.let {
                        AppNavigationGraph(navHostController = it)
                    }
                }
            }
        }
    }
}