
package com.sample.michaelwheeler.dashlite.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class Business implements Parcelable {

    public static final String BUSINESS_VERTICAL = "business_vertical";
    public static final String ID = "id";
    public static final String NAME = "name";
    private Object businessVertical;
    private int id;
    private String name;
    public final static Parcelable.Creator<Business> CREATOR = new Creator<Business>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Business createFromParcel(Parcel in) {
            return new Business(in);
        }

        public Business[] newArray(int size) {
            return (new Business[size]);
        }

    };

    protected Business(Parcel in) {
        this.businessVertical = ((Object) in.readValue((Object.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Business() {
    }

    public Object getBusinessVertical() {
        return businessVertical;
    }

    public void setBusinessVertical(Object businessVertical) {
        this.businessVertical = businessVertical;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(businessVertical);
        dest.writeValue(id);
        dest.writeValue(name);
    }

    public int describeContents() {
        return 0;
    }

    public static Business buildFromJSONObject(JSONObject jsonObject) {
        Business business = new Business();
        if (jsonObject != null) {
            business.setBusinessVertical(jsonObject.optInt(BUSINESS_VERTICAL));
            business.setId(jsonObject.optInt(ID));
            business.setName(jsonObject.optString(NAME));
        }
        return business;
    }
}
