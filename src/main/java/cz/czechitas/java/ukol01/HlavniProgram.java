package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args)
  {
    new HlavniProgram().start();
  }
  public void nakresliNozicky() {
    zofka.turnLeft(150);
    zofka.move(19);
    zofka.penUp();
    zofka.turnLeft(120);
    zofka.move(19);
    zofka.penDown();
    zofka.turnLeft(120);
    zofka.move(19);
    zofka.turnRight(30);
  }
  public void nakresliPrasatko() {
    for (int i=0; i<2; i++){
      zofka.move(75);
      zofka.turnRight(90);
      zofka.move(100);
      zofka.turnRight(90);
    } // žofka udělá obdélník tělo
    zofka.turnLeft(60);
    zofka.move(75);
    zofka.turnRight(120);
    zofka.move(75); //žofka udělá trojúhelník hlavu
    zofka.turnRight(120);
    zofka.move(75);
    zofka.turnRight(180);//žofka se přesune na pozici nožiček
    nakresliNozicky();//kreslí žofka, nebo jenom nakresliNozicky?
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(90);//přesun k druhým nožičkám
    nakresliNozicky();

    zofka.move(45);
    zofka.turnRight(60);
    zofka.move(25);
    zofka.turnLeft(60);//ocásek
  }

  public void nakresliOsmihran() {
    zofka.turnLeft(90);
    for (int i=0; i<8; i++) {
      zofka.move(46);
      zofka.turnLeft(45);
    }
    zofka.turnRight(45);
  }

  public void nakresliKolecko() {
    zofka.turnLeft(90);
    for (int i=0; i<16; i++) {
      zofka.move(23);
      zofka.turnLeft(23);
    }
    zofka.turnRight(100);
  }

  public void nakresliSlunicko() {
    zofka.turnLeft(90);
    for (int i=0; i<16; i++) {
      zofka.move(12);
      zofka.turnRight(90);
      zofka.move(20);
      zofka.turnRight(180);
      zofka.move(20);//paprsek
      zofka.turnRight(90);//dokončení úhlu

      zofka.move(12);
      zofka.turnLeft(23);//úhel bez paprsku
    }
    zofka.turnRight(98);
  }
  public void nakresliDomecek() {
    zofka.turnRight(90);
    for (int i=0; i<2; i++){
      zofka.move(75);
      zofka.turnRight(90);
      zofka.move(100);
      zofka.turnRight(90);
    } //tělo domečku
    zofka.turnLeft(60);
    zofka.move(75);
    zofka.turnRight(120);
    zofka.move(75);
zofka.turnLeft(150);
  }
  public void nakresliT (){
    zofka.penUp();

zofka.turnRight(90);
    zofka.move(42);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(32);
    zofka.turnLeft(180);
    zofka.move(65);
    zofka.penUp();
    zofka.move(10);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(180);
  }

  public void nakresliE() {
    zofka.turnRight(90);
    zofka.move(10);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(65);
    zofka.turnRight(180);
    zofka.move(65);
    zofka.turnLeft(90);
    zofka.move(45);
    zofka.turnLeft(90);
    zofka.move(40);
    zofka.turnLeft(180);
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.move(55);
    zofka.turnLeft(90);
    zofka.move(65);
    zofka.penUp();
    zofka.move(10);
    zofka.turnLeft(90);
  }

  public void nakresliR() {
    zofka.turnRight(90);
    zofka.move(10);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(100);
    zofka.turnRight(90);
    for (int i=0; i<8; i++){
      zofka.move(10);
      zofka.turnRight(25);
    }

    zofka.turnLeft(20);
    zofka.turnRight(225);
    zofka.move(75);
    zofka.penUp();
    zofka.turnLeft(45);
    zofka.move(10);
    zofka.turnLeft(90);

  }

  public void nakresliZ() {
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(10);
    zofka.penDown();
    zofka.move(65);
    zofka.turnRight(124);
    zofka.move(119);
    zofka.turnLeft(123);
    zofka.move(65);
    zofka.penUp();
    zofka.move(10);
    zofka.turnLeft(90);
  }

  public void nakresliI() {
    zofka.turnRight(90);
    zofka.move(10);
    zofka.penDown();
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnLeft(180);
    zofka.move(100);
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(10);
    zofka.turnLeft(90);
  }




  public void start()
  {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(90);
    zofka.move(250);
    zofka.penDown();
    nakresliSlunicko();

    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.move(250);
    zofka.turnRight(180);


    for (int i=0; i<5; i++) {
      zofka.penDown();
      nakresliDomecek();
      zofka.penUp();
      zofka.turnRight(90);
      zofka.move(50);
      zofka.turnLeft(90);
    }
    zofka.turnLeft(90);
    zofka.move(125);
    zofka.turnLeft(90);
    zofka.move(225);
    zofka.turnRight(180);
    zofka.penDown();
    nakresliDomecek();
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnLeft(90);
    zofka.move(80);
    zofka.turnLeft(180);
    zofka.penDown();
    nakresliPrasatko();
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(119);
    zofka.turnRight(90);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(275);
    zofka.turnRight(90);
    zofka.penDown();
    nakresliDomecek();
zofka.penUp();

    zofka.turnLeft(90);
    zofka.move(75);
    zofka.turnLeft(90);
    zofka.move(220);
    zofka.turnLeft(180);


    nakresliT();
    nakresliE();
    nakresliR();
    nakresliE();
    nakresliZ();
    nakresliI();
    nakresliE();

  }



}
