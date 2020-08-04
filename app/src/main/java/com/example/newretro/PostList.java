
package com.example.newretro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostList {

    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("Contact #")
    @Expose
    private String contact;
    @SerializedName("Distance")
    @Expose
    private Double distance;
    @SerializedName("Lat")
    @Expose
    private Double lat;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("Long")
    @Expose
    private Double _long;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Number of Rating")
    @Expose
    private Double numberOfRating;
    @SerializedName("Rating")
    @Expose
    private Double rating;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Double getLong() {
        return _long;
    }

    public void setLong(Double _long) {
        this._long = _long;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNumberOfRating() {
        return numberOfRating;
    }

    public void setNumberOfRating(Double numberOfRating) {
        this.numberOfRating = numberOfRating;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

}
