package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l89 implements fa5 {
    public final rs2 X;
    public final char Y;
    public final qn Z;
    public final long f0;
    public final long g0;

    /* JADX WARN: Multi-variable type inference failed */
    public l89(rs2 rs2Var, int i, qn qnVar, long j, long j2) {
        this.X = rs2Var;
        this.Y = i;
        this.Z = qnVar;
        this.f0 = j;
        this.g0 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static c21 a(i89 i89Var, u10 u10Var, int i) {
        qa9 qa9Var = u10Var.v;
        c21 c21Var = qa9Var == null ? null : qa9Var.f0;
        if (c21Var != null && c21Var.Y) {
            int[] iArr = c21Var.f0;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = c21Var.h0;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (i89Var.r < c21Var.g0) {
                        return c21Var;
                    }
                } else if (i89Var.r < c21Var.g0) {
                    return c21Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (i89Var.r < c21Var.g0) {
                        return c21Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.fa5
    public final void i(fb9 fb9Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        rs2 rs2Var = this.X;
        if (rs2Var.d()) {
            xl6 xl6Var = (xl6) wl6.P().Y;
            if (xl6Var == null || xl6Var.Y) {
                i89 i89Var = (i89) rs2Var.j.get(this.Z);
                if (i89Var != null) {
                    is2 is2Var = i89Var.h;
                    if (is2Var instanceof u10) {
                        is2 is2Var2 = is2Var;
                        long j3 = this.f0;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        short s = is2Var2.p;
                        if (xl6Var != null) {
                            z &= xl6Var.Z;
                            i = xl6Var.f0;
                            i3 = xl6Var.g0;
                            i2 = xl6Var.X;
                            if (is2Var2.v != null && !is2Var2.m()) {
                                c21 c21VarA = a(i89Var, is2Var2, this.Y);
                                if (c21VarA == null) {
                                    return;
                                }
                                boolean z2 = c21VarA.Z && j3 > 0;
                                i3 = c21VarA.g0;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i7 = i;
                        int iElapsedRealtime = -1;
                        if (fb9Var.i()) {
                            i5 = 0;
                        } else if (fb9Var.d) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception excF = fb9Var.f();
                            if (excF instanceof pn) {
                                Status status = ((pn) excF).X;
                                i4 = status.X;
                                x11 x11Var = status.f0;
                                if (x11Var != null) {
                                    i5 = i4;
                                    i6 = x11Var.Y;
                                }
                            } else {
                                i4 = HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.g0;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        m89 m89Var = new m89(new ov4(this.Y, i5, i6, j, j2, null, null, s, iElapsedRealtime), i2, i7, i3);
                        f99 f99Var = rs2Var.m;
                        f99Var.sendMessage(f99Var.obtainMessage(18, m89Var));
                    }
                }
            }
        }
    }
}
