package fr.joeldibasso.skyportalp6.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import fr.joeldibasso.skyportalp6.model.Source

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SourceView(
    modifier: Modifier = Modifier,
    source: Source
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(text = source.id, style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.padding(12.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text(text = "Summary", style = MaterialTheme.typography.titleMedium)
            source.summary?.let {
                Text(text = source.summary, style = MaterialTheme.typography.bodyMedium)
            } ?: run {
                Text(
                    text = "No summary",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Column {
            Text("Classifications", style = MaterialTheme.typography.titleMedium)
            if (source.classifications.isEmpty()) {
                Text(
                    text = "No classification",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
            source.classifications.forEach { classification ->
                Text(text = classification, style = MaterialTheme.typography.bodyMedium)
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Text("Position (J2000):", style = MaterialTheme.typography.titleMedium)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 4.dp)
        ) {
            Text(text = "RA: ${source.ra}", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(text = "Dec: ${source.dec}", style = MaterialTheme.typography.bodyMedium)
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.padding(top = 12.dp),
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(source.thumbnails.size) { index ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(4.dp)
                ) {
                    AsyncImage(
                        model = source.thumbnails[index].publicUrl,
                        contentDescription = null,
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                    )
                    Text(
                        text = source.thumbnails[index].type.uppercase(),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}