package defpackage;

import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v13 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Http2Connection Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ ErrorCode f0;

    public /* synthetic */ v13(Http2Connection http2Connection, int i, ErrorCode errorCode, byte b) {
        this.X = b;
        this.Y = http2Connection;
        this.Z = i;
        this.f0 = errorCode;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ErrorCode errorCode = this.f0;
        int i = this.Z;
        Http2Connection http2Connection = this.Y;
        switch (b) {
            case 0:
                return Http2Connection.writeSynResetLater$lambda$0(http2Connection, i, errorCode);
            default:
                return Http2Connection.pushResetLater$lambda$0(http2Connection, i, errorCode);
        }
    }
}
