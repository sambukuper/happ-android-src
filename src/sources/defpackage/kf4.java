package defpackage;

import android.content.Context;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.LogFileInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class kf4 {
    public final vz7 a = new vz7(new ei3((byte) 29));
    public final String b;
    public final ArrayList c;
    public String d;
    public String e;
    public String f;
    public final LogFileInfo g;
    public final LogFileInfo h;
    public final LogFileInfo i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kf4(Context context) {
        ss8 ss8Var = ss8.a;
        String strL = ss8.L(context);
        this.b = strL;
        this.c = new ArrayList();
        String strD = d();
        this.g = new LogFileInfo(System.currentTimeMillis(), strD == null ? "" : strD, "access_log.txt");
        String strConcat = strL.concat("/logs/subscription/subscription_log.txt");
        b(strConcat, false);
        this.h = new LogFileInfo(System.currentTimeMillis(), strConcat, "subscription_log.txt");
        String strConcat2 = strL.concat("/logs/push/push_log.txt");
        b(strConcat2, false);
        this.i = new LogFileInfo(System.currentTimeMillis(), strConcat2, "push_log.txt");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(String str, ArrayList arrayList) {
        arrayList.clear();
        Object objD = yw2.b.d(str, ((yi8) new jf4()).b);
        objD.getClass();
        ka2 ka2Var = new ka2(new la2(w27.l0(new hu((Iterable) objD, (byte) 1), new uh3((byte) 14)), true, new uh3((byte) 15)));
        while (ka2Var.hasNext()) {
            qg5 qg5Var = (qg5) ka2Var.next();
            LogFileInfo logFileInfo = (LogFileInfo) qg5Var.X;
            c((File) qg5Var.Y, 10);
            arrayList.add(logFileInfo);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(String str, boolean z) {
        Boolean rj6Var;
        try {
            File file = new File(str);
            File parentFile = new File(file.getPath()).getParentFile();
            boolean z2 = true;
            if ((parentFile == null || !parentFile.exists()) && parentFile != null) {
                parentFile.mkdirs();
            }
            if (file.exists() && z) {
                file.delete();
            }
            if (!file.exists() && !file.createNewFile()) {
                z2 = false;
            }
            rj6Var = Boolean.valueOf(z2);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Boolean bool = Boolean.FALSE;
        if (rj6Var instanceof rj6) {
            rj6Var = bool;
        }
        return rj6Var.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(File file, int i) {
        if (file.exists()) {
            int i2 = i * 750000;
            long j = i2;
            if (file.length() <= j) {
                return;
            }
            try {
                long jMax = Math.max(file.length() - j, 0L);
                byte[] bArr = new byte[i2];
                RandomAccessFile randomAccessFile = new RandomAccessFile(file.getPath(), "r");
                try {
                    randomAccessFile.seek(jMax);
                    int i3 = randomAccessFile.read(bArr);
                    if (i3 > 0) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(bArr, 0, i3);
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                oc.h(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        oc.h(randomAccessFile, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                if ((th5 instanceof InterruptedException) || (th5 instanceof CancellationException)) {
                    throw th5;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        String strO = pc6.o(this.b, "/logs/access/access_log.txt");
        File file = new File(strO);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        boolean zExists = file.exists();
        this.f = zExists ? strO : null;
        if (zExists) {
            return strO;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e(String str) {
        str.getClass();
        String str2 = this.b + "/logs/error/" + System.currentTimeMillis() + "_error_log.txt";
        File file = new File(str2);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        boolean zExists = file.exists();
        this.e = zExists ? str2 : null;
        this.d = str;
        if (zExists) {
            return str2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List f() {
        ArrayList rj6Var;
        try {
            String strI = ((MMKV) this.a.getValue()).i("ListErrorLogInStorage");
            if (strI != null) {
                rj6Var = this.c;
                a(strI, rj6Var);
            } else {
                rj6Var = null;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        ArrayList arrayList = rj6Var instanceof rj6 ? null : rj6Var;
        return arrayList == null ? d02.X : arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(gn2 gn2Var) {
        try {
            String str = this.b + "/logs/push/push_log.txt";
            b(str, false);
            b(str, false);
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(str, true));
            try {
                gn2Var.B(printWriter);
                printWriter.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oc.h(printWriter, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(gn2 gn2Var) {
        try {
            String str = this.b + "/logs/subscription/subscription_log.txt";
            b(str, false);
            b(str, false);
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(str, true));
            try {
                gn2Var.B(printWriter);
                printWriter.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oc.h(printWriter, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        try {
            for (LogFileInfo logFileInfo : f()) {
                logFileInfo.getClass();
                j(logFileInfo.getPath());
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(String str) {
        str.getClass();
        try {
            this.c.removeIf(new if4(new m40(str, (byte) 11), (byte) 0));
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            k();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        try {
            ((MMKV) this.a.getValue()).q("ListErrorLogInStorage", yw2.b.h(this.c));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }
}
