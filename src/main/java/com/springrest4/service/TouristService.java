package com.springrest4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest4.handleexception.TouristNotFoundException;
import com.springrest4.model.Tourist;
import com.springrest4.repo.TouristRepo;

@Service
public class TouristService implements IToursitService {
	
	@Autowired
	private TouristRepo repo;

	@Override
	public String registerTourist(Tourist tourist) {
		Tourist tour = repo.save(tourist);
		return "Tourist Registerd Successfully With Id "+tour.getId();
	}

	@Override
	public Tourist getTouristById(int id) {
		return repo.findById(id).orElseThrow(()-> new TouristNotFoundException("Tourist With Given Id Is Not Found"));
	}

	@Override
	public List<Tourist> getAllTourist() {
		return repo.findAll();
	}

	@Override
	public String updateTourist(Tourist tourist) {
		Optional<Tourist> byId = repo.findById(tourist.getId());
		if(byId.isPresent()) {
			repo.save(tourist);
			return "Updation Successfull For Given Tourist";
		}else{
			throw  new TouristNotFoundException("Updatation Failed Due To Tourist Not Found");
		}
	}

	@Override
	public String registerAllTourist(List<Tourist> tourist) {
		List<Tourist> saveAll = repo.saveAll(tourist);
		return "All Tourist Registerd Successfully ";
	}

	@Override
	public String deleteTouristById(int id) {
		Optional<Tourist> byId = repo.findById(id);
		if(byId.isPresent()) {
			repo.deleteById(id);
			return "Deletion Successfull By Given Id "+id;
		}else {
			throw  new TouristNotFoundException("Deletion Failed Due To Tourist Id Not Found");
		}
	}

	@Override
	public String updateTouristNation(int id, String nationality) {
		Optional<Tourist> byId = repo.findById(id);
		if(byId.isPresent()) {
			Tourist tourist = byId.get();
			tourist.setNationality(nationality);
			repo.save(tourist);
			return "Updation Successfull For Given Tourist"+id;
		}
		else{
			throw  new TouristNotFoundException("Updatation Failed Due To Tourist Not Found");
		}
	}

}
