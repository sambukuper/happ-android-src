package defpackage;

import android.app.Application;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.SocketServerInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class l27 extends xw8 {
    public final vz7 b;
    public final vz7 c = new vz7(new w76((byte) 27));
    public final vz7 d = new vz7(new w76((byte) 28));
    public final oh7 e;
    public final h76 f;
    public og7 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l27(Application application, SocketServerInfo socketServerInfo) {
        this.b = new vz7(new hr5(application, (byte) 16));
        oh7 oh7VarA = ph7.a(new e27(socketServerInfo, ec7.Y, km5.f0, null));
        this.e = oh7VarA;
        this.f = jm4.n(oh7VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e27 e() {
        return (e27) this.e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(s51 s51Var) {
        g27 g27Var;
        Object objA;
        if (s51Var instanceof g27) {
            g27Var = (g27) s51Var;
            int i = g27Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                g27Var.h0 = i - Integer.MIN_VALUE;
            } else {
                g27Var = new g27(this, s51Var);
            }
        } else {
            g27Var = new g27(this, s51Var);
        }
        Object obj = g27Var.f0;
        int i2 = g27Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            u17 u17Var = (u17) this.c.getValue();
            SocketServerInfo socketServerInfo = e().a;
            c83 c83Var = e().d;
            if (c83Var == null) {
                bt.q("Required value was null.");
                return null;
            }
            String[] strArr = (String[]) c83Var.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            g27Var.h0 = 1;
            objA = u17Var.a(socketServerInfo, strArr2, g27Var);
            c71 c71Var = c71.X;
            if (objA == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            objA = ((sj6) obj).X;
        }
        if (sj6.a(objA) == null) {
            int iIntValue = ((Number) objA).intValue();
            return iIntValue == 200 ? p27.a : new n27(iIntValue);
        }
        ss8 ss8Var = ss8.a;
        return ss8.x() ? q27.a : m27.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        if (r10 == r5) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(s51 s51Var) {
        h27 h27Var;
        Set rj6Var;
        oh7 oh7Var;
        Object value;
        e27 e27Var;
        c83 c83VarB;
        if (s51Var instanceof h27) {
            h27Var = (h27) s51Var;
            int i = h27Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                h27Var.h0 = i - Integer.MIN_VALUE;
            } else {
                h27Var = new h27(this, s51Var);
            }
        } else {
            h27Var = new h27(this, s51Var);
        }
        Object objH = h27Var.f0;
        int i2 = h27Var.h0;
        Object obj = c71.X;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    w39.n0(objH);
                } else {
                    if (i2 != 2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(objH);
                }
                return (r27) objH;
            }
            w39.n0(objH);
            nf1 nf1Var = tp1.a;
            l40 l40Var = new l40(this, (q51) null, (byte) 13);
            h27Var.h0 = 1;
            objH = w51.W(nf1Var, l40Var, h27Var);
            if (objH == obj) {
            }
            return obj;
            rj6Var = (Set) objH;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            return q27.a;
        }
        Set set = rj6Var;
        do {
            oh7Var = this.e;
            value = oh7Var.getValue();
            e27Var = (e27) value;
            Set set2 = set;
            set2.getClass();
            c83VarB = set2 instanceof c83 ? (c83) set2 : null;
            if (c83VarB == null) {
                mm5 mm5Var = set2 instanceof mm5 ? (mm5) set2 : null;
                c83VarB = mm5Var != null ? mm5Var.b() : null;
                if (c83VarB == null) {
                    c83VarB = mb6.V(km5.f0, set2);
                }
            }
        } while (!oh7Var.k(value, e27.a(e27Var, null, null, c83VarB, 7)));
        h27Var.h0 = 2;
        objH = h(set, h27Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Set set, s51 s51Var) {
        k27 k27Var;
        boolean zEquals;
        Object objB;
        if (s51Var instanceof k27) {
            k27Var = (k27) s51Var;
            int i = k27Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                k27Var.h0 = i - Integer.MIN_VALUE;
            } else {
                k27Var = new k27(this, s51Var);
            }
        } else {
            k27Var = new k27(this, s51Var);
        }
        Object obj = k27Var.f0;
        int i2 = k27Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            String ip = e().a.getIp();
            ss8 ss8Var = ss8.a;
            String strL = ss8.l();
            if (ip == null || e().a.getPort() == null) {
                return new o27(y46.send_to_tv_failure_no_wifi);
            }
            if (strL != null) {
                int[] iArrF0 = wl7.f0(ip);
                if (iArrF0 != null) {
                    int[] iArrG0 = eu.G0(iArrF0, x97.a0(0, 3));
                    int[] iArrF1 = wl7.f0(strL);
                    if (iArrF1 != null) {
                        zEquals = Arrays.equals(iArrG0, eu.G0(iArrF1, x97.a0(0, 3)));
                    } else {
                        zEquals = false;
                    }
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    u17 u17Var = (u17) this.c.getValue();
                    SocketServerInfo socketServerInfo = e().a;
                    String[] strArr = (String[]) set.toArray(new String[0]);
                    String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                    k27Var.h0 = 1;
                    objB = u17Var.b(socketServerInfo, strArr2, k27Var);
                    c71 c71Var = c71.X;
                    if (objB == c71Var) {
                        return c71Var;
                    }
                }
            }
            return new o27(y46.send_to_tv_failure_wrong_wifi);
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        objB = ((sj6) obj).X;
        if (sj6.a(objB) != null) {
            return new o27(y46.send_to_tv_failure_timeout);
        }
        return p27.a;
    }
}
