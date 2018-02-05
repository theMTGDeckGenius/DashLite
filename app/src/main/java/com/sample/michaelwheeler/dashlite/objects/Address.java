
package com.sample.michaelwheeler.dashlite.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class Address implements Parcelable {

    public static final String CITY = "city";
    public static final String SUBPREMISE = "subpremise";
    public static final String ID = "id";
    public static final String PRINTABLE_ADDRESS = "printable_address";
    public static final String STATE = "state";
    public static final String STREET = "street";
    public static final String COUNTRY = "country";
    public static final String LAT = "lat";
    public static final String LNG = "lng";
    public static final String SHORTNAME = "shortname";
    public static final String ZIP_CODE = "zip_code";
    private String city;
    private String subpremise;
    private int id;
    private String printableAddress;
    private String state;
    private String street;
    private String country;
    private double lat;
    private double lng;
    private String shortname;
    private String zipCode;
    public final static Parcelable.Creator<Address> CREATOR = new Creator<Address>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Address createFromParcel(Parcel in) {
            return new Address(in);
        }

        public Address[] newArray(int size) {
            return (new Address[size]);
        }

    };

    protected Address(Parcel in) {
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.subpremise = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.printableAddress = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.street = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.lat = ((double) in.readValue((double.class.getClassLoader())));
        this.lng = ((double) in.readValue((double.class.getClassLoader())));
        this.shortname = ((String) in.readValue((String.class.getClassLoader())));
        this.zipCode = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSubpremise() {
        return subpremise;
    }

    public void setSubpremise(String subpremise) {
        this.subpremise = subpremise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrintableAddress() {
        return printableAddress;
    }

    public void setPrintableAddress(String printableAddress) {
        this.printableAddress = printableAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(city);
        dest.writeValue(subpremise);
        dest.writeValue(id);
        dest.writeValue(printableAddress);
        dest.writeValue(state);
        dest.writeValue(street);
        dest.writeValue(country);
        dest.writeValue(lat);
        dest.writeValue(lng);
        dest.writeValue(shortname);
        dest.writeValue(zipCode);
    }

    public int describeContents() {
        return 0;
    }

    public static Address buildFromJSONObject(JSONObject jsonObject) {
        Address address = new Address();
        if (jsonObject != null){
            address.setCity(jsonObject.optString(CITY));
            address.setCountry(jsonObject.optString(COUNTRY));
            address.setId(jsonObject.optInt(ID));
            address.setLat(jsonObject.optDouble(LAT));
            address.setLng(jsonObject.optDouble(LNG));
            address.setPrintableAddress(jsonObject.optString(PRINTABLE_ADDRESS));
            address.setShortname(jsonObject.optString(SHORTNAME));
            address.setState(jsonObject.optString(STATE));
            address.setStreet(jsonObject.optString(STREET));
            address.setSubpremise(jsonObject.optString(SUBPREMISE));
            address.setZipCode(jsonObject.optString(ZIP_CODE));

        }
        return address;
    }
}
