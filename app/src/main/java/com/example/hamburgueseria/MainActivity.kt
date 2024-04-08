package com.example.hamburgueseria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.hamburgueseria.ui.theme.HamburgueseriaTheme
import java.security.Principal
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hamburgueseria.ui.HamburgueseriaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HamburgueseriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

enum class PrincipalScreen(@StringRes val title: Int){
    Pantalla1(title = R.string.p1),
    Pantalla2(title = R.string.p2),
    Pantalla3(title = R.string.p3),
    Pantalla4(title = R.string.p4),

}

//fun Principal(navHostController: NavHostController = rememberNavController()) {
  //  val viewModelHambuergueseria: HamburgueseriaViewModel = viewModel()
  //  viewModelHambuergueseria.
//}