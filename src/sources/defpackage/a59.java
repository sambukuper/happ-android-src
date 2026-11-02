package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a59 {
    public final l49 a;
    public final Context b;
    public final String c;
    public final zv7 d;
    public final y5 e;
    public final xy0 f;
    public final fv5 g;
    public final WorkDatabase h;
    public final n49 i;
    public final pi1 j;
    public final ArrayList k;
    public final dm3 l;
    public final ArrayList m;
    public final ArrayList n;

    public a59(d6 d6Var) throws IOException {
        l49 l49Var = (l49) d6Var.j0;
        this.a = l49Var;
        this.b = (Context) d6Var.k0;
        this.c = l49Var.a;
        this.d = (zv7) d6Var.f0;
        this.e = (y5) d6Var.g0;
        this.f = (xy0) d6Var.Y;
        this.g = (fv5) d6Var.h0;
        WorkDatabase workDatabase = (WorkDatabase) d6Var.i0;
        this.h = workDatabase;
        this.i = workDatabase.x();
        this.j = workDatabase.r();
        ArrayList arrayList = (ArrayList) d6Var.Z;
        this.k = arrayList;
        wv0.y0(arrayList, ",", null, null, null, 62);
        this.l = u70.g();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    public final void a(int i) {
        n49 n49Var = this.i;
        u39 u39Var = u39.X;
        String str = this.c;
        n49Var.h(u39Var, str);
        n49Var.g(System.currentTimeMillis(), str);
        n49Var.f(this.a.v, str);
        n49Var.e(-1L, str);
        n49Var.i(i, str);
    }

    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        n49 n49Var = this.i;
        String str = this.c;
        n49Var.g(jCurrentTimeMillis, str);
        n49Var.h(u39.X, str);
        ql6 ql6Var = n49Var.a;
        ((Number) u15.G(ql6Var, false, true, new nm7(str, (byte) 14))).intValue();
        n49Var.f(this.a.v, str);
        u15.G(ql6Var, false, true, new nm7(str, (byte) 15));
        n49Var.e(-1L, str);
    }

    public final boolean c(int i) {
        if (dh3.f(this.a.y, Boolean.TRUE)) {
            int i2 = b59.a;
            lh4.P0().getClass();
            a(i);
            return true;
        }
        n49 n49Var = this.i;
        String str = this.c;
        u39 u39VarB = n49Var.b(str);
        if (u39VarB == null || u39VarB.a()) {
            int i3 = b59.a;
            lh4 lh4VarP0 = lh4.P0();
            Objects.toString(u39VarB);
            lh4VarP0.getClass();
            return false;
        }
        int i4 = b59.a;
        lh4 lh4VarP1 = lh4.P0();
        u39VarB.toString();
        lh4VarP1.getClass();
        n49Var.h(u39.X, str);
        n49Var.i(i, str);
        n49Var.e(-1L, str);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(s51 s51Var) throws Throwable {
        z49 z49Var;
        OverwritingInputMerger overwritingInputMerger;
        u91 u91Var;
        if (s51Var instanceof z49) {
            z49Var = (z49) s51Var;
            int i = z49Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                z49Var.h0 = i - Integer.MIN_VALUE;
            } else {
                z49Var = new z49(this, s51Var);
            }
        } else {
            z49Var = new z49(this, s51Var);
        }
        z49 z49Var2 = z49Var;
        Object objW = z49Var2.f0;
        int i2 = z49Var2.h0;
        final byte b = 1;
        try {
            if (i2 == 0) {
                w39.n0(objW);
                boolean zC = ln7.c();
                l49 l49Var = this.a;
                String str = l49Var.x;
                final byte b2 = 0;
                if (zC && str != null) {
                    int iHashCode = l49Var.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        wa.a(iHashCode, str.length() <= 127 ? str : str.substring(0, 127));
                    } else {
                        String strSubstring = str.length() <= 127 ? str : str.substring(0, 127);
                        try {
                            Method method = ln7.c;
                            if (method == null) {
                                method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                ln7.c = method;
                            }
                            if (method == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            method.invoke(null, Long.valueOf(ln7.a), strSubstring, Integer.valueOf(iHashCode));
                        } catch (Exception e) {
                            if (e instanceof InvocationTargetException) {
                                Throwable cause = ((InvocationTargetException) e).getCause();
                                if (cause instanceof RuntimeException) {
                                    throw cause;
                                }
                                u52.q(cause);
                                return null;
                            }
                        }
                    }
                }
                Callable callable = new Callable(this) { // from class: s49
                    public final /* synthetic */ a59 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        byte b3 = b2;
                        u39 u39Var = u39.X;
                        a59 a59Var = this.b;
                        switch (b3) {
                            case 0:
                                l49 l49Var2 = a59Var.a;
                                if (l49Var2.b != u39Var) {
                                    int i3 = b59.a;
                                    lh4.P0().getClass();
                                    return Boolean.TRUE;
                                }
                                if ((!l49Var2.c() && (l49Var2.b != u39Var || l49Var2.k <= 0)) || System.currentTimeMillis() >= l49Var2.a()) {
                                    return Boolean.FALSE;
                                }
                                lh4 lh4VarP0 = lh4.P0();
                                int i4 = b59.a;
                                lh4VarP0.getClass();
                                return Boolean.TRUE;
                            default:
                                n49 n49Var = a59Var.i;
                                String str2 = a59Var.c;
                                boolean z = false;
                                if (n49Var.b(str2) == u39Var) {
                                    n49Var.h(u39.Y, str2);
                                    ((Number) u15.G(n49Var.a, false, true, new nm7(str2, (byte) 17))).intValue();
                                    n49Var.i(-256, str2);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                };
                WorkDatabase workDatabase = this.h;
                if (((Boolean) workDatabase.n(callable)).booleanValue()) {
                    return new w49(true);
                }
                boolean zC2 = l49Var.c();
                String str2 = this.c;
                if (zC2) {
                    u91Var = l49Var.e;
                } else {
                    String str3 = l49Var.d;
                    str3.getClass();
                    int i3 = vd3.a;
                    try {
                        Object objNewInstance = Class.forName(str3).getDeclaredConstructor(null).newInstance(null);
                        objNewInstance.getClass();
                        overwritingInputMerger = (OverwritingInputMerger) objNewInstance;
                    } catch (Exception unused) {
                        lh4.P0().getClass();
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger == null) {
                        int i4 = b59.a;
                        lh4.P0().getClass();
                        return new w49(false);
                    }
                    List listK = i21.K(l49Var.e);
                    n49 n49Var = this.i;
                    n49Var.getClass();
                    str2.getClass();
                    ArrayList arrayListH0 = wv0.H0(listK, (List) u15.G(n49Var.a, true, false, new nm7(str2, (byte) 16)));
                    t91 t91Var = new t91((byte) 0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayListH0.iterator();
                    while (it.hasNext()) {
                        Map mapUnmodifiableMap = Collections.unmodifiableMap(((u91) it.next()).a);
                        mapUnmodifiableMap.getClass();
                        linkedHashMap.putAll(mapUnmodifiableMap);
                    }
                    t91Var.b(linkedHashMap);
                    u91Var = new u91(t91Var.a);
                    wl7.c0(u91Var);
                }
                u91 u91Var2 = u91Var;
                UUID uuidFromString = UUID.fromString(str2);
                int i5 = l49Var.k;
                int i6 = l49Var.t;
                xy0 xy0Var = this.f;
                Executor executor = (Executor) xy0Var.Y;
                u61 u61Var = (u61) xy0Var.Z;
                fv5 fv5Var = this.g;
                y5 y5Var = this.e;
                WorkerParameters workerParameters = new WorkerParameters(uuidFromString, u91Var2, this.k, this.d, i5, i6, executor, u61Var, y5Var, new r39(workDatabase, fv5Var, y5Var));
                try {
                    ec4 ec4VarL = pz2.G0.l(this.b, l49Var.c, workerParameters);
                    ec4VarL.d = true;
                    s61 s61Var = z49Var2.Y;
                    s61Var.getClass();
                    q61 q61VarH0 = s61Var.H0(oy1.E0);
                    q61VarH0.getClass();
                    bm3 bm3Var = (bm3) q61VarH0;
                    bm3Var.D(new kg((byte) 3, ec4VarL, str, this, zC));
                    Object objN = workDatabase.n(new Callable(this) { // from class: s49
                        public final /* synthetic */ a59 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3 = b;
                            u39 u39Var = u39.X;
                            a59 a59Var = this.b;
                            switch (b3) {
                                case 0:
                                    l49 l49Var2 = a59Var.a;
                                    if (l49Var2.b != u39Var) {
                                        int i7 = b59.a;
                                        lh4.P0().getClass();
                                        return Boolean.TRUE;
                                    }
                                    if ((!l49Var2.c() && (l49Var2.b != u39Var || l49Var2.k <= 0)) || System.currentTimeMillis() >= l49Var2.a()) {
                                        return Boolean.FALSE;
                                    }
                                    lh4 lh4VarP0 = lh4.P0();
                                    int i8 = b59.a;
                                    lh4VarP0.getClass();
                                    return Boolean.TRUE;
                                default:
                                    n49 n49Var2 = a59Var.i;
                                    String str4 = a59Var.c;
                                    boolean z = false;
                                    if (n49Var2.b(str4) == u39Var) {
                                        n49Var2.h(u39.Y, str4);
                                        ((Number) u15.G(n49Var2.a, false, true, new nm7(str4, (byte) 17))).intValue();
                                        n49Var2.i(-256, str4);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    });
                    objN.getClass();
                    if (!((Boolean) objN).booleanValue()) {
                        return new w49(true);
                    }
                    if (bm3Var.isCancelled()) {
                        return new w49(true);
                    }
                    lj2 lj2Var = workerParameters.i;
                    lj2Var.getClass();
                    ki3 ki3Var = (ki3) y5Var.h0;
                    ki3Var.getClass();
                    u61 u61VarX = nr4.x(ki3Var);
                    bv bvVar = new bv(this, ec4VarL, lj2Var, null, (byte) 12);
                    z49Var2.h0 = 1;
                    objW = w51.W(u61VarX, bvVar, z49Var2);
                    c71 c71Var = c71.X;
                    if (objW == c71Var) {
                        return c71Var;
                    }
                } catch (Throwable unused2) {
                    int i7 = b59.a;
                    lh4.P0().getClass();
                    return new w49(false);
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(objW);
            }
            dc4 dc4Var = (dc4) objW;
            dc4Var.getClass();
            return new u49(dc4Var);
        } catch (CancellationException e2) {
            int i8 = b59.a;
            lh4.P0().getClass();
            throw e2;
        } catch (Throwable unused3) {
            int i9 = b59.a;
            lh4.P0().getClass();
            return new t49();
        }
    }

    public final void e(dc4 dc4Var) {
        String str = this.c;
        ArrayList arrayListN = i21.N(str);
        arrayListN.addAll(w51.B(this.j, str));
        Iterator it = arrayListN.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            n49 n49Var = this.i;
            if (!zHasNext) {
                u91 u91Var = ((ac4) dc4Var).a;
                u91Var.getClass();
                n49Var.f(this.a.v, str);
                u15.G(n49Var.a, false, true, new gq6(u91Var, str, (byte) 27));
                return;
            }
            String str2 = (String) it.next();
            if (n49Var.b(str2) != u39.h0) {
                n49Var.h(u39.f0, str2);
                if (!str2.equals(str)) {
                    this.n.add(str2);
                }
            }
        }
    }
}
