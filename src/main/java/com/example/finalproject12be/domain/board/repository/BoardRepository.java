package com.example.finalproject12be.domain.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finalproject12be.domain.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {


}