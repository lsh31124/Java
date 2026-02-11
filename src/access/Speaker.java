package access;

public class Speaker {
   private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없다 최대 음양");
        } else {
            volume += 10;
            System.out.println("을량을 10 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolumle() {
        System.out.println("현재 음량" + volume);
    }
    }
