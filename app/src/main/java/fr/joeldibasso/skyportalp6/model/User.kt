package fr.joeldibasso.skyportalp6.model
//{
//        "username": "tdulaz",
//        "first_name": "Theophile",
//        "last_name": "du laz",
//        "affiliations": [],
//        "contact_email": "theophile.dulaz@gmail.com",
//        "contact_phone": null,
//        "oauth_uid": "theophile.dulaz@gmail.com",
//        "expiration_date": null,
//        "id": 1046,
//        "created_at": "2022-06-10T08:01:21.164043",
//        "modified": "2023-12-11T18:37:33.160601"
//    },

data class User(
    val username: String,
    val firstName: String,
    val lastName: String,
    val affiliations: List<String>,
    val contactEmail: String,
    val id: Int,
    val gravatarUrl: String
)
