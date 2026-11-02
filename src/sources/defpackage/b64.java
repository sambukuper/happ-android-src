package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b64 {
    public q31 b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ d64 h;
    public z54[] a = vj8.f0;
    public int e = 1;

    public b64(d64 d64Var) {
        this.h = d64Var;
    }

    public static void b(b64 b64Var, f74 f74Var, b71 b71Var, vt2 vt2Var, int i, int i2) {
        b64Var.h.getClass();
        b64Var.a(f74Var, b71Var, vt2Var, i, i2, (int) (f74Var.b(0) >> 32));
    }

    public final void a(f74 f74Var, b71 b71Var, vt2 vt2Var, int i, int i2, int i3) {
        z54[] z54VarArr;
        List list = f74Var.b;
        z54[] z54VarArr2 = this.a;
        int length = z54VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                z54 z54Var = z54VarArr2[i4];
                if (z54Var != null && z54Var.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = list.size();
        int length2 = this.a.length;
        while (true) {
            z54VarArr = this.a;
            if (size >= length2) {
                break;
            }
            z54 z54Var2 = z54VarArr[size];
            if (z54Var2 != null) {
                z54Var2.c();
            }
            size++;
        }
        if (z54VarArr.length != list.size()) {
            this.a = (z54[]) Arrays.copyOf(this.a, list.size());
        }
        this.b = new q31(f74Var.l);
        this.c = i3;
        this.d = 0;
        this.e = 1;
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object objW = ((eo5) list.get(i5)).w();
            q54 q54Var = objW instanceof q54 ? (q54) objW : null;
            z54[] z54VarArr3 = this.a;
            if (q54Var == null) {
                z54 z54Var3 = z54VarArr3[i5];
                if (z54Var3 != null) {
                    z54Var3.c();
                }
                this.a[i5] = null;
            } else {
                z54 z54Var4 = z54VarArr3[i5];
                if (z54Var4 == null) {
                    z54Var4 = new z54(b71Var, vt2Var, new tb2(this.h, (byte) 19));
                    this.a[i5] = z54Var4;
                }
                z54Var4.d = q54Var.q0;
                z54Var4.e = q54Var.r0;
                z54Var4.f = q54Var.s0;
            }
        }
    }
}
