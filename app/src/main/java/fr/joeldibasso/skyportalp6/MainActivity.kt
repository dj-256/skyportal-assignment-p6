package fr.joeldibasso.skyportalp6

import android.content.res.AssetManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import fr.joeldibasso.skyportalp6.model.Source
import fr.joeldibasso.skyportalp6.model.Thumbnail
import fr.joeldibasso.skyportalp6.ui.SourceList
import fr.joeldibasso.skyportalp6.ui.SourceView
import fr.joeldibasso.skyportalp6.ui.theme.SkyPortalP6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val assetManager: AssetManager = applicationContext.assets
        val inputStream = assetManager.open("sources.json")
        val json = inputStream.bufferedReader().use { it.readText() }
        Data.sources = GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeAdapter(Thumbnail::class.java, ThumbnailDeserializer())
            .create().fromJson(json, Array<Source>::class.java).toList()

        setContent {
            SkyPortalP6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavHost()
                }
            }
        }
    }
}

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "list"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("list") {
            SourceList(
                sources = Data.sources,
                onSourceClick = { source -> navController.navigate("source/${source.id}") })
        }
        composable("source/{id}") {
            val id = it.arguments?.getString("id")
            val source = Data.sources.find { source -> source.id == id }
            if (source != null) {
                SourceView(source = source)
            } else {
                Text(text = "Source not found")
            }
        }
    }
}