package com.idevalot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity(name = "todos")
public class Todo {

	public Todo() {

	}

	@Id
	@GeneratedValue
	private int id;

	private String username;

	@Size(min = 10, message = "Enter atleast 10 characters")
	private String description;

	private LocalDate targetDate;

	private boolean done;

	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;

		this.description = description;

		this.targetDate = targetDate;

		this.done = done;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public boolean isDone() {
		return done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}

}
