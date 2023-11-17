package tj.behruz.jetpackcomposebasics.ui.screens.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import tj.behruz.jetpackcomposebasics.ui.Utils


@Preview(showSystemUi = true)
@Composable
fun TextFieldsInCompose() {

    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            style = MaterialTheme.typography.h4,
            text = "Text fields in JetpackCompose",
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding)
        )


        var text by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            value = text,
            onValueChange = { userInput ->
                text = userInput
            })


        var number by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            value = number,
            label = { Text(text = "Number Input Type") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { it ->
                number = it
            }
        )


        var name by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            value = name,
            label = { Text(text = "Enter Your Name") },
            onValueChange = {
                name = it
            }
        )


        var input by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Utils.defaultPadding),
            value = input,

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "emailIcon"
                )
            },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                input = it
            },
            label = { Text(text = "Email address") },
            placeholder = { Text(text = "Enter your e-mail") },
        )

    }


}