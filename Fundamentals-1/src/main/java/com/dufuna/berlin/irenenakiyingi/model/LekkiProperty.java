package com.dufuna.berlin.irenenakiyingi.model;

public class LekkiProperty {
    //property id
    public int propertyId;
    //setter
    public void setPropertyId( int propertyId){
        this.propertyId = propertyId;
    }
    //getter
    public void getPropertyId( int propertyId){
        this.propertyId = propertyId;
    }
    public String propertyAddress;
    //setter
    public void setPropertyAddress(String propertyAddress){
        this.propertyAddress = propertyAddress;
    }
    //getter
    public void getPropertyAddress(String propertyAddress){
        this.propertyAddress = propertyAddress;
    }
    public  String propertyType;
    //setter
    public void setPropertyType( String propertyType){
        this.propertyType = propertyType;
    }
    //getter
    public void getPropertyType( String propertyType){
        this.propertyType = propertyType;
    }
    public int numberOfBedrooms;
    //setter
    public void setNumberOfBedrooms( int numberOfBedrooms){
        this.numberOfBedrooms = numberOfBedrooms;
    }
    //getter
    public void getNumberOfBedrooms( int numberOfBedrooms){
        this.numberOfBedrooms = numberOfBedrooms;
    }
    public int numberOfSittingRooms;
    //setter
    public void setNumberOfSittingRooms( int numberOfSittingRooms){
        this.numberOfSittingRooms = numberOfSittingRooms;
    }
    //getter
    public void getNumberOfSittingRooms ( int numberOfSittingRooms){
        this.numberOfSittingRooms = numberOfSittingRooms;
    }
    public int numberOfKitchens;
    //setter
    public void setNumberOfKitchens( int numberOfKitchens){
        this.numberOfKitchens = numberOfKitchens;
    }
    //getter
    public void getNumberOfKitchens ( int numberOfKitchens){
        this.numberOfKitchens = numberOfKitchens;
    }
    public int numberOfBathrooms;
    //setter
    public void setNumberOfBathrooms( int numberOfBathrooms){
        this.numberOfBathrooms = numberOfBathrooms;
    }
    //getter
    public void getNumberOfBathrooms ( int numberOfBathrooms){
        this.numberOfBathrooms = numberOfBathrooms;
    }
    public int numberOfToilets;
    //setter
    public void setNumberOfToilets( int numberOfToilets){
        this.numberOfToilets = numberOfToilets;
    }
    //getter
    public void getNumberOfToilets ( int numberOfToilets){
        this.numberOfToilets = numberOfToilets;
    }
    public String propertyOwner;
    //setter
    public void setPropertyOwner( String propertyOwner){
        this.propertyOwner = propertyOwner;
    }
    //getter
    public void getPropertyOwner( String propertyOwner){
        this.propertyOwner = propertyOwner;
    }
    public String Description;
    //setter
    public void setDescription( String Description){
        this.Description = Description;
    }
    //getter
    public void getDescription( String Description){
        this.Description = Description;
    }
    // how to get dates?
    public String validFrom;
    //setter
    public void setValidFrom(String validFrom){
        this.validFrom = validFrom;
    }
    //getter
    public void getValidFrom( String validFrom){
        this.validFrom = validFrom;
    }
    public String validTo;
    //setter
    public void setValidTo(String validTo){
        this.validTo = validTo;
    }
    //getter
    public void getValidTo( String validTo){
        this.validTo = validTo;
    }
    //methods
     public String toString(){
         return propertyId + ',' + propertyAddress + ',' + propertyType;
    };
     public boolean equals(){
         int id1 = propertyId;
         int id2 = propertyId;
         return true;
     }
     public int hashCode(){
         return propertyId;
     }

}
