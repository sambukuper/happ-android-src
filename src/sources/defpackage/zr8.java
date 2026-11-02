package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zr8 {
    public static final vz7 a = new vz7(new ng8((byte) 5));
    public static final vz7 b = new vz7(new ng8((byte) 6));
    public static final vz7 c = new vz7(new ng8((byte) 7));
    public static final gb3 d = new gb3(null, null, null, null);

    public static final void a(wr8 wr8Var, g09 g09Var, gn2 gn2Var) {
        int iOrdinal = g09Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z68.v0(wr8Var, _UrlKt.FRAGMENT_ENCODE_SET, new pr2(gn2Var, (byte) 26));
            } else if (iOrdinal == 2) {
                gn2Var.B(wr8Var);
            } else {
                b61.c();
            }
        }
    }
}
