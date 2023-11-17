package tj.behruz.jetpackcomposebasics.ui.screens.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import tj.behruz.jetpackcomposebasics.data.Screens
import tj.behruz.jetpackcomposebasics.ui.Utils

@Composable
fun JetpackComposeLayouts(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Jetpack Compose Layouts",
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
            onClick = {
                navController.navigate(Screens.COLUMN.route)
            }) {
            Text(text = "Column Layout", color = Color.White)
        }

        Button(colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.onSecondary
        ),
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .padding(Utils.defaultPadding),
            onClick = { navController.navigate(Screens.ROW.route) }) {
            Text(text = "Row Layout", color = Color.White)
        }

        Button(colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.onSurface
        ),
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .padding(Utils.defaultPadding),
            onClick = { /*TODO*/ }) {
            Text(text = "Box Layout", color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BoxLayoutExample() {
    Box(modifier = Modifier.size(200.dp), contentAlignment = Alignment.TopCenter) {
        Text(text = "This is box layout", modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp))
        Text(text = "This is compose layout")
    }
}


@Composable
fun RowLayoutExample() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {
        Text(
            text = "Row Text 1",
            Modifier
                .height(80.dp)
                .background(Color.Red)
        )
        Text(
            text = "Row Text 2",
            Modifier
                .height(80.dp)
                .background(Color.White)
        )
        Text(
            text = "Row Text 3",
            Modifier
                .height(80.dp)
                .background(Color.Green)
        )
        Text(
            text = "Row Text 1",
            Modifier
                .height(80.dp)
                .background(Color.Red)
        )
        Text(
            text = "Row Text 2",
            Modifier
                .height(80.dp)
                .background(Color.White)
        )
        Text(
            text = "Row Text 3",
            Modifier
                .height(80.dp)
                .background(Color.Green)
        )
    }

}


@Composable
fun ColumnLayoutExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.LightGray),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Text(
            text = "This is Column Layout in Jetpack Compose",
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h3
        )

        Text(
            text = "Column let your arrange elements vertically",
            modifier = Modifier.padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h4
        )



        Text(
            text = "The option horizontalAlignment allows you to define how your element inside the column will be positioned horizontally.",
            modifier = Modifier.padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h5
        )

        Text(
            text = "The option verticalArrangement allows you to define how your element inside the column will be positioned vertically.",
            modifier = Modifier.padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h5
        )

        Text(
            text = "The option verticalArrangement allows you to define how your element inside the column will be positioned vertically.",
            modifier = Modifier.padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h5
        )

        Text(
            text = "The option verticalArrangement allows you to define how your element inside the column will be positioned vertically.",
            modifier = Modifier.padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h5
        )
        Text(
            text = "The option verticalArrangement allows you to define how your element inside the column will be positioned vertically.",
            modifier = Modifier.padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h5
        )

    }
}