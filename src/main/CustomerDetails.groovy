package main

/**
 * Created by 60923 on 27/06/2016.
 */

import groovy.json.JsonSlurper
import service.LocatorUtil

/*
Read the JSON from the file system
*/
def jsonSlurper = new JsonSlurper();
def reader = new BufferedReader(new FileReader("D:/dev/Test_03/src/customers.json"))
def parsedData = jsonSlurper.parse(reader)
def usersList =[]
def selectedCustomer =[]
parsedData.each {
    list ->
        def user = new Customer(list.user_id,
                list.name,
                list.latitude,
                list.longitude)
        usersList.add(user)
}

/*
 get Customer < 100 KM radius
*/

def latitude = 53.3381985   //given
def longitude = -6.2592576  //given

usersList.each {e ->
    def selected_radius = LocatorUtil.calculateDistance(latitude,longitude, Double.parseDouble(e.latitude), Double.parseDouble(e.longitude))
    if(selected_radius <= 100){
        selectedCustomer.add(e)
    }
}

selectedCustomer.sort{e->e.user_id}      //  sorted by User ID

//selected customer list
selectedCustomer.each { e ->
    println(e)
}


