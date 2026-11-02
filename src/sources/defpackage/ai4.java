package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ai4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String[] Y;
    public final /* synthetic */ ci4 Z;
    public final /* synthetic */ s61 f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ai4(String[] strArr, ci4 ci4Var, s61 s61Var, byte b) {
        this.X = b;
        this.Y = strArr;
        this.Z = ci4Var;
        this.f0 = s61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() throws IOException {
        switch (this.X) {
            case 0:
                Runtime runtime = Runtime.getRuntime();
                ps psVar = new ps(2);
                psVar.b("logcat");
                psVar.c(this.Y);
                Process processExec = runtime.exec((String[]) psVar.b.toArray(new String[psVar.b.size()]));
                this.Z.h = processExec;
                try {
                    u70.I(this.f0);
                    processExec.getClass();
                    if (processExec.waitFor() != 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    processExec.destroy();
                    this.Z.h = null;
                    return "";
                } catch (Throwable th) {
                    processExec.destroy();
                    this.Z.h = null;
                    throw th;
                }
            default:
                Runtime runtime2 = Runtime.getRuntime();
                ps psVar2 = new ps(2);
                psVar2.b("logcat");
                psVar2.c(this.Y);
                Process processExec2 = runtime2.exec((String[]) psVar2.b.toArray(new String[psVar2.b.size()]));
                this.Z.h = processExec2;
                try {
                    u70.I(this.f0);
                    processExec2.getClass();
                    StringBuilder sb = new StringBuilder();
                    InputStream inputStream = processExec2.getInputStream();
                    inputStream.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, iq0.a), 8192);
                    try {
                        Iterator it = dt7.c(bufferedReader).iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                            sb.append('\n');
                            if (sb.length() > 30000) {
                                sb.delete(0, sb.length() - 30000);
                            }
                        }
                        bufferedReader.close();
                        if (processExec2.waitFor() != 0) {
                            throw new IllegalStateException("Check failed.");
                        }
                        String string = sb.toString();
                        processExec2.destroy();
                        this.Z.h = null;
                        return string;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            oc.h(bufferedReader, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    processExec2.destroy();
                    this.Z.h = null;
                    throw th4;
                }
        }
    }
}
