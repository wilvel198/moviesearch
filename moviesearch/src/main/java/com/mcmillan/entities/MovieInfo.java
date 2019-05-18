package com.mcmillan.entities;

import javax.persistence.*;

@Entity
@Table(name = "tbl_movieinfo")
public class MovieInfo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	

}
