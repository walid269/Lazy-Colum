package com.jet.jetpacklazycolums

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun uiscreen() {
    AvatarListUI()
}

@Composable
fun AvatarListUI() {
    val myList = getAllAvatars()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(myList) { _, item ->
            AvatarCard(
                firstname = item.firstname,
                lastname = item.lastname,
                img = item.image
            )
        }
    }
}

@Composable
fun AvatarCard(firstname: String, lastname: String, img: Int) {
    var context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .fillMaxWidth()
                .clickable {
                    Toast.makeText(context,"Clicked $firstname", Toast.LENGTH_SHORT).show()
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "Avatar",
                modifier = Modifier
                    .size(60.dp)
                    .padding(end = 16.dp)
            )

            Column {
                Text(
                    text = firstname,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = lastname,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontSize = 16.sp
                    )
                )
            }
        }
    }
}
