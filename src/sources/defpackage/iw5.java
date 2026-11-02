package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iw5 {
    public static final g55 a = new g55((byte) 7);

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x016c A[Catch: all -> 0x0169, TRY_ENTER, TryCatch #3 {all -> 0x0169, blocks: (B:94:0x0148, B:96:0x0154, B:107:0x016c, B:108:0x0171), top: B:257:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x017d A[Catch: IllegalStateException -> 0x0163, IOException -> 0x0165, FileNotFoundException -> 0x0167, TRY_LEAVE, TryCatch #33 {FileNotFoundException -> 0x0167, IOException -> 0x0165, IllegalStateException -> 0x0163, blocks: (B:92:0x0140, B:97:0x015e, B:115:0x017d, B:113:0x017a, B:112:0x0177), top: B:299:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bd A[Catch: all -> 0x01cb, TRY_LEAVE, TryCatch #27 {all -> 0x01cb, blocks: (B:130:0x01b1, B:132:0x01bd, B:141:0x01ce), top: B:283:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ce A[Catch: all -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x01cb, blocks: (B:130:0x01b1, B:132:0x01bd, B:141:0x01ce), top: B:283:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:166:0x021b A[Catch: all -> 0x0259, TryCatch #35 {all -> 0x0259, blocks: (B:164:0x0215, B:166:0x021b, B:167:0x021f, B:169:0x0225), top: B:289:0x0215 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0225 A[Catch: all -> 0x0259, TRY_LEAVE, TryCatch #35 {all -> 0x0259, blocks: (B:164:0x0215, B:166:0x021b, B:167:0x021f, B:169:0x0225), top: B:289:0x0215 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:239:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:246:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:257:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x022a A[EDGE_INSN: B:300:0x022a->B:171:0x022a BREAK  A[LOOP:0: B:167:0x021f->B:301:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[Catch: all -> 0x0100, IllegalStateException -> 0x0103, IOException -> 0x0105, TRY_LEAVE, TryCatch #36 {IOException -> 0x0105, IllegalStateException -> 0x0103, blocks: (B:53:0x00e1, B:55:0x00eb, B:66:0x0107, B:67:0x010c), top: B:298:0x00e1, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0107 A[Catch: all -> 0x0100, IllegalStateException -> 0x0103, IOException -> 0x0105, TRY_ENTER, TryCatch #36 {IOException -> 0x0105, IllegalStateException -> 0x0103, blocks: (B:53:0x00e1, B:55:0x00eb, B:66:0x0107, B:67:0x010c), top: B:298:0x00e1, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0154 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #3 {all -> 0x0169, blocks: (B:94:0x0148, B:96:0x0154, B:107:0x016c, B:108:0x0171), top: B:257:0x0148 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static void b(Context context, Executor executor, hw5 hw5Var, boolean z) {
        boolean z2;
        ?? B;
        vm1[] vm1VarArrG0;
        vm1[] vm1VarArr;
        hw5 hw5Var2;
        vm1[] vm1VarArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i;
        ?? r9;
        boolean z4;
        boolean z5;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        rm1 rm1Var;
        ?? r11;
        String str;
        FileInputStream fileInputStreamB;
        ?? r12;
        ?? r13;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j == packageInfo.lastUpdateTime;
                            if (z6) {
                                hw5Var.i(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    context.getPackageName();
                    pw5.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            byte[] bArr4 = w39.f0;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            rm1 rm1Var2 = new rm1(assets, executor, hw5Var, name, file2);
            byte[] bArr5 = (byte[]) rm1Var2.d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            rm1Var2.a = true;
                            B = rm1Var2.b(assets, "dexopt/baseline.prof");
                            if (B != 0) {
                                if (Arrays.equals(bArr4, ys0.P(B, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                vm1VarArrG0 = w39.g0(B, ys0.P(B, 4), (String) rm1Var2.g);
                                B.close();
                                rm1Var2.h = vm1VarArrG0;
                            }
                            vm1VarArr = (vm1[]) rm1Var2.h;
                            if (vm1VarArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamB = rm1Var2.b(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamB == null) {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r11 = str;
                                    }
                                    rm1Var = null;
                                    B = r11;
                                } else {
                                    if (Arrays.equals(w39.g0, ys0.P(fileInputStreamB, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrP = ys0.P(fileInputStreamB, 4);
                                    rm1Var2.h = w39.d0(fileInputStreamB, bArrP, bArr5, vm1VarArr);
                                    fileInputStreamB.close();
                                    rm1Var = rm1Var2;
                                    B = bArrP;
                                }
                                if (rm1Var != null) {
                                    rm1Var2 = rm1Var;
                                }
                            }
                            hw5Var2 = (hw5) rm1Var2.c;
                            vm1VarArr2 = (vm1[]) rm1Var2.h;
                            bArr = (byte[]) rm1Var2.d;
                            r7 = B;
                            r7 = B;
                            if (vm1VarArr2 != null) {
                                z5 = rm1Var2.a;
                                if (z5) {
                                    bt.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (w39.p0(byteArrayOutputStream, bArr, vm1VarArr2)) {
                                    rm1Var2.e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    rm1Var2.h = null;
                                    r7 = r10;
                                } else {
                                    hw5Var2.i(5, null);
                                    rm1Var2.h = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = (byte[]) rm1Var2.e;
                            if (bArr2 != null) {
                                if (rm1Var2.a) {
                                    bt.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream((File) rm1Var2.f);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr3);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i);
                                        }
                                        r9 = 1;
                                        rm1Var2.c(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        rm1Var2.e = null;
                                        rm1Var2.h = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                a(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            rm1Var2.c(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        rm1Var2.c(4, null);
                    }
                } else if (file2.canWrite()) {
                    rm1Var2.a = true;
                    try {
                        B = rm1Var2.b(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        hw5Var.i(6, e);
                        B = 0;
                    } catch (IOException e2) {
                        hw5Var.i(7, e2);
                        B = 0;
                    }
                    try {
                        if (B != 0) {
                            try {
                                if (Arrays.equals(bArr4, ys0.P(B, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                vm1VarArrG0 = w39.g0(B, ys0.P(B, 4), (String) rm1Var2.g);
                                try {
                                    B.close();
                                } catch (IOException e3) {
                                    hw5Var.i(7, e3);
                                }
                                rm1Var2.h = vm1VarArrG0;
                            } catch (IOException e4) {
                                hw5Var.i(7, e4);
                                try {
                                    B.close();
                                } catch (IOException e5) {
                                    hw5Var.i(7, e5);
                                }
                                vm1VarArrG0 = null;
                            } catch (IllegalStateException e6) {
                                hw5Var.i(8, e6);
                                B.close();
                                vm1VarArrG0 = null;
                            }
                        }
                        vm1VarArr = (vm1[]) rm1Var2.h;
                        if (vm1VarArr != null && ((B = Build.VERSION.SDK_INT) >= 31 || B == 24 || B == 25)) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamB = rm1Var2.b(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamB == null) {
                                    try {
                                        if (Arrays.equals(w39.g0, ys0.P(fileInputStreamB, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrP2 = ys0.P(fileInputStreamB, 4);
                                        rm1Var2.h = w39.d0(fileInputStreamB, bArrP2, bArr5, vm1VarArr);
                                        fileInputStreamB.close();
                                        rm1Var = rm1Var2;
                                        B = bArrP2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamB.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r11 = str;
                                    }
                                    rm1Var = null;
                                    B = r11;
                                }
                            } catch (FileNotFoundException e7) {
                                hw5Var.i(9, e7);
                                r11 = B;
                            } catch (IOException e8) {
                                hw5Var.i(7, e8);
                                r11 = B;
                            } catch (IllegalStateException e9) {
                                rm1Var2.h = null;
                                hw5Var.i(8, e9);
                                r11 = B;
                            }
                            if (rm1Var != null) {
                                rm1Var2 = rm1Var;
                            }
                        }
                        hw5Var2 = (hw5) rm1Var2.c;
                        vm1VarArr2 = (vm1[]) rm1Var2.h;
                        bArr = (byte[]) rm1Var2.d;
                        r7 = B;
                        r7 = B;
                        if (vm1VarArr2 != null && bArr != null) {
                            z5 = rm1Var2.a;
                            if (z5) {
                                bt.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (w39.p0(byteArrayOutputStream, bArr, vm1VarArr2)) {
                                        hw5Var2.i(5, null);
                                        rm1Var2.h = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        rm1Var2.e = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        rm1Var2.h = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                hw5Var2.i(7, e10);
                                r10 = z5;
                            } catch (IllegalStateException e11) {
                                hw5Var2.i(8, e11);
                                r10 = z5;
                            }
                        }
                        bArr2 = (byte[]) rm1Var2.e;
                        if (bArr2 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (rm1Var2.a) {
                                    bt.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) rm1Var2.f);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i = byteArrayInputStream.read(bArr3);
                                                                                    if (i > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                rm1Var2.c(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                rm1Var2.e = null;
                                                                                rm1Var2.h = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        r7 = 1;
                                        rm1Var2.c(6, e);
                                        r8 = r7;
                                        rm1Var2.e = null;
                                        rm1Var2.h = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e13) {
                                        e = e13;
                                        r7 = 1;
                                        rm1Var2.c(7, e);
                                        r8 = r7;
                                        rm1Var2.e = null;
                                        rm1Var2.h = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    rm1Var2.c(6, e);
                                    r8 = r7;
                                    rm1Var2.e = null;
                                    rm1Var2.h = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e15) {
                                    e = e15;
                                    rm1Var2.c(7, e);
                                    r8 = r7;
                                    rm1Var2.e = null;
                                    rm1Var2.h = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                rm1Var2.e = null;
                                rm1Var2.h = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            a(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            B.close();
                            throw th24;
                        } catch (IOException e16) {
                            hw5Var.i(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    rm1Var2.c(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                pw5.c(context, r13);
            }
            rm1Var2.c(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            pw5.c(context, r13);
        } catch (PackageManager.NameNotFoundException e17) {
            hw5Var.i(7, e17);
            pw5.c(context, false);
        }
    }
}
