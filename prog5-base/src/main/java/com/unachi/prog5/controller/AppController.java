package com.unachi.prog5.controller;

import com.unachi.prog5.model.Student;
import com.unachi.prog5.view.ConsoleView;

public class AppController {
	 private final ConsoleView view;
	 public AppController(ConsoleView view) {
	 this.view = view;
	 }
	 public void run() {
	 Student s = new Student("2025-001", "Ana Pérez");
	 view.showMessage("Hola Programación V ");
	 view.showMessage("Modelo: " + s.summary());
	 }
}
