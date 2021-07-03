public class Main {

    public static void main(String[] args){
        //execArray();
        //execMatrix();

        Output o = new EDTOutput();
        FileInput fi = new FileInput("resources/input.txt");
        EDT edt = new EDT();
        edt.setup(10,5, fi,o);
        NormalParser np = new NormalParser(edt);
        InsertParser ip = new InsertParser(edt);
        edt.setupNormalParser(np);
        edt.setupInsertParser(ip);
        edt.run();
    }

    static void execArray(){
        Output out = new DecoratedOutput();
        Array a = new Array(10,new Char('x', out), out);
        a.ins(3,new Char('h', out));
        a.ins(4,new Char('o', out));
        a.ins(5,new Char('l', out));
        a.ins(8,new Char('a', out));
        a.print();
        a.del(6);
        a.del(6);
        a.print();
    }

    static void execMatrix() {
        Output out = new DecoratedOutput();
        Matrix m = new Matrix(10, 5, new Char(' ', out), out);
        m.setOutput(out);
        m.ins(2, 3, new Char('h', out));
        m.ins(3, 3, new Char('o', out));
        m.ins(4, 3, new Char('l', out));
        m.ins(6, 3, new Char('a', out));
        m.del(5, 3);
        m.del(2);
        m.print();
    }
}