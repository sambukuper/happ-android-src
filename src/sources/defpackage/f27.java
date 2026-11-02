package defpackage;

import android.app.Application;
import su.happ.proxyutility.dto.SocketServerInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class f27 implements bx8 {
    public final Application a;
    public final SocketServerInfo b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f27(Application application, SocketServerInfo socketServerInfo) {
        this.a = application;
        this.b = socketServerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final xw8 a(Class cls) {
        return new l27(this.a, this.b);
    }
}
