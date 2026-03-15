package ug.ac.ndejje.welcome

import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ug.ac.ndejje.welcome.ui.theme.NdejjeWelcomeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NdejjeWelcomeAppTheme {
                StudentInfo()
                }
            }
        }
    }

@Composable
fun StudentInfo() {
    val profileImage = painterResource(R.drawable.photo_1)
    val logoImage = painterResource(id = R.drawable.logo_2)
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )  {
            Box {
                Image(
                    painter = profileImage,
                    contentDescription = "Student Photo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(percent = 10))
                )
                Image(
                    painter = logoImage, contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .align (Alignment.BottomEnd)
                        .padding(all = 4.dp)

                )
            }
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.Student_name),
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(8.dp))
    Text(
        text = stringResource(R.string.Programme),
        style = MaterialTheme.typography.bodyLarge
    )
        HorizontalDivider(
            modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

        }

        Text(
            text = stringResource(R.string.Student_name),
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
        )
        Text(
            text = stringResource(R.string.Programme),
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.primary,
        )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "REG NO.:",
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(
                    modifier = Modifier.width(8.dp)
                )
                Text(
                    text = stringResource(R.string.reg_number),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }

@Composable
fun StudentIdCard() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.elevatedCardColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        ) {
            StudentInfo()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NdejjePreview() {
    NdejjeWelcomeAppTheme {
        StudentInfo()
    }
}