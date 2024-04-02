package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        stringResource(R.string.jobson_guilherme_alves_dos_santos_santiago ),
                        stringResource(R.string._3_novotec_desenvolvimento_de_sistemas),
                    )
                }
            }
        }
    }
}
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = message,
            fontSize = 40.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier.background(color = Color.Black)
        )
        Text(
            text = from,
            fontSize = 30.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier.background(color = Color.Black)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.ds)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 1F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(
            message = stringResource(R.string.jobson_guilherme_alves_dos_santos_santiago),
            from = stringResource(R.string._3_novotec_desenvolvimento_de_sistemas)
        )
    }
}