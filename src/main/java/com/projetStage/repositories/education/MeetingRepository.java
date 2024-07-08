package com.projetStage.repositories.education;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetStage.models.entities.education.Meeting;

public interface MeetingRepository extends JpaRepository<Meeting, Integer> {

}
