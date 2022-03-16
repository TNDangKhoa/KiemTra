package TranNguyenDangKhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class CDTestDrive {
    public static void main(String[] args) {
        System.out.println("==========CHUONG TRINH TEST QUAN LI CD===========");
		System.out.println("------------MENU CHUC NANG-------------");

        DanhSachCD.danhSachCD();

        ArrayList<Menu> dsmenu = DanhSachCD.danhsachMenu();
        for (int i = 0; i < dsmenu.size(); i++) {
			System.out.println(dsmenu.get(i).tenMenu);
		}

        Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("Choose searching type!: ");
		choice = scanner.nextInt();
        ArrayList<CD> dsCD = DanhSachCD.danhSachCD();
		switch (choice) {
            case 1:
			them(dsCD);
			break;

            case 2:
            sapxep(dsCD);
            break;

            case 3:
            tinh(dsCD);
        }
    }


    
    private static void sapxep(ArrayList<CD> dsCD) {
        System.out.println("Chon kieu sap xep");
        ArrayList<Menu> dsmenusapxep = DanhSachCD.menuSapXep();
        for (int i = 0; i < dsmenusapxep.size(); i++) {
        System.out.println(dsmenusapxep.get(i).tenMenu);
        }
        Scanner scanner = new Scanner(System.in);
        int luachon;
        luachon = scanner.nextInt();
        switch (luachon) {
        case 1:
            sapxepgiamdantheogiathanh(dsCD);
            break;
        case 2:
            sapxeptangdantheotuaCD(dsCD);
            break;
            default:
                System.out.println("khong co! ket thuc chuong trinh...");
            }
    }
    
    private static void them(ArrayList<CD> dsCD) {
        System.out.println("Nhap thong tin CD");
        Scanner scanner = new Scanner(System.in);
        int maCD;
        System.out.print("- Ma CD: ");
        maCD = scanner.nextInt();
    
        String chuoiCD;
        System.out.print("-Chuoi CD: ");
        chuoiCD = scanner.nextLine();
    
        String caSi;
        System.out.print("-Ten ca si: ");
        caSi = scanner.nextLine();

        double giaThanh;
        System.out.print("-Gia: ");
        giaThanh = scanner.nextDouble();
    
        int soBaihat;
        System.out.print("-So luong bai hat ");
        soBaihat = scanner.nextInt();
    
        CD cdThem = new CD(maCD, chuoiCD, caSi, soBaihat, giaThanh);
    
        System.out.println("---Thanh cong---");
        System.out.println("-So luong CD truoc khi them: " + dsCD.size());
    
        dsCD.add(cdThem);
    
        System.out.println("-So luong CD sau khi them: " + dsCD.size());
    
        System.out.println("Chi tiet CD da them:");
        System.out.println("Ma CD: " + cdThem.getMaCD());
        System.out.println("Chuoi CD: " + cdThem.getChuoiCD());
        System.out.println("Ten ca si: " + cdThem.getCaSi());
        System.out.println("Gia thanh: " + cdThem.getGiaThanh());
        System.out.println("So luong bai hat: " + cdThem.getSoBaihat());
    }
    
    private static void sapxepgiamdantheogiathanh(ArrayList<CD> dsCD) {
        System.out.println("DS CD theo gia thanh giam dan");
		ArrayList<CD> dsSapxep = SapXep.sapxepgiamdantheogiathanh(dsCD);
		for (CD cd : dsSapxep) {
			System.out.println("CD: " + cd.getMaCD() + " - " + cd.getGiaThanh());
		}
    }
    
    private static void sapxeptangdantheotuaCD(ArrayList<CD> dsCD) {
        System.out.println("DS CD theo tua CD tang dan");
		ArrayList<CD> dsSapxep = SapXep.sapxeptangdantheotuaCD(dsCD);
		for (CD cd : dsSapxep) {
			System.out.println("CD: " + cd.getMaCD() + " - " + cd.getGiaThanh());
		}
    }

    private static void tinh(ArrayList<CD> dsCD) {
        System.out.println("Chon cach tinh");
		ArrayList<Menu> dsmenutinh = DanhSachCD.danhsachMenutinh();
		for (int i = 0; i < dsmenutinh.size(); i++) {
			System.out.println(dsmenutinh.get(i).tenMenu);
		}
		Scanner scanner = new Scanner(System.in);
		int luachon;
        luachon = scanner.nextInt();
        switch (luachon) {
            case 1:
                tinhtongsoluongCD(dsCD);
                break;
            case 2:
                tinhtonggiathanhcuacacCD(dsCD);
                break;
            default:
                System.out.println("khong co! ket thuc chuong trinh...");
            }
    
    }



    private static void tinhtonggiathanhcuacacCD(ArrayList<CD> dsCD) {
        Tinh.tinhtonggiathanhcuacacCD(dsCD);
    }



    private static void tinhtongsoluongCD(ArrayList<CD> dsCD) {
        System.out.println("Tong so luong CD: " + Tinh.tinhtongsoluongCD(dsCD));
    }

}
