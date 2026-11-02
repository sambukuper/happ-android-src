package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import io.sentry.ILogger;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.p0;
import io.sentry.clientreport.b;
import io.sentry.d7;
import io.sentry.h5;
import io.sentry.o1;
import io.sentry.s5;
import io.sentry.v4;
import io.sentry.v5;
import io.sentry.y4;
import io.sentry.z5;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i82 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i82(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        int i;
        String str3 = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        str3 = null;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                z47 z47VarH = z47.H();
                ((ArrayDeque) z47VarH.g0).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (z47VarH) {
                    try {
                        String str4 = (String) z47VarH.Y;
                        if (str4 != null) {
                            str3 = str4;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null && context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                if (str.startsWith(".")) {
                                    str2 = context.getPackageName() + serviceInfo.name;
                                    z47VarH.Y = str2;
                                } else {
                                    str2 = serviceInfo.name;
                                    z47VarH.Y = str2;
                                }
                                str3 = str2;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str3 != null) {
                    intent2.setClassName(context.getPackageName(), str3);
                }
                try {
                    i = (z47VarH.L(context) ? i21.V(context, intent2) : context.startService(intent2)) == null ? 404 : -1;
                } catch (IllegalStateException e) {
                    e.toString();
                    i = 402;
                } catch (SecurityException unused) {
                    i = 401;
                }
                return Integer.valueOf(i);
            case 1:
                o1 o1Var = (o1) this.b;
                z5 z5Var = (z5) this.c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, h5.d), 512);
                    try {
                        o1Var.a(z5Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            case 2:
                o1 o1Var2 = (o1) this.b;
                d7 d7Var = (d7) this.c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, h5.d), 512);
                    try {
                        o1Var2.a(d7Var, bufferedWriter2);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
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
            case 3:
                o1 o1Var3 = (o1) this.b;
                v5 v5Var = (v5) this.c;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, h5.d), 512);
                    try {
                        o1Var3.a(v5Var, bufferedWriter3);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } catch (Throwable th10) {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th11) {
                            th10.addSuppressed(th11);
                        }
                        throw th10;
                    }
                } catch (Throwable th12) {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th13) {
                        th12.addSuppressed(th13);
                    }
                    throw th12;
                }
            case 4:
                o1 o1Var4 = (o1) this.b;
                y4 y4Var = (y4) this.c;
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter4 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, h5.d), 512);
                    try {
                        o1Var4.a(y4Var, bufferedWriter4);
                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                        bufferedWriter4.close();
                        byteArrayOutputStream4.close();
                        return byteArray4;
                    } catch (Throwable th14) {
                        try {
                            bufferedWriter4.close();
                            break;
                        } catch (Throwable th15) {
                            th14.addSuppressed(th15);
                        }
                        throw th14;
                    }
                } catch (Throwable th16) {
                    try {
                        byteArrayOutputStream4.close();
                        break;
                    } catch (Throwable th17) {
                        th16.addSuppressed(th17);
                    }
                    throw th16;
                }
            case 5:
                o1 o1Var5 = (o1) this.b;
                b bVar = (b) this.c;
                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter5 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream5, h5.d), 512);
                    try {
                        o1Var5.a(bVar, bufferedWriter5);
                        byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                        bufferedWriter5.close();
                        byteArrayOutputStream5.close();
                        return byteArray5;
                    } catch (Throwable th18) {
                        try {
                            bufferedWriter5.close();
                            break;
                        } catch (Throwable th19) {
                            th18.addSuppressed(th19);
                        }
                        throw th18;
                    }
                } catch (Throwable th20) {
                    try {
                        byteArrayOutputStream5.close();
                        break;
                    } catch (Throwable th21) {
                        th20.addSuppressed(th21);
                    }
                    throw th20;
                }
            case 6:
                return ((SentryAndroidOptions) this.c).getOrCreateDeviceInfoUtil(((p0) this.b).a);
            case 7:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                ILogger logger = screenshotEventProcessor.a.getLogger();
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream6);
                            bitmap.recycle();
                            if (byteArrayOutputStream6.size() <= 0) {
                                logger.h(s5.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream6.close();
                            } else {
                                byte[] byteArray6 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                bArr = byteArray6;
                            }
                        } catch (Throwable th22) {
                            try {
                                byteArrayOutputStream6.close();
                                break;
                            } catch (Throwable th23) {
                                th22.addSuppressed(th23);
                            }
                            throw th22;
                        }
                    } catch (Throwable th24) {
                        logger.e(s5.ERROR, "Compressing bitmap failed.", th24);
                    }
                    break;
                }
                return bArr;
            default:
                ContentResolver contentResolver = (ContentResolver) this.b;
                Uri uri = (Uri) this.c;
                long maxAttachmentSize = v4.b().i().getMaxAttachmentSize();
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    return io.sentry.util.b.k(inputStreamOpenInputStream, maxAttachmentSize);
                }
                b61.h(uri, "Unable to open image attachment: ");
                return null;
        }
    }
}
