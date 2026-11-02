package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Looper;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.graphics.vector.VectorPainter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g28 {
    public g28() {
        new ConcurrentHashMap();
    }

    public static final void a(kx4 kx4Var, lp2 lp2Var, int i) {
        lp2Var.X(311535276);
        if (lp2Var.N(i & 1, (i & 3) != 2)) {
            kx4 kx4VarF = u15.f(kx4Var, ((dp) lp2Var.j(ep.z)).b.b, u70.e);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarF);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            oc.b(vj8.j0(y46.title_xray_log_files, lp2Var), os4.w(b.a, ((gr) lp2Var.j(hr.a)).a.a), lp2Var, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new f80(kx4Var, i, (byte) 6);
        }
    }

    public static Object b(fb9 fb9Var) throws InterruptedException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            bt.i("Must not be called on the main application thread");
            return null;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            bt.i("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        w45.t(fb9Var, "Task must not be null");
        if (fb9Var.h()) {
            return o(fb9Var);
        }
        q09 q09Var = new q09();
        Executor executor = b28.b;
        fb9Var.c(executor, q09Var);
        na9 na9Var = new na9(executor, (na5) q09Var);
        o8 o8Var = fb9Var.b;
        o8Var.r(na9Var);
        fb9Var.n();
        o8Var.r(new na9(executor, (ba5) q09Var));
        fb9Var.n();
        ((CountDownLatch) q09Var.X).await();
        return o(fb9Var);
    }

    public static Object c(fb9 fb9Var, long j) throws TimeoutException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            bt.i("Must not be called on the main application thread");
            return null;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            bt.i("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        w45.t(fb9Var, "Task must not be null");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w45.t(timeUnit, "TimeUnit must not be null");
        if (fb9Var.h()) {
            return o(fb9Var);
        }
        q09 q09Var = new q09();
        Executor executor = b28.b;
        fb9Var.c(executor, q09Var);
        na9 na9Var = new na9(executor, (na5) q09Var);
        o8 o8Var = fb9Var.b;
        o8Var.r(na9Var);
        fb9Var.n();
        o8Var.r(new na9(executor, (ba5) q09Var));
        fb9Var.n();
        if (((CountDownLatch) q09Var.X).await(j, timeUnit)) {
            return o(fb9Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static fb9 d(Executor executor, Callable callable) {
        w45.t(executor, "Executor must not be null");
        fb9 fb9Var = new fb9();
        executor.execute(new zo2(fb9Var, callable, (byte) 26));
        return fb9Var;
    }

    public static final void i(ou2 ou2Var, fu8 fu8Var) {
        ArrayList arrayList = fu8Var.l0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hu8 hu8Var = (hu8) arrayList.get(i);
            if (hu8Var instanceof iu8) {
                pi5 pi5Var = new pi5();
                iu8 iu8Var = (iu8) hu8Var;
                pi5Var.d = iu8Var.Y;
                pi5Var.n = true;
                pi5Var.c();
                pi5Var.s.a.setFillType(iu8Var.Z == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                pi5Var.c();
                pi5Var.c();
                pi5Var.b = iu8Var.f0;
                pi5Var.c();
                pi5Var.c = iu8Var.g0;
                pi5Var.c();
                pi5Var.g = iu8Var.h0;
                pi5Var.c();
                pi5Var.e = iu8Var.i0;
                pi5Var.c();
                pi5Var.f = iu8Var.j0;
                pi5Var.o = true;
                pi5Var.c();
                pi5Var.h = iu8Var.k0;
                pi5Var.o = true;
                pi5Var.c();
                pi5Var.i = iu8Var.l0;
                pi5Var.o = true;
                pi5Var.c();
                pi5Var.j = iu8Var.m0;
                pi5Var.o = true;
                pi5Var.c();
                pi5Var.k = iu8Var.n0;
                pi5Var.p = true;
                pi5Var.c();
                pi5Var.l = iu8Var.o0;
                pi5Var.p = true;
                pi5Var.c();
                pi5Var.m = iu8Var.p0;
                pi5Var.p = true;
                pi5Var.c();
                ou2Var.e(i, pi5Var);
            } else if (hu8Var instanceof fu8) {
                ou2 ou2Var2 = new ou2();
                fu8 fu8Var2 = (fu8) hu8Var;
                ou2Var2.k = fu8Var2.X;
                ou2Var2.c();
                ou2Var2.l = fu8Var2.Y;
                ou2Var2.s = true;
                ou2Var2.c();
                ou2Var2.o = fu8Var2.g0;
                ou2Var2.s = true;
                ou2Var2.c();
                ou2Var2.p = fu8Var2.h0;
                ou2Var2.s = true;
                ou2Var2.c();
                ou2Var2.q = fu8Var2.i0;
                ou2Var2.s = true;
                ou2Var2.c();
                ou2Var2.r = fu8Var2.j0;
                ou2Var2.s = true;
                ou2Var2.c();
                ou2Var2.m = fu8Var2.Z;
                ou2Var2.s = true;
                ou2Var2.c();
                ou2Var2.n = fu8Var2.f0;
                ou2Var2.s = true;
                ou2Var2.c();
                ou2Var2.f = fu8Var2.k0;
                ou2Var2.g = true;
                ou2Var2.c();
                i(ou2Var2, fu8Var2);
                ou2Var.e(i, ou2Var2);
            }
        }
    }

    public static gj2 j(gj2[] gj2VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        gj2 gj2Var = null;
        int i3 = Integer.MAX_VALUE;
        for (gj2 gj2Var2 : gj2VarArr) {
            int iAbs = (Math.abs(gj2Var2.c - i2) * 2) + (gj2Var2.d == z ? 0 : 1);
            if (gj2Var == null || i3 > iAbs) {
                gj2Var = gj2Var2;
                i3 = iAbs;
            }
        }
        return gj2Var;
    }

    public static fb9 k(Exception exc) {
        fb9 fb9Var = new fb9();
        fb9Var.k(exc);
        return fb9Var;
    }

    public static fb9 l(Object obj) {
        fb9 fb9Var = new fb9();
        fb9Var.j(obj);
        return fb9Var;
    }

    public static final VectorPainter m(g73 g73Var, lp2 lp2Var) {
        fi1 fi1Var = (fi1) lp2Var.j(y01.h);
        boolean zE = lp2Var.e((((long) Float.floatToRawIntBits(fi1Var.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(g73Var.j)) << 32));
        Object objK = lp2Var.K();
        if (zE || objK == zz0.a) {
            ou2 ou2Var = new ou2();
            i(ou2Var, g73Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fi1Var.h0(g73Var.b))) << 32) | (((long) Float.floatToRawIntBits(fi1Var.h0(g73Var.c))) & 4294967295L);
            float fIntBitsToFloat = g73Var.d;
            float fIntBitsToFloat2 = g73Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            VectorPainter vectorPainter = new VectorPainter(ou2Var);
            String str = g73Var.a;
            long j = g73Var.g;
            g60 g60Var = j != 16 ? new g60(j, g73Var.h) : null;
            boolean z = g73Var.i;
            vectorPainter.h0.setValue(new ua7(jFloatToRawIntBits));
            vectorPainter.i0.setValue(Boolean.valueOf(z));
            tt8 tt8Var = vectorPainter.j0;
            tt8Var.g.setValue(g60Var);
            tt8Var.i.setValue(new ua7(jFloatToRawIntBits2));
            tt8Var.c = str;
            lp2Var.g0(vectorPainter);
            objK = vectorPainter;
        }
        return (VectorPainter) objK;
    }

    public static final void n(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof h48) {
            n(((h48) charSequence).Z, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static Object o(fb9 fb9Var) throws ExecutionException {
        if (fb9Var.i()) {
            return fb9Var.g();
        }
        if (fb9Var.d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(fb9Var.f());
    }

    public abstract Typeface e(Context context, ui2 ui2Var, Resources resources, int i);

    public abstract Typeface f(Context context, gj2[] gj2VarArr, int i);

    public Typeface g(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface h(Context context, Resources resources, int i, String str, int i2) {
        File fileH = u28.h(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (u28.b(fileH, resources, i)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }
}
