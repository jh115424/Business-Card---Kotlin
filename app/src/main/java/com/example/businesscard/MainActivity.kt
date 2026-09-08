package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CardImage(
                        name = "Jennifer Hodge", "Android Developer", "Cell: 414-779-6301",
                        "Email: jh115424@aol.com",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CardImage(
    name: String,
    modifier1: String,
    modifier2: String,
    modifier3: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.cardphoto),
            contentDescription = "This is a card image",
            modifier = Modifier.requiredSize(width = 500.dp, height = 200.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            modifier = Modifier,
            fontSize = 24.sp,
            text = name
        )
        Text(
            text = "Android Developer",
            modifier = Modifier,
            fontSize = 18.sp,

            textDecoration = TextDecoration.Underline


        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "Cell: 414-779-6301"

        )
        Text(
            "Email: jh115424@aol.com"
        )

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        CardImage(
            "Jennifer Hodge",
            "Android Developer",
            "Cell: 414-779-6301",
            "Email: jh115424@aol.com",


            )
    }
}