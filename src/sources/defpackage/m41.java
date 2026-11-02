package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m41 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public final /* synthetic */ long h0;
    public boolean i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;
    public final /* synthetic */ Object m0;
    public final /* synthetic */ Object n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(z47 z47Var, f84 f84Var, long j, Proxy proxy, HashMap map, String str, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.j0 = z47Var;
        this.k0 = f84Var;
        this.h0 = j;
        this.l0 = proxy;
        this.m0 = map;
        this.n0 = str;
        this.i0 = z;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((m41) n((q51) obj2, (ry6) obj)).q(dn8Var);
            default:
                return ((m41) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.n0;
        Object obj3 = this.m0;
        Object obj4 = this.l0;
        Object obj5 = this.k0;
        switch (b) {
            case 0:
                m41 m41Var = new m41((qo8) obj5, (o41) obj4, (w80) obj3, this.h0, (bm3) obj2, q51Var);
                m41Var.j0 = obj;
                return m41Var;
            default:
                boolean z = this.i0;
                return new m41((z47) this.j0, (f84) obj5, this.h0, (Proxy) obj4, (HashMap) obj3, (String) obj2, z, q51Var);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object rj6Var;
        yf8 yf8Var;
        Object rj6Var2;
        Object rj6Var3;
        byte b = this.g0;
        Object obj2 = this.k0;
        Object obj3 = this.n0;
        Object obj4 = this.m0;
        Object obj5 = this.l0;
        switch (b) {
            case 0:
                w80 w80Var = (w80) obj4;
                o41 o41Var = (o41) obj5;
                qo8 qo8Var = (qo8) obj2;
                boolean z = this.i0;
                if (!z) {
                    w39.n0(obj);
                    ry6 ry6Var = (ry6) this.j0;
                    qo8Var.e = o41Var.Y0(w80Var, this.h0);
                    sn snVar = new sn(o41Var, qo8Var, (bm3) obj3, ry6Var);
                    g00 g00Var = new g00((Object) o41Var, (Object) qo8Var, (Object) w80Var, (byte) 5);
                    this.i0 = true;
                    Object objA = qo8Var.a(snVar, g00Var, this);
                    c71 c71Var = c71.X;
                    if (objA == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            default:
                String str = _UrlKt.FRAGMENT_ENCODE_SET;
                w39.n0(obj);
                z47 z47Var = (z47) this.j0;
                f84 f84Var = (f84) obj2;
                try {
                    rj6Var = new yf8(f84Var.b(z47Var.o(), false, this.h0, (Proxy) obj5, (HashMap) obj4, (String) obj3, this.i0), _UrlKt.FRAGMENT_ENCODE_SET, null);
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                Proxy proxy = (Proxy) obj5;
                HashMap map = (HashMap) obj4;
                String str2 = (String) obj3;
                boolean z2 = this.i0;
                Throwable thA = sj6.a(rj6Var);
                if (thA == null) {
                    return (yf8) rj6Var;
                }
                String message = thA.getMessage();
                long j = this.h0;
                if (message != null && fm7.d0(message, "Connection reset", false)) {
                    z47Var.getClass();
                    ((ps) z47Var.f0).e("Connection");
                    try {
                        rj6Var3 = new yf8(f84Var.b(z47Var.o(), false, j, proxy, map, str2, z2), _UrlKt.FRAGMENT_ENCODE_SET, null);
                    } catch (Throwable th2) {
                        if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                            throw th2;
                        }
                        rj6Var3 = new rj6(th2);
                    }
                    Throwable thA2 = sj6.a(rj6Var3);
                    if (thA2 != null) {
                        String message2 = thA2.getMessage();
                        if (message2 == null && (message2 = thA.getMessage()) == null) {
                            message2 = _UrlKt.FRAGMENT_ENCODE_SET;
                        }
                        rj6Var3 = new yf8(null, message2, thA2);
                    }
                    yf8Var = (yf8) rj6Var3;
                    break;
                } else {
                    String message3 = thA.getMessage();
                    if ((message3 == null || !fm7.d0(message3, "timeout", false)) && !(thA instanceof IOException)) {
                        yf8Var = null;
                    } else {
                        try {
                            rj6Var2 = new yf8(f84Var.b(z47Var.o(), true, j, proxy, map, str2, z2), _UrlKt.FRAGMENT_ENCODE_SET, null);
                        } catch (Throwable th3) {
                            if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                                throw th3;
                            }
                            rj6Var2 = new rj6(th3);
                        }
                        Throwable thA3 = sj6.a(rj6Var2);
                        if (thA3 != null) {
                            String message4 = thA3.getMessage();
                            if (message4 == null && (message4 = thA.getMessage()) == null) {
                                message4 = _UrlKt.FRAGMENT_ENCODE_SET;
                            }
                            rj6Var2 = new yf8(null, message4, thA3);
                        }
                        yf8Var = (yf8) rj6Var2;
                    }
                    break;
                }
                if (yf8Var != null) {
                    return yf8Var;
                }
                String message5 = thA.getMessage();
                if (message5 != null) {
                    str = message5;
                }
                return new yf8(null, str, thA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(qo8 qo8Var, o41 o41Var, w80 w80Var, long j, bm3 bm3Var, q51 q51Var) {
        super(2, q51Var);
        this.k0 = qo8Var;
        this.l0 = o41Var;
        this.m0 = w80Var;
        this.h0 = j;
        this.n0 = bm3Var;
    }
}
