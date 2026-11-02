package io.sentry;

import defpackage.s91;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r4 {
    public final /* synthetic */ ILogger a;
    public final /* synthetic */ String b;
    public final /* synthetic */ c0 c;
    public final /* synthetic */ File d;

    public /* synthetic */ r4(ILogger iLogger, String str, c0 c0Var, File file) {
        this.a = iLogger;
        this.b = str;
        this.c = c0Var;
        this.d = file;
    }

    public final void a() {
        File file = this.d;
        s5 s5Var = s5.DEBUG;
        String str = this.b;
        ILogger iLogger = this.a;
        iLogger.h(s5Var, "Started processing cached files from %s", str);
        c0 c0Var = this.c;
        k7 k7Var = c0Var.d;
        ILogger iLogger2 = c0Var.b;
        try {
            iLogger2.h(s5Var, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new a0(c0Var, (byte) 0));
            if (fileArrListFiles == null) {
                iLogger2.h(s5.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            } else {
                iLogger2.h(s5Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!k7Var.contains(absolutePath)) {
                            s91 s91VarD = c0Var.a.d();
                            if (s91VarD != null && s91VarD.k(p.All)) {
                                iLogger2.h(s5.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                                break;
                            } else {
                                iLogger2.h(s5.DEBUG, "Processing file: %s", absolutePath);
                                c0Var.b(file2, io.sentry.util.b.f(new b0(c0Var.c, c0Var.b, absolutePath, k7Var)));
                                Thread.sleep(100L);
                            }
                        } else {
                            iLogger2.h(s5.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                    } else {
                        iLogger2.h(s5.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            iLogger2.d(s5.INFO, e, "Thread interrupted during processing '%s'", file.getAbsolutePath());
        } catch (Throwable th) {
            iLogger2.d(s5.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
        iLogger.h(s5.DEBUG, "Finished processing cached files from %s", str);
    }
}
