package com.company;

public class Main {

    public static void main(String[] args) {
	// нициализируем массив участников
        RunJamp[] participants = new RunJamp[15];
        for (int i = 0; i <participants.length ; i++) {
            if(i<6){
                participants[i]= new Man();
            }
            if((i>=6) && (i<11)){
                participants[i]= new Robot();
            }
            if(i>=11){
                participants[i] = new Cat();
            }
        }
        //инициализируем препятствия
        Obstacle[] obstacles = new Obstacle[6];
        for (int i = 0; i < obstacles.length; i++) {
            if( i % 2 == 0 ){
                obstacles[i] = new Treadmill();
            } else {
                obstacles[i] = new Wall();
            }
        }
        // отправляем участников проходить препятствия
        for (int i = 0; i <participants.length ; i++) {
            for (int j = 0; j <obstacles.length ; j++) {
                boolean result = obstacles[j].overcome(participants[i]);
                if(!result){
                    break;
                }
            }
        }
    }

}
