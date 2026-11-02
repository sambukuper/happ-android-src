package io.sentry.cache;

import io.sentry.s5;
import io.sentry.s6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Charset a = Charset.forName("UTF-8");

    public static void a(s6 s6Var, String str, String str2) {
        File fileB = b(s6Var, str);
        if (fileB == null) {
            s6Var.getLogger().h(s5.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        s6Var.getLogger().h(s5.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        s6Var.getLogger().h(s5.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static File b(s6 s6Var, String str) {
        String cacheDirPath = s6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static Object c(s6 s6Var, String str, String str2, Class cls) {
        File fileB = b(s6Var, str);
        if (fileB == null) {
            s6Var.getLogger().h(s5.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (!file.exists()) {
            s6Var.getLogger().h(s5.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), a));
            try {
                Object objB = s6Var.getSerializer().b(bufferedReader, cls);
                bufferedReader.close();
                return objB;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            s6Var.getLogger().d(s5.ERROR, th3, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    public static void d(s6 s6Var, Object obj, String str, String str2) {
        File fileB = b(s6Var, str);
        if (fileB == null) {
            s6Var.getLogger().h(s5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, a));
                try {
                    s6Var.getSerializer().a(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            s6Var.getLogger().d(s5.ERROR, th5, "Error persisting entity: %s", str2);
        }
    }
}
