package okhttp3.internal.connection;

import defpackage.ge1;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Route;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/connection/ConnectionListener;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokhttp3/Route;", "route", "Lokhttp3/Call;", "call", "Ldn8;", "connectStart", "(Lokhttp3/Route;Lokhttp3/Call;)V", "Ljava/io/IOException;", "Lokio/IOException;", "failure", "connectFailed", "(Lokhttp3/Route;Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectEnd", "(Lokhttp3/Connection;Lokhttp3/Route;Lokhttp3/Call;)V", "connectionClosed", "(Lokhttp3/Connection;)V", "connectionAcquired", "(Lokhttp3/Connection;Lokhttp3/Call;)V", "connectionReleased", "noNewExchanges", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConnectionListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConnectionListener NONE = new ConnectionListener() { // from class: okhttp3.internal.connection.ConnectionListener$Companion$NONE$1
    };

    public void connectEnd(Connection connection, Route route, Call call) {
        connection.getClass();
        route.getClass();
        call.getClass();
    }

    public void connectFailed(Route route, Call call, IOException failure) {
        route.getClass();
        call.getClass();
        failure.getClass();
    }

    public void connectStart(Route route, Call call) {
        route.getClass();
        call.getClass();
    }

    public void connectionAcquired(Connection connection, Call call) {
        connection.getClass();
        call.getClass();
    }

    public void connectionClosed(Connection connection) {
        connection.getClass();
    }

    public void connectionReleased(Connection connection, Call call) {
        connection.getClass();
        call.getClass();
    }

    public void noNewExchanges(Connection connection) {
        connection.getClass();
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/ConnectionListener$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "NONE", "Lokhttp3/internal/connection/ConnectionListener;", "getNONE", "()Lokhttp3/internal/connection/ConnectionListener;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        public final ConnectionListener getNONE() {
            return ConnectionListener.NONE;
        }

        private Companion() {
        }
    }
}
