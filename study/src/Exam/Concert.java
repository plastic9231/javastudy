package Exam;

import java.util.*;

class Seat {

    private int group;
    private int seatNumber;
    private String name;

    public Seat(int group) {
        this.group = group;
    }

    public void reserve(String name, int seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }

    public void cancel() {
        this.name = null;
        this.seatNumber = -1;
    }

    public boolean isOccupied(int seatNumber) {
        return this.seatNumber == seatNumber;
    }

    public boolean match(String name) {
        return this.name.equals(name);
    }

    public void show() {
        System.out.println("그룹: " + group + ", 번호: " + seatNumber + ", 예약자: " + name);
    }
}

public class Concert {

	private Seat[] seats;

    public Concert() {
        seats = new Seat[3];
        for (int i = 0; i < 3; i++) {
            seats[i] = new Seat(i);
        }
    }

    public void reserve(int group, String name, int seatNumber) {
        if (seats[group].isOccupied(seatNumber)) {
            System.out.println("이미 예약된 좌석입니다.");
            return;
        }
        seats[group].reserve(name, seatNumber);
    }

    public void search() {
        for (Seat seat : seats) {
            seat.show();
        }
    }

    public void cancel(String name) {
        for (Seat seat : seats) {
            if (seat.match(name)) {
                seat.cancel();
                return;
            }
        }
        System.out.println("예약된 좌석이 없습니다.");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 예약 2. 조회 3. 취소 4. 끝내기");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("좌석 타입(S, A, B): ");
                int group = scanner.nextInt();
                System.out.println("예약자 이름: ");
                String name = scanner.next();
                System.out.println("좌석 번호(1~10): ");
                int seatNumber = scanner.nextInt();

                reserve(group, name, seatNumber);
            } else if (menu == 2) {
                search();
            } else if (menu == 3) {
                System.out.println("예약자 이름: ");
                String name = scanner.next();
                cancel(name);
                System.out.println();
            } else if (menu == 4) {
                break;
            }
        }
    }
	
}

