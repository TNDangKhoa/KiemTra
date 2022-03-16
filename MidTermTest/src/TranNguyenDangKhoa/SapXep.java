package TranNguyenDangKhoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SapXep {
    static ArrayList<CD> sapxepgiamdantheogiathanh(ArrayList<CD> dsCD) {
		Collections.sort(dsCD, new Comparator<CD>() {

			public int compare(CD o1, CD o2) {
				return Double.compare(o2.getGiaThanh(), o1.getGiaThanh());
			}

		});
		return dsCD;
    }
    static ArrayList<CD> sapxeptangdantheotuaCD(ArrayList<CD> dsCD) {
		Collections.sort(dsCD, new Comparator<CD>() {

			public int compare(CD o1, CD o2) {
				return Double.compare(o1.getMaCD(), o2.getMaCD());
			}

		});
		return dsCD;
    }
}