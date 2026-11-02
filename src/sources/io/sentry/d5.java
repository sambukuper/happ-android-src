package io.sentry;

import java.util.concurrent.Callable;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d5 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io.sentry.internal.debugmeta.c b;

    public /* synthetic */ d5(io.sentry.internal.debugmeta.c cVar, byte b) {
        this.a = b;
        this.b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        io.sentry.internal.debugmeta.c cVar = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(cVar.o().length);
            case 1:
                return cVar.o();
            case 2:
                return Integer.valueOf(cVar.o().length);
            case 3:
                return cVar.o();
            case 4:
                return Integer.valueOf(cVar.o().length);
            case 5:
                return cVar.o();
            case 6:
                return Integer.valueOf(cVar.o().length);
            case 7:
                return Integer.valueOf(cVar.o().length);
            case 8:
                return cVar.o();
            case 9:
                return Integer.valueOf(cVar.o().length);
            case 10:
                return cVar.o();
            case 11:
                return Integer.valueOf(cVar.o().length);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return cVar.o();
            case 13:
                return Integer.valueOf(cVar.o().length);
            case 14:
                return cVar.o();
            case 15:
                return cVar.o();
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return Integer.valueOf(cVar.o().length);
            case 17:
                return cVar.o();
            case 18:
                return Integer.valueOf(cVar.o().length);
            default:
                return cVar.o();
        }
    }
}
