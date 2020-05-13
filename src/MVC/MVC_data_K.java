package MVC;

import controllers.C_data_K;
import models.M_karyawan;
import views.V_data_K;

public class MVC_data_K {
    V_data_K v_data_k = new V_data_K();
    M_karyawan m_karyawan = new M_karyawan();
    C_data_K c_data_k = new C_data_K(v_data_k,m_karyawan);
}
