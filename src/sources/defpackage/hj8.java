package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hj8 {
    public static final g28 a;
    public static final ej4 b;
    public static Paint c;

    static {
        Trace.beginSection("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new nj8();
        } else if (i >= 29) {
            a = new mj8();
        } else if (i >= 28) {
            a = new lj8();
        } else if (i >= 26) {
            a = new kj8();
        } else if (jj8.c != null) {
            a = new jj8();
        } else {
            a = new ij8();
        }
        b = new ej4(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, ti2 ti2Var, Resources resources, int i, String str, int i2, int i3, wl7 wl7Var, boolean z) {
        Typeface typefaceE;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        byte b2 = 9;
        int i4 = -3;
        if (ti2Var instanceof wi2) {
            wi2 wi2Var = (wi2) ti2Var;
            String str2 = wi2Var.d;
            Typeface typeface = null;
            byte b3 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = wi2Var.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        ni2 ni2Var = (ni2) arrayList.get(i6);
                                        if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(ni2Var.f)) {
                                            customFallbackBuilder.setSystemFallback(ni2Var.e);
                                        } else {
                                            String str3 = ni2Var.e;
                                            String str4 = ni2Var.f;
                                            Font fontD = d(c(str3));
                                            if (fontD != null) {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(rc.a(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((ni2) arrayList.get(i5)).e) != null) {
                                i5++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((ni2) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (wl7Var != null) {
                    new Handler(Looper.getMainLooper()).post(new sc4(wl7Var, typefaceBuild, b2));
                }
                b.b(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr2 = !z ? wl7Var != null : wi2Var.c != 0;
            int i7 = z ? wi2Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            byte b4 = 2;
            rb8 rb8Var = new rb8(b4, z2);
            rb8Var.Y = wl7Var;
            ArrayList arrayList2 = wi2Var.a;
            r52 r52Var = new r52(handler, (byte) 1);
            dq dqVar = new dq((Object) rb8Var, (Object) r52Var, (byte) 25);
            byte b5 = 6;
            if (objArr2 != true) {
                String strA = si2.a(i3, arrayList2);
                Typeface typeface2 = (Typeface) si2.a.a(strA);
                if (typeface2 != null) {
                    r52Var.execute(new zo2(rb8Var, typeface2, b5));
                    typeface = typeface2;
                } else {
                    ay1 ay1Var = new ay1(dqVar, b3);
                    synchronized (si2.c) {
                        try {
                            l97 l97Var = si2.d;
                            ArrayList arrayList3 = (ArrayList) l97Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(ay1Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(ay1Var);
                                l97Var.put(strA, arrayList4);
                                qi2 qi2Var = new qi2(strA, context, arrayList2, i3, (byte) 1);
                                ThreadPoolExecutor threadPoolExecutor = si2.b;
                                ay1 ay1Var2 = new ay1(strA, b4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                gc4 gc4Var = new gc4();
                                gc4Var.Y = qi2Var;
                                gc4Var.Z = ay1Var2;
                                gc4Var.f0 = handler2;
                                threadPoolExecutor.execute(gc4Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    bt.q("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                ni2 ni2Var2 = (ni2) arrayList2.get(0);
                ej4 ej4Var = si2.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{ni2Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = si2.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) si2.a.a(strA2);
                if (typeface3 != null) {
                    r52Var.execute(new zo2(rb8Var, typeface3, b5));
                    typeface = typeface3;
                } else if (i7 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{ni2Var2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    ri2 ri2VarB = si2.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    dqVar.H(ri2VarB);
                    typeface = ri2VarB.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    ri2 ri2Var = (ri2) si2.b.submit(new qi2(strA2, context, ni2Var2, i3, (byte) 0)).get(i7, TimeUnit.MILLISECONDS);
                                    dqVar.H(ri2Var);
                                    typeface = ri2Var.a;
                                } catch (ExecutionException e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused3) {
                        ((r52) dqVar.Z).execute(new vd0((rb8) dqVar.Y, i4, objArr == true ? 1 : 0));
                    }
                }
            }
            typefaceE = typeface;
        } else {
            typefaceE = a.e(context, (ui2) ti2Var, resources, i3);
            if (wl7Var != null) {
                if (typefaceE != null) {
                    new Handler(Looper.getMainLooper()).post(new sc4(wl7Var, typefaceE, b2));
                } else {
                    wl7Var.r(-3);
                }
            }
        }
        if (typefaceE != null) {
            b.b(b(resources, i, str, i2, i3), typefaceE);
        }
        return typefaceE;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
