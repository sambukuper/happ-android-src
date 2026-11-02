package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u58 implements lh7, yh7 {
    public y45 Z;
    public final rh5 X = new rh5(null, t58.f);
    public final rh5 Y = new rh5(null, s58.g);
    public r58 f0 = new r58();

    /* JADX WARN: Code duplicated, block: B:125:0x0254  */
    public final x78 a(t58 t58Var, s58 s58Var) {
        ArrayList arrayList;
        x78 x78Var;
        x78 x78Var2;
        x78 x78Var3;
        x78 x78Var4;
        ce4 ce4Var;
        CharSequence charSequence;
        o88 o88Var;
        Object objG;
        h48 h48VarD = t58Var.a.d();
        List listJ = h48VarD.X;
        c78 c78Var = h48VarD.Y;
        if (c78Var != null) {
            p88 p88Var = c78Var.a;
            arrayList = new ArrayList();
            df3 df3Var = p88Var.b;
            if (df3Var.d != df3Var.e) {
                int i = 4;
                while (true) {
                    zz4 zz4Var = df3Var.b;
                    if (i >= zz4Var.b) {
                        break;
                    }
                    if (!jb5.V(zz4Var.d(i)) && (objG = df3Var.a.g(i / 4)) != null) {
                        long jN = df3Var.n(i);
                        int iW = jb5.W(jN);
                        if (iW > p88Var.c) {
                            iW -= p88Var.c();
                        }
                        int iC = (int) (jN & 2147483647L);
                        if (iC > p88Var.c) {
                            iC -= p88Var.c();
                        }
                        arrayList.add(new pl(iW, iC, objG));
                    }
                    i += 4;
                }
            }
        } else {
            arrayList = null;
        }
        if ((listJ == null || listJ.isEmpty()) && (arrayList == null || arrayList.isEmpty())) {
            listJ = null;
        } else if (listJ == null || listJ.isEmpty()) {
            listJ = arrayList;
        } else if (arrayList != null && !arrayList.isEmpty()) {
            gb4 gb4VarR = i21.r();
            gb4VarR.addAll(listJ);
            gb4VarR.addAll(arrayList);
            listJ = i21.j(gb4VarR);
        }
        r58 r58Var = (r58) kd7.f(this.f0);
        x78 x78Var5 = r58Var.n;
        if (x78Var5 != null && (charSequence = r58Var.c) != null && mm7.Q(charSequence, h48VarD) && dh3.f(r58Var.d, listJ) && dh3.f(r58Var.e, h48VarD.g0) && r58Var.g == t58Var.c && r58Var.h == t58Var.d && r58Var.k == s58Var.b && r58Var.i == s58Var.a.getDensity() && r58Var.j == s58Var.a.b0() && q31.b(r58Var.m, s58Var.d) && dh3.f(r58Var.l, s58Var.c) && !x78Var5.b.a.b()) {
            o88 o88Var2 = r58Var.f;
            boolean zC = o88Var2 != null ? o88Var2.c(t58Var.b) : false;
            o88 o88Var3 = r58Var.f;
            boolean z = o88Var3 != null && (o88Var3 == (o88Var = t58Var.b) || o88Var3.a.b(o88Var.a));
            if (zC && z) {
                return x78Var5;
            }
            if (zC) {
                w78 w78Var = x78Var5.a;
                return new x78(new w78(w78Var.a, t58Var.b, w78Var.c, w78Var.d, w78Var.e, w78Var.f, w78Var.g, w78Var.h, w78Var.i, w78Var.j), x78Var5.b, x78Var5.c);
            }
        }
        d02 d02Var = d02.X;
        y45 y45Var = this.Z;
        if (y45Var == null) {
            fi2 fi2Var = s58Var.c;
            zr4 zr4Var = s58Var.a;
            z24 z24Var = s58Var.b;
            y45Var = new y45();
            y45Var.X = new zv7((byte) 3);
            this.Z = y45Var;
        }
        boolean z2 = t58Var.e;
        o88 o88VarD = t58Var.b;
        if (z2) {
            ge4 ge4Var = o88VarD.a.k;
            if (ge4Var == null || (ce4Var = (ce4) ge4Var.X.get(0)) == null) {
                ce4Var = (ce4) uo5.a.l().X.get(0);
            }
            byte bN = Build.VERSION.SDK_INT >= 28 ? en.N(ce4Var) : Character.getDirectionality(DecimalFormatSymbols.getInstance(ce4Var.a).getZeroDigit());
            o88VarD = o88VarD.d(new o88(0L, 0L, null, null, 0L, 0, (bN == 1 || bN == 2) ? 2 : 1, 0L, 16711679));
        }
        o88 o88Var4 = o88VarD;
        ql qlVar = new ql(h48VarD.Z.toString(), listJ == null ? d02Var : listJ);
        boolean z3 = t58Var.d;
        int iH = Integer.MAX_VALUE;
        int i2 = t58Var.c ? 1 : Integer.MAX_VALUE;
        long j = s58Var.d;
        z24 z24Var2 = s58Var.b;
        zr4 zr4Var2 = s58Var.a;
        fi2 fi2Var2 = s58Var.c;
        zv7 zv7Var = (zv7) y45Var.X;
        w78 w78Var2 = new w78(qlVar, o88Var4, d02Var, i2, z3, 1, zr4Var2, z24Var2, fi2Var2, j);
        int i3 = i2;
        if (zv7Var != null) {
            oc0 oc0Var = new oc0(w78Var2);
            ej4 ej4Var = (ej4) zv7Var.X;
            if (ej4Var != null) {
                x78Var3 = (x78) ej4Var.a(oc0Var);
            } else {
                if (dh3.f((oc0) zv7Var.Y, oc0Var)) {
                    x78Var3 = (x78) zv7Var.Z;
                } else {
                    x78Var4 = null;
                }
                x78Var = x78Var4;
            }
            if (x78Var3 == null || x78Var3.b.a.b()) {
                x78Var4 = null;
            } else {
                x78Var4 = x78Var3;
            }
            x78Var = x78Var4;
        } else {
            x78Var = null;
        }
        if (x78Var != null) {
            bz4 bz4Var = x78Var.b;
            x78Var2 = new x78(w78Var2, x78Var.b, s31.d(j, (((long) ((int) Math.ceil(bz4Var.e))) & 4294967295L) | (((long) ((int) Math.ceil(bz4Var.d))) << 32)));
        } else {
            y5 y5Var = new y5(qlVar, xt7.d(o88Var4, z24Var2), d02Var, zr4Var2, fi2Var2, z3);
            int iJ = q31.j(j);
            if (z3 && q31.d(j)) {
                iH = q31.h(j);
            }
            int iN = iH;
            if (iJ != iN) {
                iN = x97.n((int) Math.ceil(y5Var.l()), iJ, iN);
            }
            bz4 bz4Var2 = new bz4(y5Var, z68.B(0, iN, 0, q31.g(j)), i3, 1);
            x78 x78Var6 = new x78(w78Var2, bz4Var2, s31.d(j, (((long) ((int) Math.ceil(bz4Var2.e))) & 4294967295L) | (((long) ((int) Math.ceil(bz4Var2.d))) << 32)));
            if (zv7Var != null) {
                ej4 ej4Var2 = (ej4) zv7Var.X;
                if (ej4Var2 != null) {
                    ej4Var2.b(new oc0(w78Var2), x78Var6);
                } else {
                    zv7Var.Y = new oc0(w78Var2);
                    zv7Var.Z = x78Var6;
                }
            }
            x78Var2 = x78Var6;
        }
        if (!x78Var2.equals(x78Var5)) {
            dd7 dd7VarH = kd7.h();
            if (!dd7VarH.f()) {
                r58 r58Var2 = this.f0;
                synchronized (kd7.c) {
                    r58 r58Var3 = (r58) kd7.w(r58Var2, this, dd7VarH);
                    r58Var3.c = h48VarD;
                    r58Var3.d = listJ;
                    r58Var3.e = h48VarD.g0;
                    r58Var3.g = t58Var.c;
                    r58Var3.h = t58Var.d;
                    r58Var3.f = t58Var.b;
                    r58Var3.k = s58Var.b;
                    r58Var3.i = s58Var.e;
                    r58Var3.j = s58Var.f;
                    r58Var3.m = s58Var.d;
                    r58Var3.l = s58Var.c;
                    r58Var3.n = x78Var2;
                }
                kd7.l(dd7VarH, this);
                return x78Var2;
            }
        }
        return x78Var2;
    }

    @Override // defpackage.yh7
    public final bi7 c() {
        return this.f0;
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        s58 s58Var;
        t58 t58Var = (t58) this.X.getValue();
        if (t58Var == null || (s58Var = (s58) this.Y.getValue()) == null) {
            return null;
        }
        return a(t58Var, s58Var);
    }

    @Override // defpackage.yh7
    public final void y(bi7 bi7Var) {
        this.f0 = (r58) bi7Var;
    }

    @Override // defpackage.yh7
    public final bi7 e(bi7 bi7Var, bi7 bi7Var2, bi7 bi7Var3) {
        return bi7Var3;
    }
}
