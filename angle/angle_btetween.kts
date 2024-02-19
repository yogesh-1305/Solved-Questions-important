import kotlin.math.abs
import kotlin.math.min

fun calcAngle(hh: Int, mm: Int): Float {
    // Calculate the angles moved by hour and
    // minute hands with reference to 12:00
    val hour_angle = 0.5f * (hh * 60 + mm)
    val minute_angle = (6 * mm).toFloat()


    // Find the difference between two angles
    var angle = abs((hour_angle - minute_angle).toDouble()).toFloat()


    // Return the smaller angle of
    // two possible angles
    angle = min((360 - angle).toDouble(), angle.toDouble()).toFloat()

    return angle
}