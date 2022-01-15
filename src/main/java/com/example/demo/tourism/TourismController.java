package com.example.demo.tourism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/tourism")
public class TourismController {

    private final TourismService tourismService;

    @Autowired
    public TourismController(TourismService tourismService)
    {
        this.tourismService = tourismService;
    }

    @GetMapping
    //list of tourism
    public List<Tourism> getTourism()
    {
        return tourismService.getTourism();
    }

    @PostMapping
    public void registerNewTourism(
            @RequestBody    Tourism tourism)
    {
       tourismService.addNewTourism(tourism);
    }

    @DeleteMapping(path = "{tourismId}")
    public void deleteTourism(
            //delete tourism from specified path
            @PathVariable("tourismId") Long tourismId)
    {
        tourismService.deleteTourism(tourismId);
    }
    }

