package MVC;

import controllers.C_admin;
import views.V_admin;

public class VC_admin {
    V_admin v_admin = new V_admin();
    C_admin c_admin = new C_admin(v_admin);
}
