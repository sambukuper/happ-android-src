package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y66 {
    public final wg[] a;
    public final int b;

    public y66(c24 c24Var) {
        wu5 wu5Var = (wu5) c24Var.X;
        int size = wu5Var.X.size();
        int i = 8;
        while (i < (size <= 64 ? size + size : size + (size >> 2))) {
            i += i;
        }
        this.b = i - 1;
        wg[] wgVarArr = new wg[i];
        for (Map.Entry entry : (ru5) wu5Var.entrySet()) {
            di8 di8Var = (di8) entry.getKey();
            ar3 ar3Var = (ar3) entry.getValue();
            int i2 = di8Var.a & this.b;
            wg wgVar = wgVarArr[i2];
            wg wgVar2 = new wg();
            wgVar2.c = wgVar;
            wgVar2.b = ar3Var;
            wgVar2.a = di8Var.d;
            wgVar2.d = di8Var.b;
            wgVar2.e = di8Var.c;
            wgVarArr[i2] = wgVar2;
        }
        this.a = wgVarArr;
    }

    public final ar3 a(dh8 dh8Var) {
        wg wgVar = this.a[(dh8Var.hashCode() - 1) & this.b];
        if (wgVar == null) {
            return null;
        }
        if (!wgVar.a && dh8Var.equals((dh8) wgVar.e)) {
            return (ar3) wgVar.b;
        }
        while (true) {
            wgVar = (wg) wgVar.c;
            if (wgVar == null) {
                return null;
            }
            if (!wgVar.a && dh8Var.equals((dh8) wgVar.e)) {
                return (ar3) wgVar.b;
            }
        }
    }

    public final ar3 b(Class cls) {
        wg wgVar = this.a[cls.getName().hashCode() & this.b];
        if (wgVar == null) {
            return null;
        }
        if (((Class) wgVar.d) == cls && !wgVar.a) {
            return (ar3) wgVar.b;
        }
        while (true) {
            wgVar = (wg) wgVar.c;
            if (wgVar == null) {
                return null;
            }
            if (((Class) wgVar.d) == cls && !wgVar.a) {
                return (ar3) wgVar.b;
            }
        }
    }
}
