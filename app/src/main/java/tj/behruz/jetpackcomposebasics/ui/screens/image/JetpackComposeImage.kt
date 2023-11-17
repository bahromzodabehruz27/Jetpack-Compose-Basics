package tj.behruz.jetpackcomposebasics.ui.screens.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tj.behruz.jetpackcomposebasics.R
import tj.behruz.jetpackcomposebasics.ui.Utils


@Preview(showSystemUi = true)
@Composable
fun ImageInJetpack() {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            "Images in Jetpack Compose",
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h4
        )

        Text(
            text = "Simple Image",
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            style = MaterialTheme.typography.caption
        )


        Image(
            modifier = Modifier
                .size(160.dp)
                .padding(Utils.defaultPadding),
            painter = painterResource(id = R.drawable.android_studio_icon),
            contentDescription = "sampleImage"
        )

        Text(
            text = " Circle Image ",
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            style = MaterialTheme.typography.caption
        )

        Image(
            modifier = Modifier
                .padding(Utils.defaultPadding)
                .size(160.dp)
                .clip(CircleShape)
                .border(3.dp, Color.Blue, CircleShape),
            painter = painterResource(id = R.drawable.android_studio_icon),
            contentDescription = "sampleImage"
        )


        Text(
            text = " Round Corner Image ",
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            style = MaterialTheme.typography.caption
        )

        Image(
            painter = painterResource(R.drawable.android_studio_icon),
            contentDescription = "Round corner image",
            modifier = Modifier
                .padding(Utils.defaultPadding)
                .size(160.dp)
                .clip(RoundedCornerShape(10))
                .border(2.dp, Color.Green, RoundedCornerShape(10))
        )


        Text(
            text = " Image Background Color",
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            style = MaterialTheme.typography.caption
        )

        Image(
            painter = painterResource(R.drawable.android_studio_icon),
            contentDescription = "Round corner image",
            modifier = Modifier
                .padding(Utils.defaultPadding)
                .size(160.dp)
                .background(Color.Blue)
                .clip(RoundedCornerShape(10))
                .border(
                    2.dp, Color.Green, RoundedCornerShape(10)
                )
        )


    }
}