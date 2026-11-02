package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wc5 extends jb5 {
    public int m0;
    public int o0;
    public int q0;
    public ld2[] l0 = new ld2[16];
    public int[] n0 = new int[16];
    public Object[] p0 = new Object[16];

    public final void Y() {
        this.m0 = 0;
        this.o0 = 0;
        Arrays.fill(this.p0, 0, this.q0, (Object) null);
        this.q0 = 0;
    }

    public final void Z(rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        if (this.m0 != 0) {
            xr0 xr0Var = new xr0(this);
            wc5 wc5Var = (wc5) xr0Var.e;
            while (true) {
                ld2 ld2Var = wc5Var.l0[xr0Var.b];
                gp2 gp2VarI = ld2Var.i(xr0Var);
                rs rsVar2 = rsVar;
                bc7 bc7Var2 = bc7Var;
                p91 p91Var2 = p91Var;
                vc5 vc5Var2 = vc5Var;
                try {
                    ld2Var.d(xr0Var, rsVar2, bc7Var2, p91Var2, vc5Var2);
                    int i = xr0Var.b;
                    int i2 = wc5Var.m0;
                    if (i < i2) {
                        ld2 ld2Var2 = wc5Var.l0[i];
                        xr0Var.c += ld2Var2.b;
                        xr0Var.d += ld2Var2.c;
                        int i3 = i + 1;
                        xr0Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        rsVar = rsVar2;
                        bc7Var = bc7Var2;
                        p91Var = p91Var2;
                        vc5Var = vc5Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (vc5Var2 == null) {
                        throw th;
                    }
                    os4.U(th, new g00((Object) gp2VarI, (Object) bc7Var2, (Object) vc5Var2, (byte) 15));
                    throw th;
                }
            }
        }
        Y();
    }

    public final boolean a0() {
        return this.m0 == 0;
    }

    public final void b0(ld2 ld2Var) {
        int i = this.m0;
        ld2[] ld2VarArr = this.l0;
        if (i == ld2VarArr.length) {
            ld2[] ld2VarArr2 = new ld2[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(ld2VarArr, 0, ld2VarArr2, 0, i);
            this.l0 = ld2VarArr2;
        }
        int i2 = this.o0;
        int i3 = ld2Var.b;
        int i4 = ld2Var.c;
        int i5 = i2 + i3;
        int[] iArr = this.n0;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            eu.e0(0, 0, length, iArr, iArr2);
            this.n0 = iArr2;
        }
        int i7 = this.q0 + i4;
        Object[] objArr = this.p0;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.p0 = objArr2;
        }
        ld2[] ld2VarArr3 = this.l0;
        int i9 = this.m0;
        this.m0 = i9 + 1;
        ld2VarArr3[i9] = ld2Var;
        this.o0 += ld2Var.b;
        this.q0 += i4;
    }
}
