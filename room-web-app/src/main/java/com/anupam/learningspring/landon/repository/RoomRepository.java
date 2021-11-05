package com.anupam.learningspring.landon.repository;

import com.anupam.learningspring.landon.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
