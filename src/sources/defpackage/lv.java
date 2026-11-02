package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lv implements sa7 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;

    public /* synthetic */ lv(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                nv nvVar = (nv) obj;
                sa7 sa7Var = (sa7) this.Z;
                nvVar.enter();
                try {
                    try {
                        sa7Var.close();
                        if (nvVar.exit()) {
                            throw nvVar.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!nvVar.exit()) {
                            throw e;
                        }
                        throw nvVar.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    nvVar.exit();
                    throw th;
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.sa7, java.io.Flushable
    public final void flush() throws IOException {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                nv nvVar = (nv) obj;
                sa7 sa7Var = (sa7) this.Z;
                nvVar.enter();
                try {
                    try {
                        sa7Var.flush();
                        if (nvVar.exit()) {
                            throw nvVar.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!nvVar.exit()) {
                            throw e;
                        }
                        throw nvVar.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    nvVar.exit();
                    throw th;
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // defpackage.sa7
    public final ta8 timeout() {
        switch (this.X) {
            case 0:
                return (nv) this.Y;
            default:
                return (ta8) this.Z;
        }
    }

    public final String toString() {
        switch (this.X) {
            case 0:
                return "AsyncTimeout.sink(" + ((sa7) this.Z) + ')';
            default:
                return "sink(" + ((OutputStream) this.Y) + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009d A[LOOP:1: B:12:0x0067->B:25:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[SYNTHETIC] */
    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) throws IOException {
        long j2;
        nv nvVar;
        byte b = this.X;
        Object obj = this.Y;
        Object obj2 = this.Z;
        i90Var.getClass();
        switch (b) {
            case 0:
                os4.i(i90Var.Y, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    mz6 mz6Var = i90Var.X;
                    mz6Var.getClass();
                    j2 = 0;
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (mz6Var.c - mz6Var.b);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    nvVar = (nv) obj;
                                    sa7 sa7Var = (sa7) obj2;
                                    nvVar.enter();
                                    sa7Var.write(i90Var, j2);
                                    if (!nvVar.exit()) {
                                        throw nvVar.access$newTimeoutException(null);
                                    }
                                } else {
                                    mz6Var = mz6Var.f;
                                    mz6Var.getClass();
                                }
                            }
                            sa7Var.write(i90Var, j2);
                            if (!nvVar.exit()) {
                                throw nvVar.access$newTimeoutException(null);
                            }
                        } catch (IOException e) {
                            if (!nvVar.exit()) {
                                throw e;
                            }
                            throw nvVar.access$newTimeoutException(e);
                        }
                    } catch (Throwable th) {
                        nvVar.exit();
                        throw th;
                    }
                    nvVar = (nv) obj;
                    sa7 sa7Var2 = (sa7) obj2;
                    nvVar.enter();
                }
                return;
            default:
                os4.i(i90Var.Y, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((ta8) obj2).throwIfReached();
                    mz6 mz6Var2 = i90Var.X;
                    mz6Var2.getClass();
                    int iMin = (int) Math.min(j4, mz6Var2.c - mz6Var2.b);
                    ((OutputStream) obj).write(mz6Var2.a, mz6Var2.b, iMin);
                    int i = mz6Var2.b + iMin;
                    mz6Var2.b = i;
                    long j5 = iMin;
                    j4 -= j5;
                    i90Var.Y -= j5;
                    if (i == mz6Var2.c) {
                        i90Var.X = mz6Var2.a();
                        pz6.a(mz6Var2);
                    }
                }
                return;
        }
    }
}
