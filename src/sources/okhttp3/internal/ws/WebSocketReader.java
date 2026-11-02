package okhttp3.internal.ws;

import defpackage.ba0;
import defpackage.bt;
import defpackage.g90;
import defpackage.i90;
import defpackage.kb0;
import defpackage.u52;
import defpackage.xw3;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", _UrlKt.FRAGMENT_ENCODE_SET, "isClient", "Lba0;", "source", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLba0;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "Ldn8;", "readHeader", "()V", "readControlFrame", "readMessageFrame", "readUntilNonControlFrame", "readMessage", "processNextFrame", "close", "Z", "Lba0;", "getSource", "()Lba0;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "closed", "receivedCloseFrame", _UrlKt.FRAGMENT_ENCODE_SET, "opcode", "I", _UrlKt.FRAGMENT_ENCODE_SET, "frameLength", "J", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "Li90;", "controlFrameBuffer", "Li90;", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", _UrlKt.FRAGMENT_ENCODE_SET, "maskKey", "[B", "Lg90;", "maskCursor", "Lg90;", "FrameCallback", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final i90 controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final g90 maskCursor;
    private final byte[] maskKey;
    private final i90 messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private boolean receivedCloseFrame;
    private final ba0 source;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "text", "Ldn8;", "onReadMessage", "(Ljava/lang/String;)V", "Lkb0;", "bytes", "(Lkb0;)V", "payload", "onReadPing", "onReadPong", _UrlKt.FRAGMENT_ENCODE_SET, "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface FrameCallback {
        void onReadClose(int code, String reason);

        void onReadMessage(String text) throws IOException;

        void onReadMessage(kb0 bytes) throws IOException;

        void onReadPing(kb0 payload);

        void onReadPong(kb0 payload);
    }

    public WebSocketReader(boolean z, ba0 ba0Var, FrameCallback frameCallback, boolean z2, boolean z3) {
        ba0Var.getClass();
        frameCallback.getClass();
        this.isClient = z;
        this.source = ba0Var;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new i90();
        this.messageFrameBuffer = new i90();
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new g90();
    }

    private final void readControlFrame() throws IOException {
        short s;
        String strY;
        long j = this.frameLength;
        if (j > 0) {
            this.source.h0(this.controlFrameBuffer, j);
            if (!this.isClient) {
                i90 i90Var = this.controlFrameBuffer;
                g90 g90Var = this.maskCursor;
                g90Var.getClass();
                i90Var.R(g90Var);
                this.maskCursor.k(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                g90 g90Var2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                webSocketProtocol.toggleMask(g90Var2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                i90 i90Var2 = this.controlFrameBuffer;
                long j2 = i90Var2.Y;
                if (j2 == 1) {
                    xw3.k("Malformed close payload length of 1.");
                    return;
                }
                if (j2 != 0) {
                    s = i90Var2.readShort();
                    strY = this.controlFrameBuffer.Y();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                    if (strCloseCodeExceptionMessage != null) {
                        xw3.k(strCloseCodeExceptionMessage);
                        return;
                    }
                } else {
                    s = 1005;
                    strY = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                this.frameCallback.onReadClose(s, strY);
                this.receivedCloseFrame = true;
                return;
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                i90 i90Var3 = this.controlFrameBuffer;
                frameCallback.onReadPing(i90Var3.s(i90Var3.Y));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                i90 i90Var4 = this.controlFrameBuffer;
                frameCallback2.onReadPong(i90Var4.s(i90Var4.Y));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + _UtilJvmKt.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.receivedCloseFrame) {
            u52.s("closed");
            return;
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = _UtilCommonKt.and(this.source.readByte(), 255);
            this.source.timeout().timeout(jTimeoutNanos, timeUnit);
            int i = iAnd & 15;
            this.opcode = i;
            boolean z2 = (iAnd & 128) != 0;
            this.isFinalFrame = z2;
            boolean z3 = (iAnd & 8) != 0;
            this.isControlFrame = z3;
            if (z3 && !z2) {
                xw3.k("Control frames must be final.");
                return;
            }
            boolean z4 = (iAnd & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.perMessageDeflate) {
                        xw3.k("Unexpected rsv1 flag");
                        return;
                    }
                    z = true;
                }
                this.readingCompressedMessage = z;
            } else if (z4) {
                xw3.k("Unexpected rsv1 flag");
                return;
            }
            if ((iAnd & 32) != 0) {
                xw3.k("Unexpected rsv2 flag");
                return;
            }
            if ((iAnd & 16) != 0) {
                xw3.k("Unexpected rsv3 flag");
                return;
            }
            int iAnd2 = _UtilCommonKt.and(this.source.readByte(), 255);
            boolean z5 = (iAnd2 & 128) != 0;
            if (z5 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long jAnd = iAnd2 & 127;
            this.frameLength = jAnd;
            if (jAnd == 126) {
                jAnd = _UtilCommonKt.and(this.source.readShort(), 65535);
                this.frameLength = jAnd;
            } else if (jAnd == 127) {
                jAnd = this.source.readLong();
                this.frameLength = jAnd;
                if (jAnd < 0) {
                    throw new ProtocolException("Frame length 0x" + _UtilJvmKt.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && jAnd > 125) {
                xw3.k("Control frame must be less than 125B.");
            } else if (z5) {
                ba0 ba0Var = this.source;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                ba0Var.readFully(bArr);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(jTimeoutNanos, timeUnit);
            throw th;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.receivedCloseFrame) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.h0(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    i90 i90Var = this.messageFrameBuffer;
                    g90 g90Var = this.maskCursor;
                    g90Var.getClass();
                    i90Var.R(g90Var);
                    this.maskCursor.k(this.messageFrameBuffer.Y - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    g90 g90Var2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    bArr.getClass();
                    webSocketProtocol.toggleMask(g90Var2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + _UtilJvmKt.toHexString(this.opcode));
            }
        }
        u52.s("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + _UtilJvmKt.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        FrameCallback frameCallback = this.frameCallback;
        if (i == 1) {
            frameCallback.onReadMessage(this.messageFrameBuffer.Y());
        } else {
            i90 i90Var = this.messageFrameBuffer;
            frameCallback.onReadMessage(i90Var.s(i90Var.Y));
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.receivedCloseFrame) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            _UtilCommonKt.closeQuietly(messageInflater);
        }
        _UtilCommonKt.closeQuietly(this.source);
    }

    public final ba0 getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        if (this.closed) {
            bt.i("closed");
            return;
        }
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
