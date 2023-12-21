package fr.joeldibasso.skyportalp6

import java.text.DecimalFormat
import kotlin.math.abs
import kotlin.math.floor

object Units {
    fun raToHours(ra: Double, sep: String? = null): String {
        val raH = DecimalFormat("00").format(floor(ra / 15))
        val raM = DecimalFormat("00").format(floor((ra % 15) * 4))
        val raS = DecimalFormat("00.00").format((((ra % 15) * 4) % 1) * 60)

        return if (sep != null) {
            "$raH$sep$raM$sep$raS"
        } else {
            "$raH h $raM m $raS s"
        }
    }

    fun decToDms(deci: Double, sep: String? = null, signed: Boolean = true): String {
        val dec = abs(deci)
        val deg = floor(dec)
        val degPadded = DecimalFormat("00").format(deg)
        val min = floor((dec - deg) * 60)
        val minPadded = DecimalFormat("00").format(min)
        val sec = (dec - deg - min / 60) * 3600
        val secStr = DecimalFormat("00.00").format(sec)
        var sign = "+"

        // Omit '+' sign when not needed
        if (!(deci < 0) && !signed) {
            sign = ""
        }

        if (deci < 0) {
            sign = "-"
        }

        return if (sep != null) {
            "$sign$degPadded$sep$minPadded$sep$secStr"
        } else {
            "$sign$degPadded d $minPadded m $secStr s"
        }
    }
}