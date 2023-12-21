package fr.joeldibasso.skyportalp6.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import fr.joeldibasso.skyportalp6.Units.decToDms
import fr.joeldibasso.skyportalp6.Units.raToHours
import fr.joeldibasso.skyportalp6.model.Source

@Composable
fun SourceView(
    modifier: Modifier = Modifier,
    source: Source
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
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
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text("Classifications", style = MaterialTheme.typography.titleMedium)
            if (source.classifications.isEmpty()) {
                Text(
                    text = "No classification",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                source.classifications.forEach {
                    Box(
                        modifier = Modifier
                            .background(
                                MaterialTheme.colorScheme.secondary,
                                RoundedCornerShape(25.dp)
                            )
                            .padding(12.dp, 8.dp)
                    ) {
                        Text(
                            text = it.classification,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSecondary
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Text("Position (J2000):", style = MaterialTheme.typography.titleMedium)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 4.dp)
        ) {
            Text(
                text = "${raToHours(source.ra)}  |  ${decToDms(source.dec)}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            for (i in 0..source.thumbnails.size step 3) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    for (index in i until i + 3) {
                        if (index >= source.thumbnails.size) {
                            break
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
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
        Spacer(modifier = Modifier.padding(12.dp))
        Column {
            Text("Comments", style = MaterialTheme.typography.titleMedium)
            if (source.comments.isNullOrEmpty()) {
                Text(
                    text = "No comments yet",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.secondary
                )
            } else {
                source.comments.forEach { comment ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier
                            .padding(top = 4.dp)
                    ) {
                        AsyncImage(
                            model = comment.author.gravatarUrl,
                            contentDescription = "Gravatar",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .clip(RoundedCornerShape(25.dp))
                        )
                        Column {
                            Text(
                                text = comment.author.username,
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.tertiary
                            )
                            Text(text = comment.text, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Column {
            Text("Followup Requests", style = MaterialTheme.typography.titleMedium)
            if (source.followupRequests.isNullOrEmpty()) {
                Text(
                    text = "No followup requests",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.secondary
                )
            } else {
                source.followupRequests.forEach { followupRequest ->
                    Column {
                        Text(
                            text = followupRequest.user.username,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = followupRequest.status,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}