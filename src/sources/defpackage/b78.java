package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b78 extends oh1 implements g34, as2, s01 {
    public y78 s0;
    public boolean t0;
    public final r80 u0;
    public Map v0;

    public b78(y78 y78Var, kd8 kd8Var, o88 o88Var, boolean z, wx3 wx3Var) {
        this.s0 = y78Var;
        this.t0 = z;
        r80 r80Var = new r80(y78Var.g);
        Y0(r80Var);
        this.u0 = r80Var;
        y78 y78Var2 = this.s0;
        y78Var2.getClass();
        boolean z2 = this.t0;
        y78Var2.a.X.setValue(new t58(kd8Var, o88Var, z2, !z2, wx3Var.c == 4));
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        y78 y78Var = this.s0;
        z24 layoutDirection = zr4Var.getLayoutDirection();
        fi2 fi2Var = (fi2) hi5.W(this, y01.k);
        u58 u58Var = y78Var.a;
        s58 s58Var = new s58(zr4Var, layoutDirection, fi2Var, j);
        u58Var.Y.setValue(s58Var);
        t58 t58Var = (t58) u58Var.X.getValue();
        if (t58Var == null) {
            zc3.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            b61.n();
            return null;
        }
        x78 x78VarA = u58Var.a(t58Var, s58Var);
        long j2 = x78VarA.c;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        eo5 eo5VarO = tr4Var.o(z68.B(i, i, i2, i2));
        this.s0.f.setValue(new kt1(this.t0 ? zr4Var.R(z38.a(x78VarA.b.a(0))) : 0.0f));
        Map linkedHashMap = this.v0;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(u8.a, Integer.valueOf(Math.round(x78VarA.d)));
        linkedHashMap.put(u8.b, Integer.valueOf(Math.round(x78VarA.e)));
        this.v0 = linkedHashMap;
        return zr4Var.g0(i, i2, linkedHashMap, new d1(eo5VarO, (byte) 16));
    }

    @Override // defpackage.as2
    public final void e0(i55 i55Var) {
        this.s0.c.setValue(i55Var);
    }
}
