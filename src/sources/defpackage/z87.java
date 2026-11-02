package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z87 extends is2 {
    public final fu6 A;
    public final Bundle B;
    public final Integer C;
    public final boolean z;

    public z87(Context context, Looper looper, fu6 fu6Var, Bundle bundle, ps2 ps2Var, qs2 qs2Var) {
        super(context, looper, 44, fu6Var, ps2Var, qs2Var);
        this.z = true;
        this.A = fu6Var;
        this.B = bundle;
        this.C = (Integer) fu6Var.i0;
    }

    @Override // defpackage.u10
    public final Bundle e() {
        fu6 fu6Var = this.A;
        boolean zEquals = this.c.getPackageName().equals((String) fu6Var.f0);
        Bundle bundle = this.B;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) fu6Var.f0);
        }
        return bundle;
    }

    @Override // defpackage.u10
    public final boolean n() {
        return this.z;
    }
}
