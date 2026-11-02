package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dv2 implements je7 {
    public byte X;
    public final j76 Y;
    public final Inflater Z;
    public final oc3 f0;
    public final CRC32 g0;

    public dv2(je7 je7Var) {
        je7Var.getClass();
        j76 j76Var = new j76(je7Var);
        this.Y = j76Var;
        Inflater inflater = new Inflater(true);
        this.Z = inflater;
        this.f0 = new oc3(j76Var, inflater);
        this.g0 = new CRC32();
    }

    public static void g(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + fm7.u0(8, os4.R(i2)) + " != expected 0x" + fm7.u0(8, os4.R(i)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f0.close();
    }

    public final void k(i90 i90Var, long j, long j2) {
        mz6 mz6Var = i90Var.X;
        mz6Var.getClass();
        while (true) {
            long j3 = mz6Var.c - mz6Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            mz6Var = mz6Var.f;
            mz6Var.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) mz6Var.b) + j);
            int iMin = (int) Math.min(mz6Var.c - i, j2);
            this.g0.update(mz6Var.a, i, iMin);
            j2 -= (long) iMin;
            mz6Var = mz6Var.f;
            mz6Var.getClass();
            j = 0;
        }
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) throws IOException {
        byte b;
        dv2 dv2Var = this;
        j76 j76Var = dv2Var.Y;
        i90 i90Var2 = j76Var.Y;
        i90Var.getClass();
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = dv2Var.X;
        CRC32 crc32 = dv2Var.g0;
        if (b2 == 0) {
            j76Var.T0(10L);
            byte bU = i90Var2.u(3L);
            boolean z = ((bU >> 1) & 1) == 1;
            if (z) {
                dv2Var.k(i90Var2, 0L, 10L);
            }
            g(8075, j76Var.readShort(), "ID1ID2");
            j76Var.skip(8L);
            if (((bU >> 2) & 1) == 1) {
                j76Var.T0(2L);
                if (z) {
                    k(i90Var2, 0L, 2L);
                }
                long jU = i90Var2.U() & 65535;
                j76Var.T0(jU);
                if (z) {
                    k(i90Var2, 0L, jU);
                }
                j76Var.skip(jU);
            }
            if (((bU >> 3) & 1) == 1) {
                long jG = j76Var.g((byte) 0, 0L, Long.MAX_VALUE);
                if (jG == -1) {
                    throw new EOFException();
                }
                if (z) {
                    k(i90Var2, 0L, jG + 1);
                }
                j76Var.skip(jG + 1);
            }
            if (((bU >> 4) & 1) == 1) {
                long jG2 = j76Var.g((byte) 0, 0L, Long.MAX_VALUE);
                if (jG2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    dv2Var = this;
                    dv2Var.k(i90Var2, 0L, jG2 + 1);
                } else {
                    dv2Var = this;
                }
                j76Var.skip(jG2 + 1);
            } else {
                dv2Var = this;
            }
            if (z) {
                g(j76Var.p(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            dv2Var.X = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j2 = i90Var.Y;
            long j3 = dv2Var.f0.read(i90Var, j);
            if (j3 != -1) {
                dv2Var.k(i90Var, j2, j3);
                return j3;
            }
            b = 2;
            dv2Var.X = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            g(j76Var.k(), (int) crc32.getValue(), "CRC");
            g(j76Var.k(), (int) dv2Var.Z.getBytesWritten(), "ISIZE");
            dv2Var.X = (byte) 3;
            if (!j76Var.F()) {
                u52.s("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return this.Y.X.timeout();
    }
}
