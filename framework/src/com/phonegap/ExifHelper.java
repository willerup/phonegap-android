/*
 * PhoneGap is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 * 
 * Copyright (c) 2011, IBM Corporation
 */
package com.phonegap;

import java.io.IOException;

import android.media.ExifInterface;

public class ExifHelper {
    private String aperature = null;
    private String datetime = null;
    private String exposureTime = null;
    private String flash = null;
    private String focalLength = null;
    private String gpsAltitude = null;
    private String gpsAltitudeRef = null;
    private String gpsDateStamp = null;
    private String gpsLatitude = null;
    private String gpsLatitudeRef = null;
    private String gpsLongitude = null;
    private String gpsLongitudeRef = null;
    private String gpsProcessingMethod = null;
    private String gpsTimestamp = null;
    private String iso = null;
    private String make = null;
    private String model = null;
    private String orientation = null;
    private String whiteBalance = null;    
    
    private ExifInterface inFile = null;
    private ExifInterface outFile = null;
    
    /**
     * The file before it is compressed
     * 
     * @param filePath 
     * @throws IOException
     */
    public void createInFile(String filePath) throws IOException {
        this.inFile = new ExifInterface(filePath);
    }
    
    /** 
     * The file after it has been compressed
     * 
     * @param filePath
     * @throws IOException
     */
    public void createOutFile(String filePath) throws IOException {
        this.outFile = new ExifInterface(filePath);
    }
    
    /**
     * Reads all the EXIF data from the input file.
     */
    public void readExifData() {
//        this.aperature = inFile.getAttribute(ExifInterface.TAG_APERTURE);
        this.datetime = inFile.getAttribute(ExifInterface.TAG_DATETIME);
  //      this.exposureTime = inFile.getAttribute(ExifInterface.TAG_EXPOSURE_TIME);
        this.flash = inFile.getAttribute(ExifInterface.TAG_FLASH);
        this.focalLength = inFile.getAttribute(ExifInterface.TAG_FOCAL_LENGTH);
    //    this.gpsAltitude = inFile.getAttribute(ExifInterface.TAG_GPS_ALTITUDE);
      //  this.gpsAltitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_ALTITUDE_REF);
        this.gpsDateStamp = inFile.getAttribute(ExifInterface.TAG_GPS_DATESTAMP);
        this.gpsLatitude = inFile.getAttribute(ExifInterface.TAG_GPS_LATITUDE);
        this.gpsLatitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_LATITUDE_REF);
        this.gpsLongitude = inFile.getAttribute(ExifInterface.TAG_GPS_LONGITUDE);
        this.gpsLongitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF);
        this.gpsProcessingMethod = inFile.getAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD);
        this.gpsTimestamp = inFile.getAttribute(ExifInterface.TAG_GPS_TIMESTAMP);
        //this.iso = inFile.getAttribute(ExifInterface.TAG_ISO);
        this.make = inFile.getAttribute(ExifInterface.TAG_MAKE);
        this.model = inFile.getAttribute(ExifInterface.TAG_MODEL);
        this.orientation = inFile.getAttribute(ExifInterface.TAG_ORIENTATION);
        this.whiteBalance = inFile.getAttribute(ExifInterface.TAG_WHITE_BALANCE);        
    }
    
    /**
     * Writes the previously stored EXIF data to the output file.
     * 
     * @throws IOException
     */
    public void writeExifData() throws IOException {
        // Don't try to write to a null file
        if (this.outFile == null) {
            return;
        }
        
        if (this.aperature != null) {
          //  this.outFile.setAttribute(ExifInterface.TAG_APERTURE, this.aperature);
        }
        if (this.datetime != null) {
            this.outFile.setAttribute(ExifInterface.TAG_DATETIME, this.datetime);
        }
        if (this.exposureTime != null) {
            //this.outFile.setAttribute(ExifInterface.TAG_EXPOSURE_TIME, this.exposureTime);
        }
        if (this.flash != null) {
            this.outFile.setAttribute(ExifInterface.TAG_FLASH, this.flash);
        }
        if (this.focalLength != null) {
            this.outFile.setAttribute(ExifInterface.TAG_FOCAL_LENGTH, this.focalLength);
        }
        if (this.gpsAltitude != null) {
            //this.outFile.setAttribute(ExifInterface.TAG_GPS_ALTITUDE, this.gpsAltitude);
        }
        if (this.gpsAltitudeRef != null) {
         //   this.outFile.setAttribute(ExifInterface.TAG_GPS_ALTITUDE_REF, this.gpsAltitudeRef);
        }
        if (this.gpsDateStamp != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_DATESTAMP, this.gpsDateStamp);
        }
        if (this.gpsLatitude != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LATITUDE, this.gpsLatitude);
        }
        if (this.gpsLatitudeRef != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, this.gpsLatitudeRef);
        }
        if (this.gpsLongitude != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, this.gpsLongitude);
        }
        if (this.gpsLongitudeRef != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, this.gpsLongitudeRef);
        }
        if (this.gpsProcessingMethod != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD, this.gpsProcessingMethod);
        }
        if (this.gpsTimestamp != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_TIMESTAMP, this.gpsTimestamp);
        }
        if (this.iso != null) {
           // this.outFile.setAttribute(ExifInterface.TAG_ISO, this.iso);
        }
        if (this.make != null) {
            this.outFile.setAttribute(ExifInterface.TAG_MAKE, this.make);
        }
        if (this.model != null) {
            this.outFile.setAttribute(ExifInterface.TAG_MODEL, this.model);
        }
        if (this.orientation != null) {
            this.outFile.setAttribute(ExifInterface.TAG_ORIENTATION, this.orientation);
        }
        if (this.whiteBalance != null) {
            this.outFile.setAttribute(ExifInterface.TAG_WHITE_BALANCE, this.whiteBalance);
        }
        
        this.outFile.saveAttributes();
    }
}