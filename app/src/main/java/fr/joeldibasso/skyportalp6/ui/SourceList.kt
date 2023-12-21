package fr.joeldibasso.skyportalp6.ui

import android.content.res.AssetManager
import android.content.res.Resources
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.gson.Gson
import fr.joeldibasso.skyportalp6.model.Source

@Composable
fun SourceList(
    modifier: Modifier = Modifier,
    sources: List<Source>,
    onSourceClick: (Source) -> Unit
) {
    LazyColumn(content = {
        items(sources.size) { index ->
            SourceListItem(
                modifier = modifier,
                source = sources[index],
                onSourceClick = onSourceClick
            )
        }
    })
}

@Preview(showBackground = true)
@Composable
fun SourceListPreview() {
    val assetManager: AssetManager = Resources.getSystem().assets
    val inputStream = assetManager.open("sources.json")
    val json = inputStream.bufferedReader().use { it.readText() }
    val sources = Gson().fromJson(json, Array<Source>::class.java).toList()
    SourceList(sources = sources, onSourceClick = {})
}