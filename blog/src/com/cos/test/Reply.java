package com.cos.test;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
	private int id;
	private int boardId;
	private int userId;
	private String content;
	private Timestamp createDate;
}
