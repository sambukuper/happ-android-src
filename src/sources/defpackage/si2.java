package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class si2 {
    public static final ej4 a = new ej4(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final l97 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new i03((byte) 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new l97(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((ni2) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static ri2 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceF;
        ej4 ej4Var = a;
        Trace.beginSection("getFontSync");
        try {
            Typeface typeface = (Typeface) ej4Var.a(str);
            if (typeface != null) {
                ri2 ri2Var = new ri2(typeface);
                Trace.endSection();
                return ri2Var;
            }
            try {
                fj2 fj2VarA = mi2.a(context, list);
                List list2 = fj2VarA.a;
                boolean z = fj2VarA.b;
                if (!z) {
                    gj2[] gj2VarArr = (gj2[]) list2.get(0);
                    if (gj2VarArr == null || gj2VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = gj2VarArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i4 = gj2VarArr[i3].f;
                            if (i4 != 0) {
                                if (i4 >= 0) {
                                    i2 = i4;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (!z) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    ri2 ri2Var2 = new ri2(i2);
                    Trace.endSection();
                    return ri2Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    gj2[] gj2VarArr2 = (gj2[]) list2.get(0);
                    g28 g28Var = hj8.a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceF = hj8.a.f(context, gj2VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    g28 g28Var2 = hj8.a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceF = hj8.a.g(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceF == null) {
                    ri2 ri2Var3 = new ri2(-3);
                    Trace.endSection();
                    return ri2Var3;
                }
                ej4Var.b(str, typefaceF);
                ri2 ri2Var4 = new ri2(typefaceF);
                Trace.endSection();
                return ri2Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                ri2 ri2Var5 = new ri2(-1);
                Trace.endSection();
                return ri2Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
