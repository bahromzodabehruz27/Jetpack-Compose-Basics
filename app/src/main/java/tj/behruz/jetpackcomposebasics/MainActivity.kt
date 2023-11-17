package tj.behruz.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import tj.behruz.jetpackcomposebasics.data.Screens
import tj.behruz.jetpackcomposebasics.ui.screens.MainScreen
import tj.behruz.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            JetpackComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.MAIN.route) {

        composable(Screens.MAIN.route) {
            MainScreen()
        }
        composable(Screens.LAYOUTS.route) {

        }
        composable(Screens.TEXTS.route) {

        }

        composable(Screens.TEXTFIELDS.route) {


        }

        composable(Screens.CARDS.route) {

        }

        composable(Screens.IMAGES.route) {

        }

        composable(Screens.LISTS.route) {

        }

    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeBasicsTheme {
        Greeting("Android")
    }
}