package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student johnSmith = new Student("John Smith");
        Student ivoneEscobar = new Student("Ivone Escobar");
        Student jessiePinkman = new Student("Jessie Pinkman");
        Student williamHargood = new Student("William Hargood");
        Student horatioHornblower = new Student("Horatio Hornblower");
        Student nataliaNiemen = new Student("Natalia Niemen");

        Mentor horatioNelson = new Mentor("Horatio Nelson");
        Mentor stanBorys = new Mentor("Stan Borys");
        Mentor baruchSpinoza = new Mentor("Baruch Spinoza");

        johnSmith.myHomeworks.registerObserver(baruchSpinoza);
        ivoneEscobar.myHomeworks.registerObserver(horatioNelson);
        jessiePinkman.myHomeworks.registerObserver(baruchSpinoza);
        williamHargood.myHomeworks.registerObserver(horatioNelson);
        horatioHornblower.myHomeworks.registerObserver(horatioNelson);
        nataliaNiemen.myHomeworks.registerObserver(stanBorys);
        //When
        johnSmith.myHomeworks.addHomework("Zadanie 1");
        williamHargood.myHomeworks.addHomework("Zadanie 1");
        nataliaNiemen.myHomeworks.addHomework("Zadanie 1");
        ivoneEscobar.myHomeworks.addHomework("Zadanie 1");
        nataliaNiemen.myHomeworks.addHomework("Zadanie 2");
        johnSmith.myHomeworks.addHomework("Zadanie 2");
        horatioHornblower.myHomeworks.addHomework("Zadanie 1");
        nataliaNiemen.myHomeworks.addHomework("Zadanie 3");
        williamHargood.myHomeworks.addHomework("Zadanie 2");
        jessiePinkman.myHomeworks.addHomework("Zadanie 1");
        johnSmith.myHomeworks.addHomework("Zadanie 3");
        jessiePinkman.myHomeworks.addHomework("Zadanie 2");
        nataliaNiemen.myHomeworks.addHomework("Zadanie 4");
        williamHargood.myHomeworks.addHomework("Zadanie 3");
        //Then
        assertEquals(5, baruchSpinoza.getUpdateCount());
        assertEquals(5, horatioNelson.getUpdateCount());
        assertEquals(4, stanBorys.getUpdateCount());
    }
}
