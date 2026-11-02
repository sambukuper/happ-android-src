package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i89 implements ps2, qs2 {
    public final is2 h;
    public final qn i;
    public final c89 j;
    public final int m;
    public final q89 n;
    public boolean o;
    public final /* synthetic */ rs2 s;
    public final LinkedList g = new LinkedList();
    public final HashSet k = new HashSet();
    public final HashMap l = new HashMap();
    public final ArrayList p = new ArrayList();
    public x11 q = null;
    public int r = 0;

    public i89(rs2 rs2Var, ms2 ms2Var) {
        this.s = rs2Var;
        Looper looper = rs2Var.m.getLooper();
        lr lrVarA = ms2Var.a();
        fu6 fu6Var = new fu6((bu) lrVarA.Y, (String) lrVarA.Z, (String) lrVarA.f0);
        is2 is2VarG = ((w79) ms2Var.d.Y).g(ms2Var.a, looper, fu6Var, ms2Var.e, this, this);
        yr2 yr2Var = ms2Var.c;
        if (yr2Var == null || !(is2VarG instanceof u10)) {
            String str = ms2Var.b;
            if (str != null && (is2VarG instanceof u10)) {
                is2VarG.r = str;
            }
        } else {
            is2VarG.s = yr2Var;
        }
        this.h = is2VarG;
        this.i = ms2Var.f;
        this.j = new c89();
        this.m = ms2Var.g;
        if (!is2VarG.n()) {
            this.n = null;
            return;
        }
        Context context = rs2Var.e;
        f99 f99Var = rs2Var.m;
        lr lrVarA2 = ms2Var.a();
        this.n = new q89(context, f99Var, new fu6((bu) lrVarA2.Y, (String) lrVarA2.Z, (String) lrVarA2.f0));
    }

    public final void a() {
        rs2 rs2Var = this.s;
        w45.p(rs2Var.m);
        this.q = null;
        l(x11.h0);
        if (this.o) {
            f99 f99Var = rs2Var.m;
            qn qnVar = this.i;
            f99Var.removeMessages(11, qnVar);
            rs2Var.m.removeMessages(9, qnVar);
            this.o = false;
        }
        Iterator it = this.l.values().iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
        e();
        k();
    }

    @Override // defpackage.qs2
    public final void b(x11 x11Var) {
        n(x11Var, null);
    }

    public final void c(int i) {
        w45.p(this.s.m);
        this.q = null;
        this.o = true;
        String str = this.h.a;
        c89 c89Var = this.j;
        c89Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        c89Var.a(true, new Status(20, sb.toString(), null, null));
        qn qnVar = this.i;
        rs2 rs2Var = this.s;
        f99 f99Var = rs2Var.m;
        f99Var.sendMessageDelayed(Message.obtain(f99Var, 9, qnVar), StateDownloadFileV2.Success.OUTDATED_DURATION_MS);
        f99 f99Var2 = rs2Var.m;
        f99Var2.sendMessageDelayed(Message.obtain(f99Var2, 11, qnVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) rs2Var.g.Y;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.l.values().iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
    }

    public final boolean d(x11 x11Var) {
        synchronized (rs2.q) {
            this.s.getClass();
        }
        return false;
    }

    public final void e() {
        LinkedList linkedList = this.g;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o89 o89Var = (o89) arrayList.get(i);
            if (!this.h.l()) {
                return;
            }
            if (h(o89Var)) {
                linkedList.remove(o89Var);
            }
        }
    }

    @Override // defpackage.ps2
    public final void f(int i) {
        rs2 rs2Var = this.s;
        if (Looper.myLooper() == rs2Var.m.getLooper()) {
            c(i);
        } else {
            rs2Var.m.post(new vd0(this, i, (byte) 4));
        }
    }

    @Override // defpackage.ps2
    public final void g() {
        rs2 rs2Var = this.s;
        if (Looper.myLooper() == rs2Var.m.getLooper()) {
            a();
        } else {
            rs2Var.m.post(new xb(this, (byte) 27));
        }
    }

    public final boolean h(o89 o89Var) {
        if (o89Var == null) {
            c89 c89Var = this.j;
            is2 is2Var = this.h;
            o89Var.f(c89Var, is2Var.n());
            try {
                o89Var.g(this);
                return true;
            } catch (DeadObjectException unused) {
                f(1);
                is2Var.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        k82[] k82VarArrA = o89Var.a(this);
        k82 k82Var = null;
        if (k82VarArrA != null && k82VarArrA.length != 0) {
            qa9 qa9Var = this.h.v;
            k82[] k82VarArr = qa9Var == null ? null : qa9Var.Y;
            if (k82VarArr == null) {
                k82VarArr = new k82[0];
            }
            vt vtVar = new vt(k82VarArr.length);
            for (k82 k82Var2 : k82VarArr) {
                vtVar.put(k82Var2.X, Long.valueOf(k82Var2.c()));
            }
            for (k82 k82Var3 : k82VarArrA) {
                Long l = (Long) vtVar.get(k82Var3.X);
                if (l == null || l.longValue() < k82Var3.c()) {
                    k82Var = k82Var3;
                    break;
                }
            }
        }
        if (k82Var == null) {
            c89 c89Var2 = this.j;
            is2 is2Var2 = this.h;
            o89Var.f(c89Var2, is2Var2.n());
            try {
                o89Var.g(this);
                return true;
            } catch (DeadObjectException unused2) {
                f(1);
                is2Var2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        new StringBuilder(this.h.getClass().getName().length() + 53 + String.valueOf(k82Var.X).length() + 2 + String.valueOf(k82Var.c()).length() + 2);
        rs2 rs2Var = this.s;
        if (!rs2Var.n || !o89Var.b(this)) {
            o89Var.e(new lo8(k82Var));
            return true;
        }
        int iC = o89Var.c(this);
        j89 j89Var = new j89(this.i, k82Var);
        ArrayList arrayList = this.p;
        int iIndexOf = arrayList.indexOf(j89Var);
        if (iIndexOf >= 0) {
            j89 j89Var2 = (j89) arrayList.get(iIndexOf);
            rs2Var.m.removeMessages(15, j89Var2);
            rs2Var.m.sendMessageDelayed(Message.obtain(rs2Var.m, 15, j89Var2), StateDownloadFileV2.Success.OUTDATED_DURATION_MS);
        } else {
            arrayList.add(j89Var);
            rs2Var.m.sendMessageDelayed(Message.obtain(rs2Var.m, 15, j89Var), StateDownloadFileV2.Success.OUTDATED_DURATION_MS);
            rs2Var.m.sendMessageDelayed(Message.obtain(rs2Var.m, 16, j89Var), 120000L);
            x11 x11Var = new x11(1, 2, null, null, Integer.valueOf(iC));
            if (d(x11Var)) {
                new StringBuilder(String.valueOf(k82Var.X).length() + 61 + String.valueOf(k82Var.c()).length());
            } else if (rs2Var.e(x11Var, this.m)) {
                new StringBuilder(String.valueOf(k82Var.X).length() + 55 + String.valueOf(k82Var.c()).length());
            }
        }
        return false;
    }

    public final void i(Status status, Exception exc, boolean z) {
        w45.p(this.s.m);
        if ((status == null) == (exc == null)) {
            bt.q("Status XOR exception should be null");
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            o89 o89Var = (o89) it.next();
            if (!z || o89Var.a == 2) {
                if (status != null) {
                    o89Var.d(status);
                } else {
                    o89Var.e(exc);
                }
                it.remove();
            }
        }
    }

    public final void j(Status status) {
        w45.p(this.s.m);
        i(status, null, false);
    }

    public final void k() {
        rs2 rs2Var = this.s;
        f99 f99Var = rs2Var.m;
        qn qnVar = this.i;
        f99Var.removeMessages(12, qnVar);
        f99 f99Var2 = rs2Var.m;
        f99Var2.sendMessageDelayed(f99Var2.obtainMessage(12, qnVar), rs2Var.a);
    }

    public final void l(x11 x11Var) {
        HashSet hashSet = this.k;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            c2.m();
            return;
        }
        if (zc1.F(x11Var, x11.h0)) {
            is2 is2Var = this.h;
            if (!is2Var.l() || is2Var.b == null) {
                kp5.t("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    public final void m(x11 x11Var) {
        w45.p(this.s.m);
        is2 is2Var = this.h;
        String name = is2Var.getClass().getName();
        String strValueOf = String.valueOf(x11Var);
        is2 is2Var2 = is2Var;
        is2Var2.c(oi0.q(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        n(x11Var, null);
    }

    public final void n(x11 x11Var, RuntimeException runtimeException) {
        z87 z87Var;
        rs2 rs2Var = this.s;
        w45.p(rs2Var.m);
        q89 q89Var = this.n;
        if (q89Var != null && (z87Var = q89Var.m) != null) {
            z87Var.b();
        }
        w45.p(this.s.m);
        this.q = null;
        SparseIntArray sparseIntArray = (SparseIntArray) rs2Var.g.Y;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(x11Var);
        if ((this.h instanceof i99) && x11Var.Y != 24) {
            rs2Var.b = true;
            f99 f99Var = rs2Var.m;
            f99Var.sendMessageDelayed(f99Var.obtainMessage(19), 300000L);
        }
        int i = x11Var.Y;
        if (i == 4) {
            j(rs2.p);
            return;
        }
        if (i == 25) {
            j(rs2.b(this.i, x11Var));
            return;
        }
        LinkedList linkedList = this.g;
        if (linkedList.isEmpty()) {
            this.q = x11Var;
            return;
        }
        if (runtimeException != null) {
            w45.p(rs2Var.m);
            i(null, runtimeException, false);
            return;
        }
        boolean z = rs2Var.n;
        qn qnVar = this.i;
        if (!z) {
            j(rs2.b(qnVar, x11Var));
            return;
        }
        i(rs2.b(qnVar, x11Var), null, true);
        if (linkedList.isEmpty() || d(x11Var) || rs2Var.e(x11Var, this.m)) {
            return;
        }
        if (x11Var.Y == 18) {
            this.o = true;
        }
        if (!this.o) {
            j(rs2.b(qnVar, x11Var));
        } else {
            f99 f99Var2 = rs2Var.m;
            f99Var2.sendMessageDelayed(Message.obtain(f99Var2, 9, qnVar), StateDownloadFileV2.Success.OUTDATED_DURATION_MS);
        }
    }

    public final void o(o89 o89Var) {
        w45.p(this.s.m);
        boolean zL = this.h.l();
        LinkedList linkedList = this.g;
        if (zL) {
            if (h(o89Var)) {
                k();
                return;
            } else {
                linkedList.add(o89Var);
                return;
            }
        }
        linkedList.add(o89Var);
        x11 x11Var = this.q;
        if (x11Var == null || x11Var.Y == 0 || x11Var.Z == null) {
            q();
        } else {
            n(x11Var, null);
        }
    }

    public final void p() {
        rs2 rs2Var = this.s;
        w45.p(rs2Var.m);
        Status status = rs2.o;
        j(status);
        this.j.a(false, status);
        for (lc4 lc4Var : (lc4[]) this.l.keySet().toArray(new lc4[0])) {
            o(new y89(new z18()));
        }
        l(new x11(4, null, null));
        if (this.h.l()) {
            rs2Var.m.post(new xb(new q09(this), (byte) 28));
        }
    }

    public final void q() {
        rs2 rs2Var = this.s;
        w45.p(rs2Var.m);
        is2 is2Var = this.h;
        if (is2Var.l()) {
            return;
        }
        is2 is2Var2 = is2Var;
        if (is2Var2.m()) {
            return;
        }
        try {
            int iD = rs2Var.g.d(rs2Var.e, is2Var);
            if (iD != 0) {
                x11 x11Var = new x11(iD, null, null);
                new StringBuilder(is2Var.getClass().getName().length() + 35 + x11Var.toString().length());
                n(x11Var, null);
                return;
            }
            bl blVar = new bl(rs2Var, is2Var, this.i);
            if (is2Var.n()) {
                q89 q89Var = this.n;
                w45.s(q89Var);
                z87 z87Var = q89Var.m;
                if (z87Var != null) {
                    z87Var.b();
                }
                fu6 fu6Var = q89Var.l;
                fu6Var.i0 = Integer.valueOf(System.identityHashCode(q89Var));
                z79 z79Var = q89Var.j;
                Context context = q89Var.h;
                Handler handler = q89Var.i;
                q89Var.m = (z87) z79Var.g(context, handler.getLooper(), fu6Var, (a97) fu6Var.h0, q89Var, q89Var);
                q89Var.n = blVar;
                Set set = q89Var.k;
                if (set == null || set.isEmpty()) {
                    handler.post(new xb(q89Var));
                } else {
                    z87 z87Var2 = q89Var.m;
                    z87Var2.getClass();
                    z87Var2.i = new wl6(z87Var2);
                    z87Var2.p(2, null);
                }
            }
            try {
                is2Var2.i = blVar;
                is2Var2.p(2, null);
            } catch (SecurityException e) {
                n(new x11(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            n(new x11(10, null, null), e2);
        }
    }
}
