package defpackage;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bb0 extends kb8 {
    public final /* synthetic */ byte f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(byte b) {
        super(ByteBuffer.class, (byte) 2);
        this.f0 = b;
        switch (b) {
            case 1:
                super(InetSocketAddress.class, (byte) 2);
                break;
            case 2:
                super(String.class, (byte) 2);
                break;
            case 3:
                super(TimeZone.class, (byte) 2);
                break;
            default:
                break;
        }
    }

    public static void r(InetSocketAddress inetSocketAddress, ro3 ro3Var) {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        ro3Var.c1(hostName + ":" + inetSocketAddress.getPort());
    }

    @Override // defpackage.kb8, defpackage.ar3
    public boolean c(t37 t37Var, Object obj) {
        switch (this.f0) {
            case 2:
                return ((String) obj).isEmpty();
            default:
                return super.c(t37Var, obj);
        }
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        switch (this.f0) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.hasArray()) {
                    int iPosition = byteBuffer.position();
                    byte[] bArrArray = byteBuffer.array();
                    int iArrayOffset = byteBuffer.arrayOffset() + iPosition;
                    int iLimit = byteBuffer.limit() - iPosition;
                    ro3Var.getClass();
                    ro3Var.u(m10.a, bArrArray, iArrayOffset, iLimit);
                    return;
                }
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                h90 h90Var = new h90(byteBufferAsReadOnlyBuffer);
                int iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                ro3Var.getClass();
                l10 l10Var = m10.a;
                r59 r59Var = (r59) ro3Var;
                char c = r59Var.s0;
                k43 k43Var = r59Var.f0;
                r59Var.h1("write a binary value");
                int i = r59Var.v0;
                int i2 = r59Var.w0;
                if (i >= i2) {
                    r59Var.m1();
                }
                char[] cArr = r59Var.t0;
                int i3 = r59Var.v0;
                r59Var.v0 = i3 + 1;
                cArr[i3] = c;
                if (k43Var.g0 != null) {
                    bt.i("Trying to call same allocXxx() method second time");
                    return;
                }
                m90 m90Var = k43Var.Y;
                m90Var.getClass();
                int i4 = m90.c[3];
                if (i4 <= 0) {
                    i4 = 0;
                }
                byte[] bArr = (byte[]) m90Var.a.getAndSet(3, null);
                if (bArr == null || bArr.length < i4) {
                    bArr = new byte[i4];
                }
                k43Var.g0 = bArr;
                try {
                    if (iRemaining < 0) {
                        r59Var.q1(l10Var, h90Var, bArr);
                    } else {
                        int iR1 = r59Var.r1(l10Var, h90Var, bArr, iRemaining);
                        if (iR1 > 0) {
                            r59Var.g("Too few bytes available: missing " + iR1 + " bytes (out of " + iRemaining + ")");
                            throw null;
                        }
                    }
                    k43Var.g(bArr);
                    if (r59Var.v0 >= i2) {
                        r59Var.m1();
                    }
                    char[] cArr2 = r59Var.t0;
                    int i5 = r59Var.v0;
                    r59Var.v0 = i5 + 1;
                    cArr2[i5] = c;
                    h90Var.close();
                    return;
                } catch (Throwable th) {
                    k43Var.g(bArr);
                    throw th;
                }
            case 1:
                r((InetSocketAddress) obj, ro3Var);
                return;
            case 2:
                ro3Var.c1((String) obj);
                return;
            default:
                ro3Var.c1(((TimeZone) obj).getID());
                return;
        }
    }

    @Override // defpackage.kb8, defpackage.ar3
    public void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws IOException {
        switch (this.f0) {
            case 1:
                InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                z76 z76VarD = ri8Var.d(inetSocketAddress, gr3.VALUE_STRING);
                z76VarD.f0 = InetSocketAddress.class;
                z76 z76VarE = ri8Var.e(ro3Var, z76VarD);
                r(inetSocketAddress, ro3Var);
                ri8Var.f(ro3Var, z76VarE);
                break;
            case 2:
                ro3Var.c1((String) obj);
                break;
            case 3:
                TimeZone timeZone = (TimeZone) obj;
                z76 z76VarD2 = ri8Var.d(timeZone, gr3.VALUE_STRING);
                z76VarD2.f0 = TimeZone.class;
                z76 z76VarE2 = ri8Var.e(ro3Var, z76VarD2);
                ro3Var.c1(timeZone.getID());
                ri8Var.f(ro3Var, z76VarE2);
                break;
            default:
                super.f(obj, ro3Var, t37Var, ri8Var);
                break;
        }
    }
}
