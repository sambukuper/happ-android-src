package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class op1 {
    public static final z31 a = new z31("UNDEFINED", (byte) 3);
    public static final z31 b = new z31("REUSABLE_CLAIMED", (byte) 3);

    public static final void a(q51 q51Var, Object obj) {
        if (!(q51Var instanceof np1)) {
            q51Var.f(obj);
            return;
        }
        np1 np1Var = (np1) q51Var;
        u61 u61Var = np1Var.f0;
        s51 s51Var = np1Var.g0;
        Throwable thA = sj6.a(obj);
        Object xx0Var = thA == null ? obj : new xx0(thA, false);
        if (c(u61Var, s51Var.w())) {
            np1Var.h0 = xx0Var;
            np1Var.Z = 1;
            b(u61Var, s51Var.w(), np1Var);
            return;
        }
        d42 d42VarA = j98.a();
        if (d42VarA.Z >= 4294967296L) {
            np1Var.h0 = xx0Var;
            np1Var.Z = 1;
            d42VarA.e1(np1Var);
            return;
        }
        d42VarA.f1(true);
        try {
            bm3 bm3Var = (bm3) s51Var.w().H0(oy1.E0);
            if (bm3Var == null || bm3Var.k()) {
                Object obj2 = np1Var.i0;
                s61 s61VarW = s51Var.w();
                Object objC = g98.c(s61VarW, obj2);
                am8 am8VarT = objC != g98.a ? ch3.T(s51Var, s61VarW, objC) : null;
                try {
                    s51Var.f(obj);
                    if (am8VarT == null || am8VarT.p0()) {
                        g98.a(s61VarW, objC);
                    }
                } catch (Throwable th) {
                    if (am8VarT == null || am8VarT.p0()) {
                        g98.a(s61VarW, objC);
                    }
                    throw th;
                }
            } else {
                np1Var.f(w39.t(bm3Var.R()));
            }
            while (d42VarA.h1()) {
            }
        } catch (Throwable th2) {
            try {
                np1Var.h(th2);
            } finally {
                d42VarA.d1(true);
            }
        }
    }

    public static final void b(u61 u61Var, s61 s61Var, Runnable runnable) {
        try {
            u61Var.Z0(s61Var, runnable);
        } catch (Throwable th) {
            throw new mp1(th, u61Var, s61Var);
        }
    }

    public static final boolean c(u61 u61Var, s61 s61Var) throws mp1 {
        try {
            return u61Var.b1(s61Var);
        } catch (Throwable th) {
            throw new mp1(th, u61Var, s61Var);
        }
    }
}
