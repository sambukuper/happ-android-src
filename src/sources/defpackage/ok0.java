package defpackage;

import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ok0 {
    public final Object a = new Object();
    public final f63 b = new f63((byte) 9);
    public final yz4 c = new yz4();
    public qi0 d;
    public bj0 e;
    public vx f;
    public boolean g;
    public final LinkedHashMap h;

    public ok0() {
        bj0 bj0Var = bj0.Z;
        this.e = bj0Var;
        this.h = new LinkedHashMap();
        c(bj0Var, null);
    }

    public final void a(qi0 qi0Var, rt2 rt2Var) {
        nt2 nt2Var = nt2.c;
        nt2 nt2Var2 = nt2.b;
        if (qi0Var != this.d) {
            if (hi5.i0("CXCP")) {
                Objects.toString(rt2Var);
                return;
            }
            return;
        }
        bj0 bj0Var = this.e;
        bj0Var.getClass();
        rt2Var.getClass();
        int iOrdinal = bj0Var.ordinal();
        bj0 bj0Var2 = bj0.i0;
        bj0 bj0Var3 = bj0.h0;
        nk0 nk0Var = null;
        if (iOrdinal != 2) {
            bj0 bj0Var4 = bj0.f0;
            bj0 bj0Var5 = bj0.Z;
            if (iOrdinal != 3) {
                ot2 ot2Var = ot2.b;
                bj0 bj0Var6 = bj0.g0;
                if (iOrdinal != 4) {
                    pt2 pt2Var = pt2.b;
                    if (iOrdinal != 5) {
                        if (iOrdinal == 6) {
                            if (rt2Var.equals(pt2Var)) {
                                nk0Var = new nk0(bj0Var6);
                            } else if (rt2Var.equals(ot2Var)) {
                                nk0Var = new nk0(bj0Var5);
                            } else if (rt2Var instanceof mt2) {
                                int i = ((mt2) rt2Var).b;
                                nk0Var = w79.H(i) ? new nk0(bj0Var4, w79.M(i)) : new nk0(bj0Var5, w79.M(i));
                            }
                        }
                    } else if (rt2Var.equals(nt2Var2)) {
                        nk0Var = new nk0(bj0Var2);
                    } else if (rt2Var instanceof mt2) {
                        mt2 mt2Var = (mt2) rt2Var;
                        int i2 = mt2Var.b;
                        if (mt2Var.c) {
                            nk0Var = new nk0(bj0Var3, w79.M(i2));
                        } else {
                            nk0Var = w79.H(i2) ? new nk0(bj0Var4, w79.M(i2)) : new nk0(bj0Var6, w79.M(i2));
                        }
                    } else if (rt2Var.equals(pt2Var)) {
                        nk0Var = new nk0(bj0Var6);
                    } else if (rt2Var.equals(ot2Var)) {
                        nk0Var = new nk0(bj0Var5);
                    }
                } else if (rt2Var.equals(ot2Var)) {
                    nk0Var = new nk0(bj0Var5);
                } else if (rt2Var.equals(nt2Var)) {
                    nk0Var = new nk0(bj0Var3);
                } else if (rt2Var instanceof mt2) {
                    nk0Var = new nk0(bj0Var6, w79.M(((mt2) rt2Var).b));
                }
            } else if (rt2Var.equals(nt2Var)) {
                nk0Var = new nk0(bj0Var3);
            } else if (rt2Var.equals(nt2Var2)) {
                nk0Var = new nk0(bj0Var2);
            } else if (rt2Var instanceof mt2) {
                int i3 = ((mt2) rt2Var).b;
                nk0Var = w79.H(i3) ? new nk0(bj0Var4, w79.M(i3)) : new nk0(bj0Var5, w79.M(i3));
            }
        } else if (rt2Var.equals(nt2Var)) {
            nk0Var = new nk0(bj0Var3);
        } else if (rt2Var.equals(nt2Var2)) {
            nk0Var = new nk0(bj0Var2);
        }
        if (nk0Var == null) {
            if (hi5.m0()) {
                Objects.toString(this.e);
                rt2Var.toString();
                return;
            }
            return;
        }
        this.e = nk0Var.a;
        this.f = nk0Var.b;
        if (hi5.i0("CXCP")) {
            nk0Var.toString();
        }
        c(this.e, this.f);
    }

    public final void b(qi0 qi0Var, rt2 rt2Var) {
        rt2Var.getClass();
        synchronized (this.a) {
            if (this.g) {
                if (hi5.m0()) {
                    rt2Var.toString();
                }
            } else {
                if (hi5.i0("CXCP")) {
                    rt2Var.toString();
                }
                a(qi0Var, rt2Var);
            }
        }
    }

    public final void c(bj0 bj0Var, vx vxVar) {
        List<Map.Entry> listY0;
        ((yz4) this.b.Y).k(new tc4(bj0Var));
        bj0Var.getClass();
        int iOrdinal = bj0Var.ordinal();
        int i = 5;
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                i = 1;
            } else if (iOrdinal == 4) {
                i = 4;
            } else if (iOrdinal == 5) {
                i = 2;
            } else {
                if (iOrdinal != 6) {
                    u52.j(bj0Var, "Unexpected CameraInternal state: ");
                    return;
                }
                i = 3;
            }
        }
        ux uxVar = new ux(i, vxVar);
        yz4 yz4Var = this.c;
        yz4Var.getClass();
        if (dh3.f(Looper.myLooper(), Looper.getMainLooper())) {
            yz4Var.j(uxVar);
        } else {
            yz4Var.k(uxVar);
        }
        synchronized (this.a) {
            listY0 = wv0.Y0(this.h.entrySet());
        }
        for (Map.Entry entry : listY0) {
            ((Executor) entry.getValue()).execute(new sc((d41) entry.getKey(), uxVar, (byte) 8));
        }
    }
}
