package controller;

import view.Field;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by trakhov-pc on 19.05.17.
 */
public class ArrangeShips extends model.ArrangeShips {
    private model.ArrangeShips arrangeShips;

    public ArrangeShips(model.ArrangeShips arrangeShips) {

        this.arrangeShips = arrangeShips;
        this.arrangeShips.addListener(new A1(), 0);
        this.arrangeShips.addListener(new A2(), 1);
        this.arrangeShips.addListener(new A3(), 2);
        this.arrangeShips.addListener(new A4(), 3);
        this.arrangeShips.addListener(new A5(), 4);
        this.arrangeShips.addListener(new A6(), 5);
        this.arrangeShips.addListener(new A7(), 6);
        this.arrangeShips.addListener(new A8(), 7);
        this.arrangeShips.addListener(new A9(), 8);
        this.arrangeShips.addListener(new A10(), 9);

        this.arrangeShips.addListener(new B1(), 10);
        this.arrangeShips.addListener(new B2(), 11);
        this.arrangeShips.addListener(new B3(), 12);
        this.arrangeShips.addListener(new B4(), 13);
        this.arrangeShips.addListener(new B5(), 14);
        this.arrangeShips.addListener(new B6(), 15);
        this.arrangeShips.addListener(new B7(), 16);
        this.arrangeShips.addListener(new B8(), 17);
        this.arrangeShips.addListener(new B9(), 18);
        this.arrangeShips.addListener(new B10(), 19);

        this.arrangeShips.addListener(new C1(), 20);
        this.arrangeShips.addListener(new C2(), 21);
        this.arrangeShips.addListener(new C3(), 22);
        this.arrangeShips.addListener(new C4(), 23);
        this.arrangeShips.addListener(new C5(), 24);
        this.arrangeShips.addListener(new C6(), 25);
        this.arrangeShips.addListener(new C7(), 26);
        this.arrangeShips.addListener(new C8(), 27);
        this.arrangeShips.addListener(new C9(), 28);
        this.arrangeShips.addListener(new C10(), 29);

        this.arrangeShips.addListener(new D1(), 30);
        this.arrangeShips.addListener(new D2(), 31);
        this.arrangeShips.addListener(new D3(), 32);
        this.arrangeShips.addListener(new D4(), 33);
        this.arrangeShips.addListener(new D5(), 34);
        this.arrangeShips.addListener(new D6(), 35);
        this.arrangeShips.addListener(new D7(), 36);
        this.arrangeShips.addListener(new D8(), 37);
        this.arrangeShips.addListener(new D9(), 38);
        this.arrangeShips.addListener(new D10(), 39);

        this.arrangeShips.addListener(new E1(), 40);
        this.arrangeShips.addListener(new E2(), 41);
        this.arrangeShips.addListener(new E3(), 42);
        this.arrangeShips.addListener(new E4(), 43);
        this.arrangeShips.addListener(new E5(), 44);
        this.arrangeShips.addListener(new E6(), 45);
        this.arrangeShips.addListener(new E7(), 46);
        this.arrangeShips.addListener(new E8(), 47);
        this.arrangeShips.addListener(new E9(), 48);
        this.arrangeShips.addListener(new E10(), 49);

        this.arrangeShips.addListener(new F1(), 50);
        this.arrangeShips.addListener(new F2(), 51);
        this.arrangeShips.addListener(new F3(), 52);
        this.arrangeShips.addListener(new F4(), 53);
        this.arrangeShips.addListener(new F5(), 54);
        this.arrangeShips.addListener(new F6(), 55);
        this.arrangeShips.addListener(new F7(), 56);
        this.arrangeShips.addListener(new F8(), 57);
        this.arrangeShips.addListener(new F9(), 58);
        this.arrangeShips.addListener(new F10(), 59);

        this.arrangeShips.addListener(new G1(), 60);
        this.arrangeShips.addListener(new G2(), 61);
        this.arrangeShips.addListener(new G3(), 62);
        this.arrangeShips.addListener(new G4(), 63);
        this.arrangeShips.addListener(new G5(), 64);
        this.arrangeShips.addListener(new G6(), 65);
        this.arrangeShips.addListener(new G7(), 66);
        this.arrangeShips.addListener(new G8(), 67);
        this.arrangeShips.addListener(new G9(), 68);
        this.arrangeShips.addListener(new G10(), 69);

        this.arrangeShips.addListener(new H1(), 70);
        this.arrangeShips.addListener(new H2(), 71);
        this.arrangeShips.addListener(new H3(), 72);
        this.arrangeShips.addListener(new H4(), 73);
        this.arrangeShips.addListener(new H5(), 74);
        this.arrangeShips.addListener(new H6(), 75);
        this.arrangeShips.addListener(new H7(), 76);
        this.arrangeShips.addListener(new H8(), 77);
        this.arrangeShips.addListener(new H9(), 78);
        this.arrangeShips.addListener(new H10(), 79);

        this.arrangeShips.addListener(new I1(), 80);
        this.arrangeShips.addListener(new I2(), 81);
        this.arrangeShips.addListener(new I3(), 82);
        this.arrangeShips.addListener(new I4(), 83);
        this.arrangeShips.addListener(new I5(), 84);
        this.arrangeShips.addListener(new I6(), 85);
        this.arrangeShips.addListener(new I7(), 86);
        this.arrangeShips.addListener(new I8(), 87);
        this.arrangeShips.addListener(new I9(), 88);
        this.arrangeShips.addListener(new I10(), 89);

        this.arrangeShips.addListener(new J1(), 90);
        this.arrangeShips.addListener(new J2(), 91);
        this.arrangeShips.addListener(new J3(), 92);
        this.arrangeShips.addListener(new J4(), 93);
        this.arrangeShips.addListener(new J5(), 94);
        this.arrangeShips.addListener(new J6(), 95);
        this.arrangeShips.addListener(new J7(), 96);
        this.arrangeShips.addListener(new J8(), 97);
        this.arrangeShips.addListener(new J9(), 98);
        this.arrangeShips.addListener(new J10(), 99);
        this.arrangeShips.addButtonListener(new TB());
        this.arrangeShips.setVisibl();
        dispose();
    }

    private class TB implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           arrangeShips.actionbutton();
        }
    }
    private class A1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e,0);
        }
    }
    private class A2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 1);
        }
    }
    private class A3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 2);
        }
    }
    private class A4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 3);
        }
    }
    private class A5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 4);
        }
    }
    private class A6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 5);
        }
    }
    private class A7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 6);
        }
    }
    private class A8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 7);
        }
    }
    private class A9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 8);
        }

    }
    private class A10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 9);
        }

    }
    private class B1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 10);
        }

    }
    private class B2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 11);
        }

    }
    private class B3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 12);
        }

    }
    private class B4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 13);
        }

    }private class B5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 14);
        }

    }private class B6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 15);
        }

    }private class B7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 16);
        }

    }private class B8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 17);
        }

    }private class B9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 18);
        }

    }private class B10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 19);
        }

    }private class C1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 20);
        }

    }private class C2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 21);
        }

    }private class C3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 22);
        }

    }private class C4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 23);
        }

    }private class C5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 24);
        }

    }private class C6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 25);
        }

    }private class C7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 26);
        }

    }private class C8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 27);
        }

    }private class C9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 28);
        }

    }private class C10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 29);
        }

    }private class D1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 30);
        }

    }private class D2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 31);
        }

    }private class D3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 32);
        }

    }private class D4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 33);
        }

    }private class D5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 34);
        }

    }private class D6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 35);
        }

    }private class D7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 36);
        }

    }private class D8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 37);
        }

    }private class D9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 38);
        }

    }private class D10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 39);
        }

    }private class E1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 40);
        }

    }private class E2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 41);
        }

    }
    private class E3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 42);
        }

    }
    private class E4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 43);
        }

    }
    private class E5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 44);
        }

    }
    private class E6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 45);
        }

    }
    private class E7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 46);
        }

    }
    private class E8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 47);
        }

    }
    private class E9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 48);
        }

    }
    private class E10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 49);
        }

    }
    private class F1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 50);
        }

    }
    private class F2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 51);
        }

    }
    private class F3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 52);
        }

    }
    private class F4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 53);
        }

    }
    private class F5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 54);
        }

    }
    private class F6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 55);
        }

    }
    private class F7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 56);
        }

    }
    private class F8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 57);
        }

    }
    private class F9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 58);
        }

    }
    private class F10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 59);
        }

    }
    private class G1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 60);
        }

    }
    private class G2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 61);
        }

    }
    private class G3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 62);
        }

    }
    private class G4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 63);
        }

    }
    private class G5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 64);
        }

    }
    private class G6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 65);
        }

    }
    private class G7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 66);
        }

    }
    private class G8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 67);
        }

    }
    private class G9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 68);
        }

    }
    private class G10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 69);
        }

    }
    private class H1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 70);
        }

    }
    private class H2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 71);
        }

    }
    private class H3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 72);
        }

    }
    private class H4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 73);
        }

    }
    private class H5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 74);
        }

    }
    private class H6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 75);
        }

    }
    private class H7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 76);
        }

    }
    private class H8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 77);
        }

    }
    private class H9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 78);
        }

    }
    private class H10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 79);
        }

    }
    private class I1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 80);
        }

    }
    private class I2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 81);
        }

    }
    private class I3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 82);
        }

    }
    private class I4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 83);
        }

    }
    private class I5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 84);
        }

    }
    private class I6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 85);
        }

    }
    private class I7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 86);
        }

    }
    private class I8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 87);
        }

    }
    private class I9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 88);
        }

    }
    private class I10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 89);
        }

    }
    private class J1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 90);
        }

    }
    private class J2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 91);
        }

    }
    private class J3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 92);
        }

    }
    private class J4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 93);
        }

    }
    private class J5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 94);
        }

    }
    private class J6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 95);
        }

    }
    private class J7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 96);
        }

    }
    private class J8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 97);
        }

    }
    private class J9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 98);
        }

    }
    private class J10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            arrangeShips.action(e, 99);
        }
    }
}
