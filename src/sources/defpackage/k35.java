package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k35 implements v82 {
    public final vz7 a;
    public final vz7 b;
    public final xd6 c;
    public final vz7 d;

    public k35(dw4 dw4Var) {
        dw4 dw4Var2 = new dw4((byte) 10);
        j35 j35Var = j35.X;
        dw4 dw4Var3 = new dw4((byte) 11);
        this.a = new vz7(dw4Var);
        this.b = x97.Q(dw4Var2);
        xd6 xd6Var = new xd6((byte) 9);
        xd6Var.Y = j35Var;
        xd6Var.Z = qe4.B0;
        this.c = xd6Var;
        this.d = x97.Q(dw4Var3);
    }

    @Override // defpackage.v82
    public final w82 a(Object obj, pd5 pd5Var, v76 v76Var) {
        dq8 dq8Var = (dq8) obj;
        if (!dh3.f(dq8Var.c, "http") && !dh3.f(dq8Var.c, "https")) {
            return null;
        }
        String str = dq8Var.a;
        vz7 vz7Var = this.a;
        vz7 vz7Var2 = new vz7(new tb2(v76Var, (byte) 25));
        vz7 vz7Var3 = this.b;
        xd6 xd6Var = this.c;
        Context context = pd5Var.a;
        Object obj2 = xd6Var.Z;
        qe4 qe4Var = qe4.B0;
        if (obj2 == qe4Var) {
            synchronized (xd6Var) {
                obj2 = xd6Var.Z;
                if (obj2 == qe4Var) {
                    gn2 gn2Var = (gn2) xd6Var.Y;
                    gn2Var.getClass();
                    Object objB = gn2Var.B(context);
                    xd6Var.Z = objB;
                    xd6Var.Y = null;
                    obj2 = objB;
                }
            }
        }
        return new o35(str, pd5Var, vz7Var, vz7Var2, vz7Var3, new qc3(obj2), this.d);
    }
}
