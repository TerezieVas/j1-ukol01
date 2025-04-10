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


  public void start()
  {
    zofka = new Turtle();

    //TODO implementace domácího úkolu
    nakresliPrasatko();
  }



}
