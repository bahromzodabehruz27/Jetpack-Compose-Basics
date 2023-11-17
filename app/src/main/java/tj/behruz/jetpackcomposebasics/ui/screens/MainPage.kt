package tj.behruz.jetpackcomposebasics.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tj.behruz.jetpackcomposebasics.ui.Utils

@Composable
fun MainScreen() {
    Scaffold { paddingValues: PaddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            Text(
                text = "Jetpack Compose Basics",
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Utils.defaultPadding)
            )


            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.onPrimary
            ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(Utils.defaultPadding),
                onClick = { /*TODO*/ }) {
                Text(text = "Compose Layouts", color = Color.White)
            }

            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.onSecondary
            ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(Utils.defaultPadding),
                onClick = { /*TODO*/ }) {
                Text(text = "Compose Texts", color = Color.White)
            }

            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.onSurface
            ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(Utils.defaultPadding),
                onClick = { /*TODO*/ }) {
                Text(text = "Compose TextsFields", color = Color.White)
            }


            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.surface
            ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(Utils.defaultPadding),
                onClick = { /*TODO*/ }) {
                Text(text = "Compose Images", color = Color.White)
            }

            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondaryVariant
            ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(Utils.defaultPadding),
                onClick = { /*TODO*/ }) {
                Text(text = "Compose Cards", color = Color.White)
            }

            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary
            ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(Utils.defaultPadding),
                onClick = { /*TODO*/ }) {
                Text(text = "Compose Lists", color = Color.White)
            }


            Button(colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.primary
            ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .padding(Utils.defaultPadding),
                onClick = { /*TODO*/ }) {
                Text(text = "Compose Animation", color = Color.White)
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    MaterialTheme {
        MainScreen()
    }
}