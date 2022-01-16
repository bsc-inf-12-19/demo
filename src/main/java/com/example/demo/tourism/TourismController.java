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
    @GetMapping(path = "/home")
    public String home()
    {
        return "Welcome to MalawiTourism";
    }

    @GetMapping(path = "/destination")
    public String destination()
    {
        return "different tourism destination within malawi";
    }

    @GetMapping(path = "/gallery")
    public String gallery()
    {
        return "Welcome to MalawiTourism Gallery";
    }
    @GetMapping(path = "/feedback")
    public String feedback()
    {
        return "give us feedback";
    }
    @GetMapping(path = "/search")
    public String search()
    {
        return "search malawian district here to view tourism site";
    }
    }

