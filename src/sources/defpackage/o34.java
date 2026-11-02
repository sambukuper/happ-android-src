package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o34 {
    public final v8 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public v8 h;
    public final /* synthetic */ byte j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public o34(v8 v8Var, byte b) {
        this.j = b;
        this.a = v8Var;
    }

    public final void a(r8 r8Var, int i, i55 i55Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long J = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        lf5 lf5Var = i55Var.V0;
                        if (lf5Var != null) {
                            au2 au2Var = (au2) lf5Var;
                            float[] fArrB = au2Var.b();
                            if (!au2Var.u0) {
                                J = or4.b(fArrB, J);
                            }
                        }
                        J = nr4.J(J, i55Var.H0);
                        break;
                    default:
                        xi4 xi4VarT0 = i55Var.T0();
                        xi4VarT0.getClass();
                        long j = xi4VarT0.x0;
                        J = z85.f((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), J);
                        break;
                }
                i55Var = i55Var.y0;
                i55Var.getClass();
                if (i55Var.equals(this.a.d())) {
                    int iRound = Math.round(r8Var instanceof t03 ? Float.intBitsToFloat((int) (J & 4294967295L)) : Float.intBitsToFloat((int) (J >> 32)));
                    HashMap map = this.i;
                    if (map.containsKey(r8Var)) {
                        int iIntValue = ((Number) zp4.H(map, r8Var)).intValue();
                        t03 t03Var = u8.a;
                        iRound = ((Number) r8Var.a.K(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(r8Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(i55Var).containsKey(r8Var));
            float fC = c(i55Var, r8Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(i55 i55Var) {
        switch (this.j) {
            case 0:
                return i55Var.s0().c();
            default:
                xi4 xi4VarT0 = i55Var.T0();
                xi4VarT0.getClass();
                return xi4VarT0.s0().c();
        }
    }

    public final int c(i55 i55Var, r8 r8Var) {
        switch (this.j) {
            case 0:
                return i55Var.N(r8Var);
            default:
                xi4 xi4VarT0 = i55Var.T0();
                xi4VarT0.getClass();
                return xi4VarT0.N(r8Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        v8 v8Var = this.a;
        v8 v8VarF = v8Var.f();
        if (v8VarF == null) {
            return;
        }
        if (this.c) {
            v8VarF.J();
        } else if (this.e || this.d) {
            v8VarF.requestLayout();
        }
        if (this.f) {
            v8Var.J();
        }
        if (this.g) {
            v8Var.requestLayout();
        }
        v8VarF.c().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        y0 y0Var = new y0((Object) this, (byte) 3);
        v8 v8Var = this.a;
        v8Var.s(y0Var);
        map.putAll(b(v8Var.d()));
        this.b = false;
    }

    public final void h() {
        o34 o34VarC;
        o34 o34VarC2;
        boolean zD = d();
        v8 v8Var = this.a;
        if (!zD) {
            v8 v8VarF = v8Var.f();
            if (v8VarF == null) {
                return;
            }
            v8Var = v8VarF.c().h;
            if (v8Var == null || !v8Var.c().d()) {
                v8 v8Var2 = this.h;
                if (v8Var2 == null || v8Var2.c().d()) {
                    return;
                }
                v8 v8VarF2 = v8Var2.f();
                if (v8VarF2 != null && (o34VarC2 = v8VarF2.c()) != null) {
                    o34VarC2.h();
                }
                v8 v8VarF3 = v8Var2.f();
                v8Var = (v8VarF3 == null || (o34VarC = v8VarF3.c()) == null) ? null : o34VarC.h;
            }
        }
        this.h = v8Var;
    }
}
