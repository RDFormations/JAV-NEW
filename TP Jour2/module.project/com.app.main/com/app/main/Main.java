package com.app.main;

import com.animal.mod.Dog;

public class Main {
	public static void main(String[] args) {
		Dog doggo = new Dog();
		doggo.MakeNoise();
	}
}

//javac -d .\mods\Zoo.com.animal.mod .\Zoo.com.animal.mod\module-info.java .\Zoo.com.animal.mod\Zoo\com\animal\mod\Dog.java .\com.app.main\com\app\main\Main.java
//java --module-path mods -m com.animal.mod/com.app.main.Main 
