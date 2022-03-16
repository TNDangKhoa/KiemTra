package TranNguyenDangKhoa;

import java.util.ArrayList;

public class DanhSachCD {
    public static ArrayList<CD> danhSachCD(){
        ArrayList<CD> dsCD = new ArrayList<CD>();
        dsCD.add(new CD(001, "nhac dong que", "Thu Hien", 15, 10_000));
        dsCD.add(new CD(002, "nhac tre", "Son Tung MTV", 5, 8_000));
        return dsCD;
    }

    public static ArrayList<Menu> danhsachMenu() {
		// menu them, xoa, sua
		ArrayList<Menu> dsMenu = new ArrayList<Menu>();
		dsMenu.add(new Menu(1, "1. Them"));
		dsMenu.add(new Menu(2, "2. Sap xep"));
		dsMenu.add(new Menu(3, "3. Tinh"));
		return dsMenu;
	}

    public static ArrayList<Menu> menuSapXep() {
		ArrayList<Menu> dsmenusapxep = new ArrayList<Menu>();
		dsmenusapxep.add(new Menu(1, "1. Sap xep giam dan theo gia thanh"));
		dsmenusapxep.add(new Menu(2, "2. Sap xep tang dan theo tua CD"));
		return dsmenusapxep;
	}
	
	public static ArrayList<Menu> danhsachMenutinh() {
		ArrayList<Menu> dsmenuthongke = new ArrayList<Menu>();
		dsmenuthongke.add(new Menu(1, "1. Tong so luong CD"));
		dsmenuthongke.add(new Menu(2, "2. Tong gia tthanh cua cac CD"));
		return dsmenuthongke;
	}
}
