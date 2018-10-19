package com.andymitchell.divedb.presentation;

import com.andymitchell.divedb.logic.DiveStatistic;
import com.andymitchell.divedb.logic.StatisticsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Resource
    private StatisticsService statisticsService;

    @GetMapping
    public DiveStatistic getDiveStatistic() {
        return statisticsService.getDiveStatistic();
    }

}
