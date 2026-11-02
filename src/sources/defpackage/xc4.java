package defpackage;

import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class xc4 extends xw8 {
    public static final ol2 c = new ol2((byte) 1);
    public final ue7 b = new ue7(0);

    @Override // defpackage.xw8
    public final void d() {
        ue7 ue7Var = this.b;
        int i = ue7Var.Z;
        if (i > 0) {
            ue7Var.e(0).getClass();
            c2.m();
            return;
        }
        Object[] objArr = ue7Var.Y;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        ue7Var.Z = 0;
    }
}
