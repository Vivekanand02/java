package main;

import Furniture.Chair;
import Furniture.Furniture;
import Furniture.Table;

import animal.Animal;
import animal.Cat;
import animal.Dog;

import car.Audi;
import car.Car;
import car.Mustang;

import fan.Bajaj;
import fan.Fan;
import fan.Orient;

import fruit.Apple;
import fruit.Mango;
import fruit.Fruit;

public class Main {
 public static void main(String[] args) {
	Animal animal=new Cat();
	animal.sound();
	animal=new Dog();
	animal.sound();
	
	Fruit fruit=new Mango();
	fruit.price();
	fruit=new Apple();
	fruit.price();
	
	Car car=new Mustang();
	car.name();
	car=new Audi();
	car.name();
		
	Furniture furniture= new Chair();
	furniture.brand();
	furniture=new Table();
	furniture.brand();
		
	Fan fan=new Bajaj();
	fan.price();
//	fan=new Orient();
//	fan.price();
//	
	Bajaj b= (Bajaj) fan;
	b.price();
}
}
