
package com.sample.michaelwheeler.dashlite.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class MinimumSubtotalMonetaryFields implements Parcelable {

    public static final String CURRENCY = "currency";
    public static final String DISPLAY_STRING = "display_string";
    public static final String DECIMAL_PLACES = "decimal_places";
    public static final String UNIT_AMOUNT = "unit_amount";
    private String currency;
    private String displayString;
    private int decimalPlaces;
    private int unitAmount;
    public final static Parcelable.Creator<MinimumSubtotalMonetaryFields> CREATOR = new Creator<MinimumSubtotalMonetaryFields>() {


        @SuppressWarnings({
                "unchecked"
        })
        public MinimumSubtotalMonetaryFields createFromParcel(Parcel in) {
            return new MinimumSubtotalMonetaryFields(in);
        }

        public MinimumSubtotalMonetaryFields[] newArray(int size) {
            return (new MinimumSubtotalMonetaryFields[size]);
        }

    };

    protected MinimumSubtotalMonetaryFields(Parcel in) {
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.displayString = ((String) in.readValue((String.class.getClassLoader())));
        this.decimalPlaces = ((int) in.readValue((int.class.getClassLoader())));
        this.unitAmount = ((int) in.readValue((int.class.getClassLoader())));
    }

    public MinimumSubtotalMonetaryFields() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public int getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public int getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(int unitAmount) {
        this.unitAmount = unitAmount;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(currency);
        dest.writeValue(displayString);
        dest.writeValue(decimalPlaces);
        dest.writeValue(unitAmount);
    }

    public int describeContents() {
        return 0;
    }

    public static MinimumSubtotalMonetaryFields buildFromJSONObject(JSONObject jsonObject) {
        MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields = new MinimumSubtotalMonetaryFields();
        if (jsonObject != null) {
            minimumSubtotalMonetaryFields.setCurrency(jsonObject.optString(CURRENCY));
            minimumSubtotalMonetaryFields.setDisplayString(jsonObject.optString(DISPLAY_STRING));
            minimumSubtotalMonetaryFields.setDecimalPlaces(jsonObject.optInt(DECIMAL_PLACES));
            minimumSubtotalMonetaryFields.setUnitAmount(jsonObject.optInt(UNIT_AMOUNT));
        }
        return minimumSubtotalMonetaryFields;
    }
}
