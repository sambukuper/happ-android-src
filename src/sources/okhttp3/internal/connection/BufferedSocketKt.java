package okhttp3.internal.connection;

import defpackage.aa0;
import defpackage.ba0;
import defpackage.vr3;
import defpackage.yd7;
import defpackage.z47;
import java.net.Socket;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/net/Socket;", "Lokhttp3/internal/connection/BufferedSocket;", "asBufferedSocket", "(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;", "Lyd7;", "(Lyd7;)Lokhttp3/internal/connection/BufferedSocket;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BufferedSocketKt {
    public static final BufferedSocket asBufferedSocket(Socket socket) {
        socket.getClass();
        return asBufferedSocket(new z47(socket));
    }

    public static final BufferedSocket asBufferedSocket(yd7 yd7Var) {
        yd7Var.getClass();
        return new BufferedSocket(yd7Var) { // from class: okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket.1
            private final yd7 delegate;
            private final aa0 sink;
            private final ba0 source;

            {
                this.delegate = yd7Var;
                this.source = vr3.i(yd7Var.getSource());
                this.sink = vr3.h(yd7Var.getSink());
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.yd7
            public void cancel() {
                this.delegate.cancel();
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.yd7
            public aa0 getSink() {
                return this.sink;
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.yd7
            public ba0 getSource() {
                return this.source;
            }
        };
    }
}
