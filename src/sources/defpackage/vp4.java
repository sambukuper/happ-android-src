package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vp4 implements rs0, Serializable {
    public final long X;
    public final l20 Y;

    static {
        ep3 ep3Var = ep3.g0;
        no3 no3Var = no3.k0;
    }

    public vp4(wp4 wp4Var, long j) {
        this.Y = wp4Var.Y;
        this.X = j;
    }

    public static int b(Class cls) {
        int iB = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            m11 m11Var = (m11) obj;
            if (m11Var.a()) {
                iB |= m11Var.b();
            }
        }
        return iB;
    }

    public final dh8 c(Class cls) {
        return this.Y.X.b(null, cls, uh8.f0);
    }

    public final m85 d() {
        return f(xp4.Z) ? this.Y.Z : z55.X;
    }

    public abstract boolean e(nb1 nb1Var);

    public final boolean f(xp4 xp4Var) {
        return (xp4Var.Y & this.X) != 0;
    }

    public vp4(l20 l20Var, long j) {
        this.Y = l20Var;
        this.X = j;
    }
}
