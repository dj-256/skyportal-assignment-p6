package fr.joeldibasso.skyportalp6.model

//{
//    "status": "success",
//    "data": {
//    "ra_dis": null,
//    "redshift_origin": null,
//    "e_mag_nearest_source": null,
//    "score": null,
//    "modified": "2023-09-14T04:30:23.749616",
//    "id": "WNTR23aaaws",
//    "redshift_history": null,
//    "transient": false,
//    "ra": 271.0403312264301,
//    "dec": -20.389258007972437,
//    "dec_dis": null,
//    "host_id": null,
//    "varstar": false,
//    "origin": "mirar:0.9.2",
//    "ra_err": null,
//    "summary": null,
//    "is_roid": false,
//    "alias": null,
//    "dec_err": null,
//    "summary_history": null,
//    "mpc_name": null,
//    "healpix": 2035423059869367600,
//    "offset": 0,
//    "altdata": null,
//    "gcn_crossmatch": null,
//    "internal_key": "cc7569c9-66f5-4948-83b4-44ea041999e4",
//    "redshift": null,
//    "dist_nearest_source": null,
//    "tns_name": null,
//    "detect_photometry_count": null,
//    "redshift_error": null,
//    "mag_nearest_source": null,
//    "tns_info": null,
//    "created_at": "2023-09-14T04:15:52.146814",
//    "photstats": [
//    {
//        "num_obs_global": 2,
//        "last_detected_mjd": 60200.12554414352,
//        "last_detected_no_forced_phot_filter": "2massj",
//        "mean_color": {},
//        "rise_rate": null,
//        "num_obs_per_filter": {
//        "2massj": 2
//    },
//        "last_detected_mag": 12.224870345823303,
//        "recent_obs_mjd": 60200.12554414352,
//        "peak_mjd_global": 60200.12554414352,
//        "decay_rate": null,
//        "num_det_global": 2,
//        "last_detected_filter": "2massj",
//        "predetection_mjds": [],
//        "peak_mjd_per_filter": {
//        "2massj": 60200.12554414352
//    },
//        "mag_rms_global": 0.3207193672474773,
//        "num_det_no_forced_phot_global": 2,
//        "first_detected_no_forced_phot_mjd": 60200.12554414352,
//        "last_non_detection_mjd": null,
//        "peak_mag_global": 12.224870345823303,
//        "mag_rms_per_filter": {
//        "2massj": 0.3207193672474773
//    },
//        "num_det_per_filter": {
//        "2massj": 2
//    },
//        "first_detected_no_forced_phot_mag": 12.224870345823303,
//        "time_to_non_detection": null,
//        "peak_mag_per_filter": {
//        "2massj": 12.224870345823303
//    },
//        "id": 35807,
//        "last_update": "2023-09-14T04:30:23.884177",
//        "first_detected_mjd": 60200.12554414352,
//        "first_detected_no_forced_phot_filter": "2massj",
//        "mean_mag_global": 12.54558971307078,
//        "faintest_mag_global": 12.866309080318258,
//        "created_at": "2023-09-14T04:15:52.274852",
//        "last_full_update": "2023-09-14T04:15:52.328849",
//        "first_detected_mag": 12.224870345823303,
//        "last_detected_no_forced_phot_mjd": 60200.12554414352,
//        "faintest_mag_per_filter": {
//        "2massj": 12.866309080318258
//    },
//        "deepest_limit_global": null,
//        "modified": "2023-09-14T04:30:23.830285",
//        "obj_id": "WNTR23aaaws",
//        "first_detected_filter": "2massj",
//        "last_detected_no_forced_phot_mag": 12.224870345823303,
//        "mean_mag_per_filter": {
//        "2massj": 12.54558971307078
//    },
//        "deepest_limit_per_filter": {}
//    }
//    ],
//    "thumbnails": [
//    {
//        "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_sub.png",
//        "public_url": "/static/thumbnails/11/55/WNTR23aaaws_sub.png",
//        "obj_id": "WNTR23aaaws",
//        "id": 211217,
//        "modified": "2023-09-14T04:15:52.610785",
//        "type": "sub",
//        "origin": null,
//        "is_grayscale": true,
//        "created_at": "2023-09-14T04:15:52.610785"
//    },
//    {
//        "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_new.png",
//        "public_url": "/static/thumbnails/11/55/WNTR23aaaws_new.png",
//        "obj_id": "WNTR23aaaws",
//        "id": 211215,
//        "modified": "2023-09-14T04:15:52.412919",
//        "type": "new",
//        "origin": null,
//        "is_grayscale": true,
//        "created_at": "2023-09-14T04:15:52.412919"
//    },
//    {
//        "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_ref.png",
//        "public_url": "/static/thumbnails/11/55/WNTR23aaaws_ref.png",
//        "obj_id": "WNTR23aaaws",
//        "id": 211216,
//        "modified": "2023-09-14T04:15:52.514212",
//        "type": "ref",
//        "origin": null,
//        "is_grayscale": true,
//        "created_at": "2023-09-14T04:15:52.514212"
//    },
//    {
//        "file_uri": null,
//        "public_url": "https://skyserver.sdss.org/dr12/SkyserverWS/ImgCutout/getjpeg?ra=271.0403312264301&dec=-20.389258007972437&scale=0.3&width=200&height=200&opt=G&query=&Grid=on",
//        "obj_id": "WNTR23aaaws",
//        "id": 211224,
//        "modified": "2023-09-14T04:15:52.917652",
//        "type": "sdss",
//        "origin": null,
//        "is_grayscale": false,
//        "created_at": "2023-09-14T04:15:52.917652"
//    },
//    {
//        "file_uri": null,
//        "public_url": "https://www.legacysurvey.org/viewer/jpeg-cutout?ra=271.0403312264301&dec=-20.389258007972437&size=200&layer=ls-dr9&pixscale=0.262&bands=grz",
//        "obj_id": "WNTR23aaaws",
//        "id": 211225,
//        "modified": "2023-09-14T04:15:52.917652",
//        "type": "ls",
//        "origin": null,
//        "is_grayscale": false,
//        "created_at": "2023-09-14T04:15:52.917652"
//    },
//    {
//        "file_uri": null,
//        "public_url": "https://ps1images.stsci.edu/cgi-bin/fitscut.cgi?red=/rings.v3.skycell/0859/092/rings.v3.skycell.0859.092.stk.i.unconv.fits&blue=/rings.v3.skycell/0859/092/rings.v3.skycell.0859.092.stk.g.unconv.fits&green=/rings.v3.skycell/0859/092/rings.v3.skycell.0859.092.stk.r.unconv.fits&x=271.040331&y=-20.389258&size=250&wcs=1&asinh=True&autoscale=99.750000",
//        "obj_id": "WNTR23aaaws",
//        "id": 211226,
//        "modified": "2023-09-14T04:15:52.917652",
//        "type": "ps1",
//        "origin": null,
//        "is_grayscale": false,
//        "created_at": "2023-09-14T04:15:52.917652"
//    },
//    {
//        "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_sub.png",
//        "public_url": "/static/thumbnails/11/55/WNTR23aaaws_sub.png",
//        "obj_id": "WNTR23aaaws",
//        "id": 212855,
//        "modified": "2023-09-14T04:30:24.164968",
//        "type": "sub",
//        "origin": null,
//        "is_grayscale": true,
//        "created_at": "2023-09-14T04:30:24.164968"
//    },
//    {
//        "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_new.png",
//        "public_url": "/static/thumbnails/11/55/WNTR23aaaws_new.png",
//        "obj_id": "WNTR23aaaws",
//        "id": 212853,
//        "modified": "2023-09-14T04:30:23.961591",
//        "type": "new",
//        "origin": null,
//        "is_grayscale": true,
//        "created_at": "2023-09-14T04:30:23.961591"
//    },
//    {
//        "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_ref.png",
//        "public_url": "/static/thumbnails/11/55/WNTR23aaaws_ref.png",
//        "obj_id": "WNTR23aaaws",
//        "id": 212854,
//        "modified": "2023-09-14T04:30:24.066726",
//        "type": "ref",
//        "origin": null,
//        "is_grayscale": false,
//        "created_at": "2023-09-14T04:30:24.066726"
//    }
//    ],
//    "followup_requests": [
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
//    "assignments": [],
//    "galaxies": null,
//    "duplicates": null,
//    "first_detected": "2023-09-13T03:00:47.014",
//    "last_detected": "2023-09-13T03:00:47.014",
//    "comments": [],
//    "labellers": [],
//    "annotations": [],
//    "classifications": [],
//    "gal_lat": 0.6879161292225767,
//    "gal_lon": 9.501089528522327,
//    "luminosity_distance": null,
//    "dm": null,
//    "angular_diameter_distance": null,
//    "ebv": 7.955162525177002,
//    "photometry_exists": false,
//    "spectrum_exists": false,
//    "groups": [
//    {
//        "private": false,
//        "single_user_group": false,
//        "id": 1,
//        "created_at": "2020-10-21T00:50:25.965131",
//        "modified": "2020-10-21T00:50:25.965131",
//        "nickname": null,
//        "name": "Sitewide Group",
//        "description": null,
//        "active": true,
//        "requested": false,
//        "saved_at": "2023-09-18T06:03:24.355657",
//        "saved_by": {
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
//    }
//    }
//    ],
//    "color_magnitude": []
//},
//    "version": "0.9.dev0+git20231218.35252162+fritz.91dce7b"
//}
data class Source(
    val id: String,
    val ra: Double,
    val dec: Double,
    val thumbnails: List<Thumbnail>,
    val summary: String? = null,
    val classifications: List<Classification>,
    val comments: List<Comment>? = null,
    val followupRequests: List<FollowupRequest>? = null,
) {
}