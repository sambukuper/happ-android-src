package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 {
    public static final Object s = new Object();
    public static final SparseArray t = new SparseArray();
    public final bm0 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public t6 g;
    public hl0 h;
    public ul0 i;
    public xd6 j;
    public z47 k;
    public final fk6 l;
    public final ud0 m;
    public final ek0 n;
    public final vz7 o;
    public int p;
    public final Integer r;
    public final jk0 a = new jk0();
    public final Object b = new Object();
    public xb4 q = u73.Z;

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0250, code lost:
    
        r5 = r11;
        r11 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zl0(su.happ.proxyutility.ui.ScannerActivity r11, defpackage.q84 r12) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl0.<init>(su.happ.proxyutility.ui.ScannerActivity, q84):void");
    }

    public static void a(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(fk0 fk0Var) throws Throwable {
        if (ln7.c()) {
            byte b = fk0Var != null ? fk0Var.a : (byte) -1;
            if (Build.VERSION.SDK_INT >= 29) {
                wa.E(b, "CX:CameraProvider-RetryStatus");
                return;
            }
            try {
                Method method = ln7.e;
                if (method == null) {
                    method = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                    ln7.e = method;
                }
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                method.invoke(null, Long.valueOf(ln7.a), "CX:CameraProvider-RetryStatus", Integer.valueOf(b));
            } catch (Exception e) {
                if (e instanceof InvocationTargetException) {
                    Throwable cause = ((InvocationTargetException) e).getCause();
                    if (cause instanceof RuntimeException) {
                        throw cause;
                    }
                    u52.q(cause);
                }
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = t;
        if (sparseArray.size() == 0) {
            hi5.f0 = (byte) 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            hi5.f0 = (byte) 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            hi5.f0 = (byte) 4;
        } else if (sparseArray.get(5) != null) {
            hi5.f0 = (byte) 5;
        } else if (sparseArray.get(6) != null) {
            hi5.f0 = (byte) 6;
        }
    }
}
