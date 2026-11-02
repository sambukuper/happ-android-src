package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pf4 {
    public final Context a;
    public volatile Process b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pf4(Context context) {
        context.getClass();
        this.a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object d(List list, File file) {
        try {
            if (file.exists()) {
                file.delete();
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                ArrayList<File> arrayList = new ArrayList();
                for (Object obj : list) {
                    File file2 = (File) obj;
                    if (!file2.isDirectory()) {
                        String name = file2.getName();
                        name.getClass();
                        if (!fm7.d0(name, "zip", false)) {
                            arrayList.add(obj);
                        }
                    }
                }
                for (File file3 : arrayList) {
                    zipOutputStream.putNextEntry(new ZipEntry(file3.getName()));
                    FileInputStream fileInputStream = new FileInputStream(file3);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, i);
                            try {
                                throw th;
                            } catch (Throwable th) {
                                oc.h(zipOutputStream, th);
                                throw th;
                            }
                        }
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            oc.h(fileInputStream, th2);
                            throw th3;
                        }
                    }
                }
                zipOutputStream.close();
                return dn8.a;
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (Throwable th5) {
            if ((th5 instanceof InterruptedException) || (th5 instanceof CancellationException)) {
                throw th5;
            }
            return new rj6(th5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Serializable a() {
        Context context = this.a;
        try {
            String packageName = context.getPackageName();
            String str = Build.MODEL;
            String str2 = Build.DEVICE;
            String str3 = Build.MANUFACTURER;
            String str4 = Build.PRODUCT;
            String str5 = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            ss8 ss8Var = ss8.a;
            String strJ = ss8.j(context);
            kw4 kw4Var = kw4.a;
            String strN = gm7.N("\n            Package name: " + packageName + "\n            Model: " + str + "\n            Device: " + str2 + "\n            Manufacturer: " + str3 + "\n            Product: " + str4 + "\n            Android version: " + str5 + "\n            API Level: " + i + "\n            HWID: " + strJ + "\n            App version: 4.9.0 (1721)\n            Provider ID: " + wv0.y0(kw4.t(), (CharSequence) null, (String) null, (String) null, (gn2) null, 63) + "\n        ");
            File file = new File(ss8.L(context).concat("/device_info.txt"));
            if (!file.exists()) {
                file.createNewFile();
            }
            da2.T(file, strN);
            return file;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Serializable b() {
        InputStream inputStream;
        try {
            try {
                Process process = this.b;
                if (process != null) {
                    process.exitValue();
                }
            } catch (IllegalThreadStateException unused) {
                Process process2 = this.b;
                if (process2 != null) {
                    process2.destroy();
                }
            }
            this.b = Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-v", "threadtime"});
            StringBuilder sb = new StringBuilder();
            Process process3 = this.b;
            if (process3 != null && (inputStream = process3.getInputStream()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, iq0.a), 8192);
                try {
                    int length = 5138022;
                    for (String str : dt7.c(bufferedReader)) {
                        sb.append(str);
                        sb.append("\n");
                        if (length < 0) {
                            int length2 = str.length();
                            if (length2 > 0) {
                                sb.delete(0, length2 - 1);
                            }
                        } else {
                            length -= str.length();
                        }
                    }
                    Process process4 = this.b;
                    if (process4 != null) {
                        process4.destroy();
                    }
                    this.b = null;
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            ss8 ss8Var = ss8.a;
            File file = new File(ss8.L(this.a) + "/report.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            da2.T(file, sb.toString());
            return file;
        } catch (Throwable th3) {
            if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                throw th3;
            }
            return new rj6(th3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, s51 s51Var) {
        of4 of4Var;
        if (s51Var instanceof of4) {
            of4Var = (of4) s51Var;
            int i = of4Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                of4Var.h0 = i - Integer.MIN_VALUE;
            } else {
                of4Var = new of4(this, s51Var);
            }
        } else {
            of4Var = new of4(this, s51Var);
        }
        Object objN = of4Var.f0;
        int i2 = of4Var.h0;
        if (i2 == 0) {
            w39.n0(objN);
            k kVar = new k(this, str, (q51) null, (byte) 17);
            of4Var.h0 = 1;
            objN = gv3.n(kVar, of4Var);
            c71 c71Var = c71.X;
            if (objN == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objN);
        }
        return ((sj6) objN).X;
    }
}
