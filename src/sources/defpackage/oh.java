package defpackage;

import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ oh(Object obj, long j, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = j;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        long j = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                return ((q67) ((d90) obj)).b(j);
            case 1:
                return Long.valueOf(Http2Connection._init_$lambda$0((Http2Connection) obj, j));
            case 2:
                return Long.valueOf(RealWebSocket.initReaderAndWriter$lambda$0$0((RealWebSocket) obj, j));
            default:
                d02 d02Var = d02.X;
                return new y68((String) obj, j, new xd6((u88) null, new bm8(d02Var, d02Var, 100)));
        }
    }
}
