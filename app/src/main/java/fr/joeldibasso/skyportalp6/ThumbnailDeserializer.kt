package fr.joeldibasso.skyportalp6

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import fr.joeldibasso.skyportalp6.model.Thumbnail
import java.lang.reflect.Type

class ThumbnailDeserializer : JsonDeserializer<Thumbnail> {
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): Thumbnail {
        val jsonObject = json.asJsonObject
        var publicUrl = jsonObject.get("public_url").asString
        if (publicUrl.startsWith("/")) {
            publicUrl = "https://preview.fritz.science$publicUrl"
        }
        val type = jsonObject.get("type").asString
        return Thumbnail(publicUrl = publicUrl, type = type)
    }
}