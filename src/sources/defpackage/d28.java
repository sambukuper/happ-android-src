package defpackage;

import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d28 {
    public static final e37 a(e37 e37Var, g55 g55Var) {
        e37Var.getClass();
        g55Var.getClass();
        if (!dh3.f(e37Var.r(), i37.M)) {
            return e37Var.i() ? a(e37Var.h(0), g55Var) : e37Var;
        }
        z39.u(e37Var);
        return e37Var;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static db8 c(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return db8.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return db8.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return db8.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return db8.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return db8.SSL_3_0;
        }
        bt.q("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static final String d(long j) {
        String strG;
        if (j <= -999500000) {
            strG = ie2.g((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strG = ie2.g((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strG = ie2.g((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strG = ie2.g((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strG = ie2.g((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strG = ie2.g((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strG}, 1));
    }

    public static final void e(w18 w18Var, e28 e28Var, String str) {
        f28.i.fine(e28Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + w18Var.a);
    }

    public static float f(float f, DisplayMetrics displayMetrics) {
        if (Build.VERSION.SDK_INT >= 34) {
            return u3.c(f, displayMetrics);
        }
        float f2 = displayMetrics.scaledDensity;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    public static final q59 g(vm3 vm3Var, e37 e37Var) {
        e37Var.getClass();
        nr4 nr4VarR = e37Var.r();
        if (nr4VarR instanceof qq5) {
            return q59.POLY_OBJ;
        }
        if (dh3.f(nr4VarR, pm7.N)) {
            return q59.LIST;
        }
        if (!dh3.f(nr4VarR, pm7.O)) {
            return q59.OBJ;
        }
        e37 e37VarA = a(e37Var.h(0), vm3Var.b);
        nr4 nr4VarR2 = e37VarA.r();
        if ((nr4VarR2 instanceof zt5) || dh3.f(nr4VarR2, j37.M)) {
            return q59.MAP;
        }
        throw ys0.i(e37VarA);
    }
}
