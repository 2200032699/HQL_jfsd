package com.klef.JFSD_HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table (name ="student")
public class Student {
 @Id
 
 int sid;
 
  String sname;

  String sgender;
  
  String sdepartment;
  
  String sprogram;
  
  String sdateOfBirth;
   
  String scontactNumber;
   
   String sgraduationStatus;
    
   double scgpa;
    
   int snumberOfBacklogs;
   
   
   

  
 public int getsid() {
  return sid;
 }





 public void setsid(int sid) {
  this.sid = sid;
 }





 public String getsname() {
  return sname;
 }





 public void setsname(String sname) {
  this.sname = sname;
 }





 public String getsgender() {
  return sgender;
 }





 public void setsgender(String sgender) {
  this.sgender = sgender;
 }





 public String getsdepartment() {
  return sdepartment;
 }





 public void setsdepartment(String sdepartment) {
  this.sdepartment = sdepartment;
 }





 public String getsprogram() {
  return sprogram;
 }





 public void setsprogram(String sprogram) {
  this.sprogram = sprogram;
 }





 public String getsdateOfBirth() {
  return sdateOfBirth;
 }





 public void setsdateOfBirth(String sdateOfBirth) {
  this.sdateOfBirth = sdateOfBirth;
 }





 public String getscontactNumber() {
  return scontactNumber;
 }





 public void setscontactNumber(String scontactNumber) {
  this.scontactNumber = scontactNumber;
 }





 public String getsgraduationStatus() {
  return sgraduationStatus;
 }





 public void setsgraduationStatus(String sgraduationStatus) {
  this.sgraduationStatus = sgraduationStatus;
 }





 public double getscgpa() {
  return scgpa;
 }





 public void setscgpa(double scgpa) {
  this.scgpa = scgpa;
 }





 public int getsnumberOfBacklogs() {
  return snumberOfBacklogs;
 }





 public void setsnumberOfBacklogs(int snumberOfBacklogs) {
  this.snumberOfBacklogs = snumberOfBacklogs;
 }





@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sgender=" + sgender + ", sdepartment=" + sdepartment
			+ ", sprogram=" + sprogram + ", sdateOfBirth=" + sdateOfBirth + ", scontactNumber=" + scontactNumber
			+ ", sgraduationStatus=" + sgraduationStatus + ", scgpa=" + scgpa + ", snumberOfBacklogs="
			+ snumberOfBacklogs + "]";
}
	





 
      
}
