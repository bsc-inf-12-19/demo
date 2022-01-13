package com.example.demo.tourism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourismService {

    private final TourismRepository tourismRepository;

    @Autowired
    public TourismService(TourismRepository tourismRepository) {
        this.tourismRepository = tourismRepository;
    }

    public List<Tourism> getTourism(){
       return tourismRepository.findAll();
    }

    public void addNewTourism(Tourism tourism) {
        Optional<Tourism> tourismByEmail = tourismRepository
                .findTourismByEmail(tourism.getEmail());
        if(tourismByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
       tourismRepository.save(tourism);
    }
}
