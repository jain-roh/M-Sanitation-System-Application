/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lav;

/**
 *
 * @author VAIBHAV RAJ
 */
public class Lav {
    private int LavID;
private float Lat;
private float Long;

private int LocationID;   
private int Rating;

    public int getLavID() {
        return LavID;
    }

    public void setLavID(int LavID) {
        this.LavID = LavID;
    }

    public float getLat() {
        return Lat;
    }

    public void setLat(float Lat) {
        this.Lat = Lat;
    }

    public float getLong() {
        return Long;
    }

    public void setLong(float Long) {
        this.Long = Long;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int LocationID) {
        this.LocationID = LocationID;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

}
