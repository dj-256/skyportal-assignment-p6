package fr.joeldibasso.skyportalp6.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import fr.joeldibasso.skyportalp6.model.Source

@Composable
fun SourceListItem(
    modifier: Modifier = Modifier,
    source: Source,
    onSourceClick: (Source) -> Unit
) {
    Column(
        modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable { onSourceClick(source) }
                .padding(horizontal = 16.dp, vertical = 10.dp)
                .fillMaxSize()
        ) {
            AsyncImage(
                model = source.thumbnails[0].publicUrl,
                contentDescription = null
            )
            Column {
                Text(text = source.id, style = MaterialTheme.typography.headlineSmall)
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "ra: ${source.ra}", style = MaterialTheme.typography.bodyMedium)
                Text(text = "dec: ${source.dec}", style = MaterialTheme.typography.bodyMedium)
            }
        }
        Divider()
    }
}