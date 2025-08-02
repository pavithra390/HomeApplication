package com.example.home.repo;
import com.example.home.entity.HomeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HomeRepo extends CrudRepository<HomeEntity, Integer> {
    public Iterable<HomeEntity> findByFatherName(String fatherName);
    public Iterable<HomeEntity> findByMotherName(String motherName);
    public Iterable<HomeEntity> findByFatherNameAndMotherName(String fatherName, String motherName);
    @Query("From HomeEntity h where h.fatherName=:fatherName ")
    public Iterable<HomeEntity> retrieveRecordByFatherName(String fatherName);
    @Query("From HomeEntity h where h.motherName=:motherName")
    public Iterable<HomeEntity> retrieveRecordByMotherName(String motherName);
    @Query("From HomeEntity h where h.fatherName=:fatherName and h.motherName=:motherName")
    public Iterable<HomeEntity> retrieveRecordByFatherNameAndMotherName(String fatherName, String motherName);

}
