package MultiLevelInhertance;

public class Box {
    int l;
    int h;
    int w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(int side) {
        System.out.println("This is the Box Class");
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box other) {
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }
}
