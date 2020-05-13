package MVC;

import controllers.C_karyawan;
import models.M_karyawan;
import views.V_karyawan;

public class VC_karyawan {
    V_karyawan v_karyawan = new V_karyawan();
    C_karyawan c_karyawan = new C_karyawan(v_karyawan);
}
