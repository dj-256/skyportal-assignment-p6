package fr.joeldibasso.skyportalp6.model

import java.util.Date

data class Comment(
    val author: User,
    val date: Date,
    val text: String
)
