package defpackage;

import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f59 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ f59(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                h59 h59Var = (h59) obj3;
                zy0 zy0Var = (zy0) obj2;
                xz0 xz0Var = (xz0) obj;
                if (!h59Var.Z) {
                    d94 d94VarD = xz0Var.d();
                    View view = xz0Var.a;
                    g94 h0 = d94VarD.getH0();
                    h59Var.g0 = zy0Var;
                    if (h59Var.f0 != null) {
                        if (h0.i.compareTo(o84.Z) >= 0) {
                            h59Var.Y.A(new zy0(-1723985096, true, new fh((Object) h59Var, (Object) xz0Var, (Object) zy0Var, (byte) 24)));
                        }
                    } else if (!dh3.f(Looper.myLooper(), view.getHandler().getLooper())) {
                        view.post(new sc4(h59Var, h0, (byte) 20));
                    } else {
                        h59Var.f0 = h0;
                        h0.a(h59Var);
                    }
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                ((un5) obj3).getClass();
                un5.d(jLongValue, (String) obj2);
                break;
        }
        return dn8Var;
    }
}
