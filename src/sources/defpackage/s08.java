package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s08 {
    public static final aa7 a(t14 t14Var) {
        t14Var.getClass();
        mo8 mo8VarQ0 = t14Var.q0();
        aa7 aa7Var = mo8VarQ0 instanceof aa7 ? (aa7) mo8VarQ0 : null;
        if (aa7Var != null) {
            return aa7Var;
        }
        b61.o(t14Var, "This is should be simple type: ");
        return null;
    }

    public static void b() {
        mb6.s("Not in application's main thread", c());
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final aa7 d(aa7 aa7Var, List list, ch8 ch8Var) {
        aa7Var.getClass();
        list.getClass();
        ch8Var.getClass();
        if (list.isEmpty() && ch8Var == aa7Var.m0()) {
            return aa7Var;
        }
        if (list.isEmpty()) {
            return aa7Var.t0(ch8Var);
        }
        if (!(aa7Var instanceof q32)) {
            return dh3.N(ch8Var, aa7Var.n0(), list, aa7Var.o0());
        }
        q32 q32Var = (q32) aa7Var;
        lh8 lh8Var = q32Var.Y;
        n32 n32Var = q32Var.Z;
        s32 s32Var = q32Var.f0;
        boolean z = q32Var.h0;
        String[] strArr = q32Var.i0;
        return new q32(lh8Var, n32Var, s32Var, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static t14 e(t14 t14Var, List list, sm smVar, int i) {
        if ((i & 2) != 0) {
            smVar = t14Var.getAnnotations();
        }
        if ((list.isEmpty() || list == t14Var.l0()) && smVar == t14Var.getAnnotations()) {
            return t14Var;
        }
        ch8 ch8VarM0 = t14Var.m0();
        if ((smVar instanceof ia2) && ((ia2) smVar).isEmpty()) {
            smVar = oy1.f0;
        }
        ch8 ch8VarI = bt7.i(ch8VarM0, smVar);
        mo8 mo8VarQ0 = t14Var.q0();
        if (mo8VarQ0 instanceof ce2) {
            ce2 ce2Var = (ce2) mo8VarQ0;
            return dh3.s(d(ce2Var.Y, list, ch8VarI), d(ce2Var.Z, list, ch8VarI));
        }
        if (mo8VarQ0 instanceof aa7) {
            return d((aa7) mo8VarQ0, list, ch8VarI);
        }
        b61.c();
        return null;
    }

    public static /* synthetic */ aa7 f(aa7 aa7Var, List list, ch8 ch8Var, int i) {
        if ((i & 1) != 0) {
            list = aa7Var.l0();
        }
        if ((i & 2) != 0) {
            ch8Var = aa7Var.m0();
        }
        return d(aa7Var, list, ch8Var);
    }

    public static void g(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            mb6.s("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static final Object h(g94 g94Var, boolean z, hv2 hv2Var, dn2 dn2Var, uy7 uy7Var) {
        mm0 mm0Var = new mm0(1, mb6.H(uy7Var));
        mm0Var.s();
        f39 f39Var = new f39(g94Var, mm0Var, dn2Var);
        if (z) {
            hv2Var.Z0(b02.X, new e39(g94Var, f39Var, (byte) 0));
        } else {
            g94Var.a(f39Var);
        }
        mm0Var.u(new vt1(hv2Var, g94Var, f39Var, (byte) 3));
        return mm0Var.q();
    }

    public static final long i(String str, long j, long j2, long j3) {
        String property;
        int i = r08.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lC0 = mm7.c0(property);
        if (lC0 == null) {
            u52.n("System property '", str, "' has unrecognized value '", property);
            return 0L;
        }
        long jLongValue = lC0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(int i, int i2, String str) {
        return (int) i(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final fl1 k(l5 l5Var) {
        l5Var.getClass();
        fl1 fl1Var = (fl1) ek3.d.get(l5Var);
        return fl1Var == null ? gl1.g(l5Var) : fl1Var;
    }
}
