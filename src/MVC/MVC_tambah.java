package MVC;

import controllers.C_tambah;
import models.M_admin;
import views.V_tambah;

public class MVC_tambah {
    V_tambah v_tambah = new V_tambah();
    M_admin m_admin = new M_admin();
    C_tambah c_tambah =new C_tambah(v_tambah,m_admin);
}
