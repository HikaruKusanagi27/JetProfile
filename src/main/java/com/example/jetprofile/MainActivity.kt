package com.example.jetprofile

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.component.CompanySection
import com.example.jetprofile.component.DetailSection
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {

        // プロフィール画像
        Image(
            painter = painterResource(id = R.drawable.good),
            contentDescription = "プロフィール",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.height(20.dp))
        // 名前
        Text(
            text = "名前: ピカール",
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "職業: Androidエンジニア",
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(20.dp))

        CompanySection()

        Spacer(modifier = Modifier.height(20.dp))

        // 詳細表示ボタン
        var isShowDetail = remember { mutableStateOf(false) }

        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor =  Color(color = 0xFFF85F6A)),
            shape = RoundedCornerShape(8.dp), // 角丸の半径を設定します
            onClick = { isShowDetail.value = !isShowDetail.value }
        ) {
            Text(text = "詳細を表示", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))

        // 趣味 & 居住地セクション
        if (isShowDetail.value) {
            DetailSection()
        }
    }
}


