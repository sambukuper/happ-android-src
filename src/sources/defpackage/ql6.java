package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ql6 {
    public m51 a;
    public Executor b;
    public lp c;
    public by0 d;
    public fi3 e;
    public boolean g;
    public final mj0 f = new mj0(new ub(0, this, ql6.class, "onClosed", "onClosed()V", 0, 27));
    public final ThreadLocal h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        if (this.g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            bt.i("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        sm2 sm2VarG0 = g().g0();
        if (!sm2VarG0.D()) {
            jm4.Z(new r5((Object) f(), (q51) null, (byte) 15));
        }
        if (sm2VarG0.X.isWriteAheadLoggingEnabled()) {
            sm2VarG0.k();
        } else {
            sm2VarG0.g();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(aq4.G(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(zc1.M((zu3) entry.getKey()), entry.getValue());
        }
        return d02.X;
    }

    public abstract fi3 d();

    public td5 e() {
        throw new g65(0);
    }

    public final fi3 f() {
        fi3 fi3Var = this.e;
        if (fi3Var != null) {
            return fi3Var;
        }
        dh3.T("internalTracker");
        throw null;
    }

    public final ax7 g() {
        by0 by0Var = this.d;
        if (by0Var == null) {
            dh3.T("connectionManager");
            throw null;
        }
        ax7 ax7VarE = by0Var.e();
        if (ax7VarE != null) {
            return ax7VarE;
        }
        bt.i("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set h() {
        return wv0.c1(new ArrayList(xv0.Z(m02.X, 10)));
    }

    public LinkedHashMap i() {
        int iG = aq4.G(xv0.Z(m02.X, 10));
        if (iG < 16) {
            iG = 16;
        }
        return new LinkedHashMap(iG);
    }

    public final boolean j() {
        by0 by0Var = this.d;
        if (by0Var != null) {
            return by0Var.e() != null;
        }
        dh3.T("connectionManager");
        throw null;
    }

    public final boolean k() {
        return m() && g().g0().D();
    }

    public final void l() {
        g().g0().p();
        if (k()) {
            return;
        }
        fi3 fi3VarF = f();
        fi3VarF.b.c(fi3VarF.e, fi3VarF.f);
    }

    public final boolean m() {
        by0 by0Var = this.d;
        if (by0Var == null) {
            dh3.T("connectionManager");
            throw null;
        }
        sm2 sm2Var = (sm2) by0Var.g;
        if (sm2Var != null) {
            return sm2Var.X.isOpen();
        }
        return false;
    }

    public final Object n(Callable callable) {
        b();
        try {
            Object objCall = callable.call();
            p();
            return objCall;
        } finally {
            l();
        }
    }

    public final void o(Runnable runnable) {
        b();
        try {
            runnable.run();
            p();
        } finally {
            l();
        }
    }

    public final void p() {
        g().g0().J();
    }

    public final Object q(boolean z, rn2 rn2Var, s51 s51Var) {
        by0 by0Var = this.d;
        if (by0Var != null) {
            return ((t11) by0Var.f).E(z, rn2Var, s51Var);
        }
        dh3.T("connectionManager");
        throw null;
    }
}
