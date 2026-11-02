package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z64 {
    public final j74 a;
    public final y64 b;
    public final k44 c;
    public final ne d;

    public z64(j74 j74Var, y64 y64Var, k44 k44Var, ne neVar) {
        this.a = j74Var;
        this.b = y64Var;
        this.c = k44Var;
        this.d = neVar;
    }

    public final void a(int i, Object obj, lp2 lp2Var, int i2) {
        int i3;
        Object obj2;
        lp2 lp2Var2;
        lp2Var.X(-462424778);
        int i4 = (lp2Var.d(i) ? 4 : 2) | i2 | (lp2Var.h(obj) ? 32 : 16) | (lp2Var.f(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        byte b = 1;
        if (lp2Var.N(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            lp2Var2 = lp2Var;
            vj8.k(obj2, i3, this.a.u0, jm4.U(-824725566, new gx2(this, i, b), lp2Var), lp2Var2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new g64(this, i3, obj2, i2);
        }
    }

    public final Object b(int i) {
        y64 y64Var = this.b;
        y64Var.getClass();
        rg3 rg3VarD = y64Var.a.d(i);
        return ((gn2) rg3VarD.c.Z).B(Integer.valueOf(i - rg3VarD.a));
    }

    public final int c() {
        y64 y64Var = this.b;
        y64Var.getClass();
        return y64Var.a.b;
    }

    public final Object d(int i) {
        Object objB;
        ne neVar = this.d;
        Object[] objArr = (Object[]) neVar.d;
        int i2 = i - neVar.b;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        y64 y64Var = this.b;
        y64Var.getClass();
        rg3 rg3VarD = y64Var.a.d(i);
        int i3 = i - rg3VarD.a;
        gn2 gn2Var = (gn2) rg3VarD.c.Y;
        return (gn2Var == null || (objB = gn2Var.B(Integer.valueOf(i3))) == null) ? new gf1(i) : objB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z64)) {
            return false;
        }
        return dh3.f(this.b, ((z64) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
