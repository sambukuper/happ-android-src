package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public static String a;
    public static final Charset b = Charset.forName("UTF-8");
    public static final io.sentry.util.a c = new io.sentry.util.a();

    public static String a(Context context) {
        io.sentry.util.a aVar = c;
        aVar.g();
        try {
            String str = a;
            if (str == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = b;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strF = io.sentry.config.a.f();
                            fileOutputStream.write(strF.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            a = strF;
                            aVar.close();
                            return strF;
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str2 = new String(bArr, charset);
                        randomAccessFile.close();
                        a = str2;
                        str = str2;
                    } catch (Throwable th3) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    throw new RuntimeException(th5);
                }
            }
            aVar.close();
            return str;
        } catch (Throwable th6) {
            try {
                aVar.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }
}
