
package com.sample.michaelwheeler.dashlite.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Parcelable {

    public static final String STATUS = "status";
    public static final String MENU_VERSION = "menu_version";
    public static final String SUBTITLE = "subtitle";
    public static final String NAME = "name";
    public static final String OPEN_HOURS = "open_hours";
    public static final String IS_BUSINESS_ENABLED = "is_business_enabled";
    public static final String IS_CATERING = "is_catering";
    public static final String ID = "id";
    public static final String STATUS_TYPE = "status_type";
    private String status;
    private int menuVersion;
    private String subtitle;
    private String name;
    private List<OpenHour> openHours = null;
    private boolean isBusinessEnabled;
    private boolean isCatering;
    private int id;
    private String statusType;
    public final static Parcelable.Creator<Menu> CREATOR = new Creator<Menu>() {

        @SuppressWarnings({
                "unchecked"
        })
        public Menu createFromParcel(Parcel in) {
            return new Menu(in);
        }

        public Menu[] newArray(int size) {
            return (new Menu[size]);
        }

    };

    protected Menu(Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.menuVersion = ((int) in.readValue((int.class.getClassLoader())));
        this.subtitle = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.openHours, OpenHour.class.getClassLoader());
        this.isBusinessEnabled = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isCatering = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.statusType = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Menu() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMenuVersion() {
        return menuVersion;
    }

    public void setMenuVersion(int menuVersion) {
        this.menuVersion = menuVersion;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OpenHour> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(List<OpenHour> openHours) {
        this.openHours = openHours;
    }

    public boolean getIsBusinessEnabled() {
        return isBusinessEnabled;
    }

    public void setIsBusinessEnabled(boolean isBusinessEnabled) {
        this.isBusinessEnabled = isBusinessEnabled;
    }

    public boolean isIsCatering() {
        return isCatering;
    }

    public void setIsCatering(boolean isCatering) {
        this.isCatering = isCatering;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(menuVersion);
        dest.writeValue(subtitle);
        dest.writeValue(name);
        dest.writeList(openHours);
        dest.writeValue(isBusinessEnabled);
        dest.writeValue(isCatering);
        dest.writeValue(id);
        dest.writeValue(statusType);
    }

    public int describeContents() {
        return 0;
    }

    public static List<Menu> buildFromJSONObject(JSONObject jsonObject) {
        List<Menu> menus = new ArrayList<>();
        if (jsonObject != null) {
            for (int x = 0; x < jsonObject.length(); x++) {
                Menu menu = new Menu();
                menu.setId(jsonObject.optInt(ID));
                menu.setIsBusinessEnabled(jsonObject.optBoolean(IS_BUSINESS_ENABLED));
                menu.setIsCatering(jsonObject.optBoolean(IS_CATERING));
                menu.setMenuVersion(jsonObject.optInt(MENU_VERSION));
                menu.setName(jsonObject.optString(NAME));
                menu.setOpenHours(OpenHour.buildFromJSONObject(jsonObject.optJSONObject(OPEN_HOURS)));
                menu.setStatus(jsonObject.optString(STATUS));
                menu.setStatusType(jsonObject.optString(STATUS_TYPE));
                menu.setSubtitle(jsonObject.optString(SUBTITLE));
                menus.add(menu);
            }
        }
        return menus;
    }
}
