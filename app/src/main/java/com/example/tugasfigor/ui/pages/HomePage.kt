package com.example.tugasfigor.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugasfigor.model.Anime
import com.example.tugasfigor.ui.components.BoxImage
import com.example.tugasfigor.ui.components.CustomText
import com.example.tugasfigor.ui.components.HeadingText

@Composable
fun HomePage(modifier: Modifier = Modifier, navController: NavController) {
    val filterMovie = Anime.filterMovie()
    val filterSeries = Anime.filterSeries()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        HeadingText("Anime Movies")
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(filterMovie.size) {index ->
                val anime = filterMovie[index]
                BoxImage(anime.imageUrl, anime.title, function = {
                    navController.navigate("detail_anime/${anime.id}")
                })
            }
        }

        HeadingText("Anime Series")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            items(filterSeries.size) {index ->
                val anime = filterSeries[index]
                Row(
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    BoxImage(anime.imageUrl, anime.title, function = {
                        navController.navigate("detail_anime/${anime.id}")
                    })
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        modifier = Modifier.padding(start = 8.dp)
                    ) {
                        CustomText(anime.title)
                        CustomText(
                            text = "★".repeat(anime.rating.toInt()),
                            color = Color(0xFFFFC107)
                        )
                        CustomText(
                            text = anime.genre + " | " + anime.status.toString(),
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}