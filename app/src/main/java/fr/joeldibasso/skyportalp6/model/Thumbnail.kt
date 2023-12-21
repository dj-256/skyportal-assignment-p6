package fr.joeldibasso.skyportalp6.model

//"thumbnails": [
//{
//    "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_sub.png",
//    "public_url": "/static/thumbnails/11/55/WNTR23aaaws_sub.png",
//    "obj_id": "WNTR23aaaws",
//    "id": 211217,
//    "modified": "2023-09-14T04:15:52.610785",
//    "origin": null,
//    "type": "sub",
//    "is_grayscale": true,
//    "created_at": "2023-09-14T04:15:52.610785"
//},
//{
//    "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_new.png",
//    "public_url": "/static/thumbnails/11/55/WNTR23aaaws_new.png",
//    "obj_id": "WNTR23aaaws",
//    "id": 211215,
//    "modified": "2023-09-14T04:15:52.412919",
//    "origin": null,
//    "type": "new",
//    "is_grayscale": true,
//    "created_at": "2023-09-14T04:15:52.412919"
//},
//{
//    "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_ref.png",
//    "public_url": "/static/thumbnails/11/55/WNTR23aaaws_ref.png",
//    "obj_id": "WNTR23aaaws",
//    "id": 211216,
//    "modified": "2023-09-14T04:15:52.514212",
//    "origin": null,
//    "type": "ref",
//    "is_grayscale": true,
//    "created_at": "2023-09-14T04:15:52.514212"
//},
//{
//    "file_uri": null,
//    "public_url": "https://skyserver.sdss.org/dr12/SkyserverWS/ImgCutout/getjpeg?ra=271.0403312264301&dec=-20.389258007972437&scale=0.3&width=200&height=200&opt=G&query=&Grid=on",
//    "obj_id": "WNTR23aaaws",
//    "id": 211224,
//    "modified": "2023-09-14T04:15:52.917652",
//    "origin": null,
//    "type": "sdss",
//    "is_grayscale": false,
//    "created_at": "2023-09-14T04:15:52.917652"
//},
//{
//    "file_uri": null,
//    "public_url": "https://www.legacysurvey.org/viewer/jpeg-cutout?ra=271.0403312264301&dec=-20.389258007972437&size=200&layer=ls-dr9&pixscale=0.262&bands=grz",
//    "obj_id": "WNTR23aaaws",
//    "id": 211225,
//    "modified": "2023-09-14T04:15:52.917652",
//    "origin": null,
//    "type": "ls",
//    "is_grayscale": false,
//    "created_at": "2023-09-14T04:15:52.917652"
//},
//{
//    "file_uri": null,
//    "public_url": "https://ps1images.stsci.edu/cgi-bin/fitscut.cgi?red=/rings.v3.skycell/0859/092/rings.v3.skycell.0859.092.stk.i.unconv.fits&blue=/rings.v3.skycell/0859/092/rings.v3.skycell.0859.092.stk.g.unconv.fits&green=/rings.v3.skycell/0859/092/rings.v3.skycell.0859.092.stk.r.unconv.fits&x=271.040331&y=-20.389258&size=250&wcs=1&asinh=True&autoscale=99.750000",
//    "obj_id": "WNTR23aaaws",
//    "id": 211226,
//    "modified": "2023-09-14T04:15:52.917652",
//    "origin": null,
//    "type": "ps1",
//    "is_grayscale": false,
//    "created_at": "2023-09-14T04:15:52.917652"
//},
//{
//    "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_sub.png",
//    "public_url": "/static/thumbnails/11/55/WNTR23aaaws_sub.png",
//    "obj_id": "WNTR23aaaws",
//    "id": 212855,
//    "modified": "2023-09-14T04:30:24.164968",
//    "origin": null,
//    "type": "sub",
//    "is_grayscale": true,
//    "created_at": "2023-09-14T04:30:24.164968"
//},
//{
//    "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_new.png",
//    "public_url": "/static/thumbnails/11/55/WNTR23aaaws_new.png",
//    "obj_id": "WNTR23aaaws",
//    "id": 212853,
//    "modified": "2023-09-14T04:30:23.961591",
//    "origin": null,
//    "type": "new",
//    "is_grayscale": true,
//    "created_at": "2023-09-14T04:30:23.961591"
//},
//{
//    "file_uri": "/skyportal/static/thumbnails/11/55/WNTR23aaaws_ref.png",
//    "public_url": "/static/thumbnails/11/55/WNTR23aaaws_ref.png",
//    "obj_id": "WNTR23aaaws",
//    "id": 212854,
//    "modified": "2023-09-14T04:30:24.066726",
//    "origin": null,
//    "type": "ref",
//    "is_grayscale": false,
//    "created_at": "2023-09-14T04:30:24.066726"
//}
//]
data class Thumbnail(
    val publicUrl: String,
    val type: String
) {
}
