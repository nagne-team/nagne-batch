package org.team.nagnebatch.place.domain.requestAttraction;

public class AttractionDTO {

  private String addr1;

  private String contentId;

  private Long contentTypeId;

  //기본 이미지
  private String firstImage;

  //썸네일 이미지
  private String firstImage2;

  private double lat;

  private double lng;

  private String tel;

  private String title;

  private String areaCode;

  private String overview;

  private String modifiedTime;

  //데이터 처리 동작을 맡는 것
  public void addContent(String overview){
    this.overview = overview;
  }

  public String getAddr1() {
    return addr1;
  }

  public String getContentId() {
    return contentId;
  }

  public Long getContentTypeId() {
    return contentTypeId;
  }

  public String getFirstImage() {
    return firstImage;
  }

  public String getFirstImage2() {
    return firstImage2;
  }

  public double getLat() {
    return lat;
  }

  public double getLng() {
    return lng;
  }

  public String getTel() {
    return tel;
  }

  public String getTitle() {
    return title;
  }

  public String getOverview() {
    return overview;
  }

  public String getAreaCode() {
    return areaCode;
  }

  public String getModifiedTime() {return modifiedTime;}

  public static class Builder {

    private String addr1;
    private String contentId;
    private Long contentTypeId;
    private String firstImage;
    private String firstImage2;
    private double lat;
    private double lng;
    private String tel;
    private String title;
    private String areaCode;
    private String overview;
    private String modifiedTime;

    public Builder addr1(String addr1) {
      this.addr1 = addr1;
      return this;
    }

    public Builder contentId(String contentId) {
      this.contentId = contentId;
      return this;
    }

    public Builder contentTypeId(Long contentTypeId) {
      this.contentTypeId = contentTypeId;
      return this;
    }

    public Builder firstImage(String firstImage) {
      this.firstImage = firstImage;
      return this;
    }

    public Builder firstImage2(String firstImage2) {
      this.firstImage2 = firstImage2;
      return this;
    }

    public Builder lat(double lat) {
      this.lat = lat;
      return this;
    }

    public Builder lng(double lng) {
      this.lng = lng;
      return this;
    }

    public Builder tel(String tel) {
      this.tel = tel;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder areaCode(String areaCode) {
      this.areaCode = areaCode;
      return this;
    }

    public Builder overview(String overview){
      this.overview = overview;
      return this;
    }

    public Builder modifiedTime(String modifiedTime) {
      this.modifiedTime = modifiedTime;
      return this;
    }

    public AttractionDTO build() {
      AttractionDTO dto = new AttractionDTO();
      dto.addr1 = this.addr1;
      dto.contentId = this.contentId;
      dto.contentTypeId = this.contentTypeId;
      dto.firstImage = this.firstImage;
      dto.firstImage2 = this.firstImage2;
      dto.lat = this.lat;
      dto.lng = this.lng;
      dto.tel = this.tel;
      dto.title = this.title;
      dto.areaCode = this.areaCode;
      dto.overview = this.overview;
      dto.modifiedTime = this.modifiedTime;
      return dto;
    }
  }

  public static Builder builder() {
    return new Builder();
  }
}
