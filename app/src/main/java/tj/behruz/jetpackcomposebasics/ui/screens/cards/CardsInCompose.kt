package tj.behruz.jetpackcomposebasics.ui.screens.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tj.behruz.jetpackcomposebasics.ui.Utils

@Preview(showSystemUi = true)
@Composable
fun CardsInCompose() {

    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Cards in Jetpack Compose",
            style = MaterialTheme.typography.h4,
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
        )


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(Utils.defaultPadding)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Simple Card in Compose", style = MaterialTheme.typography.h5)
            }


        }

        Card(
            elevation = 10.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(Utils.defaultPadding)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Card with shadow in Compose", style = MaterialTheme.typography.h5)
            }
        }

        Card(
            shape = RoundedCornerShape(20.dp), elevation = 10.dp, modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(Utils.defaultPadding)
        ) {

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(
                    text = "Card with rounded corner shape in Compose",
                    style = MaterialTheme.typography.subtitle1
                )
            }

        }


        Card(
            border = BorderStroke(1.dp, Color.DarkGray),

            shape = RoundedCornerShape(20.dp), elevation = 10.dp, modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(Utils.defaultPadding)
        ) {

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(
                    text = "Card with border  shape in Compose",
                    style = MaterialTheme.typography.subtitle1
                )
            }

        }


    }


}