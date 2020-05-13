package MVC;

import controllers.C_karyawan;

import views.V_petunjuk_K;

public class VC_petunjuk_k {
    V_petunjuk_K v_petunjuk_k = new V_petunjuk_K();
    C_karyawan c_karyawan = new C_karyawan(v_petunjuk_k);
}
