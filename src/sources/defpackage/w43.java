package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.a;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w43 {
    public static final kx4 a = b.g(hx4.X, w45.m);

    public static final void a(g73 g73Var, String str, kx4 kx4Var, long j, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-126890956);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(g73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.e(j) ? 2048 : 1024;
        }
        if (lp2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            b(g28.m(g73Var, lp2Var), str, kx4Var, j, lp2Var, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new v43(g73Var, str, kx4Var, j, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    public static final void b(og5 og5Var, String str, kx4 kx4Var, long j, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4VarA;
        lp2Var.X(-2142239481);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(og5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.e(j) ? 2048 : 1024;
        }
        if (lp2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && lp2Var.e(j)) || (i2 & 3072) == 2048;
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (z || objK == beVar) {
                objK = tk8.a(j, dw0.g) ? null : new g60(j, 5);
                lp2Var.g0(objK);
            }
            g60 g60Var = (g60) objK;
            kx4 kx4Var2 = hx4.X;
            if (str != null) {
                lp2Var.W(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object objK2 = lp2Var.K();
                if (z2 || objK2 == beVar) {
                    objK2 = new m40(str, (byte) 10);
                    lp2Var.g0(objK2);
                }
                kx4VarA = v07.a(kx4Var2, false, (gn2) objK2);
                lp2Var.p(false);
            } else {
                lp2Var.W(-536832197);
                lp2Var.p(false);
                kx4VarA = kx4Var2;
            }
            if (ua7.a(og5Var.h(), 9205357640488583168L)) {
                kx4Var2 = a;
            } else {
                long jH = og5Var.h();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jH >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jH & 4294967295L)))) {
                    kx4Var2 = a;
                }
            }
            g80.a(a.a(kx4Var.y(kx4Var2), og5Var, g60Var).y(kx4VarA), lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new v43(og5Var, str, kx4Var, j, i, (byte) 1);
        }
    }
}
