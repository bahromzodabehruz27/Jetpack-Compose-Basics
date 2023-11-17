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
import tj.behruz.jetpackcomposebasics.ui.screens.cards.CardsInCompose
import tj.behruz.jetpackcomposebasics.ui.screens.image.ImageInJetpack
import tj.behruz.jetpackcomposebasics.ui.screens.layouts.ColumnLayoutExample
import tj.behruz.jetpackcomposebasics.ui.screens.layouts.JetpackComposeLayouts
import tj.behruz.jetpackcomposebasics.ui.screens.layouts.RowLayoutExample
import tj.behruz.jetpackcomposebasics.ui.screens.text.TextFieldsInCompose
import tj.behruz.jetpackcomposebasics.ui.screens.text.TextScreen
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
            MainScreen(navController = navController)
        }
        composable(Screens.LAYOUTS.route) {
            JetpackComposeLayouts(navController = navController)
        }
        composable(Screens.TEXTS.route) {
            TextScreen()
        }

        composable(Screens.TEXTFIELDS.route) {
            TextFieldsInCompose()

        }

        composable(Screens.CARDS.route) {
            CardsInCompose()
        }

        composable(Screens.IMAGES.route) {
            ImageInJetpack()
        }

        composable(Screens.LISTS.route) {

        }
        composable(Screens.COLUMN.route) {
            ColumnLayoutExample()
        }
        composable(Screens.ROW.route) {
            RowLayoutExample()
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