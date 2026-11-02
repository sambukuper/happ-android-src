package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mv implements je7 {
    public final /* synthetic */ byte X = 1;
    public final Object Y;
    public final Object Z;

    public mv(InputStream inputStream, ta8 ta8Var) {
        inputStream.getClass();
        ta8Var.getClass();
        this.Y = inputStream;
        this.Z = ta8Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                nv nvVar = (nv) obj;
                je7 je7Var = (je7) this.Z;
                nvVar.enter();
                try {
                    try {
                        je7Var.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) throws IOException {
        byte b = this.X;
        Object obj = this.Y;
        Object obj2 = this.Z;
        i90Var.getClass();
        switch (b) {
            case 0:
                nv nvVar = (nv) obj;
                je7 je7Var = (je7) obj2;
                nvVar.enter();
                try {
                    try {
                        long j2 = je7Var.read(i90Var, j);
                        if (nvVar.exit()) {
                            throw nvVar.access$newTimeoutException(null);
                        }
                        return j2;
                    } catch (IOException e) {
                        if (nvVar.exit()) {
                            throw nvVar.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    nvVar.exit();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    em7.c(ie2.f(j, "byteCount < 0: "));
                    return 0L;
                }
                try {
                    ((ta8) obj2).throwIfReached();
                    mz6 mz6VarU0 = i90Var.u0(1);
                    int i = ((InputStream) obj).read(mz6VarU0.a, mz6VarU0.c, (int) Math.min(j, 8192 - mz6VarU0.c));
                    if (i == -1) {
                        if (mz6VarU0.b == mz6VarU0.c) {
                            i90Var.X = mz6VarU0.a();
                            pz6.a(mz6VarU0);
                        }
                        return -1L;
                    }
                    mz6VarU0.c += i;
                    long j3 = i;
                    i90Var.Y += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (y79.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // defpackage.je7
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
                return "AsyncTimeout.source(" + ((je7) this.Z) + ')';
            default:
                return "source(" + ((InputStream) this.Y) + ')';
        }
    }

    public mv(nv nvVar, je7 je7Var) {
        this.Y = nvVar;
        this.Z = je7Var;
    }
}
