package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.widget.a;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zo2 implements Runnable {
    public final /* synthetic */ byte X;
    public Object Y;
    public final Object Z;

    public /* synthetic */ zo2(byte b, Object obj, Object obj2, boolean z) {
        this.X = b;
        this.Z = obj;
        this.Y = obj2;
    }

    private final void a() {
        l49 l49Var;
        fv5 fv5Var = ((i08) this.Z).X.n0;
        String str = (String) this.Y;
        synchronized (fv5Var.k) {
            try {
                a59 a59VarC = fv5Var.c(str);
                l49Var = a59VarC != null ? a59VarC.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l49Var == null || dh3.f(p31.j, l49Var.j)) {
            return;
        }
        synchronized (((i08) this.Z).Z) {
            ((i08) this.Z).h0.put(v18.b(l49Var), l49Var);
            i08 i08Var = (i08) this.Z;
            ((i08) this.Z).i0.put(v18.b(l49Var), k39.a(i08Var.j0, l49Var, (u61) i08Var.Y.Z, i08Var));
        }
    }

    private final void b() {
        na9 na9Var = (na9) this.Z;
        synchronized (na9Var.Z) {
            ((fa5) na9Var.f0).i((fb9) this.Y);
        }
    }

    private final void c() {
        IBinder iBinder = (IBinder) this.Z;
        xa9 xa9Var = (xa9) this.Y;
        synchronized (xa9Var) {
            if (iBinder == null) {
                xa9Var.b("Null service connection");
                return;
            }
            try {
                xa9Var.c = new c89(iBinder);
                xa9Var.a = (byte) 2;
                ((ScheduledExecutorService) xa9Var.f.f0).execute(new ra9(xa9Var, (byte) 1));
            } catch (RemoteException e) {
                xa9Var.b(e.getMessage());
            }
        }
    }

    private final void d() {
        na9 na9Var = (na9) this.Z;
        synchronized (na9Var.Z) {
            na5 na5Var = (na5) na9Var.f0;
            Exception excF = ((fb9) this.Y).f();
            w45.s(excF);
            na5Var.d(excF);
        }
    }

    private final void e() {
        na9 na9Var = (na9) this.Z;
        synchronized (na9Var.Z) {
            ((ab5) na9Var.f0).b(((fb9) this.Y).g());
        }
    }

    private final void f() {
        bb9 bb9Var = (bb9) this.Z;
        xa9 xa9Var = (xa9) this.Y;
        int i = bb9Var.a;
        synchronized (xa9Var) {
            SparseArray sparseArray = xa9Var.e;
            bb9 bb9Var2 = (bb9) sparseArray.get(i);
            if (bb9Var2 != null) {
                new StringBuilder(String.valueOf(i).length() + 20);
                sparseArray.remove(i);
                bb9Var2.c(new db9("Timed out waiting for response", null));
                xa9Var.d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.Y).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        defpackage.b37.h0.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.Y), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.Y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.Z     // Catch: java.lang.Throwable -> L58
            b37 r2 = (defpackage.b37) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.Y     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.Z     // Catch: java.lang.Throwable -> L20
            b37 r0 = (defpackage.b37) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.Z     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.f0     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f0 = r6     // Catch: java.lang.Throwable -> L20
            r0.Z = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.Z     // Catch: java.lang.Throwable -> L20
            b37 r4 = (defpackage.b37) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.Y     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.Y = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.Z     // Catch: java.lang.Throwable -> L20
            b37 r10 = (defpackage.b37) r10     // Catch: java.lang.Throwable -> L20
            r10.Z = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.Y     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.Y = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.b37.h0     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.Y     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.Y = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo2.g():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        lt4 lt4Var;
        qo1 qo1Var;
        int i;
        iv ivVar;
        int[] iArr;
        x23 x23Var;
        x23 cb9Var;
        int i2 = 0;
        int i3 = 1;
        try {
            switch (this.X) {
                case 0:
                    xo2 xo2Var = (xo2) this.Z;
                    try {
                        xo2Var.b(vr3.x((Future) this.Y));
                        return;
                    } catch (Error e) {
                        e = e;
                        xo2Var.u(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        xo2Var.u(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            xo2Var.u(e3);
                            return;
                        } else {
                            xo2Var.u(cause);
                            return;
                        }
                    }
                case 1:
                    g5 g5Var = (g5) this.Y;
                    a aVar = (a) this.Z;
                    nt4 nt4Var = aVar.Z;
                    if (nt4Var != null && (lt4Var = nt4Var.e) != null) {
                        lt4Var.D(nt4Var);
                    }
                    View view = (View) aVar.j0;
                    if (view != null && view.getWindowToken() != null) {
                        if (g5Var.b()) {
                            aVar.u0 = g5Var;
                        } else if (g5Var.f != null) {
                            g5Var.d(0, 0, false, false);
                            aVar.u0 = g5Var;
                        }
                    }
                    aVar.w0 = null;
                    return;
                case 2:
                    ((e6) this.Y).X = this.Z;
                    return;
                case 3:
                    ((Application) this.Y).unregisterActivityLifecycleCallbacks((e6) this.Z);
                    return;
                case 4:
                    Object obj = this.Z;
                    Object obj2 = this.Y;
                    try {
                        Method method = f6.d;
                        if (method != null) {
                            method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            f6.e.invoke(obj2, obj, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e4) {
                        if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                            throw e4;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                case 5:
                    gv gvVar = (gv) this.Z;
                    iv ivVar2 = gvVar.f0;
                    if (ivVar2.g == gvVar.Z) {
                        List list = gvVar.Y;
                        qo1 qo1Var2 = (qo1) this.Y;
                        ivVar2.e = list;
                        ivVar2.f = Collections.unmodifiableList(list);
                        wl6 wl6Var = ivVar2.a;
                        int[] iArr2 = qo1Var2.b;
                        ArrayList arrayList = qo1Var2.a;
                        int i4 = qo1Var2.e;
                        yr2 yr2Var = qo1Var2.d;
                        w40 w40Var = new w40(wl6Var);
                        ArrayDeque arrayDeque = new ArrayDeque();
                        int i5 = qo1Var2.f;
                        int size = arrayList.size() - 1;
                        int i6 = i5;
                        int i7 = i4;
                        while (size >= 0) {
                            po1 po1Var = (po1) arrayList.get(size);
                            int i8 = po1Var.a;
                            int i9 = po1Var.c;
                            int i10 = i3;
                            int i11 = i8 + i9;
                            int i12 = po1Var.b;
                            int i13 = i12 + i9;
                            while (i7 > i11) {
                                i7--;
                                int i14 = iArr2[i7];
                                if ((i14 & 12) != 0) {
                                    i = i11;
                                    int i15 = i14 >> 4;
                                    ivVar = ivVar2;
                                    iArr = iArr2;
                                    ro1 ro1VarA = qo1.a(arrayDeque, i15, false);
                                    if (ro1VarA != null) {
                                        int i16 = (i4 - ro1VarA.b) - 1;
                                        w40Var.k(i7, i16);
                                        if ((i14 & 4) != 0) {
                                            w40Var.F(i16, i10, yr2Var.n(i7, i15));
                                        }
                                    } else {
                                        boolean z = i10;
                                        arrayDeque.add(new ro1(i7, (i4 - i7) - (z ? 1 : 0), z));
                                    }
                                } else {
                                    i = i11;
                                    ivVar = ivVar2;
                                    iArr = iArr2;
                                    w40Var.w(i7, i10);
                                    i4--;
                                }
                                i11 = i;
                                ivVar2 = ivVar;
                                iArr2 = iArr;
                                i10 = 1;
                            }
                            iv ivVar3 = ivVar2;
                            int[] iArr3 = iArr2;
                            while (i6 > i13) {
                                i6--;
                                int i17 = qo1Var2.c[i6];
                                if ((i17 & 12) != 0) {
                                    int i18 = i17 >> 4;
                                    qo1Var = qo1Var2;
                                    ro1 ro1VarA2 = qo1.a(arrayDeque, i18, true);
                                    if (ro1VarA2 == null) {
                                        arrayDeque.add(new ro1(i6, i4 - i7, false));
                                    } else {
                                        w40Var.k((i4 - ro1VarA2.b) - 1, i7);
                                        if ((i17 & 4) != 0) {
                                            w40Var.F(i7, 1, yr2Var.n(i18, i6));
                                        }
                                    }
                                } else {
                                    qo1Var = qo1Var2;
                                    w40Var.o(i7, 1);
                                    i4++;
                                }
                                qo1Var2 = qo1Var;
                            }
                            qo1 qo1Var3 = qo1Var2;
                            int i19 = i12;
                            int i20 = i8;
                            for (int i21 = 0; i21 < i9; i21++) {
                                if ((iArr3[i20] & 15) == 2) {
                                    w40Var.F(i20, 1, yr2Var.n(i20, i19));
                                }
                                i20++;
                                i19++;
                            }
                            size--;
                            qo1Var2 = qo1Var3;
                            i3 = 1;
                            i6 = i12;
                            i7 = i8;
                            ivVar2 = ivVar3;
                            iArr2 = iArr3;
                        }
                        w40Var.a();
                        ivVar2.a();
                        return;
                    }
                    return;
                case 6:
                    rb8 rb8Var = (rb8) this.Y;
                    Typeface typeface = (Typeface) this.Z;
                    wl7 wl7Var = (wl7) rb8Var.Y;
                    if (wl7Var != null) {
                        wl7Var.T(typeface);
                        return;
                    }
                    return;
                case 7:
                    try {
                        try {
                            zo0 zo0Var = (zo0) this.Z;
                            Object objE = vr3.E((xb4) this.Y);
                            qd0 qd0Var = zo0Var.Y;
                            if (qd0Var != null) {
                                qd0Var.b(objE);
                            }
                        } catch (ExecutionException e5) {
                            zo0 zo0Var2 = (zo0) this.Z;
                            Throwable cause2 = e5.getCause();
                            qd0 qd0Var2 = zo0Var2.Y;
                            if (qd0Var2 != null) {
                                qd0Var2.d(cause2);
                            }
                        }
                        break;
                    } catch (CancellationException unused2) {
                        ((zo0) this.Z).cancel(false);
                    }
                    return;
                case 8:
                    lh4 lh4VarP0 = lh4.P0();
                    int i22 = mh1.d;
                    l49 l49Var = (l49) this.Y;
                    lh4VarP0.getClass();
                    ((mh1) this.Z).a.e(l49Var);
                    return;
                case 9:
                    while (true) {
                        try {
                            ((Runnable) this.Y).run();
                        } catch (Throwable th) {
                            vr3.F(b02.X, th);
                        }
                        try {
                            Runnable runnableD1 = ((u94) this.Z).d1();
                            if (runnableD1 == null) {
                                return;
                            }
                            this.Y = runnableD1;
                            i2++;
                            if (i2 >= 16) {
                                u94 u94Var = (u94) this.Z;
                                if (op1.c(u94Var.f0, u94Var)) {
                                    u94 u94Var2 = (u94) this.Z;
                                    op1.b(u94Var2.f0, u94Var2, this);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            u94 u94Var3 = (u94) this.Z;
                            synchronized (u94Var3.i0) {
                                u94.j0.decrementAndGet(u94Var3);
                                throw th2;
                            }
                        }
                        break;
                    }
                    break;
                case 10:
                    r43 r43Var = (r43) ((gc4) this.Z).Z;
                    try {
                        vb4.b(r43Var, w79.K(new gh5((kj2) ((xb4) this.Y).get())));
                        return;
                    } catch (Throwable th3) {
                        vb4.a(r43Var, th3);
                        return;
                    }
                case 11:
                    ((ay1) this.Y).accept(this.Z);
                    return;
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    ((mm0) this.Z).F((t52) this.Y);
                    return;
                case 13:
                    try {
                        g();
                        return;
                    } catch (Error e6) {
                        synchronized (((b37) this.Z).Y) {
                            ((b37) this.Z).Z = 1;
                            throw e6;
                        }
                    }
                case 14:
                    try {
                        ((Runnable) this.Z).run();
                        synchronized (((h37) this.Y).f0) {
                            ((h37) this.Y).a();
                            break;
                        }
                        return;
                    } catch (Throwable th4) {
                        synchronized (((h37) this.Y).f0) {
                            ((h37) this.Y).a();
                            throw th4;
                        }
                    }
                case 15:
                    a();
                    return;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    x11 x11Var = (x11) this.Y;
                    bl blVar = (bl) this.Z;
                    rs2 rs2Var = (rs2) blVar.h0;
                    is2 is2Var = (is2) blVar.X;
                    i89 i89Var = (i89) rs2Var.j.get((qn) blVar.Z);
                    if (i89Var == null) {
                        return;
                    }
                    if (x11Var.Y != 0) {
                        i89Var.n(x11Var, null);
                        return;
                    }
                    blVar.Y = true;
                    if (is2Var.n()) {
                        if (!blVar.Y || (x23Var = (x23) blVar.f0) == null) {
                            return;
                        }
                        is2Var.g(x23Var, (Set) blVar.g0);
                        return;
                    }
                    try {
                        is2Var.g(null, is2Var.n() ? is2Var.y : Collections.EMPTY_SET);
                        return;
                    } catch (SecurityException unused3) {
                        is2Var.c("Failed to get service from broker.");
                        i89Var.n(new x11(10, null, null), null);
                        return;
                    }
                case 17:
                    q89 q89Var = (q89) this.Z;
                    e99 e99Var = (e99) this.Y;
                    x11 x11Var2 = e99Var.Y;
                    if (x11Var2.Y == 0) {
                        k99 k99Var = e99Var.Z;
                        w45.s(k99Var);
                        x11 x11Var3 = k99Var.Z;
                        if (x11Var3.Y != 0) {
                            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(x11Var3)), new Exception());
                            q89Var.n.j(x11Var3);
                            q89Var.m.b();
                            return;
                        }
                        bl blVar2 = q89Var.n;
                        IBinder iBinder = k99Var.Y;
                        if (iBinder == null) {
                            cb9Var = null;
                        } else {
                            int i23 = v4.h;
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            cb9Var = iInterfaceQueryLocalInterface instanceof x23 ? (x23) iInterfaceQueryLocalInterface : new cb9(iBinder);
                        }
                        Set set = q89Var.k;
                        blVar2.getClass();
                        if (cb9Var == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            blVar2.j(new x11(4, null, null));
                        } else {
                            blVar2.f0 = cb9Var;
                            blVar2.g0 = set;
                            if (blVar2.Y) {
                                ((is2) blVar2.X).g(cb9Var, set);
                            }
                        }
                    } else {
                        q89Var.n.j(x11Var2);
                    }
                    q89Var.m.b();
                    return;
                case 18:
                    fb9 fb9Var = (fb9) this.Y;
                    boolean z2 = fb9Var.d;
                    ga9 ga9Var = (ga9) this.Z;
                    if (z2) {
                        ga9Var.f0.l();
                        return;
                    }
                    try {
                        ((ga9) this.Z).f0.j(ga9Var.Z.g(fb9Var));
                        return;
                    } catch (er6 e7) {
                        boolean z3 = e7.getCause() instanceof Exception;
                        ga9 ga9Var2 = (ga9) this.Z;
                        if (z3) {
                            ga9Var2.f0.k((Exception) e7.getCause());
                            return;
                        } else {
                            ga9Var2.f0.k(e7);
                            return;
                        }
                    } catch (Exception e8) {
                        ((ga9) this.Z).f0.k(e8);
                        return;
                    }
                case 19:
                    ga9 ga9Var3 = (ga9) this.Z;
                    fb9 fb9Var2 = ga9Var3.f0;
                    try {
                        fb9 fb9Var3 = (fb9) ga9Var3.Z.g((fb9) this.Y);
                        if (fb9Var3 == null) {
                            ga9Var3.d(new NullPointerException("Continuation returned null"));
                            return;
                        }
                        o8 o8Var = fb9Var3.b;
                        dp1 dp1Var = b28.b;
                        fb9Var3.c(dp1Var, ga9Var3);
                        o8Var.r(new na9((Executor) dp1Var, (na5) ga9Var3));
                        fb9Var3.n();
                        o8Var.r(new na9((Executor) dp1Var, (ba5) ga9Var3));
                        fb9Var3.n();
                        return;
                    } catch (er6 e9) {
                        if (e9.getCause() instanceof Exception) {
                            fb9Var2.k((Exception) e9.getCause());
                            return;
                        } else {
                            fb9Var2.k(e9);
                            return;
                        }
                    } catch (Exception e10) {
                        fb9Var2.k(e10);
                        return;
                    }
                case 20:
                    b();
                    return;
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    d();
                    return;
                case 22:
                    c();
                    return;
                case 23:
                    e();
                    return;
                case 24:
                    f();
                    return;
                case 25:
                    na9 na9Var = (na9) this.Z;
                    fb9 fb9Var4 = (fb9) na9Var.f0;
                    try {
                        fb9 fb9VarB = ((iw7) na9Var.Z).b(((fb9) this.Y).g());
                        o8 o8Var2 = fb9VarB.b;
                        dp1 dp1Var2 = b28.b;
                        fb9VarB.c(dp1Var2, na9Var);
                        o8Var2.r(new na9((Executor) dp1Var2, (na5) na9Var));
                        fb9VarB.n();
                        o8Var2.r(new na9((Executor) dp1Var2, (ba5) na9Var));
                        fb9VarB.n();
                        return;
                    } catch (er6 e11) {
                        if (e11.getCause() instanceof Exception) {
                            na9Var.d((Exception) e11.getCause());
                            return;
                        } else {
                            fb9Var4.k(e11);
                            return;
                        }
                    } catch (CancellationException unused4) {
                        na9Var.c();
                        return;
                    } catch (Exception e12) {
                        fb9Var4.k(e12);
                        return;
                    }
                default:
                    fb9 fb9Var5 = (fb9) this.Y;
                    try {
                        fb9Var5.j(((Callable) this.Z).call());
                        return;
                    } catch (Exception e13) {
                        fb9Var5.k(e13);
                        return;
                    } catch (Throwable th5) {
                        fb9Var5.k(new RuntimeException(th5));
                        return;
                    }
            }
        } finally {
            ((zo0) this.Z).i0 = null;
        }
    }

    public String toString() {
        String str;
        byte b = this.X;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return zo2.class.getSimpleName() + "," + ((xo2) obj);
            case 13:
                Runnable runnable = (Runnable) this.Y;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((b37) obj).Z;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zo2(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    public zo2(b37 b37Var) {
        this.X = (byte) 13;
        this.Z = b37Var;
    }
}
