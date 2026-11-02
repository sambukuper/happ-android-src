package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x39 extends w39 {
    public static x39 t0;
    public static x39 u0;
    public static final Object v0;
    public final Context i0;
    public final xy0 j0;
    public final WorkDatabase k0;
    public final y5 l0;
    public final List m0;
    public final fv5 n0;
    public final lr5 o0;
    public boolean p0 = false;
    public BroadcastReceiver.PendingResult q0;
    public volatile pd6 r0;
    public final y5 s0;

    static {
        lh4.a1("WorkManagerImpl");
        t0 = null;
        u0 = null;
        v0 = new Object();
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [int[], java.io.Serializable, java.lang.Object] */
    public x39(Context context, final xy0 xy0Var, y5 y5Var, final WorkDatabase workDatabase, final List list, fv5 fv5Var, y5 y5Var2) {
        Context applicationContext = context.getApplicationContext();
        qg5 qg5Var = null;
        if (applicationContext.isDeviceProtectedStorage()) {
            bt.i("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        lh4 lh4Var = new lh4(4);
        synchronized (lh4.Y) {
            try {
                if (lh4.Z == null) {
                    lh4.Z = lh4Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i0 = applicationContext;
        this.l0 = y5Var;
        this.k0 = workDatabase;
        this.n0 = fv5Var;
        this.s0 = y5Var2;
        this.j0 = xy0Var;
        this.m0 = list;
        m51 m51Var = (m51) y5Var.g0;
        byte b = 1;
        this.o0 = new lr5(workDatabase, b);
        final h37 h37Var = (h37) y5Var.Y;
        int i = ax6.a;
        fv5Var.a(new p52() { // from class: zw6
            @Override // defpackage.p52
            public final void b(s39 s39Var, boolean z) {
                h37Var.execute(new rg0(workDatabase, s39Var, list, xy0Var, (byte) 2));
            }
        });
        ((h37) y5Var.Y).execute(new jj2(applicationContext, this));
        int i2 = fm8.a;
        m51Var.getClass();
        if (dv5.a(applicationContext, xy0Var)) {
            ql6 ql6Var = workDatabase.x().a;
            ut8 ut8Var = new ut8((byte) 21);
            fi3 fi3VarF = ql6Var.f();
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            xf8 xf8Var = fi3VarF.b;
            xf8Var.getClass();
            o57 o57Var = new o57();
            for (String str : strArr) {
                LinkedHashMap linkedHashMap = xf8Var.c;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Set set = (Set) linkedHashMap.get(lowerCase);
                if (set != null) {
                    o57Var.addAll(set);
                } else {
                    o57Var.add(str);
                }
            }
            String[] strArr2 = (String[]) w45.m(o57Var).toArray(new String[0]);
            int length = strArr2.length;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                String str2 = strArr2[i3];
                LinkedHashMap linkedHashMap2 = xf8Var.f;
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer num = (Integer) linkedHashMap2.get(lowerCase2);
                if (num == null) {
                    bt.q("There is no table with name ".concat(str2));
                    String[] strArr3 = (String[]) qg5Var.X;
                    ?? r4 = (int[]) qg5Var.Y;
                    strArr3.getClass();
                    r4.getClass();
                    q51 q51Var = null;
                    w51.G(m51Var, null, null, new r5((Object) new sf2(w51.t(zc1.o(new lf2(new qg2(zc1.o(new j31(new wu1((Object) xf8Var, (Serializable) r4, (Object) strArr3, q51Var, (byte) 11), (byte) 7), -1), ql6Var, ut8Var, b), new em8(4, null), (byte) 3), -1)), new ym7(applicationContext, q51Var, (byte) 10), (byte) 2), q51Var, (byte) 12), 3);
                }
                iArr[i3] = num.intValue();
            }
            qg5Var = new qg5(strArr2, iArr);
            String[] strArr4 = (String[]) qg5Var.X;
            ?? r5 = (int[]) qg5Var.Y;
            strArr4.getClass();
            r5.getClass();
            q51 q51Var2 = null;
            w51.G(m51Var, null, null, new r5((Object) new sf2(w51.t(zc1.o(new lf2(new qg2(zc1.o(new j31(new wu1((Object) xf8Var, (Serializable) r5, (Object) strArr4, q51Var2, (byte) 11), (byte) 7), -1), ql6Var, ut8Var, b), new em8(4, null), (byte) 3), -1)), new ym7(applicationContext, q51Var2, (byte) 10), (byte) 2), q51Var2, (byte) 12), 3);
        }
    }

    public static x39 v0(Context context) {
        x39 x39VarV0;
        Object obj = v0;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        x39VarV0 = t0;
                        if (x39VarV0 == null) {
                            x39VarV0 = u0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x39VarV0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (x39VarV0 == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof HappApplication)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            w0(applicationContext, ((HappApplication) applicationContext).j());
            x39VarV0 = v0(applicationContext);
        }
        return x39VarV0;
    }

    public static void w0(Context context, xy0 xy0Var) {
        synchronized (v0) {
            try {
                x39 x39Var = t0;
                if (x39Var != null && u0 != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (x39Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    x39 x39VarQ = u0;
                    if (x39VarQ == null) {
                        x39VarQ = z39.q(applicationContext, xy0Var);
                        u0 = x39VarQ;
                    }
                    t0 = x39VarQ;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x0() {
        synchronized (v0) {
            try {
                this.p0 = true;
                BroadcastReceiver.PendingResult pendingResult = this.q0;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.q0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y0() throws Throwable {
        Object obj = this.j0.j0;
        im0 im0Var = new im0(this, (byte) 1);
        boolean zC = ln7.c();
        if (zC) {
            try {
                Trace.beginSection("ReschedulingWork");
            } finally {
                if (zC) {
                    Trace.endSection();
                }
            }
        }
        im0Var.invoke();
    }
}
