package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y76 {
    public final m76 a;
    public final ArrayList b;
    public final int c;
    public final wg d;
    public final y5 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public y76(m76 m76Var, ArrayList arrayList, int i, wg wgVar, y5 y5Var, int i2, int i3, int i4) {
        this.a = m76Var;
        this.b = arrayList;
        this.c = i;
        this.d = wgVar;
        this.e = y5Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static y76 a(y76 y76Var, int i, wg wgVar, y5 y5Var, int i2) {
        if ((i2 & 1) != 0) {
            i = y76Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            wgVar = y76Var.d;
        }
        wg wgVar2 = wgVar;
        if ((i2 & 4) != 0) {
            y5Var = y76Var.e;
        }
        y5 y5Var2 = y5Var;
        int i4 = y76Var.f;
        int i5 = y76Var.g;
        int i6 = y76Var.h;
        y5Var2.getClass();
        return new y76(y76Var.a, y76Var.b, i3, wgVar2, y5Var2, i4, i5, i6);
    }

    public final zf6 b(y5 y5Var) {
        y5Var.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            bt.i("Check failed.");
            return null;
        }
        this.i++;
        wg wgVar = this.d;
        if (wgVar != null) {
            p42 p42Var = (p42) wgVar.c;
            u23 u23Var = (u23) y5Var.Y;
            p42Var.getClass();
            u23Var.getClass();
            u23 u23Var2 = p42Var.b.h;
            if (u23Var.e != u23Var2.e || !dh3.f(u23Var.d, u23Var2.d)) {
                om0.l("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.i != 1) {
                om0.l("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        y76 y76VarA = a(this, i2, null, y5Var, 58);
        zf3 zf3Var = (zf3) arrayList.get(i);
        zf6 zf6VarA = zf3Var.a(y76VarA);
        if (zf6VarA == null) {
            throw new NullPointerException("interceptor " + zf3Var + " returned null");
        }
        if (wgVar != null && i2 < arrayList.size() && y76VarA.i != 1) {
            om0.l("network interceptor ", zf3Var, " must call proceed() exactly once");
            return null;
        }
        if (zf6VarA.i0 != null) {
            return zf6VarA;
        }
        om0.l("interceptor ", zf3Var, " returned a response with no body");
        return null;
    }
}
