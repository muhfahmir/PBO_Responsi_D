package MVC;

import controllers.C_login;
import views.V_login;

public class VC_login {
    V_login v_login = new V_login();
    C_login c_karyawan = new C_login(v_login);
}
