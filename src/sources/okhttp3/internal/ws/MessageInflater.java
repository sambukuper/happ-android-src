package okhttp3.internal.ws;

import defpackage.bt;
import defpackage.i90;
import defpackage.oc3;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", _UrlKt.FRAGMENT_ENCODE_SET, "noContextTakeover", "<init>", "(Z)V", "Li90;", "buffer", "Ldn8;", "inflate", "(Li90;)V", "close", "()V", "Z", "deflatedBytes", "Li90;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Loc3;", "inflaterSource", "Loc3;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageInflater implements Closeable {
    private final i90 deflatedBytes = new i90();
    private Inflater inflater;
    private oc3 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        oc3 oc3Var = this.inflaterSource;
        if (oc3Var != null) {
            oc3Var.close();
        }
        this.inflaterSource = null;
        this.inflater = null;
    }

    public final void inflate(i90 buffer) throws IOException {
        buffer.getClass();
        if (this.deflatedBytes.Y != 0) {
            bt.q("Failed requirement.");
            return;
        }
        Inflater inflater = this.inflater;
        if (inflater == null) {
            inflater = new Inflater(true);
            this.inflater = inflater;
        }
        oc3 oc3Var = this.inflaterSource;
        if (oc3Var == null) {
            oc3Var = new oc3(this.deflatedBytes, inflater);
            this.inflaterSource = oc3Var;
        }
        if (this.noContextTakeover) {
            inflater.reset();
        }
        this.deflatedBytes.M(buffer);
        this.deflatedBytes.Z0(65535);
        long bytesRead = inflater.getBytesRead() + this.deflatedBytes.Y;
        do {
            oc3Var.g(buffer, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            this.deflatedBytes.g();
            oc3Var.close();
            this.inflaterSource = null;
            this.inflater = null;
        }
    }
}
