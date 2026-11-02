package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u10 {
    public static final k82[] x = new k82[0];
    public volatile String a;
    public rl6 b;
    public final Context c;
    public final ya9 d;
    public final x99 e;
    public final Object f;
    public final Object g;
    public n99 h;
    public t10 i;
    public IInterface j;
    public final ArrayList k;
    public ia9 l;
    public byte m;
    public final rb8 n;
    public final q09 o;
    public final short p;
    public final String q;
    public volatile String r;
    public volatile yr2 s;
    public x11 t;
    public boolean u;
    public volatile qa9 v;
    public final AtomicInteger w;

    /* JADX WARN: Multi-variable type inference failed */
    public u10(Context context, Looper looper, ya9 ya9Var, int i, rb8 rb8Var, q09 q09Var, String str) {
        Object obj = ns2.c;
        this.a = null;
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList();
        this.m = (byte) 1;
        this.t = null;
        this.u = false;
        this.v = null;
        this.w = new AtomicInteger(0);
        w45.t(context, "Context must not be null");
        this.c = context;
        w45.t(looper, "Looper must not be null");
        this.d = ya9Var;
        this.e = new x99(this, looper);
        this.p = i;
        this.n = rb8Var;
        this.o = q09Var;
        this.q = str;
    }

    public IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof t89 ? (t89) iInterfaceQueryLocalInterface : new t89(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void b() {
        this.w.incrementAndGet();
        ArrayList arrayList = this.k;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m99 m99Var = (m99) arrayList.get(i);
                    synchronized (m99Var) {
                        m99Var.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.h = null;
        }
        p(1, null);
    }

    public final void c(String str) {
        this.a = str;
        b();
    }

    public k82[] d() {
        return x;
    }

    public Bundle e() {
        return new Bundle();
    }

    public int f() {
        return 12451000;
    }

    public final void g(x23 x23Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleE = e();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.s == null || (attributionSource = (AttributionSource) this.s.Y) == null || attributionSource.getAttributionTag() == null) ? this.r : attributionSource.getAttributionTag();
        String str = attributionTag;
        short s = this.p;
        int i = os2.a;
        Scope[] scopeArr = sr2.q0;
        Bundle bundle = new Bundle();
        k82[] k82VarArr = sr2.r0;
        sr2 sr2Var = new sr2(6, s, i, null, null, scopeArr, bundle, null, k82VarArr, k82VarArr, true, 0, false, str);
        sr2Var.f0 = this.c.getPackageName();
        sr2Var.i0 = bundleE;
        if (set != null) {
            sr2Var.h0 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            sr2Var.j0 = new Account("<<default account>>", "com.google");
            if (x23Var != null) {
                sr2Var.g0 = ((cb9) x23Var).g;
            }
        }
        sr2Var.k0 = x;
        sr2Var.l0 = d();
        if (this instanceof fa9) {
            sr2Var.o0 = true;
        }
        try {
            try {
                synchronized (this.g) {
                    try {
                        n99 n99Var = this.h;
                        if (n99Var != null) {
                            n99Var.b(new ea9(this, this.w.get()), sr2Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i2 = this.w.get();
                ka9 ka9Var = new ka9(this, 8, null, null);
                x99 x99Var = this.e;
                x99Var.sendMessage(x99Var.obtainMessage(1, i2, -1, ka9Var));
            }
        } catch (DeadObjectException unused2) {
            int i3 = this.w.get();
            x99 x99Var2 = this.e;
            x99Var2.sendMessage(x99Var2.obtainMessage(6, i3, 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public final IInterface h() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.m == 5) {
                    throw new DeadObjectException();
                }
                if (!l()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.j;
                w45.t(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public String i() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public String j() {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean k() {
        return f() >= 211700000;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 4;
        }
        return z;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.f) {
            byte b = this.m;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean n() {
        return false;
    }

    public final /* synthetic */ boolean o(int i, int i2, IInterface iInterface) {
        synchronized (this.f) {
            try {
                if (this.m != i) {
                    return false;
                }
                p(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(int i, IInterface iInterface) {
        rl6 rl6Var;
        if ((i == 4) != (iInterface != null)) {
            kp5.e();
            return;
        }
        synchronized (this.f) {
            try {
                this.m = i;
                this.j = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    ia9 ia9Var = this.l;
                    if (ia9Var != null) {
                        ya9 ya9Var = this.d;
                        String str = this.b.b;
                        w45.s(str);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        ya9Var.b(str, ia9Var, this.b.a);
                        this.l = null;
                    }
                } else if (i == 2 || i == 3) {
                    ia9 ia9Var2 = this.l;
                    if (ia9Var2 != null && (rl6Var = this.b) != null) {
                        new StringBuilder(String.valueOf(rl6Var.b).length() + 70 + "com.google.android.gms".length());
                        ya9 ya9Var2 = this.d;
                        String str2 = this.b.b;
                        w45.s(str2);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        ya9Var2.b(str2, ia9Var2, this.b.a);
                        this.w.incrementAndGet();
                    }
                    ia9 ia9Var3 = new ia9(this, this.w.get());
                    this.l = ia9Var3;
                    String strJ = j();
                    boolean zK = k();
                    this.b = new rl6(strJ, zK);
                    if (zK && f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.b)));
                    }
                    ya9 ya9Var3 = this.d;
                    String str3 = this.b.b;
                    w45.s(str3);
                    this.b.getClass();
                    String name = this.q;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    x11 x11VarA = ya9Var3.a(new ua9(str3, this.b.a), ia9Var3, name);
                    if (!(x11VarA.Y == 0)) {
                        new StringBuilder(String.valueOf(this.b.b).length() + 34 + "com.google.android.gms".length());
                        int i2 = x11VarA.Y;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (x11VarA.Z != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", x11VarA.Z);
                        }
                        int i3 = this.w.get();
                        la9 la9Var = new la9(this, i2, bundle);
                        x99 x99Var = this.e;
                        x99Var.sendMessage(x99Var.obtainMessage(7, i3, -1, la9Var));
                    }
                } else if (i == 4) {
                    w45.s(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
