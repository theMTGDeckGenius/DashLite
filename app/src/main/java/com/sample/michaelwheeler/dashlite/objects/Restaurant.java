
package com.sample.michaelwheeler.dashlite.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Parcelable {

    public static final String PHONE_NUMBER = "phone_number";
    public static final String YELP_REVIEW_COUNT = "yelp_review_count";
    public static final String MAX_ORDER_SIZE = "max_order_size";
    public static final String DELIVERY_FEE = "delivery_fee";
    public static final String MAX_COMPOSITE_SCORE = "max_composite_score";
    public static final String ID = "id";
    public static final String AVERAGE_RATING = "average_rating";
    public static final String TAGS = "tags";
    public static final String DELIVERY_RADIUS = "delivery_radius";
    public static final String INFLATION_RATE = "inflation_rate";
    public static final String MENUS = "menus";
    public static final String SHOW_STORE_MENU_HEADER_PHOTO = "show_store_menu_header_photo";
    public static final String COMPOSITE_SCORE = "composite_score";
    public static final String NUMBER_OF_RATINGS = "number_of_ratings";
    public static final String STATUS_TYPE = "status_type";
    public static final String IS_ONLY_CATERING = "is_only_catering";
    public static final String STATUS = "status";
    public static final String OBJECT_TYPE = "object_type";
    public static final String DESCRIPTION = "description";
    public static final String BUSINESS = "business";
    public static final String YELP_BIZ_ID = "yelp_biz_id";
    public static final String ASAP_TIME = "asap_time";
    public static final String YELP_RATING = "yelp_rating";
    public static final String EXTRA_SOS_DELIVERY_FEE = "extra_sos_delivery_fee";
    public static final String BUSINESS_ID = "business_id";
    public static final String SPECIAL_INSTRUCTIONS_MAX_LENGTH = "special_instructions_max_length";
    public static final String COVER_IMG_URL = "cover_img_url";
    public static final String ADDRESS = "address";
    public static final String PRICE_RANGE = "price_range";
    public static final String SLUG = "slug";
    public static final String SHOW_SUGGESTED_ITEMS = "show_suggested_items";
    public static final String NAME = "name";
    public static final String IS_NEWLY_ADDED = "is_newly_added";
    public static final String IS_GOOD_FOR_GROUP_ORDERS = "is_good_for_group_orders";
    public static final String SERVICE_RATE = "service_rate";
    public static final String MERCHANT_PROMOTIONS = "merchant_promotions";
    public static final String HEADER_IMAGE_URL = "header_image_url";
    private String phoneNumber;
    private int yelpReviewCount;
    private int maxOrderSize;
    private int deliveryFee;
    private int maxCompositeScore;
    private int id;
    private double averageRating;
    private List<String> tags = null;
    private int deliveryRadius;
    private double inflationRate;
    private List<Menu> menus = null;
    private boolean showStoreMenuHeaderPhoto;
    private int compositeScore;
    private int numberOfRatings;
    private String statusType;
    private boolean isOnlyCatering;
    private String status;
    private String objectType;
    private String description;
    private Business business;
    private String yelpBizId;
    //    private Object asapTime;
    private double yelpRating;
    private int extraSosDeliveryFee;
    private int businessId;
    private Object specialInstructionsMaxLength;
    private String coverImgUrl;
    private Address address;
    private int priceRange;
    private String slug;
    private boolean showSuggestedItems;
    private String name;
    private boolean isNewlyAdded;
    private boolean isGoodForGroupOrders;
    private double serviceRate;
    private List<MerchantPromotion> merchantPromotions = null;
    private String headerImageUrl;
    public final static Parcelable.Creator<Restaurant> CREATOR = new Creator<Restaurant>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        public Restaurant[] newArray(int size) {
            return (new Restaurant[size]);
        }

    };

    protected Restaurant(Parcel in) {
        this.phoneNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.yelpReviewCount = ((int) in.readValue((int.class.getClassLoader())));
        this.maxOrderSize = ((int) in.readValue((int.class.getClassLoader())));
        this.deliveryFee = ((int) in.readValue((int.class.getClassLoader())));
        this.maxCompositeScore = ((int) in.readValue((int.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.averageRating = ((double) in.readValue((double.class.getClassLoader())));
        in.readList(this.tags, (java.lang.String.class.getClassLoader()));
        this.deliveryRadius = ((int) in.readValue((int.class.getClassLoader())));
        this.inflationRate = ((double) in.readValue((double.class.getClassLoader())));
        in.readList(this.menus, (Menu.class.getClassLoader()));
        this.showStoreMenuHeaderPhoto = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.compositeScore = ((int) in.readValue((int.class.getClassLoader())));
        this.numberOfRatings = ((int) in.readValue((int.class.getClassLoader())));
        this.statusType = ((String) in.readValue((String.class.getClassLoader())));
        this.isOnlyCatering = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.objectType = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.business = ((Business) in.readValue((Business.class.getClassLoader())));
        this.yelpBizId = ((String) in.readValue((String.class.getClassLoader())));
//        this.asapTime = ((Object) in.readValue((Object.class.getClassLoader())));
        this.yelpRating = ((double) in.readValue((double.class.getClassLoader())));
        this.extraSosDeliveryFee = ((int) in.readValue((int.class.getClassLoader())));
        this.businessId = ((int) in.readValue((int.class.getClassLoader())));
        this.specialInstructionsMaxLength = ((Object) in.readValue((Object.class.getClassLoader())));
        this.coverImgUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.address = ((Address) in.readValue((Address.class.getClassLoader())));
        this.priceRange = ((int) in.readValue((int.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.showSuggestedItems = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.isNewlyAdded = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isGoodForGroupOrders = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.serviceRate = ((double) in.readValue((double.class.getClassLoader())));
        in.readList(this.merchantPromotions, (com.sample.michaelwheeler.dashlite.objects.MerchantPromotion.class.getClassLoader()));
        this.headerImageUrl = ((String) in.readValue((Object.class.getClassLoader())));
    }

    public Restaurant() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYelpReviewCount() {
        return yelpReviewCount;
    }

    public void setYelpReviewCount(int yelpReviewCount) {
        this.yelpReviewCount = yelpReviewCount;
    }

    public Object getMaxOrderSize() {
        return maxOrderSize;
    }

    public void setMaxOrderSize(int maxOrderSize) {
        this.maxOrderSize = maxOrderSize;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public int getMaxCompositeScore() {
        return maxCompositeScore;
    }

    public void setMaxCompositeScore(int maxCompositeScore) {
        this.maxCompositeScore = maxCompositeScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getDeliveryRadius() {
        return deliveryRadius;
    }

    public void setDeliveryRadius(int deliveryRadius) {
        this.deliveryRadius = deliveryRadius;
    }

    public double getInflationRate() {
        return inflationRate;
    }

    public void setInflationRate(double inflationRate) {
        this.inflationRate = inflationRate;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public boolean isShowStoreMenuHeaderPhoto() {
        return showStoreMenuHeaderPhoto;
    }

    public void setShowStoreMenuHeaderPhoto(boolean showStoreMenuHeaderPhoto) {
        this.showStoreMenuHeaderPhoto = showStoreMenuHeaderPhoto;
    }

    public int getCompositeScore() {
        return compositeScore;
    }

    public void setCompositeScore(int compositeScore) {
        this.compositeScore = compositeScore;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public boolean isIsOnlyCatering() {
        return isOnlyCatering;
    }

    public void setIsOnlyCatering(boolean isOnlyCatering) {
        this.isOnlyCatering = isOnlyCatering;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public String getYelpBizId() {
        return yelpBizId;
    }

    public void setYelpBizId(String yelpBizId) {
        this.yelpBizId = yelpBizId;
    }

//    public Object getAsapTime() {
//        return asapTime;
//    }
//
//    public void setAsapTime(Object asapTime) {
//        this.asapTime = asapTime;
//    }

    public double getYelpRating() {
        return yelpRating;
    }

    public void setYelpRating(double yelpRating) {
        this.yelpRating = yelpRating;
    }

    public int getExtraSosDeliveryFee() {
        return extraSosDeliveryFee;
    }

    public void setExtraSosDeliveryFee(int extraSosDeliveryFee) {
        this.extraSosDeliveryFee = extraSosDeliveryFee;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public Object getSpecialInstructionsMaxLength() {
        return specialInstructionsMaxLength;
    }

    public void setSpecialInstructionsMaxLength(Object specialInstructionsMaxLength) {
        this.specialInstructionsMaxLength = specialInstructionsMaxLength;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isShowSuggestedItems() {
        return showSuggestedItems;
    }

    public void setShowSuggestedItems(boolean showSuggestedItems) {
        this.showSuggestedItems = showSuggestedItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsNewlyAdded() {
        return isNewlyAdded;
    }

    public void setIsNewlyAdded(boolean isNewlyAdded) {
        this.isNewlyAdded = isNewlyAdded;
    }

    public boolean isIsGoodForGroupOrders() {
        return isGoodForGroupOrders;
    }

    public void setIsGoodForGroupOrders(boolean isGoodForGroupOrders) {
        this.isGoodForGroupOrders = isGoodForGroupOrders;
    }

    public double getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(double serviceRate) {
        this.serviceRate = serviceRate;
    }

    public List<MerchantPromotion> getMerchantPromotions() {
        return merchantPromotions;
    }

    public void setMerchantPromotions(List<MerchantPromotion> merchantPromotions) {
        this.merchantPromotions = merchantPromotions;
    }

    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(phoneNumber);
        dest.writeValue(yelpReviewCount);
        dest.writeValue(maxOrderSize);
        dest.writeValue(deliveryFee);
        dest.writeValue(maxCompositeScore);
        dest.writeValue(id);
        dest.writeValue(averageRating);
        dest.writeList(tags);
        dest.writeValue(deliveryRadius);
        dest.writeValue(inflationRate);
        dest.writeList(menus);
        dest.writeValue(showStoreMenuHeaderPhoto);
        dest.writeValue(compositeScore);
        dest.writeValue(numberOfRatings);
        dest.writeValue(statusType);
        dest.writeValue(isOnlyCatering);
        dest.writeValue(status);
        dest.writeValue(objectType);
        dest.writeValue(description);
        dest.writeValue(business);
        dest.writeValue(yelpBizId);
//        dest.writeValue(asapTime);
        dest.writeValue(yelpRating);
        dest.writeValue(extraSosDeliveryFee);
        dest.writeValue(businessId);
        dest.writeValue(specialInstructionsMaxLength);
        dest.writeValue(coverImgUrl);
        dest.writeValue(address);
        dest.writeValue(priceRange);
        dest.writeValue(slug);
        dest.writeValue(showSuggestedItems);
        dest.writeValue(name);
        dest.writeValue(isNewlyAdded);
        dest.writeValue(isGoodForGroupOrders);
        dest.writeValue(serviceRate);
        dest.writeList(merchantPromotions);
        dest.writeValue(headerImageUrl);
    }

    public int describeContents() {
        return 0;
    }

    public static Restaurant buildFromJSONObject(JSONObject jsonObject) {
        Restaurant newRestaurant = new Restaurant();
        if (jsonObject != null) {
            newRestaurant.setAddress(Address.buildFromJSONObject(jsonObject.optJSONObject(ADDRESS)));
            newRestaurant.setAverageRating(jsonObject.optDouble(AVERAGE_RATING));
            newRestaurant.setBusiness(Business.buildFromJSONObject(jsonObject.optJSONObject(BUSINESS)));
            newRestaurant.setBusinessId(jsonObject.optInt(BUSINESS_ID));
            newRestaurant.setCompositeScore(jsonObject.optInt(COMPOSITE_SCORE));
            newRestaurant.setCoverImgUrl(jsonObject.optString(COVER_IMG_URL));
            newRestaurant.setDeliveryFee(jsonObject.optInt(DELIVERY_FEE));
            newRestaurant.setDeliveryRadius(jsonObject.optInt(DELIVERY_RADIUS));
            newRestaurant.setDescription(jsonObject.optString(DESCRIPTION));
            newRestaurant.setExtraSosDeliveryFee(jsonObject.optInt(EXTRA_SOS_DELIVERY_FEE));
            newRestaurant.setHeaderImageUrl(jsonObject.optString(HEADER_IMAGE_URL));
            newRestaurant.setId(jsonObject.optInt(ID));
            newRestaurant.setInflationRate(jsonObject.optInt(INFLATION_RATE));
            newRestaurant.setIsGoodForGroupOrders(jsonObject.optBoolean(IS_GOOD_FOR_GROUP_ORDERS));
            newRestaurant.setIsNewlyAdded(jsonObject.optBoolean(IS_NEWLY_ADDED));
            newRestaurant.setIsOnlyCatering(jsonObject.optBoolean(IS_ONLY_CATERING));
            newRestaurant.setMaxCompositeScore(jsonObject.optInt(MAX_COMPOSITE_SCORE));
            newRestaurant.setMaxOrderSize(jsonObject.optInt(MAX_ORDER_SIZE));
            newRestaurant.setMenus(Menu.buildFromJSONObject(jsonObject.optJSONObject(MENUS)));
            newRestaurant.setMerchantPromotions(MerchantPromotion.buildFromJSONObject(jsonObject.optJSONObject(MERCHANT_PROMOTIONS)));
            newRestaurant.setName(jsonObject.optString(NAME));
            newRestaurant.setNumberOfRatings(jsonObject.optInt(NUMBER_OF_RATINGS));
            newRestaurant.setObjectType(jsonObject.optString(OBJECT_TYPE));
            newRestaurant.setPhoneNumber(jsonObject.optString(PHONE_NUMBER));
            newRestaurant.setPriceRange(jsonObject.optInt(PRICE_RANGE));
            newRestaurant.setServiceRate(jsonObject.optInt(SERVICE_RATE));
            newRestaurant.setShowStoreMenuHeaderPhoto(jsonObject.optBoolean(SHOW_STORE_MENU_HEADER_PHOTO));
            newRestaurant.setShowSuggestedItems(jsonObject.optBoolean(SHOW_SUGGESTED_ITEMS));
            newRestaurant.setSlug(jsonObject.optString(SLUG));
            newRestaurant.setSpecialInstructionsMaxLength(jsonObject.optInt(SPECIAL_INSTRUCTIONS_MAX_LENGTH));
            newRestaurant.setStatus(jsonObject.optString(STATUS));
            newRestaurant.setStatusType(jsonObject.optString(STATUS_TYPE));
            newRestaurant.setTags(getTags(jsonObject.optJSONArray(TAGS)));
            newRestaurant.setYelpBizId(jsonObject.optString(YELP_BIZ_ID));
            newRestaurant.setYelpRating(jsonObject.optDouble(YELP_RATING));
            newRestaurant.setYelpReviewCount(jsonObject.optInt(YELP_REVIEW_COUNT));
        }
        return newRestaurant;
    }

    private static List<String> getTags(JSONArray array) {
        List<String> tags = new ArrayList<>();

        if (array != null) {
            for (int x = 0; x < array.length(); x++) {
                try {
                    tags.add(array.getString(x));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return tags;
    }
}
