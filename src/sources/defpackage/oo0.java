package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oo0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public oo0(View view, c19 c19Var, xd6 xd6Var, ValueAnimator valueAnimator) {
        this.X = (byte) 2;
        this.Y = view;
        this.Z = c19Var;
        this.f0 = xd6Var;
        this.g0 = valueAnimator;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            switch (this.X) {
                case 0:
                    qo0 qo0Var = (qo0) ((yr2) this.g0).Y;
                    st4 st4Var = (st4) this.Z;
                    po0 po0Var = (po0) this.Y;
                    if (po0Var != null) {
                        qo0Var.C0 = true;
                        po0Var.b.c(false);
                        qo0Var.C0 = false;
                    }
                    if (st4Var.isEnabled() && st4Var.hasSubMenu()) {
                        ((nt4) this.f0).q(st4Var, null, 4);
                        return;
                    }
                    return;
                case 1:
                    try {
                        vb4.b((r43) this.Z, w79.K(new lh5((dc4) ((wy7) this.Y).Y.get())));
                        synchronized (((hc4) this.g0).l) {
                            ((hc4) this.g0).m.remove((String) this.f0);
                            ((hc4) this.g0).n.remove((String) this.f0);
                            HashMap map = ((hc4) this.g0).o;
                            str = (String) this.f0;
                            map.remove(str);
                            break;
                        }
                        this = str;
                    } catch (InterruptedException e) {
                        e = e;
                        vb4.a((r43) this.Z, e);
                        synchronized (((hc4) this.g0).l) {
                            ((hc4) this.g0).m.remove((String) this.f0);
                            ((hc4) this.g0).n.remove((String) this.f0);
                            HashMap map2 = ((hc4) this.g0).o;
                            String str2 = (String) this.f0;
                            map2.remove(str2);
                            this = str2;
                            break;
                        }
                    } catch (CancellationException e2) {
                        lh4 lh4VarP0 = lh4.P0();
                        byte[] bArr = hc4.p;
                        lh4VarP0.getClass();
                        vb4.a((r43) this.Z, e2);
                        synchronized (((hc4) this.g0).l) {
                            ((hc4) this.g0).m.remove((String) this.f0);
                            ((hc4) this.g0).n.remove((String) this.f0);
                            HashMap map3 = ((hc4) this.g0).o;
                            String str3 = (String) this.f0;
                            map3.remove(str3);
                            this = str3;
                        }
                    } catch (ExecutionException e3) {
                        e = e3;
                        vb4.a((r43) this.Z, e);
                        synchronized (((hc4) this.g0).l) {
                            ((hc4) this.g0).m.remove((String) this.f0);
                            ((hc4) this.g0).n.remove((String) this.f0);
                            HashMap map4 = ((hc4) this.g0).o;
                            String str4 = (String) this.f0;
                            map4.remove(str4);
                            this = str4;
                            break;
                        }
                    }
                    return;
                default:
                    y09.i((View) this.Y, (c19) this.Z, (xd6) this.f0);
                    ((ValueAnimator) this.g0).start();
                    return;
            }
        } catch (Throwable th) {
            synchronized (((hc4) this.g0).l) {
                ((hc4) this.g0).m.remove((String) this.f0);
                ((hc4) this.g0).n.remove((String) this.f0);
                ((hc4) this.g0).o.remove((String) this.f0);
                throw th;
            }
        }
        synchronized (((hc4) this.g0).l) {
            ((hc4) this.g0).m.remove((String) this.f0);
            ((hc4) this.g0).n.remove((String) this.f0);
            ((hc4) this.g0).o.remove((String) this.f0);
            throw th;
        }
    }

    public /* synthetic */ oo0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.g0 = obj;
        this.Y = obj2;
        this.Z = obj3;
        this.f0 = obj4;
    }
}
