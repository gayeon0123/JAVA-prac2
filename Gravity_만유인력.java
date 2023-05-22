package 실습연습;

public class Gravity_만유인력 {
    public static void main(String[] args) {

                double G = 6.67384E-11; // 중력 상수
                double m1 = 5.9722E24; // 지구 질량
                double m2 = 7.342E22; // 달 질량
                double r = 384400000.0; // 지구와 달 사이의 거리

                double F = G * m1 * m2 / (r * r); // 중력 크기 계산
                System.out.println("지구와 달 사이의 중력: " + F + " N"); // 결과 출력
            }
        }

