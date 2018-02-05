
package com.sample.michaelwheeler.dashlite.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class OpenHour implements Parcelable {

    public static final String HOUR = "hour";
    public static final String MINUTE = "minute";
    private int hour;
    private int minute;
    public final static Parcelable.Creator<OpenHour> CREATOR = new Creator<OpenHour>() {


        @SuppressWarnings({
                "unchecked"
        })
        public OpenHour createFromParcel(Parcel in) {
            return new OpenHour(in);
        }

        public OpenHour[] newArray(int size) {
            return (new OpenHour[size]);
        }

    };

    protected OpenHour(Parcel in) {
        this.hour = ((int) in.readValue((int.class.getClassLoader())));
        this.minute = ((int) in.readValue((int.class.getClassLoader())));
    }

    public OpenHour() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(hour);
        dest.writeValue(minute);
    }

    public int describeContents() {
        return 0;
    }

    public static List<OpenHour> buildFromJSONObject(JSONObject jsonObject) {
        List<OpenHour> openHours = new ArrayList<>();
        if (jsonObject != null) {
            for (int x = 0; x < jsonObject.length(); x++) {
                OpenHour openHour = new OpenHour();
                openHour.setHour(jsonObject.optInt(HOUR));
                openHour.setMinute(jsonObject.optInt(MINUTE));
                openHours.add(openHour);
            }
        }
        return openHours;
    }
}
