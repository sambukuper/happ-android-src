package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nv6 implements kv6, yv6 {
    public final /* synthetic */ lv6 X;
    public g94 Y;
    public xd6 Z;

    public nv6(lv6 lv6Var) {
        this.X = lv6Var;
        Object objE = lv6Var.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objE instanceof Bundle ? (Bundle) objE : null;
        if (bundle != null && this.Z == null) {
            xd6 xd6Var = new xd6(new xv6(this, new hr5(this, (byte) 14)), (byte) 5);
            this.Z = xd6Var;
            xd6Var.x(bundle);
        }
        lv6Var.a("androidx.savedstate.SavedStateRegistry", new hr5(this, (byte) 12));
    }

    @Override // defpackage.kv6
    public final f63 a(String str, dn2 dn2Var) {
        return this.X.a(str, dn2Var);
    }

    @Override // defpackage.kv6
    public final boolean c(Object obj) {
        return this.X.c(obj);
    }

    @Override // defpackage.kv6
    public final Map d() {
        return this.X.d();
    }

    @Override // defpackage.kv6
    public final Object e(String str) {
        return this.X.e(str);
    }

    @Override // defpackage.yv6
    public final xd6 f() {
        xd6 xd6Var = this.Z;
        if (xd6Var == null) {
            xd6 xd6Var2 = new xd6(new xv6(this, new hr5(this, (byte) 14)), (byte) 5);
            this.Z = xd6Var2;
            xd6Var2.x(null);
            xd6Var = xd6Var2;
        }
        return (xd6) xd6Var.Z;
    }

    @Override // defpackage.d94
    /* JADX INFO: renamed from: h */
    public final g94 getH0() {
        g94 g94Var = this.Y;
        if (g94Var != null) {
            return g94Var;
        }
        g94 g94Var2 = new g94(this, false);
        this.Y = g94Var2;
        return g94Var2;
    }
}
