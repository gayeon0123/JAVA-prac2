package 교재.제어흐름_4;

public class 교통신호등_enum_276 {

        enum TrafficLight {
            Red(30), Amber(10), Green(30);
            int seconds;

            TrafficLight(int seconds) {
                this.seconds = seconds;
            }

            int getSeconds() {
                return seconds;
            }

        }

    public static void main(String[] args) {

            for(TrafficLight light : TrafficLight.values()) {
                System.out.printf("%s: 유지 시간: %d\n", light, light.getSeconds());
            }
    }

}
