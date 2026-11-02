package okhttp3.internal.cache;

import defpackage.bk2;
import defpackage.gn2;
import defpackage.i90;
import defpackage.sa7;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lbk2;", "Lsa7;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Ldn8;", "onException", "<init>", "(Lsa7;Lgn2;)V", "Li90;", "source", _UrlKt.FRAGMENT_ENCODE_SET, "byteCount", "write", "(Li90;J)V", "flush", "()V", "close", "Lgn2;", "getOnException", "()Lgn2;", _UrlKt.FRAGMENT_ENCODE_SET, "hasErrors", "Z", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FaultHidingSink extends bk2 {
    private boolean hasErrors;
    private final gn2 onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(sa7 sa7Var, gn2 gn2Var) {
        super(sa7Var);
        sa7Var.getClass();
        gn2Var.getClass();
        this.onException = gn2Var;
    }

    @Override // defpackage.bk2, defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.B(e);
        }
    }

    @Override // defpackage.bk2, defpackage.sa7, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.B(e);
        }
    }

    public final gn2 getOnException() {
        return this.onException;
    }

    @Override // defpackage.bk2, defpackage.sa7
    public void write(i90 source, long byteCount) throws EOFException {
        source.getClass();
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.B(e);
        }
    }
}
