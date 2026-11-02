package defpackage;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import su.happ.proxyutility.ui.ScannerActivity;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d6 implements ov8 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public Object Z;
    public Object f0;
    public Object g0;
    public Object h0;
    public Object i0;
    public Object j0;
    public final Object k0;

    public d6(byte b) {
        this.X = b;
        switch (b) {
            case 4:
                Boolean bool = Boolean.FALSE;
                this.Y = z51.H(bool);
                this.g0 = new nh5(1.0f);
                this.h0 = z51.H(bool);
                this.i0 = new nh5(1.0f);
                this.j0 = z51.H(bool);
                this.Z = z51.H(new gd8(gd8.b));
                this.k0 = z51.H(bool);
                this.f0 = z51.H(new dw0(dw0.f));
                break;
            default:
                this.Y = new Object();
                this.h0 = u73.Z;
                this.k0 = new HashMap();
                this.f0 = new HashSet();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0074, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:5:0x003d, B:7:0x0050, B:9:0x005c, B:11:0x0060, B:17:0x006e, B:18:0x0071, B:22:0x0077), top: B:72:0x003d, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r18v1, types: [a7, cj0] */
    public static p84 a(d6 d6Var, ScannerActivity scannerActivity, lk0 lk0Var, xy0 xy0Var) {
        p84 p84VarB;
        Collection collectionUnmodifiableCollection;
        Object obj;
        boolean zContains;
        b7 b7Var;
        dq dqVar = dq.g0;
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            s08.b();
            zl0 zl0Var = (zl0) d6Var.i0;
            zl0Var.getClass();
            cj0 cj0VarC = lk0Var.c(zl0Var.a.c());
            cj0VarC.getClass();
            cj0VarC.r(true);
            a7 a7VarC = d6Var.c(lk0Var);
            Object obj2 = null;
            wi0 wi0VarC = z68.C(a7VarC, null);
            t84 t84Var = (t84) d6Var.j0;
            t84Var.getClass();
            synchronized (t84Var.a) {
                try {
                    p84VarB = (p84) t84Var.b.get(new sy(System.identityHashCode(scannerActivity), wi0VarC));
                    if (p84VarB != null) {
                        tl0 tl0Var = p84VarB.Z;
                        if (tl0Var.X.X.m() || ((b7Var = tl0Var.Y) != null && b7Var.X.m())) {
                            t84Var.k(p84VarB);
                            p84VarB = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            t84 t84Var2 = (t84) d6Var.j0;
            t84Var2.getClass();
            synchronized (t84Var2.a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(t84Var2.b.values());
            }
            for (hq8 hq8Var : (List) xy0Var.h0) {
                for (Object obj3 : collectionUnmodifiableCollection) {
                    obj3.getClass();
                    p84 p84Var = (p84) obj3;
                    synchronized (p84Var.X) {
                        obj = obj2;
                        zContains = ((ArrayList) p84Var.Z.A()).contains(hq8Var);
                    }
                    if (zContains && !p84Var.f().equals(scannerActivity)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{hq8Var}, 1)));
                    }
                    obj2 = obj;
                }
            }
            ?? r18 = obj2;
            if (p84VarB == null) {
                t84 t84Var3 = (t84) d6Var.j0;
                t84Var3.getClass();
                zl0 zl0Var2 = (zl0) d6Var.i0;
                zl0Var2.getClass();
                z47 z47Var = zl0Var2.k;
                if (z47Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                tl0 tl0Var2 = new tl0(cj0VarC, r18, a7VarC, r18, dqVar, dqVar, (vh0) z47Var.Z, (xd6) z47Var.g0, (hr8) z47Var.f0);
                zl0 zl0Var3 = (zl0) d6Var.i0;
                zl0Var3.getClass();
                p84VarB = t84Var3.b(scannerActivity, tl0Var2, (dm6) zl0Var3.o.getValue());
            }
            if (!((List) xy0Var.h0).isEmpty()) {
                t84 t84Var4 = (t84) d6Var.j0;
                t84Var4.getClass();
                zl0 zl0Var4 = (zl0) d6Var.i0;
                zl0Var4.getClass();
                t6 t6Var = zl0Var4.g;
                if (t6Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                t84Var4.a(p84VarB, xy0Var, (vh0) t6Var.h0);
                ((HashSet) d6Var.f0).add(new sy(System.identityHashCode(scannerActivity), wi0VarC));
            }
            Trace.endSection();
            return p84VarB;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public lh0 b(lk0 lk0Var) {
        Iterator it = lk0Var.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ny nyVar = i84.b;
            if (!dh3.f(nyVar, nyVar)) {
                synchronized (l62.a) {
                }
                ((Context) this.Z).getClass();
            }
        }
        return mh0.a;
    }

    public a7 c(lk0 lk0Var) {
        Object a7Var;
        Trace.beginSection("CX:getCameraInfo");
        try {
            zl0 zl0Var = (zl0) this.i0;
            zl0Var.getClass();
            aj0 aj0VarS = lk0Var.c(zl0Var.a.c()).s();
            aj0VarS.getClass();
            lh0 lh0VarB = b(lk0Var);
            String strE = aj0VarS.e();
            strE.getClass();
            wi0 wi0VarV = z68.v(strE, null, lh0VarB.X);
            synchronized (this.Y) {
                a7Var = ((HashMap) this.k0).get(wi0VarV);
                if (a7Var == null) {
                    a7Var = new a7(aj0VarS, lh0VarB);
                    ((HashMap) this.k0).put(wi0VarV, a7Var);
                }
            }
            a7 a7Var2 = (a7) a7Var;
            Trace.endSection();
            return a7Var2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void d(zl0 zl0Var, Context context) {
        ek0 ek0Var;
        synchronized (this.Y) {
            this.i0 = zl0Var;
            this.Z = context;
            if (zl0Var != null && (ek0Var = zl0Var.n) != null) {
                ScheduledExecutorService scheduledExecutorServiceJ = km4.J();
                scheduledExecutorServiceJ.getClass();
                ek0Var.n.add(new ck0(this, scheduledExecutorServiceJ));
                ((lv2) scheduledExecutorServiceJ).execute(new ak0(ek0Var, this));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(int i) {
        jk0 jk0Var;
        zl0 zl0Var = (zl0) this.i0;
        if (zl0Var != null) {
            zl0Var.getClass();
            t6 t6Var = zl0Var.g;
            if (t6Var == null) {
                bt.i("CameraX not initialized yet.");
                return;
            }
            vh0 vh0Var = (vh0) t6Var.h0;
            synchronized (vh0Var.b) {
                vh0Var.e = i;
                jk0Var = vh0Var.c;
            }
            if (jk0Var == null) {
                return;
            }
            vh0Var.f = i == 2;
            Iterator it = jk0Var.c().iterator();
            it.getClass();
            while (it.hasNext()) {
                cj0 cj0Var = (cj0) it.next();
                ej0 ej0Var = cj0Var instanceof ej0 ? (ej0) cj0Var : null;
                if (ej0Var != null) {
                    if (i == 1) {
                        lr8 lr8Var = ej0Var.X;
                        synchronized (lr8Var.k) {
                            lr8Var.o = true;
                        }
                    } else if (i != 2) {
                        continue;
                    } else {
                        lr8 lr8Var2 = ej0Var.X;
                        synchronized (lr8Var2.k) {
                            lr8Var2.o = false;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object f(String str, int i, long j, bg0 bg0Var, pw pwVar, s51 s51Var) {
        sk0 sk0Var;
        bg0 bg0Var2;
        pw pwVar2;
        long j2;
        int i2;
        String str2;
        if (s51Var instanceof sk0) {
            sk0Var = (sk0) s51Var;
            int i3 = sk0Var.m0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sk0Var.m0 = i3 - Integer.MIN_VALUE;
            } else {
                sk0Var = new sk0(this, s51Var);
            }
        } else {
            sk0Var = new sk0(this, s51Var);
        }
        Object objW = sk0Var.k0;
        c71 c71Var = c71.X;
        int i4 = sk0Var.m0;
        q51 q51Var = null;
        if (i4 == 0) {
            w39.n0(objW);
            ig0 ig0Var = (ig0) this.g0;
            sk0Var.f0 = str;
            sk0Var.g0 = bg0Var;
            sk0Var.h0 = pwVar;
            sk0Var.i0 = i;
            sk0Var.j0 = j;
            sk0Var.m0 = 1;
            hg0 hg0Var = (hg0) ig0Var;
            synchronized (hg0Var.f) {
                jj0 jj0Var = (jj0) hg0Var.f.get(str);
                objW = jj0Var != null ? jj0Var : w51.W(hg0Var.b.f, new k(hg0Var, str, q51Var, (byte) 5), sk0Var);
            }
            if (objW != c71Var) {
                bg0Var2 = bg0Var;
                pwVar2 = pwVar;
                j2 = j;
                i2 = i;
                str2 = str;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                w39.n0(objW);
                return objW;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = sk0Var.j0;
        int i5 = sk0Var.i0;
        pw pwVar3 = sk0Var.h0;
        bg0 bg0Var3 = sk0Var.g0;
        String str3 = sk0Var.f0;
        w39.n0(objW);
        pwVar2 = pwVar3;
        j2 = j3;
        bg0Var2 = bg0Var3;
        str2 = str3;
        i2 = i5;
        u08 u08Var = (u08) this.j0;
        eg0 eg0Var = (eg0) this.h0;
        jg0 jg0Var = (jg0) this.i0;
        s98 s98Var = (s98) this.k0;
        lj0 lj0Var = (lj0) this.Z;
        xk0 xk0Var = new xk0(this, str2, new db(str2, (jj0) objW, i2, j2, u08Var, eg0Var, bg0Var2, jg0Var, s98Var, pwVar2, lj0Var.a, lj0Var.b), null);
        sk0Var.f0 = null;
        sk0Var.g0 = null;
        sk0Var.h0 = null;
        sk0Var.m0 = 2;
        nw7 nw7Var = new nw7(sk0Var, sk0Var.w());
        Object objD = z38.d(nw7Var, true, nw7Var, xk0Var);
        return objD == c71Var ? c71Var : objD;
    }

    @Override // defpackage.ov8
    public View getRoot() {
        switch (this.X) {
            case 0:
                break;
        }
        return (LinearLayout) this.Y;
    }

    public /* synthetic */ d6(LinearLayout linearLayout, View view, ViewGroup viewGroup, ViewGroup viewGroup2, LinearLayout linearLayout2, HappSpinnerField happSpinnerField, LinearLayout linearLayout3, Toolbar toolbar, byte b) {
        this.X = b;
        this.Y = linearLayout;
        this.g0 = view;
        this.h0 = viewGroup;
        this.i0 = viewGroup2;
        this.j0 = linearLayout2;
        this.Z = happSpinnerField;
        this.k0 = linearLayout3;
        this.f0 = toolbar;
    }

    public d6(dq dqVar, ig0 ig0Var, eg0 eg0Var, jg0 jg0Var, u08 u08Var, lj0 lj0Var, s98 s98Var) {
        this.X = (byte) 2;
        ig0Var.getClass();
        eg0Var.getClass();
        jg0Var.getClass();
        u08Var.getClass();
        s98Var.getClass();
        this.Y = dqVar;
        this.g0 = ig0Var;
        this.h0 = eg0Var;
        this.i0 = jg0Var;
        this.j0 = u08Var;
        this.Z = lj0Var;
        this.k0 = s98Var;
        this.f0 = new ux0();
    }

    public d6(Context context, xy0 xy0Var, y5 y5Var, fv5 fv5Var, WorkDatabase workDatabase, l49 l49Var, ArrayList arrayList) {
        this.X = (byte) 5;
        context.getClass();
        fv5Var.getClass();
        this.Y = xy0Var;
        this.g0 = y5Var;
        this.h0 = fv5Var;
        this.i0 = workDatabase;
        this.j0 = l49Var;
        this.Z = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.k0 = applicationContext;
        this.f0 = new zv7((byte) 12);
    }
}
