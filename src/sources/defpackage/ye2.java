package defpackage;

import androidx.constraintlayout.widget.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ye2 extends xz2 {
    public int A0;
    public d30 B0;
    public e30 C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public m31[] X0;
    public m31[] Y0;
    public int[] Z0;
    public m31[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.xz2
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            m31 m31Var = this.q0[i];
            if (m31Var != null) {
                m31Var.F = true;
            }
        }
    }

    public final int T(m31 m31Var, int i) {
        m31 m31Var2;
        if (m31Var != null) {
            int[] iArr = m31Var.p0;
            if (iArr[1] == 3) {
                int i2 = m31Var.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (m31Var.z * i);
                        if (i3 != m31Var.k()) {
                            m31Var.g = true;
                            V(iArr[0], m31Var.q(), 1, i3, m31Var);
                        }
                        return i3;
                    }
                    m31Var2 = m31Var;
                    if (i2 == 1) {
                        return m31Var2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((m31Var2.q() * m31Var2.W) + 0.5f);
                    }
                }
            } else {
                m31Var2 = m31Var;
            }
            return m31Var2.k();
        }
        return 0;
    }

    public final int U(m31 m31Var, int i) {
        m31 m31Var2;
        if (m31Var != null) {
            int[] iArr = m31Var.p0;
            if (iArr[0] == 3) {
                int i2 = m31Var.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (m31Var.w * i);
                        if (i3 != m31Var.q()) {
                            m31Var.g = true;
                            V(1, i3, iArr[1], m31Var.k(), m31Var);
                        }
                        return i3;
                    }
                    m31Var2 = m31Var;
                    if (i2 == 1) {
                        return m31Var2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((m31Var2.k() * m31Var2.W) + 0.5f);
                    }
                }
            } else {
                m31Var2 = m31Var;
            }
            return m31Var2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, m31 m31Var) {
        e30 e30Var;
        n31 n31Var;
        d30 d30Var = this.B0;
        while (true) {
            e30Var = this.C0;
            if (e30Var != null || (n31Var = this.T) == null) {
                break;
            } else {
                this.C0 = n31Var.u0;
            }
        }
        d30Var.a = i;
        d30Var.b = i3;
        d30Var.c = i2;
        d30Var.d = i4;
        ((b) e30Var).b(m31Var, d30Var);
        m31Var.O(d30Var.e);
        m31Var.L(d30Var.f);
        m31Var.E = d30Var.h;
        m31Var.I(d30Var.g);
    }

    @Override // defpackage.m31
    public final void b(ka4 ka4Var, boolean z) {
        m31 m31Var;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(ka4Var, z);
        n31 n31Var = this.T;
        boolean z2 = n31Var != null && n31Var.v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((we2) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((we2) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                m31 m31Var2 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    m31 m31Var3 = this.Y0[i];
                    if (m31Var3 != null) {
                        u21 u21Var = m31Var3.I;
                        if (m31Var3.g0 != 8) {
                            if (i8 == 0) {
                                m31Var3.f(u21Var, this.I, this.w0);
                                m31Var3.i0 = this.D0;
                                m31Var3.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                m31Var3.f(m31Var3.K, this.K, this.x0);
                            }
                            if (i8 > 0 && m31Var2 != null) {
                                u21 u21Var2 = m31Var2.K;
                                m31Var3.f(u21Var, u21Var2, this.P0);
                                m31Var2.f(u21Var2, u21Var, 0);
                            }
                            m31Var2 = m31Var3;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    m31 m31Var4 = this.X0[i9];
                    if (m31Var4 != null) {
                        u21 u21Var3 = m31Var4.J;
                        if (m31Var4.g0 != 8) {
                            if (i9 == 0) {
                                m31Var4.f(u21Var3, this.J, this.s0);
                                m31Var4.j0 = this.E0;
                                m31Var4.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                m31Var4.f(m31Var4.L, this.L, this.t0);
                            }
                            if (i9 > 0 && m31Var2 != null) {
                                u21 u21Var4 = m31Var2.L;
                                m31Var4.f(u21Var3, u21Var4, this.Q0);
                                m31Var2.f(u21Var4, u21Var3, 0);
                            }
                            m31Var2 = m31Var4;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        m31[] m31VarArr = this.a1;
                        if (i12 < m31VarArr.length && (m31Var = m31VarArr[i12]) != null && m31Var.g0 != 8) {
                            m31 m31Var5 = this.Y0[i10];
                            m31 m31Var6 = this.X0[i11];
                            if (m31Var != m31Var5) {
                                m31Var.f(m31Var.I, m31Var5.I, 0);
                                m31Var.f(m31Var.K, m31Var5.K, 0);
                            }
                            if (m31Var != m31Var6) {
                                m31Var.f(m31Var.J, m31Var6.J, 0);
                                m31Var.f(m31Var.L, m31Var6.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((we2) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
