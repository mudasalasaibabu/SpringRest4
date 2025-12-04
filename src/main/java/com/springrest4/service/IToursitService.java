package com.springrest4.service;

import java.util.List;

import com.springrest4.handleexception.TouristNotFoundException;
import com.springrest4.model.Tourist;

public interface IToursitService {
public String registerTourist(Tourist tourist);
public Tourist getTouristById(int id);
public List<Tourist> getAllTourist();
public String updateTourist(Tourist tourist);
public String registerAllTourist(List<Tourist> tourist);
public String deleteTouristById(int id);
public String updateTouristNation(int id,String nationality);
}
