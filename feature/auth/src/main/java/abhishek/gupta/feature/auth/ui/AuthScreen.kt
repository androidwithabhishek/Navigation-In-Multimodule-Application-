package abhishek.gupta.feature.auth.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AuthScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    onGoDesClick: () -> Unit,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Text(
                text = "Auth Screen",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2E7D32)
            )

            Button(
                onClick = onGoDesClick,
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .height(50.dp)
            ) {
                Text(
                    text = "Go to Dashboard",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            OutlinedButton(
                onClick = onBackClick,
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .height(50.dp)
            ) {
                Text(
                    text = "Go Back",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

