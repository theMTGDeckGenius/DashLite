
package com.sample.michaelwheeler.dashlite.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class DeliveryFeeMonetaryFields implements Parcelable {

    public static final String CURRENCY = "currency";
    public static final String DISPLAY_STRING = "display_string";
    public static final String DECIMAL_PLACES = "decimal_places";
    public static final String UNIT_AMOUNT = "unit_amount";
    private String currency;
    private String displayString;
    private int decimalPlaces;
    private int unitAmount;
    public final static Parcelable.Creator<DeliveryFeeMonetaryFields> CREATOR = new Creator<DeliveryFeeMonetaryFields>() {


        @SuppressWarnings({
                "unchecked"
        })
        public DeliveryFeeMonetaryFields createFromParcel(Parcel in) {
            return new DeliveryFeeMonetaryFields(in);
        }

        public DeliveryFeeMonetaryFields[] newArray(int size) {
            return (new DeliveryFeeMonetaryFields[size]);
        }

    };

    protected DeliveryFeeMonetaryFields(Parcel in) {
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.displayString = ((String) in.readValue((String.class.getClassLoader())));
        this.decimalPlaces = ((int) in.readValue((int.class.getClassLoader())));
        this.unitAmount = ((int) in.readValue((int.class.getClassLoader())));
    }

    public DeliveryFeeMonetaryFields() {
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

    public static DeliveryFeeMonetaryFields buildFromJSONObject(JSONObject jsonObject) {
        DeliveryFeeMonetaryFields deliveryFeeMonetaryFields = new DeliveryFeeMonetaryFields();
        if (jsonObject != null) {
            deliveryFeeMonetaryFields.setCurrency(jsonObject.optString(CURRENCY));
            deliveryFeeMonetaryFields.setDecimalPlaces(jsonObject.optInt(DECIMAL_PLACES));
            deliveryFeeMonetaryFields.setDisplayString(jsonObject.optString(DISPLAY_STRING));
            deliveryFeeMonetaryFields.setUnitAmount(jsonObject.optInt(UNIT_AMOUNT));
        }
        return deliveryFeeMonetaryFields;
    }
}
