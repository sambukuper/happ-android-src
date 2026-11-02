package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hz8 implements Serializable {
    public static final hz8 h0;
    public static final hz8 i0;
    public final hn3 X;
    public final hn3 Y;
    public final hn3 Z;
    public final hn3 f0;
    public final hn3 g0;

    static {
        hn3 hn3Var = hn3.X;
        hn3 hn3Var2 = hn3.Y;
        h0 = new hz8(hn3Var2, hn3Var2, hn3Var, hn3Var, hn3Var2);
        i0 = new hz8(hn3Var2, hn3Var2, hn3Var2, hn3Var2, hn3Var2);
    }

    public hz8(hn3 hn3Var, hn3 hn3Var2, hn3 hn3Var3, hn3 hn3Var4, hn3 hn3Var5) {
        this.X = hn3Var;
        this.Y = hn3Var2;
        this.Z = hn3Var3;
        this.f0 = hn3Var4;
        this.g0 = hn3Var5;
    }

    public final String toString() {
        return "[Visibility: getter=" + this.X + ",isGetter=" + this.Y + ",setter=" + this.Z + ",creator=" + this.f0 + ",field=" + this.g0 + "]";
    }
}
