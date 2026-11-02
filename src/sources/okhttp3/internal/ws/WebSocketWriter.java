package okhttp3.internal.ws;

import defpackage.aa0;
import defpackage.bt;
import defpackage.g90;
import defpackage.i90;
import defpackage.kb0;
import defpackage.mz6;
import defpackage.u52;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", _UrlKt.FRAGMENT_ENCODE_SET, "isClient", "Laa0;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", _UrlKt.FRAGMENT_ENCODE_SET, "minimumDeflateSize", "<init>", "(ZLaa0;Ljava/util/Random;ZZJ)V", _UrlKt.FRAGMENT_ENCODE_SET, "opcode", "Lkb0;", "payload", "Ldn8;", "writeControlFrame", "(ILkb0;)V", "writePing", "(Lkb0;)V", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "()V", "Z", "Laa0;", "getSink", "()Laa0;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "J", "Li90;", "messageBuffer", "Li90;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", _UrlKt.FRAGMENT_ENCODE_SET, "maskKey", "[B", "Lg90;", "maskCursor", "Lg90;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final g90 maskCursor;
    private final byte[] maskKey;
    private final i90 messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final aa0 sink;
    private final i90 sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, aa0 aa0Var, Random random, boolean z2, boolean z3, long j) {
        aa0Var.getClass();
        random.getClass();
        this.isClient = z;
        this.sink = aa0Var;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new i90();
        this.sinkBuffer = aa0Var.c();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new g90() : null;
    }

    private final void writeControlFrame(int opcode, kb0 payload) throws IOException {
        if (this.writerClosed) {
            u52.s("closed");
            return;
        }
        int iE = payload.e();
        if (iE > 125) {
            bt.q("Payload size must be less than or equal to 125");
            return;
        }
        this.sinkBuffer.H0(opcode | 128);
        boolean z = this.isClient;
        i90 i90Var = this.sinkBuffer;
        if (z) {
            i90Var.H0(iE | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            bArr.getClass();
            random.nextBytes(bArr);
            i90 i90Var2 = this.sinkBuffer;
            byte[] bArr2 = this.maskKey;
            i90Var2.getClass();
            bArr2.getClass();
            i90Var2.write(bArr2, 0, bArr2.length);
            if (iE > 0) {
                i90 i90Var3 = this.sinkBuffer;
                long j = i90Var3.Y;
                i90Var3.C0(payload);
                i90 i90Var4 = this.sinkBuffer;
                g90 g90Var = this.maskCursor;
                g90Var.getClass();
                i90Var4.R(g90Var);
                this.maskCursor.k(j);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            i90Var.H0(iE);
            this.sinkBuffer.C0(payload);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            _UtilCommonKt.closeQuietly(messageDeflater);
        }
        _UtilCommonKt.closeQuietly(this.sink);
    }

    public final Random getRandom() {
        return this.random;
    }

    public final aa0 getSink() {
        return this.sink;
    }

    public final void writeClose(int code, kb0 reason) throws IOException {
        kb0 kb0VarS = kb0.f0;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            i90 i90Var = new i90();
            i90Var.a1(code);
            if (reason != null) {
                i90Var.C0(reason);
            }
            kb0VarS = i90Var.s(i90Var.Y);
        }
        try {
            writeControlFrame(8, kb0VarS);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, kb0 data) throws IOException {
        data.getClass();
        if (this.writerClosed) {
            u52.s("closed");
            return;
        }
        this.messageBuffer.C0(data);
        int i = formatOpcode | 128;
        if (this.perMessageDeflate && data.e() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i = formatOpcode | 192;
        }
        long j = this.messageBuffer.Y;
        this.sinkBuffer.H0(i);
        int i2 = this.isClient ? 128 : 0;
        i90 i90Var = this.sinkBuffer;
        if (j <= 125) {
            i90Var.H0(i2 | ((int) j));
        } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            i90Var.H0(i2 | WebSocketProtocol.PAYLOAD_SHORT);
            this.sinkBuffer.a1((int) j);
        } else {
            i90Var.H0(i2 | 127);
            i90 i90Var2 = this.sinkBuffer;
            mz6 mz6VarU0 = i90Var2.u0(8);
            byte[] bArr = mz6VarU0.a;
            int i3 = mz6VarU0.c;
            bArr[i3] = (byte) ((j >>> 56) & 255);
            bArr[i3 + 1] = (byte) ((j >>> 48) & 255);
            bArr[i3 + 2] = (byte) ((j >>> 40) & 255);
            bArr[i3 + 3] = (byte) ((j >>> 32) & 255);
            bArr[i3 + 4] = (byte) ((j >>> 24) & 255);
            bArr[i3 + 5] = (byte) ((j >>> 16) & 255);
            bArr[i3 + 6] = (byte) ((j >>> 8) & 255);
            bArr[i3 + 7] = (byte) (j & 255);
            mz6VarU0.c = i3 + 8;
            i90Var2.Y += 8;
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr2 = this.maskKey;
            bArr2.getClass();
            random.nextBytes(bArr2);
            i90 i90Var3 = this.sinkBuffer;
            byte[] bArr3 = this.maskKey;
            i90Var3.getClass();
            bArr3.getClass();
            i90Var3.write(bArr3, 0, bArr3.length);
            if (j > 0) {
                i90 i90Var4 = this.messageBuffer;
                g90 g90Var = this.maskCursor;
                g90Var.getClass();
                i90Var4.R(g90Var);
                this.maskCursor.k(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j);
        this.sink.flush();
    }

    public final void writePing(kb0 payload) throws IOException {
        payload.getClass();
        writeControlFrame(9, payload);
    }

    public final void writePong(kb0 payload) throws IOException {
        payload.getClass();
        writeControlFrame(10, payload);
    }
}
