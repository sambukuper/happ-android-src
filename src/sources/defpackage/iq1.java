package defpackage;

import okhttp3.Request;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iq1 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ iq1(Http2Connection.ReaderRunnable readerRunnable, boolean z, Settings settings) {
        this.X = (byte) 1;
        this.Z = readerRunnable;
        this.Y = z;
        this.f0 = settings;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        String str;
        Request.Builder builderHeader;
        switch (this.X) {
            case 0:
                boolean z = this.Y;
                xd6 xd6Var = (xd6) this.Z;
                String str2 = (String) this.f0;
                if (z) {
                    xv6 xv6Var = (xv6) xd6Var.Y;
                    synchronized (xv6Var.c) {
                    }
                }
                return dn8.a;
            case 1:
                return Http2Connection.ReaderRunnable.settings$lambda$0((Http2Connection.ReaderRunnable) this.Z, this.Y, (Settings) this.f0);
            case 2:
                y5 y5Var = (y5) this.Z;
                z47 z47Var = (z47) this.f0;
                boolean z2 = this.Y;
                String strA = ((nz2) y5Var.g0).a("X-HWID");
                if (strA != null) {
                    str = z2 ? strA : null;
                    if (str != null) {
                        ((ps) z47Var.f0).e("X-HWID");
                        z47Var.M("Cookie", str);
                    }
                }
                return z47Var;
            default:
                Request request = (Request) this.Z;
                Request.Builder builder = (Request.Builder) this.f0;
                boolean z3 = this.Y;
                String strHeader = request.header("X-HWID");
                if (strHeader == null) {
                    return builder;
                }
                str = z3 ? strHeader : null;
                return (str == null || (builderHeader = builder.removeHeader("X-HWID").header("Cookie", str)) == null) ? builder : builderHeader;
        }
    }

    public /* synthetic */ iq1(byte b, Object obj, Object obj2, boolean z) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = z;
    }

    public /* synthetic */ iq1(boolean z, xd6 xd6Var, String str) {
        this.X = (byte) 0;
        this.Y = z;
        this.Z = xd6Var;
        this.f0 = str;
    }
}
