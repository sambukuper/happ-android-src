package com.github.luben.zstd.util;

import defpackage.oi0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum Native {
    ;

    private static final String libname = "libzstd-jni-1.5.7-21";
    private static final String libnameShort = "zstd-jni-1.5.7-21";
    private static final String nativePathOverride = "ZstdNativePath";
    private static final String tempFolderOverride = "ZstdTempFolder";
    private static final String errorMsg = oi0.p(new StringBuilder("Unsupported OS/arch, cannot find "), resourceName(), " or load zstd-jni-1.5.7-21 from system libraries. Please try building from source the jar or providing libzstd-jni-1.5.7-21 in your system.");
    private static AtomicBoolean loaded = new AtomicBoolean(false);

    public static synchronized void assumeLoaded() {
        loaded.set(true);
    }

    public static synchronized boolean isLoaded() {
        return loaded.get();
    }

    private static String libExtension() {
        if (osName().contains("os_x") || osName().contains("darwin")) {
            return "dylib";
        }
        return osName().contains("win") ? "dll" : "so";
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0107 A[Catch: all -> 0x0028, IOException -> 0x0115, TryCatch #1 {IOException -> 0x0115, blocks: (B:63:0x0102, B:65:0x0107, B:67:0x010c, B:69:0x0112), top: B:77:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x010c A[Catch: all -> 0x0028, IOException -> 0x0115, TryCatch #1 {IOException -> 0x0115, blocks: (B:63:0x0102, B:65:0x0107, B:67:0x010c, B:69:0x0112), top: B:77:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:98:? A[ADDED_TO_REGION, Catch: all -> 0x0028, REMOVE, SYNTHETIC, TRY_ENTER, TryCatch #4 {, blocks: (B:4:0x0007, B:8:0x0011, B:10:0x001e, B:18:0x0037, B:35:0x0083, B:37:0x0088, B:38:0x008b, B:40:0x0091, B:63:0x0102, B:65:0x0107, B:67:0x010c, B:69:0x0112, B:70:0x0115, B:71:0x0116, B:72:0x0131, B:15:0x002b), top: B:83:0x0007, inners: #10 }] */
    public static synchronized void load(File file) {
        File file2;
        Throwable th;
        FileOutputStream fileOutputStream;
        if (loaded.get()) {
            return;
        }
        String strResourceName = resourceName();
        String property = System.getProperty(nativePathOverride);
        if (property != null) {
            loadLibraryFile(property);
            loaded.set(true);
            return;
        }
        try {
            loadLibrary(libnameShort);
            loaded.set(true);
        } catch (Throwable unused) {
            InputStream resourceAsStream = Native.class.getResourceAsStream(strResourceName);
            if (resourceAsStream == null) {
                throw new UnsatisfiedLinkError("Failed to open resource " + strResourceName + " as stream:\n" + errorMsg);
            }
            File file3 = null;
            fileOutputStream = null;
            fileOutputStream = null;
            FileOutputStream fileOutputStream2 = null;
            try {
                File fileCreateTempFile = File.createTempFile(libname, "." + libExtension(), file);
                try {
                    fileCreateTempFile.deleteOnExit();
                    FileOutputStream fileOutputStream3 = new FileOutputStream(fileCreateTempFile);
                    try {
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = resourceAsStream.read(bArr);
                                if (i == -1) {
                                    try {
                                        break;
                                    } catch (IOException unused2) {
                                        fileOutputStream2 = fileOutputStream3;
                                    }
                                } else {
                                    fileOutputStream3.write(bArr, 0, i);
                                }
                            }
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                            try {
                                loadLibraryFile(fileCreateTempFile.getAbsolutePath());
                                loaded.set(true);
                                try {
                                    resourceAsStream.close();
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    if (fileCreateTempFile.exists()) {
                                        fileCreateTempFile.delete();
                                    }
                                } catch (IOException unused3) {
                                }
                            } catch (UnsatisfiedLinkError e) {
                                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e.getMessage() + "\n" + errorMsg);
                                unsatisfiedLinkError.setStackTrace(e.getStackTrace());
                                throw unsatisfiedLinkError;
                            }
                        } catch (IOException e2) {
                            file3 = fileCreateTempFile;
                            fileOutputStream = fileOutputStream3;
                            e = e2;
                            try {
                                ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-21: " + e.getMessage());
                                exceptionInInitializerError.setStackTrace(e.getStackTrace());
                                throw exceptionInInitializerError;
                            } catch (Throwable th2) {
                                File file4 = file3;
                                th = th2;
                                file2 = file4;
                                try {
                                    resourceAsStream.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (file2 != null) {
                                        throw th;
                                    }
                                    throw th;
                                } catch (IOException unused4) {
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file2 = fileCreateTempFile;
                        fileOutputStream = fileOutputStream3;
                        resourceAsStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (file2 != null || !file2.exists()) {
                            throw th;
                        }
                        file2.delete();
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    FileOutputStream fileOutputStream4 = fileOutputStream2;
                    file3 = fileCreateTempFile;
                    fileOutputStream = fileOutputStream4;
                    ExceptionInInitializerError exceptionInInitializerError2 = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-21: " + e.getMessage());
                    exceptionInInitializerError2.setStackTrace(e.getStackTrace());
                    throw exceptionInInitializerError2;
                } catch (Throwable th4) {
                    file2 = fileCreateTempFile;
                    fileOutputStream = fileOutputStream2;
                    th = th4;
                    resourceAsStream.close();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (file2 != null) {
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                fileOutputStream = null;
            } catch (Throwable th5) {
                file2 = null;
                th = th5;
                fileOutputStream = null;
            }
        }
    }

    private static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.1
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    private static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.2
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    private static String osName() {
        String property = System.getProperty("os.name");
        if (property == null) {
            property = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String strReplace = property.toLowerCase().replace(' ', '_');
        if (strReplace.startsWith("win")) {
            return "win";
        }
        return strReplace.startsWith("mac") ? "darwin" : strReplace;
    }

    private static String resourceName() {
        String strOsName = osName();
        String property = System.getProperty("os.arch");
        if (strOsName.equals("darwin") && "amd64".equals(property)) {
            property = "x86_64";
        }
        StringBuilder sbT = oi0.t("/", strOsName, "/", property, "/libzstd-jni-1.5.7-21.");
        sbT.append(libExtension());
        return sbT.toString();
    }

    public static synchronized void load() {
        try {
            String property = System.getProperty(tempFolderOverride);
            if (property == null) {
                load(null);
            } else {
                load(new File(property));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
