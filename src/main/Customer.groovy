package main

/**
 * Created by 60923 on 27/06/2016.
 */

class Customer {
    def user_id;
    def name;
    def latitude;
    def longitude;

    Customer(user_id, name, latitude, longitude){
        this.user_id = user_id
        this.name = name
        this.latitude = latitude
        this.longitude = longitude
    }

    def String toString(){
        return "user_id: "+this.user_id+"n"+
                "name:"+this.name+"n"+
                "latitude: "+this.latitude+"n"+
                "longitude: "+this.longitude
    }
}
