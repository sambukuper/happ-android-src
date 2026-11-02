package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.google.gson.a;
import su.happ.proxyutility.dto.SocketServerInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xn1 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ eo1 Y;

    public /* synthetic */ xn1(eo1 eo1Var, byte b) {
        this.X = b;
        this.Y = eo1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        q51 q51Var = null;
        dn8 dn8Var = dn8.a;
        eo1 eo1Var = this.Y;
        switch (b) {
            case 0:
                Application application = eo1Var.M().getApplication();
                application.getClass();
                a aVar = new a();
                Bundle bundle = eo1Var.h0;
                String string = bundle != null ? bundle.getString("socket_server_info") : null;
                if (string == null) {
                    bt.q("Required value was null.");
                    return null;
                }
                Object objC = aVar.c(string, new yi8(SocketServerInfo.class));
                objC.getClass();
                return new f27(application, (SocketServerInfo) objC);
            case 1:
                return jm4.a0(w51.t(new co1(eo1Var.Z().f, (byte) 0)), ys0.z(eo1Var.S0), h87.a, km5.f0);
            case 2:
                return new dw7((mh7) eo1Var.u1.getValue(), null, new yn1(2, eo1Var.Z(), l27.class, "onSubChecked", "onSubChecked-N_SCOKg(Ljava/lang/String;Z)V", 0, (byte) 0), new vb(3, eo1Var.Z(), l27.class, "onServerChecked", "onServerChecked-S0IonpA(Ljava/lang/String;Ljava/lang/String;Z)V", 0, (byte) 6), null, new d0(1, eo1Var.Z(), l27.class, "onChangedExpanded", "onChangedExpanded-PzuDCJM(Ljava/lang/String;)V", 0, (byte) 9), null, 164);
            case 3:
                eo1Var.R(false, false);
                return dn8Var;
            case 4:
                jm4.Q(i21.H(eo1Var), null, new zn1(eo1Var, q51Var, (byte) 1), 3);
                return dn8Var;
            case 5:
                eo1Var.R(false, false);
                return dn8Var;
            case 6:
                eo1Var.R(false, false);
                return dn8Var;
            default:
                eo1Var.R(false, false);
                return dn8Var;
        }
    }
}
