package org.team.nagnebatch.place.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.team.nagnebatch.place.batch.market.domain.Area;
import org.team.nagnebatch.utils.BaseEntity;

@Entity
public class Place extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "place_id")
  private Long id;

  private String address;

  private String title;

  @Column(unique = true)
  private String contentId;

  private int contentTypeId;

  private double lat;

  private double lng;

  @Enumerated(EnumType.STRING)
  private ApiType apiType;

  @ManyToOne(fetch = FetchType.LAZY)
  private Area area;

  protected Place() {}

  // 지역코드 기반 insert
  public Place(String address, String title, String contentId, int contentTypeId, double latitude, double longitude, Area area) {
    this.address = address;
    this.title = title;
    this.contentId = contentId;
    this.contentTypeId = contentTypeId;
    this.lat = latitude;
    this.lng = longitude;
    this.area = area;
  }

  public Place(Long id, String address, String title, String contentId, int contentTypeId,
               double latitude, double longitude) {
    this.id = id;
    this.address = address;
    this.title = title;
    this.contentId = contentId;
    this.contentTypeId = contentTypeId;
    this.lat = latitude;
    this.lng = longitude;
  }

  public Place(String address, String title, String contentId, double lat, int contentTypeId,
      double lng, Area area, ApiType apiType) {
    this.address = address;
    this.title = title;
    this.contentId = contentId;
    this.lat = lat;
    this.contentTypeId = contentTypeId;
    this.lng = lng;
    this.area = area;
    this.apiType = apiType;
  }

  public Long getId() {
    return id;
  }

  public String getAddress() {
    return address;
  }

  public String getTitle() {
    return title;
  }

  public String getContentId() {
    return contentId;
  }

  public int getContentTypeId() {
    return contentTypeId;
  }

  public double getLatitude() {
    return lat;
  }

  public double getLongitude() {
    return lng;
  }

  public ApiType getApiType() {
    return apiType;
  }

  public void setApiType(ApiType apiType) {
    this.apiType = apiType;
  }
}
