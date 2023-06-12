package com.example.finalproject12be.domain.board.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.finalproject12be.common.Timestamped;
import com.example.finalproject12be.domain.board.dto.BoardRequest;
import com.example.finalproject12be.domain.member.entity.Member;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Board extends Timestamped {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOARD_ID")
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String content;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MEMBER_ID")
	private Member member;


	private Board(String title, String content, Member member) {
		this.title = title;
		this.content = content;
		this.member = member;
	}

	public void updateBoard(BoardRequest boardRequest){
		this.title = boardRequest.getTitle();
		this.content = boardRequest.getContent();

	}

	public static Board of(String title, String content, Member member) {
		return new Board(title, content, member);
	}

}