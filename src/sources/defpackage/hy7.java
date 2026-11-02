package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hy7 {
    public final Object a = new Object();
    public final Size b;
    public final px1 c;
    public final cj0 d;
    public final boolean e;
    public final ud0 f;
    public final qd0 g;
    public final ud0 h;
    public final qd0 i;
    public final qd0 j;
    public final v73 k;
    public mz l;
    public gy7 m;
    public Executor n;

    static {
        Range range = iz.h;
    }

    public hy7(Size size, cj0 cj0Var, boolean z, px1 px1Var, sx7 sx7Var) {
        this.b = size;
        this.d = cj0Var;
        this.e = z;
        mb6.o(px1Var.b(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.c = px1Var;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            atomicReference.set(qd0Var);
            qd0Var.a = str.concat("-cancellation");
        } catch (Exception e) {
            ud0Var.b(e);
        }
        qd0 qd0Var2 = (qd0) atomicReference.get();
        qd0Var2.getClass();
        this.j = qd0Var2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        qd0 qd0Var3 = new qd0();
        qd0Var3.c = new if6();
        ud0 ud0Var2 = new ud0(qd0Var3);
        qd0Var3.b = ud0Var2;
        qd0Var3.a = p61.class;
        try {
            atomicReference2.set(qd0Var3);
            qd0Var3.a = str.concat("-status");
        } catch (Exception e2) {
            ud0Var2.b(e2);
        }
        this.h = ud0Var2;
        dq dqVar = new dq((Object) qd0Var2, (Object) ud0Var, (byte) 4);
        byte b = 0;
        ud0Var2.a(new zo2(ud0Var2, dqVar, b), dp1.a());
        qd0 qd0Var4 = (qd0) atomicReference2.get();
        qd0Var4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        qd0 qd0Var5 = new qd0();
        qd0Var5.c = new if6();
        ud0 ud0Var3 = new ud0(qd0Var5);
        qd0Var5.b = ud0Var3;
        qd0Var5.a = p61.class;
        try {
            atomicReference3.set(qd0Var5);
            qd0Var5.a = str.concat("-Surface");
        } catch (Exception e3) {
            ud0Var3.b(e3);
        }
        this.f = ud0Var3;
        qd0 qd0Var6 = (qd0) atomicReference3.get();
        qd0Var6.getClass();
        this.g = qd0Var6;
        v73 v73Var = new v73(this, size);
        this.k = v73Var;
        xb4 xb4VarP = vr3.P(v73Var.e);
        ud0Var3.a(new zo2(ud0Var3, new lr((Object) xb4VarP, (Object) qd0Var4, (Object) str, (byte) 2), b), dp1.a());
        xb4VarP.a(new ig1(this, (byte) 1), dp1.a());
        dp1 dp1VarA = dp1.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        ud0 ud0VarU = u15.u(new jn0(this, atomicReference4, (byte) 13));
        ud0VarU.a(new zo2(ud0VarU, new lr5((Object) sx7Var, (byte) 20), b), dp1VarA);
        qd0 qd0Var7 = (qd0) atomicReference4.get();
        qd0Var7.getClass();
        this.i = qd0Var7;
    }

    public final void a(final Surface surface, Executor executor, final d41 d41Var) {
        final byte b = 0;
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: ey7
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    Surface surface2 = surface;
                    d41 d41Var2 = d41Var;
                    switch (b2) {
                        case 0:
                            d41Var2.accept(new lz(2, surface2));
                            break;
                        case 1:
                            d41Var2.accept(new lz(3, surface2));
                            break;
                        default:
                            d41Var2.accept(new lz(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.g.b(surface)) {
            ud0 ud0Var = this.f;
            if (!ud0Var.isCancelled()) {
                mb6.s(null, ud0Var.Y.isDone());
                try {
                    ud0Var.get();
                    final byte b2 = 1;
                    executor.execute(new Runnable() { // from class: ey7
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            Surface surface2 = surface;
                            d41 d41Var2 = d41Var;
                            switch (b3) {
                                case 0:
                                    d41Var2.accept(new lz(2, surface2));
                                    break;
                                case 1:
                                    d41Var2.accept(new lz(3, surface2));
                                    break;
                                default:
                                    d41Var2.accept(new lz(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final byte b3 = 2;
                    executor.execute(new Runnable() { // from class: ey7
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            Surface surface2 = surface;
                            d41 d41Var2 = d41Var;
                            switch (b4) {
                                case 0:
                                    d41Var2.accept(new lz(2, surface2));
                                    break;
                                case 1:
                                    d41Var2.accept(new lz(3, surface2));
                                    break;
                                default:
                                    d41Var2.accept(new lz(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        dq dqVar = new dq((Object) d41Var, (Object) surface, (byte) 5);
        ud0 ud0Var2 = this.h;
        ud0Var2.a(new zo2(ud0Var2, dqVar, b), executor);
    }

    public final void b(Executor executor, gy7 gy7Var) {
        mz mzVar;
        synchronized (this.a) {
            this.m = gy7Var;
            this.n = executor;
            mzVar = this.l;
        }
        if (mzVar != null) {
            executor.execute(new dy7(gy7Var, mzVar, (byte) 1));
        }
    }

    public final boolean c() {
        return this.g.d(new vg1("Surface request will not complete."));
    }
}
