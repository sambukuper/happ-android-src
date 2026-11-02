package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b23 extends w18 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b23(String str, Object obj, Object obj2, byte b) {
        super(str, true);
        this.e = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w18
    public final long a() {
        int i;
        long jA;
        o23[] o23VarArr;
        switch (this.e) {
            case 0:
                h23 h23Var = (h23) this.f;
                h23Var.X.a(h23Var, (t57) ((ea6) this.g).X);
                return -1L;
            case 1:
                try {
                    ((h23) this.f).X.b((o23) this.g);
                    break;
                } catch (IOException e) {
                    lo5 lo5Var = lo5.a;
                    lo5 lo5Var2 = lo5.a;
                    String str = "Http2Connection.Listener failure for " + ((h23) this.f).Z;
                    lo5Var2.getClass();
                    lo5.i(str, 4, e);
                    try {
                        ((o23) this.g).c(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                c3 c3Var = (c3) this.f;
                t57 t57Var = (t57) this.g;
                ea6 ea6Var = new ea6();
                h23 h23Var2 = (h23) c3Var.Z;
                synchronized (h23Var2.y0) {
                    synchronized (h23Var2) {
                        try {
                            t57 t57Var2 = h23Var2.s0;
                            t57 t57Var3 = new t57();
                            t57Var2.getClass();
                            Object[] objArr = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & t57Var2.a) != 0) {
                                    t57Var3.b(i2, t57Var2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & t57Var.a) != 0) {
                                    t57Var3.b(i3, t57Var.b[i3]);
                                }
                            }
                            ea6Var.X = t57Var3;
                            jA = ((long) t57Var3.a()) - ((long) t57Var2.a());
                            o23VarArr = (jA == 0 || h23Var2.Y.isEmpty()) ? null : (o23[]) h23Var2.Y.values().toArray(new o23[0]);
                            t57 t57Var4 = (t57) ea6Var.X;
                            t57Var4.getClass();
                            h23Var2.s0 = t57Var4;
                            h23Var2.l0.c(new b23(h23Var2.Z + " onSettings", h23Var2, ea6Var, objArr == true ? 1 : 0), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        h23Var2.y0.g((t57) ea6Var.X);
                    } catch (IOException e2) {
                        h23Var2.g(2, 2, e2);
                    }
                    break;
                }
                if (o23VarArr != null) {
                    for (o23 o23Var : o23VarArr) {
                        synchronized (o23Var) {
                            o23Var.f += jA;
                            if (jA > 0) {
                                o23Var.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return -1L;
        }
    }
}
