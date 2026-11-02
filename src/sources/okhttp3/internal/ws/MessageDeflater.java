package okhttp3.internal.ws;

import defpackage.bt;
import defpackage.g90;
import defpackage.i76;
import defpackage.i90;
import defpackage.jh1;
import defpackage.kb0;
import defpackage.oc;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", _UrlKt.FRAGMENT_ENCODE_SET, "noContextTakeover", "<init>", "(Z)V", "Li90;", "Lkb0;", "suffix", "endsWith", "(Li90;Lkb0;)Z", "buffer", "Ldn8;", "deflate", "(Li90;)V", "close", "()V", "Z", "deflatedBytes", "Li90;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Ljh1;", "deflaterSink", "Ljh1;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageDeflater implements Closeable {
    private final i90 deflatedBytes;
    private final Deflater deflater;
    private final jh1 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        i90 i90Var = new i90();
        this.deflatedBytes = i90Var;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new jh1(new i76(i90Var), deflater);
    }

    private final boolean endsWith(i90 i90Var, kb0 kb0Var) {
        return i90Var.q(i90Var.Y - ((long) kb0Var.e()), kb0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(i90 buffer) throws IOException {
        buffer.getClass();
        if (this.deflatedBytes.Y != 0) {
            bt.q("Failed requirement.");
            return;
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.Y);
        this.deflaterSink.flush();
        boolean zEndsWith = endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK);
        i90 i90Var = this.deflatedBytes;
        if (zEndsWith) {
            long j = i90Var.Y - 4;
            g90 g90Var = new g90();
            i90Var.R(g90Var);
            try {
                g90Var.g(j);
                g90Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oc.h(g90Var, th);
                    throw th2;
                }
            }
        } else {
            i90Var.H0(0);
        }
        i90 i90Var2 = this.deflatedBytes;
        buffer.write(i90Var2, i90Var2.Y);
    }
}
