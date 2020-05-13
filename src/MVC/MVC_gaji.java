package MVC;

import controllers.C_gaji;
import models.M_karyawan;
import views.V_gaji;

public class MVC_gaji {
    V_gaji v_gaji= new V_gaji();
    M_karyawan m_karyawan = new M_karyawan();
    C_gaji C_gaji = new C_gaji(v_gaji,m_karyawan);
}
