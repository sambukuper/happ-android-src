package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kp0 implements wo2 {
    public final s61 X;
    public final int Y;
    public final l90 Z;

    public kp0(s61 s61Var, int i, l90 l90Var) {
        this.X = s61Var;
        this.Y = i;
        this.Z = l90Var;
    }

    @Override // defpackage.xe2
    public Object a(ze2 ze2Var, q51 q51Var) {
        Object objN = gv3.n(new r0(ze2Var, this, null, (byte) 9), q51Var);
        return objN == c71.X ? objN : dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.wo2
    public final xe2 b(s61 s61Var, int i, l90 l90Var) {
        s61 s61Var2 = this.X;
        s61 s61VarB0 = s61Var.B0(s61Var2);
        l90 l90Var2 = l90.X;
        l90 l90Var3 = this.Z;
        int i2 = this.Y;
        if (l90Var == l90Var2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            l90Var = l90Var3;
        }
        return (dh3.f(s61VarB0, s61Var2) && i == i2 && l90Var == l90Var3) ? this : f(s61VarB0, i, l90Var);
    }

    public abstract Object d(kv5 kv5Var, q51 q51Var);

    public abstract kp0 f(s61 s61Var, int i, l90 l90Var);

    public xe2 h() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        b02 b02Var = b02.X;
        s61 s61Var = this.X;
        if (s61Var != b02Var) {
            arrayList.add("context=" + s61Var);
        }
        int i = this.Y;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        l90 l90Var = l90.X;
        l90 l90Var2 = this.Z;
        if (l90Var2 != l90Var) {
            arrayList.add("onBufferOverflow=" + l90Var2);
        }
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return oi0.o(sb, wv0.y0(arrayList, ", ", null, null, null, 62), ']');
    }
}
