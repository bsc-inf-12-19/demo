package com.example.demo.tourism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
