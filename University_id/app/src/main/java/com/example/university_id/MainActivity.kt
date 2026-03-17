package com.example.university_id

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.university_id.ui.theme.University_idTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            University_idTheme {
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    StudentID()
                }
            }
        }
    }
}

@Composable
fun StudentID() {
    ElevatedCard(modifier = Modifier
        .width(340.dp)
        .height(180.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp)

    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "watermark",
                modifier = Modifier
                    .size(90.dp)
                    .align(Alignment.CenterStart)
                    .alpha(0.08f)
            )

            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "watermark",
                modifier = Modifier
                    .size(90.dp)
                    .align(Alignment.CenterEnd)
                    .alpha(0.08f)
            )

            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .background(Color(0xFF8B1E1E))
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically

                    ) {
                        Image(painter = painterResource(id = R.drawable.logo_2),
                            contentDescription = "logo",
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .background(color = Color.White, CircleShape)
                                .size(40.dp)
                                .clip(CircleShape)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.flag),
                            contentDescription = "Flag",
                            modifier = Modifier.size(55.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(28.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "IBEMBE JOASH",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 12.sp
                    )
                    Text(
                        text = "Programme: BSc in Information Technology",
                        fontSize = 11.sp,
                        lineHeight = 12.sp
                    )
                    Text(
                        text = "Registration Number: 24/2/314/D/335",
                        fontSize = 11.sp,
                        lineHeight = 12.sp
                    )
                    Text(
                        text = "Issue: 01/02/2026 Expiry: 01/02/2029",
                        fontSize = 11.sp,
                        lineHeight = 12.sp
                    )
                    Row(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .padding(bottom = 4.dp)
                            .height(20.dp)
                            .fillMaxWidth(0.95F),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        repeat(85) {index->
                            Box(
                                modifier = Modifier
                                    .width(1.dp)
                                    .fillMaxHeight()
                                    .background(Color.Black)
                            )
                            Spacer(modifier = Modifier.width(1.dp))
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(15.dp)
                        .background(Color(0xFF8B1E1E))
                )
            }
            Image(
                painter = painterResource(id = R.drawable.photo_1),
                contentDescription = "photo",
                modifier = Modifier
                    .padding(top = 10.dp)
                    .size(80.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color(0xFF8B1E1E), CircleShape)
                    .align(Alignment.TopCenter)
                    .offset(y= 1.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IDPreview() {
    University_idTheme {
        StudentID()
    }
}