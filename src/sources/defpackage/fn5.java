package defpackage;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructPollfd;
import java.io.FileDescriptor;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class fn5 implements Runnable {
    public static final short g0;
    public final InetAddress X;
    public final pr2 Y;
    public byte Z = 3;
    public final zx1 f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = OsConstants.POLLIN;
        if (i == 0) {
            i = 1;
        }
        g0 = (short) i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fn5(InetAddress inetAddress, pr2 pr2Var) {
        this.X = inetAddress;
        this.Y = pr2Var;
        byte b = inetAddress instanceof Inet6Address ? (byte) -128 : (byte) 8;
        byte[] bytes = "abcdefghijklmnopqrstuvwabcdefghi".getBytes(iq0.a);
        bytes.getClass();
        this.f0 = new zx1(b, bytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        if (Build.VERSION.SDK_INT >= 26) {
            Os.setsockoptInt(fileDescriptor, OsConstants.IPPROTO_IP, OsConstants.IP_TOS, 16);
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Os.class.getMethod("setsockoptInt", FileDescriptor.class, cls, cls, cls).invoke(null, fileDescriptor, Integer.valueOf(OsConstants.IPPROTO_IP), Integer.valueOf(OsConstants.IP_TOS), 16);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        rj6 rj6Var;
        short s;
        short s2 = g0;
        pr2 pr2Var = this.Y;
        InetAddress inetAddress = this.X;
        if (inetAddress instanceof Inet6Address) {
            i = OsConstants.AF_INET6;
            i2 = OsConstants.IPPROTO_ICMPV6;
        } else {
            i = OsConstants.AF_INET;
            i2 = OsConstants.IPPROTO_ICMP;
        }
        try {
            FileDescriptor fileDescriptorSocket = Os.socket(i, OsConstants.SOCK_DGRAM, i2);
            fileDescriptorSocket.getClass();
            boolean zValid = fileDescriptorSocket.valid();
            rj6Var = dn8.a;
            if (zValid) {
                try {
                    a(fileDescriptorSocket);
                    StructPollfd structPollfd = new StructPollfd();
                    structPollfd.fd = fileDescriptorSocket;
                    structPollfd.events = s2;
                    StructPollfd[] structPollfdArr = {structPollfd};
                    byte b = this.Z;
                    short s3 = 0;
                    int i3 = 0;
                    while (i3 < b) {
                        ByteBuffer byteBufferA = this.f0.a();
                        int iLimit = byteBufferA.limit();
                        byte[] bArr = new byte[iLimit];
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (Os.sendto(fileDescriptorSocket, byteBufferA, s3, inetAddress, 7) < 0) {
                                pr2Var.B(-1L);
                                break;
                            }
                            int iPoll = Os.poll(structPollfdArr, 4000);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (iPoll < 0) {
                                pr2Var.B(-1L);
                                break;
                            }
                            if (structPollfd.revents == s2) {
                                structPollfd.revents = s3;
                                s = s3;
                                Os.recvfrom(fileDescriptorSocket, bArr, 0, iLimit, 64, null);
                                pr2Var.B(Long.valueOf(jCurrentTimeMillis2));
                            } else {
                                s = s3;
                                pr2Var.B(-1L);
                            }
                            try {
                                Thread.sleep(1000L);
                            } catch (Throwable th) {
                                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                    throw th;
                                }
                            }
                            i3++;
                            s3 = s;
                            if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                throw th;
                            }
                            rj6Var = new rj6(th);
                        } catch (ErrnoException unused) {
                            pr2Var.B(-1L);
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                            throw th2;
                        }
                        rj6Var = new rj6(th2);
                        Os.close(fileDescriptorSocket);
                        rj6Var = new sj6(rj6Var);
                        if (sj6.a(rj6Var) != null) {
                            pr2Var.B(-1L);
                        }
                    } catch (Throwable th3) {
                        Os.close(fileDescriptorSocket);
                        throw th3;
                    }
                }
                Os.close(fileDescriptorSocket);
                rj6Var = new sj6(rj6Var);
            } else {
                pr2Var.B(-1L);
            }
        } catch (Throwable th4) {
            if (th4 instanceof InterruptedException) {
            }
            throw th4;
        }
        if (sj6.a(rj6Var) != null) {
            pr2Var.B(-1L);
        }
    }
}
