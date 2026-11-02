package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eb9 implements h91, m73 {
    public static eb9 h0;
    public static HandlerThread i0;
    public static Handler j0;
    public final /* synthetic */ byte X;
    public int Y;
    public Object Z;
    public Object f0;
    public Object g0;

    public eb9(mn3 mn3Var) {
        this.X = (byte) 4;
        this.Z = mn3Var;
        this.f0 = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.g0 = iArr;
        this.Y = -1;
    }

    public static void j(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    public static synchronized eb9 n(Context context) {
        eb9 eb9Var;
        eb9Var = h0;
        if (eb9Var == null) {
            eb9Var = new eb9(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new e25("MessengerIpcClient"))));
            h0 = eb9Var;
        }
        return eb9Var;
    }

    @Override // defpackage.m73
    public int a() {
        g48 g48Var = (g48) this.f0;
        return g48Var != null ? g48Var.Z.length() : ((kd8) this.Z).d().Z.length();
    }

    @Override // defpackage.m73
    public long b(long j) {
        kd8 kd8Var = (kd8) this.Z;
        return kd8Var.c != null ? kd8Var.e(j) : j;
    }

    @Override // defpackage.h91
    public boolean c() {
        Object next;
        Iterator it = wv0.o0((List) this.f0, this.Y + 1).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((View) next).getVisibility() != 0);
        View view = (View) next;
        return view != null ? view.requestFocus() : ((View) this.g0).requestFocus();
    }

    @Override // defpackage.m73
    public long f(long j) {
        kd8 kd8Var = (kd8) this.Z;
        return kd8Var.c != null ? kd8Var.f(j) : j;
    }

    @Override // defpackage.h91
    public boolean g() {
        return ((BaseActivity) this.Z).x();
    }

    @Override // defpackage.h91
    public boolean i() {
        Object objPrevious;
        Iterator it = new dq4(wv0.U0((List) this.f0, Math.max(this.Y - 1, 0))).iterator();
        do {
            ListIterator listIterator = (ListIterator) ((qk6) it).Y;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((View) objPrevious).getVisibility() != 0);
        View view = (View) objPrevious;
        return view != null ? view.requestFocus() : ((View) this.g0).requestFocus();
    }

    public boolean k() {
        kd8 kd8Var = (kd8) this.Z;
        c15 c15Var = (c15) this.g0;
        int i = this.Y - 1;
        this.Y = i;
        if (i == 0 && c15Var.Z != 0) {
            y68 y68Var = kd8Var.a;
            de3 de3Var = kd8Var.b;
            y68Var.b.a().A();
            g48 g48Var = y68Var.b;
            if (kd8Var.c == null) {
                this.f0 = g48Var;
            }
            Object[] objArr = c15Var.X;
            int i2 = c15Var.Z;
            for (int i3 = 0; i3 < i2; i3++) {
                ((gn2) objArr[i3]).B(g48Var);
            }
            kd8Var.l(g48Var);
            y68Var.b(de3Var, false, e58.X);
            y68Var.f(true);
            y68Var.e(y68Var.b.g0);
            c15Var.g();
        }
        return this.Y > 0;
    }

    public String l() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.Y + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f0)[i2];
            if (obj instanceof e37) {
                e37 e37Var = (e37) obj;
                boolean zF = dh3.f(e37Var.r(), pm7.N);
                int[] iArr = (int[]) this.g0;
                if (!zF) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(e37Var.f(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.g0)[i2]);
                    sb.append("]");
                }
            } else if (obj == pz2.W0) {
                sb.append("[<debug info disabled>]");
            } else if (obj != oy1.F0) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void m() {
        int i = this.Y * 2;
        this.f0 = Arrays.copyOf((Object[]) this.f0, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        eu.h0(0, 0, 14, (int[]) this.g0, iArr);
        this.g0 = iArr;
    }

    public synchronized fb9 o(bb9 bb9Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(bb9Var.toString());
            }
            if (!((xa9) this.g0).a(bb9Var)) {
                xa9 xa9Var = new xa9(this);
                this.g0 = xa9Var;
                xa9Var.a(bb9Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bb9Var.b.a;
    }

    public String toString() {
        switch (this.X) {
            case 4:
                return l();
            default:
                return super.toString();
        }
    }

    public eb9(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.X = (byte) 0;
        this.g0 = new xa9(this);
        this.Y = 1;
        this.f0 = scheduledExecutorService;
        this.Z = context.getApplicationContext();
    }

    public eb9(kd8 kd8Var) {
        this.X = (byte) 2;
        this.Z = kd8Var;
        this.g0 = new c15(0, new gn2[16]);
    }

    public eb9(int i, l90 l90Var, s61 s61Var, xe2 xe2Var) {
        this.X = (byte) 5;
        this.Z = xe2Var;
        this.Y = i;
        this.f0 = l90Var;
        this.g0 = s61Var;
    }

    public eb9(BaseActivity baseActivity, gb4 gb4Var, int i, View view) {
        this.X = (byte) 1;
        this.Z = baseActivity;
        this.f0 = gb4Var;
        this.Y = i;
        this.g0 = view;
    }

    public eb9(int i) {
        this.X = (byte) 3;
        this.Z = new SparseIntArray[9];
        this.f0 = new ArrayList();
        this.g0 = new lm2(this);
        this.Y = i;
    }
}
