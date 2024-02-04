package com.example.jetbizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.jetbizcard.ui.theme.JetBizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetBizCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreateBizCard()
                }
            }
        }
    }
}

@Composable
fun CreateBizCard() {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        color = Color.Gray) {
        Card(modifier = Modifier
            .width(200.dp)
            .height(390.dp)
            .padding(20.dp),
            shape = RoundedCornerShape(corner = CornerSize(25.dp)),
            elevation = cardElevation(10.dp,4.dp,6.dp,8.dp,8.dp,20.dp)
        ) {
            Column(modifier = Modifier
                .height(380.dp)
                .fillMaxWidth(1f)
                .padding(vertical = 5.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally) {
                CreateProfileImage()
                Divider(modifier = Modifier.height(2.dp),
                    thickness = 10.dp,
                    color = Color.Gray)
                DisplayText()
            }
            ShowSkills()
        }
    }
}

@Composable
private fun ShowSkills() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.size(width = 100.dp, height = 50.dp)
        ) {
            Text(
                text = "Skills",
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Black,
                fontSize = TextUnit(19.5f, TextUnitType.Sp)
            )
        }
    }
}

@Composable
private fun DisplayText() {
    Text(
        text = "Mojiz Hasan",
        color = Color.Yellow,
        fontSize = TextUnit(37.5f, TextUnitType.Sp),
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif,
        style = MaterialTheme.typography.titleMedium
    )
    Text(
        text = "Student",
        fontSize = TextUnit(22.5f, TextUnitType.Sp),
        modifier = Modifier.offset((-75).dp),
        fontWeight = FontWeight.SemiBold
    )
    Text(
        text = "@mojiz.hasan.786",
        fontSize = TextUnit(20.5f, TextUnitType.Sp),
        modifier = Modifier.offset((-30).dp),
        fontWeight = FontWeight.Medium
    )
}

@Composable
private fun CreateProfileImage() {
    Surface(
        modifier = Modifier
            .size(250.dp)
            .padding(10.dp),
        shape = CircleShape,
        border = BorderStroke(width = 1.5.dp, color = Color.Yellow),
        tonalElevation = 4.dp,
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "Profile Image",
            modifier = Modifier.size(135.dp),
            contentScale = ContentScale.FillBounds
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetBizCardTheme {
        CreateBizCard()
    }
}