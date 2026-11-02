package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class im2 extends ck2 {
    public static final kb0 Y;
    public final i90 X;

    static {
        kb0 kb0Var = kb0.f0;
        Y = ra.f("0021F904");
    }

    public im2(ba0 ba0Var) {
        super(ba0Var);
        this.X = new i90();
    }

    public final boolean g(long j) {
        i90 i90Var = this.X;
        long j2 = i90Var.Y;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.read(i90Var, j3) == j3;
    }

    @Override // defpackage.ck2, defpackage.je7
    public final long read(i90 i90Var, long j) throws EOFException {
        long j2;
        long j3;
        g(j);
        i90 i90Var2 = this.X;
        long j4 = 0;
        if (i90Var2.Y == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jC = -1;
            while (true) {
                kb0 kb0Var = Y;
                j2 = j4;
                jC = i90Var2.C(kb0Var.X[0], jC + 1, Long.MAX_VALUE);
                if (jC == -1 || (g(kb0Var.X.length) && i90Var2.J(kb0Var.e(), kb0Var, jC))) {
                    break;
                }
                j4 = j2;
            }
            if (jC == -1) {
                break;
            }
            long j6 = i90Var2.read(i90Var, jC + 4);
            if (j6 < j2) {
                j6 = j2;
            }
            j5 += j6;
            if (g(5L) && i90Var2.u(4L) == 0 && (((i90Var2.u(2L) & 255) << 8) | (i90Var2.u(1L) & 255)) < 2) {
                i90Var.H0(i90Var2.u(j2));
                i90Var.H0(10);
                i90Var.H0(0);
                i90Var2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long j7 = i90Var2.read(i90Var, j - j5);
            j3 = 0;
            if (j7 < 0) {
                j7 = 0;
            }
            j5 += j7;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
