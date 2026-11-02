package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ix5 implements Serializable {
    public static final ix5 h0 = new ix5(Boolean.TRUE, null, null, null, null, null, null);
    public static final ix5 i0 = new ix5(Boolean.FALSE, null, null, null, null, null, null);
    public static final ix5 j0 = new ix5(null, null, null, null, null, null, null);
    public final Boolean X;
    public final Integer Y;
    public final String Z;
    public final m75 f0;
    public final m75 g0;

    public ix5(Boolean bool, String str, Integer num, String str2, zc1 zc1Var, m75 m75Var, m75 m75Var2) {
        this.X = bool;
        this.Y = num;
        this.Z = (str2 == null || str2.isEmpty()) ? null : str2;
        this.f0 = m75Var;
        this.g0 = m75Var2;
    }
}
