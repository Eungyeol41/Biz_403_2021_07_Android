package com.ini.movie.model;

import java.util.List;

public class NaverMovieDTO {

    private String title; // string	검색 결과 영화의 제목을 나타낸다. 제목에서 검색어와 일치하는 부분은 태그로 감싸져 있다.
    private String link; // 검색 결과 영화의 하이퍼텍스트 link를 나타낸다.
    private String image; // 검색 결과 영화의 썸네일 이미지의 URL이다. 이미지가 있는 경우만 나타난다.
    private String subtitle; // 검색 결과 영화의 영문 제목이다.
    private String pubDate; // 검색 결과 영화의 제작년도이다.
    private String director; // 검색 결과 영화의 감독이다.
    private String actor; // 검색 결과 영화의 출연 배우이다.
    private String userRating; // 검색 결과 영화에 대한 유저들의 평점

}
