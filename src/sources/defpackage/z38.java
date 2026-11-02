package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z38 {
    public static final int a(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static dv8 b(a06 a06Var) {
        a06Var.getClass();
        if (a06Var.Y.size() == 0) {
            return dv8.b;
        }
        List list = a06Var.Y;
        list.getClass();
        return new dv8(list);
    }

    public static long c(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static final Object d(fx6 fx6Var, boolean z, Object obj, rn2 rn2Var) {
        Object xx0Var;
        Object objW;
        try {
            if (rn2Var instanceof r10) {
                ci8.i(2, rn2Var);
                xx0Var = rn2Var.K(obj, fx6Var);
            } else {
                xx0Var = mb6.k0(rn2Var, obj, fx6Var);
            }
        } catch (mp1 e) {
            Throwable th = e.X;
            fx6Var.V(new xx0(th, false));
            throw th;
        } catch (Throwable th2) {
            xx0Var = new xx0(th2, false);
        }
        c71 c71Var = c71.X;
        if (xx0Var == c71Var || (objW = fx6Var.W(xx0Var)) == sm3.b) {
            return c71Var;
        }
        fx6Var.o0();
        if (!(objW instanceof xx0)) {
            return sm3.a(objW);
        }
        if (!z) {
            Throwable th3 = ((xx0) objW).a;
            if ((th3 instanceof ua8) && ((ua8) th3).X == fx6Var) {
                if (xx0Var instanceof xx0) {
                    throw ((xx0) xx0Var).a;
                }
                return xx0Var;
            }
        }
        throw ((xx0) objW).a;
    }

    public static void e(int i, int i2) {
        String strF;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strF = ln7.f("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strF = ln7.f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static void f(int i, int i2, int i3) {
        String strG;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strG = g(i, i3, "start index");
            } else {
                strG = (i2 < 0 || i2 > i3) ? g(i2, i3, "end index") : ln7.f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static String g(int i, int i2, String str) {
        if (i < 0) {
            return ln7.f("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ln7.f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
