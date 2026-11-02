package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xu2 {
    public static final vz7 a = new vz7(new j72((byte) 15));
    public static final vz7 b = new vz7(new j72((byte) 16));

    public static ArrayList a(ox7 ox7Var, ox7 ox7Var2) {
        ArrayList arrayList = new ArrayList();
        nx7 nx7Var = new nx7();
        jl7 jl7Var = rx7.e;
        jl7 jl7Var2 = rx7.e;
        qx7 qx7Var = qx7.X;
        nx7Var.a(we5.f(qx7Var, ox7Var, jl7Var2));
        nx7Var.a(we5.f(qx7.Z, ox7Var2, jl7Var2));
        arrayList.add(nx7Var);
        nx7 nx7Var2 = new nx7();
        nx7Var2.a(we5.f(qx7Var, ox7Var, jl7Var2));
        nx7Var2.a(we5.f(qx7.f0, ox7Var2, jl7Var2));
        arrayList.add(nx7Var2);
        return arrayList;
    }

    public static ArrayList b(jj0 jj0Var, lv8 lv8Var) {
        jj0Var.getClass();
        lv8Var.getClass();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
            key.getClass();
            Object objC = ((lf0) jj0Var).c(key);
            if (objC == null) {
                bt.q("Required value was null.");
                return null;
            }
            int iIntValue = ((Number) objC).intValue();
            if (iIntValue >= 35 && lv8Var != lv8.f0) {
                arrayList.addAll((List) a.getValue());
            }
            if (iIntValue >= 36 && lv8Var != lv8.g0) {
                arrayList.addAll((List) b.getValue());
                return arrayList;
            }
        }
        return arrayList;
    }
}
