
package com.sample.michaelwheeler.dashlite.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MerchantPromotion implements Parcelable {

    public static final String MINIMUM_SUBTOTAL_MONETARY_FIELDS = "minimum_subtotal_monetary_fields";
    public static final String DELIVERY_FEE = "delivery_fee";
    public static final String DELIVERY_FEE_MONETARY_FIELDS = "delivery_fee_monetary_fields";
    public static final String MINIMUM_SUBTOTAL = "minimum_subtotal";
    public static final String NEW_STORE_CUSTOMERS_ONLY = "new_store_customers_only";
    public static final String ID = "id";
    private MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields;
    private int deliveryFee;
    private DeliveryFeeMonetaryFields deliveryFeeMonetaryFields;
    private Object minimumSubtotal;
    private boolean newStoreCustomersOnly;
    private int id;
    public final static Parcelable.Creator<MerchantPromotion> CREATOR = new Creator<MerchantPromotion>() {

        @SuppressWarnings({
                "unchecked"
        })
        public MerchantPromotion createFromParcel(Parcel in) {
            return new MerchantPromotion(in);
        }

        public MerchantPromotion[] newArray(int size) {
            return (new MerchantPromotion[size]);
        }

    };

    protected MerchantPromotion(Parcel in) {
        this.minimumSubtotalMonetaryFields = ((MinimumSubtotalMonetaryFields) in.readValue((MinimumSubtotalMonetaryFields.class.getClassLoader())));
        this.deliveryFee = ((int) in.readValue((int.class.getClassLoader())));
        this.deliveryFeeMonetaryFields = ((DeliveryFeeMonetaryFields) in.readValue((DeliveryFeeMonetaryFields.class.getClassLoader())));
        this.minimumSubtotal = ((Object) in.readValue((Object.class.getClassLoader())));
        this.newStoreCustomersOnly = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
    }

    public MerchantPromotion() {
    }

    public MinimumSubtotalMonetaryFields getMinimumSubtotalMonetaryFields() {
        return minimumSubtotalMonetaryFields;
    }

    public void setMinimumSubtotalMonetaryFields(MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields) {
        this.minimumSubtotalMonetaryFields = minimumSubtotalMonetaryFields;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public DeliveryFeeMonetaryFields getDeliveryFeeMonetaryFields() {
        return deliveryFeeMonetaryFields;
    }

    public void setDeliveryFeeMonetaryFields(DeliveryFeeMonetaryFields deliveryFeeMonetaryFields) {
        this.deliveryFeeMonetaryFields = deliveryFeeMonetaryFields;
    }

    public Object getMinimumSubtotal() {
        return minimumSubtotal;
    }

    public void setMinimumSubtotal(Object minimumSubtotal) {
        this.minimumSubtotal = minimumSubtotal;
    }

    public boolean isNewStoreCustomersOnly() {
        return newStoreCustomersOnly;
    }

    public void setNewStoreCustomersOnly(boolean newStoreCustomersOnly) {
        this.newStoreCustomersOnly = newStoreCustomersOnly;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(minimumSubtotalMonetaryFields);
        dest.writeValue(deliveryFee);
        dest.writeValue(deliveryFeeMonetaryFields);
        dest.writeValue(minimumSubtotal);
        dest.writeValue(newStoreCustomersOnly);
        dest.writeValue(id);
    }

    public int describeContents() {
        return 0;
    }

    public static List<MerchantPromotion> buildFromJSONObject(JSONObject jsonObject) {
        List<MerchantPromotion> merchantPromotions = new ArrayList<>();
        if (jsonObject != null) {
            for (int x = 0; x < jsonObject.length(); x++) {
                MerchantPromotion merchantPromotion = new MerchantPromotion();
                merchantPromotion.setDeliveryFee(jsonObject.optInt(DELIVERY_FEE));
                merchantPromotion.setDeliveryFeeMonetaryFields(DeliveryFeeMonetaryFields.buildFromJSONObject(jsonObject.optJSONObject(DELIVERY_FEE_MONETARY_FIELDS)));
                merchantPromotion.setId(jsonObject.optInt(ID));
                merchantPromotion.setMinimumSubtotal(jsonObject.opt(MINIMUM_SUBTOTAL));
                merchantPromotion.setMinimumSubtotalMonetaryFields(MinimumSubtotalMonetaryFields.buildFromJSONObject(jsonObject.optJSONObject(MINIMUM_SUBTOTAL_MONETARY_FIELDS)));
                merchantPromotion.setNewStoreCustomersOnly(jsonObject.optBoolean(NEW_STORE_CUSTOMERS_ONLY));
                merchantPromotions.add(merchantPromotion);
            }
        }
        return merchantPromotions;
    }
}
