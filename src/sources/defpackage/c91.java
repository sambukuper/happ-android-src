package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c91 extends w45 {
    public final /* synthetic */ byte o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Serializable q;

    public c91(ea6 ea6Var, gn2 gn2Var) {
        this.o = (byte) 1;
        this.q = ea6Var;
        this.p = gn2Var;
    }

    @Override // defpackage.w45
    public final Object R() {
        byte b = this.o;
        Object obj = this.q;
        switch (b) {
            case 0:
                return Boolean.valueOf(((boolean[]) obj)[0]);
            case 1:
                return (ld0) ((ea6) obj).X;
            default:
                ts3 ts3Var = (ts3) ((ea6) obj).X;
                return ts3Var == null ? ts3.f0 : ts3Var;
        }
    }

    @Override // defpackage.w45
    public void i(Object obj) {
        switch (this.o) {
            case 1:
                ld0 ld0Var = (ld0) obj;
                ld0Var.getClass();
                ea6 ea6Var = (ea6) this.q;
                if (ea6Var.X == null && ((Boolean) ((gn2) this.p).B(ld0Var)).booleanValue()) {
                    ea6Var.X = ld0Var;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.w45
    public final boolean j(Object obj) {
        byte b = this.o;
        Object obj2 = this.p;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                if (((Boolean) ((gn2) obj2).B(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                ((ld0) obj).getClass();
                return ((ea6) obj3).X == null;
            default:
                sx4 sx4Var = (sx4) obj;
                ea6 ea6Var = (ea6) obj3;
                sx4Var.getClass();
                String str = (String) obj2;
                String str2 = ll3.a;
                qs0 qs0VarH = ll3.h(el1.g(sx4Var).a);
                String str3 = (qs0VarH != null ? zs3.b(qs0VarH) : z51.t(sx4Var, qe4.A0)) + '.' + str;
                if (xs3.b.contains(str3)) {
                    ea6Var.X = ts3.X;
                } else if (xs3.d.contains(str3)) {
                    ea6Var.X = ts3.Y;
                } else if (xs3.c.contains(str3)) {
                    ea6Var.X = ts3.Z;
                } else if (xs3.a.contains(str3)) {
                    ea6Var.X = ts3.g0;
                }
                return ea6Var.X == null;
        }
    }

    public /* synthetic */ c91(Object obj, Serializable serializable, byte b) {
        this.o = b;
        this.p = obj;
        this.q = serializable;
    }
}
