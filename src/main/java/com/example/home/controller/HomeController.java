package com.example.home.controller;
import com.example.home.entity.HomeEntity;
import com.example.home.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/producer")
public class HomeController {
    @Autowired
    private HomeService hs;

    @PostMapping("/adding/familyRecord")
    //http://localhost:1994/producer/adding/familyRecord
    public String addingRecord(@RequestBody HomeEntity family){
        hs.addingRecord(family);
        return "Record added successfully";
    }
    @PostMapping("/adding/AllfamilyRecords")
    //http://localhost:1994/producer/adding/AllfamilyRecords
    public String addingAllRecords(@RequestBody Iterable<HomeEntity> family){
        hs.addingAllRecords(family);
        return "All Records added successfully";
    }
    @GetMapping("/getting/FamilyRecord")
    //http://localhost:1994/producer/getting/FamilyRecord
    public Optional<HomeEntity> gettingRecord(@PathVariable int id){
        return hs.gettingRecord(id);
    }
    @GetMapping("/getting/AllFamilyRecords")
    //http://localhost:1994/producer/getting/AllFamilyRecords
    public Iterable<HomeEntity> gettingAllRecords(){
        return hs.gettingAllRecords();
    }
    @DeleteMapping("/deleting/FamilyRecord")
    //http://localhost:1994/producer/deleting/FamilyRecord
    public String deletingRecord(@PathVariable int id){
        hs.deleteRecord(id);
        return "Record deleted successfully";
    }
    @DeleteMapping("/deleting/AllFamilyRecords")
    //http://localhost:1994/producer/deleting/AllFamilyRecords
    public String deletingAllRecords(){
        hs.deletingAllRecords();
        return "All Records Deleted Successfully";
    }
    //Now im implementing the custom methods..................................
    @GetMapping("/getting/recordByFatherName/{father_name}")
    //http://localhost:1994/producer/getting/recordByFatherName
    public Iterable<HomeEntity> gettingRecordByFatherName(@PathVariable("father_name") String fatherName){
        return hs.getByFather(fatherName);
    }
    @GetMapping("/getting/recordByMotherName/{mother_name}")
    //http://localhost:1994/producer/getting/recordByMotherName
    public Iterable<HomeEntity> gettingRecordByMotherName(@PathVariable("mother_name") String motherName){
        return hs.getByMother(motherName);
    }
    @GetMapping("/getting/recordByFatherNameAndMotherName/{father_name}/{mother_name}")
    //http://localhost:1994/producer/getting/recordByMotherName
    public Iterable<HomeEntity> gettingRecordByFatherNameAndMotherName(@PathVariable("father_name") String fatherName, @PathVariable("mother_name") String motherName){
        return hs.getByFatherAndMother(fatherName,motherName);
    }

    //Implementing methods by using custom method names..........
    @GetMapping("/retrieve/recordByFatherName/{father_name}")
    //http://localhost:1994/producer/retrieve/recordByFatherName/{mother_name}
    public Iterable<HomeEntity> retrieveByFatherName(@PathVariable("father_name") String fatherName){
        return hs.retrieveByFather(fatherName);
    }
    @GetMapping("/retrieve/recordByMotherName/{mother_name}")
    //http://localhost:1994/producer/retrieve/recordByMotherName/{mother_name}
    public Iterable<HomeEntity> retrieveByMotherName(@PathVariable("mother_name") String motherName){
        return hs.retrieveByMother(motherName);
    }

    @GetMapping("/retrieve/recordByFatherNameAndMotherName/{father_name}/{mother_name}")
    //http://localhost:1994/producer/retrieve/recordByFatherNameAndMotherName/{father_name}/{mother_name}
    public Iterable<HomeEntity> retrieveByFatherNameAndMotherName(@PathVariable("father_name") String fatherName, @PathVariable("mother_name") String motherName){
        return hs.retrieveByFatherNameAndMother(fatherName,motherName);
    }


}
