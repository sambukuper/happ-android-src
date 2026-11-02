package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i76 implements aa0 {
    public final sa7 X;
    public final i90 Y;
    public boolean Z;

    public i76(sa7 sa7Var) {
        sa7Var.getClass();
        this.X = sa7Var;
        this.Y = new i90();
    }

    @Override // defpackage.aa0
    public final long M(je7 je7Var) {
        je7Var.getClass();
        long j = 0;
        while (true) {
            long j2 = je7Var.read(this.Y, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            O();
        }
    }

    @Override // defpackage.aa0
    public final aa0 N0(int i, int i2, byte[] bArr) {
        bArr.getClass();
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.write(bArr, i, i2);
        O();
        return this;
    }

    @Override // defpackage.aa0
    public final aa0 O() {
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        i90 i90Var = this.Y;
        long jK = i90Var.k();
        if (jK > 0) {
            this.X.write(i90Var, jK);
        }
        return this;
    }

    @Override // defpackage.aa0
    public final aa0 P0(kb0 kb0Var) {
        kb0Var.getClass();
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.C0(kb0Var);
        O();
        return this;
    }

    @Override // defpackage.aa0
    public final aa0 U0(long j) {
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.J0(j);
        O();
        return this;
    }

    @Override // defpackage.aa0
    public final i90 c() {
        return this.Y;
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        sa7 sa7Var = this.X;
        if (this.Z) {
            return;
        }
        i90 i90Var = this.Y;
        long j = i90Var.Y;
        if (j > 0) {
            sa7Var.write(i90Var, j);
        }
        th = null;
        try {
            sa7Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.Z = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.aa0
    public final aa0 f0(String str) {
        str.getClass();
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.d1(str);
        O();
        return this;
    }

    @Override // defpackage.aa0, defpackage.sa7, java.io.Flushable
    public final void flush() {
        if (this.Z) {
            bt.i("closed");
            return;
        }
        i90 i90Var = this.Y;
        long j = i90Var.Y;
        sa7 sa7Var = this.X;
        if (j > 0) {
            sa7Var.write(i90Var, j);
        }
        sa7Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.Z;
    }

    @Override // defpackage.aa0
    public final aa0 o0(long j) {
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.V0(j);
        O();
        return this;
    }

    @Override // defpackage.aa0
    public final aa0 t0(int i, int i2, String str) {
        str.getClass();
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.c1(i, i2, str);
        O();
        return this;
    }

    @Override // defpackage.sa7
    public final ta8 timeout() {
        return this.X.timeout();
    }

    public final String toString() {
        return "buffer(" + this.X + ')';
    }

    @Override // defpackage.aa0
    public final aa0 w(int i) {
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.e1(i);
        O();
        return this;
    }

    @Override // defpackage.aa0
    public final aa0 write(byte[] bArr) {
        bArr.getClass();
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.write(bArr, 0, bArr.length);
        O();
        return this;
    }

    @Override // defpackage.aa0
    public final aa0 writeByte(int i) {
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.H0(i);
        O();
        return this;
    }

    @Override // defpackage.aa0
    public final aa0 writeInt(int i) {
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.Z0(i);
        O();
        return this;
    }

    @Override // defpackage.aa0
    public final aa0 writeShort(int i) {
        if (this.Z) {
            bt.i("closed");
            return null;
        }
        this.Y.a1(i);
        O();
        return this;
    }

    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) {
        i90Var.getClass();
        if (!this.Z) {
            this.Y.write(i90Var, j);
            O();
        } else {
            bt.i("closed");
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.Z) {
            int iWrite = this.Y.write(byteBuffer);
            O();
            return iWrite;
        }
        bt.i("closed");
        return 0;
    }
}
