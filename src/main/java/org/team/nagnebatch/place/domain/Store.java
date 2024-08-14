package org.team.nagnebatch.place.domain;

import jakarta.persistence.*;

@Entity
public class Store {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "store_id")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "place_id")
  private Place place;

  @Column(length = 1000)
  private String openTime;

  @Column(length = 50)
  private String contactNumber;

  public Store(Long id, Place place, String openTime, String contactNumber) {
    this.id = id;
    this.place = place;
    this.openTime = openTime;
    this.contactNumber = contactNumber;
  }

  public Store() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Place getPlace() {
    return place;
  }

  public void setPlace(Place place) {
    this.place = place;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public String getOpenTime() {
    return openTime;
  }

  public void setOpenTime(String openTime) {
    this.openTime = openTime;
  }

}
