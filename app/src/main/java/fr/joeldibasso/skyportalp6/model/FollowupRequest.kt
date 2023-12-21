package fr.joeldibasso.skyportalp6.model

//"followup_requests": [
//    {
//        "status": "rejected: b'<html>\\r\\n<head><title>502 Bad Gateway</title></head>\\r\\n<body bgcolor=\"white\">\\r\\n<center><h1>502 Bad Gateway</h1></center>\\r\\n<hr><center>nginx/1.14.0</center>\\r\\n</body>\\r\\n</html>\\r\\n'",
//        "allocation_id": 1,
//        "id": 1010,
//        "created_at": "2023-09-28T23:48:40.756909",
//        "last_modified_by_id": 1046,
//        "modified": "2023-09-28T23:48:40.832496",
//        "requester_id": 1046,
//        "obj_id": "WNTR23aaaws",
//        "payload": {
//        "end_date": "2001-05-05",
//        "priority": 1,
//        "start_date": "2000-04-28",
//        "maximum_fwhm": 10,
//        "exposure_time": -1,
//        "maximum_airmass": 2.8,
//        "observation_type": "IFU"
//    },
//        "watchers": [],
//        "requester": {
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
//        "allocation": {
//        "default_share_group_ids": null,
//        "types": [
//        "triggered"
//        ],
//        "group_id": 1,
//        "proposal_id": "SEDM-001",
//        "instrument_id": 2,
//        "pi": "none, test allocation only, targets will not be observed",
//        "start_date": "2020-09-15T00:00:00",
//        "id": 1,
//        "end_date": "2020-10-15T00:00:00",
//        "created_at": "2020-10-21T01:09:53.451982",
//        "hours_allocated": 100,
//        "modified": "2020-10-21T01:09:53.451982",
//        "group": {
//        "private": false,
//        "single_user_group": false,
//        "id": 1,
//        "created_at": "2020-10-21T00:50:25.965131",
//        "modified": "2020-10-21T00:50:25.965131",
//        "nickname": null,
//        "name": "Sitewide Group",
//        "description": null
//    },
//        "instrument": {
//        "name": "SEDM",
//        "api_classname": "SEDMAPI",
//        "created_at": "2020-10-21T01:09:52.078392",
//        "band": "optical",
//        "api_classname_obsplan": null,
//        "modified": "2020-10-21T01:09:52.078392",
//        "telescope_id": 37,
//        "listener_classname": null,
//        "filters": [
//        "sdssu",
//        "sdssg",
//        "sdssr",
//        "sdssi"
//        ],
//        "treasuremap_id": null,
//        "sensitivity_data": null,
//        "tns_id": null,
//        "configuration_data": null,
//        "has_fields": false,
//        "last_status_update": null,
//        "has_region": false,
//        "type": "imaging spectrograph",
//        "id": 2
//    }
//    }
//    }
//    ],
data class FollowupRequest(
    val status: String,
    val allocationId: Int,
    val id: Int,
    val createdAt: String,
    val lastModifiedById: Int,
    val modified: String,
    val requesterId: Int,
    val objId: String,
    val user: User,
) {

}
