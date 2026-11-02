package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import okhttp3.Request;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b72 extends uy7 implements rn2 {
    public final /* synthetic */ Request.Builder g0;
    public final /* synthetic */ e72 h0;
    public final /* synthetic */ long i0;
    public final /* synthetic */ Proxy j0;
    public final /* synthetic */ HashMap k0;
    public final /* synthetic */ String l0;
    public final /* synthetic */ boolean m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b72(Request.Builder builder, e72 e72Var, long j, Proxy proxy, HashMap map, String str, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.g0 = builder;
        this.h0 = e72Var;
        this.i0 = j;
        this.j0 = proxy;
        this.k0 = map;
        this.l0 = str;
        this.m0 = z;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((b72) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new b72(this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object rj6Var;
        yf8 yf8Var;
        Object rj6Var2;
        Object rj6Var3;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        w39.n0(obj);
        Request.Builder builder = this.g0;
        e72 e72Var = this.h0;
        try {
            rj6Var = new yf8(e72Var.b(builder.build(), false, this.i0, this.j0, this.k0, this.l0, this.m0), _UrlKt.FRAGMENT_ENCODE_SET, null);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Throwable thA = sj6.a(rj6Var);
        if (thA == null) {
            return (yf8) rj6Var;
        }
        String message = thA.getMessage();
        long j = this.i0;
        Proxy proxy = this.j0;
        HashMap map = this.k0;
        String str2 = this.l0;
        boolean z = this.m0;
        if (message == null || !fm7.d0(message, "Connection reset", false)) {
            String message2 = thA.getMessage();
            if ((message2 == null || !fm7.d0(message2, "timeout", false)) && !(thA instanceof IOException)) {
                yf8Var = null;
            } else {
                try {
                    rj6Var2 = new yf8(e72Var.b(builder.build(), true, j, proxy, map, str2, z), _UrlKt.FRAGMENT_ENCODE_SET, null);
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var2 = new rj6(th2);
                }
                Throwable thA2 = sj6.a(rj6Var2);
                if (thA2 != null) {
                    String message3 = thA2.getMessage();
                    if (message3 == null && (message3 = thA.getMessage()) == null) {
                        message3 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    rj6Var2 = new yf8(null, message3, thA2);
                }
                yf8Var = (yf8) rj6Var2;
            }
        } else {
            builder.removeHeader("Connection");
            try {
                rj6Var3 = new yf8(e72Var.b(builder.build(), false, j, proxy, map, str2, z), _UrlKt.FRAGMENT_ENCODE_SET, null);
            } catch (Throwable th3) {
                if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                    throw th3;
                }
                rj6Var3 = new rj6(th3);
            }
            Throwable thA3 = sj6.a(rj6Var3);
            if (thA3 != null) {
                String message4 = thA3.getMessage();
                if (message4 == null && (message4 = thA.getMessage()) == null) {
                    message4 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                rj6Var3 = new yf8(null, message4, thA3);
            }
            yf8Var = (yf8) rj6Var3;
        }
        if (yf8Var == null) {
            String message5 = thA.getMessage();
            if (message5 != null) {
                str = message5;
            }
            yf8Var = new yf8(null, str, thA);
        }
        return yf8Var;
    }
}
