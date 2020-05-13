package MVC;

import controllers.C_admin;
import controllers.C_data_A;
import models.M_admin;
import views.V_data_A;

public class MVC_data_A {
    V_data_A v_data_a= new V_data_A();
    M_admin m_admin = new M_admin();
    C_data_A c_data_a = new C_data_A(v_data_a,m_admin);
}
