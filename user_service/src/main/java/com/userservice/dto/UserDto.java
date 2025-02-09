package com.userservice.dto;

public class UserDto {
    private int id;
    private String name;
    private String address;
    private String email;
    private HotelDto hotelDto;
    private RatingDto ratingDto;

    public UserDto() {
    }

    public UserDto(int id, String name, String address, String email, HotelDto hotelDto, RatingDto ratingDto) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.hotelDto = hotelDto;
        this.ratingDto = ratingDto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HotelDto getHotelDto() {
        return hotelDto;
    }

    public void setHotelDto(HotelDto hotelDto) {
        this.hotelDto = hotelDto;
    }

    public RatingDto getRatingDto() {
        return ratingDto;
    }

    public void setRatingDto(RatingDto ratingDto) {
        this.ratingDto = ratingDto;
    }
}
