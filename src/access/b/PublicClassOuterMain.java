package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicclass = new PublicClass();

        //다른 패키지 접근 불가
        //DefaultClass defaultclass1 = new DefaultClass();
        //DefaultClass defaultclass2 = new DefaultClass();
    }
}
