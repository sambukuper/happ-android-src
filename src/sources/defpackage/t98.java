package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t98 {
    public final int a;
    public final c00 b;
    public final p0 c;
    public t98 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ u98 h;

    public t98(u98 u98Var, int i, c00 c00Var, p0 p0Var) {
        this.h = u98Var;
        this.a = i;
        this.b = c00Var;
        this.c = p0Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        tc6 tc6Var;
        tc6 tc6Var2;
        long j5 = this.h.f;
        c00 c00Var = this.b;
        i55 i55VarX = yn0.X(c00Var, 2);
        LayoutNode layoutNodeZ = yn0.Z(c00Var);
        if (layoutNodeZ.L()) {
            if (layoutNodeZ.getOuterCoordinator$ui() != i55VarX) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = i55VarX.Z;
                i55 outerCoordinator$ui = layoutNodeZ.getOuterCoordinator$ui();
                outerCoordinator$ui.getClass();
                long jM = nr4.M(outerCoordinator$ui.F(i55VarX, jFloatToRawIntBits));
                tc6Var = new tc6(jM, (4294967295L & ((long) (((int) (jM & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jM >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, c00Var);
            } else {
                tc6Var = new tc6(j, j2, j3, j4, j5, fArr, c00Var);
            }
            tc6Var2 = tc6Var;
        } else {
            tc6Var2 = null;
        }
        if (tc6Var2 == null) {
            return;
        }
        this.c.B(tc6Var2);
    }

    public final void b() {
        u98 u98Var = this.h;
        vz4 vz4Var = u98Var.a;
        int i = this.a;
        t98 t98Var = (t98) vz4Var.g(i);
        if (t98Var != null) {
            if (t98Var == this) {
                t98 t98Var2 = this.d;
                this.d = null;
                if (t98Var2 != null) {
                    int iD = vz4Var.d(i);
                    Object[] objArr = vz4Var.c;
                    Object obj = objArr[iD];
                    vz4Var.b[iD] = i;
                    objArr[iD] = t98Var2;
                    return;
                }
                LayoutNode layoutNodeZ = yn0.Z(this.b.X);
                if (layoutNodeZ.K()) {
                    u86 rectManager = q34.a(layoutNodeZ).getRectManager();
                    rectManager.getClass();
                    if (layoutNodeZ.i0 != -4) {
                        ne neVar = rectManager.c;
                        int iD2 = rectManager.d(layoutNodeZ);
                        long[] jArr = (long[]) neVar.c;
                        int i2 = iD2 + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iD3 = vz4Var.d(i);
            Object[] objArr2 = vz4Var.c;
            Object obj2 = objArr2[iD3];
            vz4Var.b[iD3] = i;
            objArr2[iD3] = t98Var;
            while (true) {
                t98 t98Var3 = t98Var.d;
                if (t98Var3 == null) {
                    break;
                }
                if (t98Var3 == this) {
                    t98Var.d = this.d;
                    this.d = null;
                    return;
                }
                t98Var = t98Var3;
            }
        }
        t98 t98Var4 = u98Var.b;
        if (t98Var4 == this) {
            u98Var.b = t98Var4.d;
            this.d = null;
            return;
        }
        t98 t98Var5 = t98Var4 != null ? t98Var4.d : null;
        while (true) {
            t98 t98Var6 = t98Var4;
            t98Var4 = t98Var5;
            if (t98Var4 == null) {
                return;
            }
            if (t98Var4 == this) {
                if (t98Var6 != null) {
                    t98Var6.d = t98Var4.d;
                }
                this.d = null;
                return;
            }
            t98Var5 = t98Var4.d;
        }
    }
}
