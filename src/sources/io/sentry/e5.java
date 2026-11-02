package io.sentry;

import defpackage.bt;
import defpackage.pc6;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e5 implements Callable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ o1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e5(a aVar, long j, o1 o1Var, ILogger iLogger) {
        this.d = aVar;
        this.b = j;
        this.c = o1Var;
        this.e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.c {
        byte[] bArr;
        byte b = this.a;
        byte[] bArr2 = null;
        o1 o1Var = this.c;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                a aVar = (a) obj2;
                ILogger iLogger = (ILogger) obj;
                byte[] bArr3 = aVar.a;
                String str = aVar.d;
                if (bArr3 != null) {
                    h5.a(bArr3.length, str, j);
                    return bArr3;
                }
                io.sentry.protocol.j0 j0Var = aVar.b;
                if (j0Var != null) {
                    Charset charset = io.sentry.util.e.a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, io.sentry.util.e.a));
                            try {
                                o1Var.a(j0Var, bufferedWriter);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                bArr2 = byteArray;
                            } catch (Throwable th) {
                                try {
                                    bufferedWriter.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        iLogger.e(s5.ERROR, "Could not serialize serializable", th5);
                    }
                    if (bArr2 != null) {
                        h5.a(bArr2.length, str, j);
                        return bArr2;
                    }
                } else {
                    Callable callable = aVar.c;
                    if (callable != null && (bArr = (byte[]) callable.call()) != null) {
                        h5.a(bArr.length, str, j);
                        return bArr;
                    }
                }
                throw new io.sentry.exception.c(pc6.p("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
            default:
                File file = (File) obj2;
                z3 z3Var = (z3) obj;
                if (!file.exists()) {
                    throw new io.sentry.exception.c(pc6.p("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(io.sentry.vendor.a.b(io.sentry.util.b.q(j, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new io.sentry.exception.c("Profiling trace file is empty");
                    }
                    z3Var.D0 = str2;
                    try {
                        z3Var.n0 = (List) z3Var.Y.call();
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, h5.d), 512);
                                try {
                                    o1Var.a(z3Var, bufferedWriter2);
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    file.delete();
                                    return byteArray2;
                                } catch (Throwable th6) {
                                    try {
                                        bufferedWriter2.close();
                                        break;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th8) {
                                try {
                                    byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                                throw th8;
                            }
                        } catch (Throwable th10) {
                            file.delete();
                            throw th10;
                        }
                    } catch (IOException e) {
                        throw new io.sentry.exception.c("Failed to serialize profiling trace data\n" + e.getMessage());
                    }
                } catch (UnsupportedEncodingException e2) {
                    bt.g(e2);
                    return null;
                }
        }
    }

    public /* synthetic */ e5(File file, long j, z3 z3Var, o1 o1Var) {
        this.d = file;
        this.b = j;
        this.e = z3Var;
        this.c = o1Var;
    }
}
