package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j76 implements ba0 {
    public final je7 X;
    public final i90 Y;
    public boolean Z;

    public j76(je7 je7Var) {
        je7Var.getClass();
        this.X = je7Var;
        this.Y = new i90();
    }

    @Override // defpackage.ba0
    public final byte[] B() {
        je7 je7Var = this.X;
        i90 i90Var = this.Y;
        i90Var.M(je7Var);
        return i90Var.D0(i90Var.Y);
    }

    @Override // defpackage.ba0
    public final byte[] D0(long j) throws EOFException {
        T0(j);
        return this.Y.D0(j);
    }

    @Override // defpackage.ba0
    public final boolean F() {
        if (this.Z) {
            bt.i("closed");
            return false;
        }
        i90 i90Var = this.Y;
        return i90Var.F() && this.X.read(i90Var, 8192L) == -1;
    }

    @Override // defpackage.ba0
    public final int H(od5 od5Var) throws EOFException {
        i90 i90Var;
        od5Var.getClass();
        if (this.Z) {
            bt.i("closed");
            return 0;
        }
        do {
            i90Var = this.Y;
            int iD = b.d(i90Var, od5Var, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                i90Var.skip(od5Var.X[iD].e());
                return iD;
            }
        } while (this.X.read(i90Var, 8192L) != -1);
        return -1;
    }

    @Override // defpackage.ba0
    public final long P() throws EOFException {
        i90 i90Var;
        T0(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zRequest = request(j2);
            i90Var = this.Y;
            if (!zRequest) {
                break;
            }
            byte bU = i90Var.u(j);
            if ((bU < 48 || bU > 57) && !(j == 0 && bU == 45)) {
                if (j != 0) {
                    break;
                }
                km4.q(16);
                String string = Integer.toString(bU, 16);
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            j = j2;
        }
        return i90Var.P();
    }

    @Override // defpackage.ba0
    public final long S(long j, kb0 kb0Var) {
        kb0Var.getClass();
        return km4.u(this, kb0Var, kb0Var.e(), 0L, j);
    }

    @Override // defpackage.ba0
    public final void T0(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.ba0
    public final String V(long j) throws EOFException {
        if (j < 0) {
            em7.c(ie2.f(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jG = g((byte) 10, 0L, j2);
        i90 i90Var = this.Y;
        if (jG != -1) {
            return b.c(i90Var, jG);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && i90Var.u(j2 - 1) == 13 && request(j2 + 1) && i90Var.u(j2) == 10) {
            return b.c(i90Var, j2);
        }
        i90 i90Var2 = new i90();
        i90Var.p(i90Var2, 0L, Math.min(32L, i90Var.Y));
        throw new EOFException("\\n not found: limit=" + Math.min(i90Var.Y, j) + " content=" + i90Var2.s(i90Var2.Y).f() + (char) 8230);
    }

    @Override // defpackage.ba0
    public final long W0() throws EOFException {
        i90 i90Var;
        T0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            i90Var = this.Y;
            if (!zRequest) {
                break;
            }
            byte bU = i90Var.u(i);
            if ((bU < 48 || bU > 57) && ((bU < 97 || bU > 102) && (bU < 65 || bU > 70))) {
                if (i != 0) {
                    break;
                }
                km4.q(16);
                String string = Integer.toString(bU, 16);
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return i90Var.W0();
    }

    @Override // defpackage.ba0
    public final InputStream Y0() {
        return new h90(this, (byte) 2);
    }

    @Override // defpackage.ba0
    public final long Z(aa0 aa0Var) {
        i90 i90Var;
        long j = 0;
        while (true) {
            je7 je7Var = this.X;
            i90Var = this.Y;
            if (je7Var.read(i90Var, 8192L) == -1) {
                break;
            }
            long jK = i90Var.k();
            if (jK > 0) {
                j += jK;
                aa0Var.write(i90Var, jK);
            }
        }
        long j2 = i90Var.Y;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        aa0Var.write(i90Var, j2);
        return j3;
    }

    @Override // defpackage.ba0, defpackage.aa0
    public final i90 c() {
        return this.Y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.X.close();
        this.Y.g();
    }

    public final long g(byte b, long j, long j2) {
        if (this.Z) {
            bt.i("closed");
            return 0L;
        }
        if (0 > j2) {
            em7.c(ie2.f(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            i90 i90Var = this.Y;
            byte b2 = b;
            long j3 = j2;
            long jC = i90Var.C(b2, jMax, j3);
            if (jC != -1) {
                return jC;
            }
            long j4 = i90Var.Y;
            if (j4 >= j3 || this.X.read(i90Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // defpackage.ba0
    public final void h0(i90 i90Var, long j) throws EOFException {
        i90 i90Var2 = this.Y;
        i90Var.getClass();
        try {
            T0(j);
            i90Var2.h0(i90Var, j);
        } catch (EOFException e) {
            i90Var.M(i90Var2);
            throw e;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.Z;
    }

    public final int k() throws EOFException {
        T0(4L);
        return os4.K(this.Y.readInt());
    }

    @Override // defpackage.ba0
    public final String k0(Charset charset) {
        charset.getClass();
        je7 je7Var = this.X;
        i90 i90Var = this.Y;
        i90Var.M(je7Var);
        return i90Var.X(i90Var.Y, charset);
    }

    public final long m() throws EOFException {
        T0(8L);
        long j = this.Y.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // defpackage.ba0
    public final String o(long j) throws EOFException {
        T0(j);
        return this.Y.X(j, iq0.a);
    }

    public final short p() throws EOFException {
        T0(2L);
        return this.Y.U();
    }

    @Override // defpackage.ba0
    public final j76 peek() {
        return new j76(new qj5(this));
    }

    @Override // defpackage.ba0
    public final boolean q(long j, kb0 kb0Var) {
        kb0Var.getClass();
        int iE = kb0Var.e();
        if (!this.Z) {
            return iE >= 0 && j >= 0 && iE <= kb0Var.e() && (iE == 0 || km4.u(this, kb0Var, iE, j, j + 1) != -1);
        }
        bt.i("closed");
        return false;
    }

    @Override // defpackage.ba0
    public final kb0 q0() {
        je7 je7Var = this.X;
        i90 i90Var = this.Y;
        i90Var.M(je7Var);
        return i90Var.s(i90Var.Y);
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) {
        i90Var.getClass();
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.Z) {
            bt.i("closed");
            return 0L;
        }
        i90 i90Var2 = this.Y;
        if (i90Var2.Y == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.X.read(i90Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return i90Var2.read(i90Var, Math.min(j, i90Var2.Y));
    }

    @Override // defpackage.ba0
    public final byte readByte() throws EOFException {
        T0(1L);
        return this.Y.readByte();
    }

    @Override // defpackage.ba0
    public final void readFully(byte[] bArr) throws EOFException {
        i90 i90Var = this.Y;
        bArr.getClass();
        try {
            T0(bArr.length);
            i90Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = i90Var.Y;
                if (j <= 0) {
                    throw e;
                }
                int i2 = i90Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // defpackage.ba0
    public final int readInt() throws EOFException {
        T0(4L);
        return this.Y.readInt();
    }

    @Override // defpackage.ba0
    public final long readLong() throws EOFException {
        T0(8L);
        return this.Y.readLong();
    }

    @Override // defpackage.ba0
    public final short readShort() throws EOFException {
        T0(2L);
        return this.Y.readShort();
    }

    @Override // defpackage.ba0
    public final boolean request(long j) {
        i90 i90Var;
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return false;
        }
        if (this.Z) {
            bt.i("closed");
            return false;
        }
        do {
            i90Var = this.Y;
            if (i90Var.Y >= j) {
                return true;
            }
        } while (this.X.read(i90Var, 8192L) != -1);
        return false;
    }

    @Override // defpackage.ba0
    public final kb0 s(long j) throws EOFException {
        T0(j);
        return this.Y.s(j);
    }

    @Override // defpackage.ba0
    public final void skip(long j) throws EOFException {
        if (this.Z) {
            bt.i("closed");
            return;
        }
        while (j > 0) {
            i90 i90Var = this.Y;
            if (i90Var.Y == 0 && this.X.read(i90Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, i90Var.Y);
            i90Var.skip(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return this.X.timeout();
    }

    public final String toString() {
        return "buffer(" + this.X + ')';
    }

    @Override // defpackage.ba0
    public final String z0() {
        return V(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        i90 i90Var = this.Y;
        if (i90Var.Y == 0 && this.X.read(i90Var, 8192L) == -1) {
            return -1;
        }
        return i90Var.read(byteBuffer);
    }
}
