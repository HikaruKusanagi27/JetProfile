package com.example.jetprofile.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable

fun CompanySection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth(),
    ) {
        //会社名
        Text(
            text = "まるまる会社",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))
        // 部署・グループ名
        Text(
            text = "アプリ開発グループ",
            color = Color.Gray,
            fontSize = 16.sp,
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Email
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "email",
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Email", fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "pikarl@gmail.com", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(5.dp))
        Divider(
            modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
            thickness = 2.dp,
        )
    }
}