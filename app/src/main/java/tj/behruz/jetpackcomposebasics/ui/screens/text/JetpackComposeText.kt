package tj.behruz.jetpackcomposebasics.ui.screens.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import tj.behruz.jetpackcomposebasics.ui.Utils


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TextScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Sample Text", modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding)
        )

        Text(
            text = "Sample Text with Style",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding)
        )

        val offset = Offset(5.0f, 10.0f)
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            text = "Text with shadow",
            style = TextStyle(
                fontSize = 24.sp,
                shadow = Shadow(
                    color = Color.LightGray, offset = offset, blurRadius = 3f
                )
            )
        )

        Text(

            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            style = MaterialTheme.typography.h5,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Blue)) {
                    append("H")
                }
                append("ello ")

                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                    append("W")
                }
                append("orld")
            }
        )

        val gradientColors = listOf(Cyan, MaterialTheme.colors.primary, Magenta)

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            text = "You are not limited to this particular color scheme or style of coloring. While we have provided a simple example to highlight, use any of the built-in Brushes or even just a SolidColor to enhance your Text.",
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = gradientColors
                )
            )
        )
    }
}