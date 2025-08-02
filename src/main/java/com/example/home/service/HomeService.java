package com.example.home.service;
import com.example.home.entity.HomeEntity;
import com.example.home.repo.HomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HomeService {
    @Autowired
    HomeRepo hr;
    public void addingRecord(HomeEntity family){
        hr.save(family);
    }
    public void addingAllRecords(Iterable<HomeEntity> family){
        hr.saveAll(family);
    }
    public Optional<HomeEntity> gettingRecord(Integer id){
       return hr.findById(id);
    }
    public Iterable<HomeEntity> gettingAllRecords(){
        return hr.findAll();
    }
    public void deleteRecord(Integer id){
        hr.deleteById(id);
    }
    public void deletingAllRecords(){
         hr.deleteAll();
    }
    //Now im implementing the methods by using particular column............................
    public Iterable<HomeEntity> getByFather(String fatherName){
    return hr.findByFatherName(fatherName);
    }
    public Iterable<HomeEntity> getByMother(String motherName){
        return hr.findByMotherName(motherName);
    }
    public Iterable<HomeEntity> getByFatherAndMother(String fatherName,String motherName){
        return hr.findByFatherNameAndMotherName(fatherName,motherName);
    }
    //Implementing methods by using custom method names.......
    public Iterable<HomeEntity> retrieveByFather(String fatherName){
        return hr.retrieveRecordByFatherName(fatherName);
    }
    public Iterable<HomeEntity> retrieveByMother(String motherName){
        return hr.retrieveRecordByMotherName(motherName);
    }
    public Iterable<HomeEntity> retrieveByFatherNameAndMother(String fatherName, String motherName){
        return hr.retrieveRecordByFatherNameAndMotherName(fatherName,
                motherName);
    }
}
