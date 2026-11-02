package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class mj8 extends g28 {
    public static Font p(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iS = s(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iS2 = s(fontStyle, font2.getStyle());
            if (iS2 < iS) {
                font = font2;
                iS = iS2;
            }
        }
        return font;
    }

    public static int s(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.g28
    public final Typeface e(Context context, ui2 ui2Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (vi2 vi2Var : ui2Var.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, vi2Var.f).setWeight(vi2Var.b).setSlant(vi2Var.c ? 1 : 0).setTtcIndex(vi2Var.e).setFontVariationSettings(vi2Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(p(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.g28
    public final Typeface f(Context context, gj2[] gj2VarArr, int i) {
        try {
            FontFamily fontFamilyQ = q(gj2VarArr, context.getContentResolver());
            if (fontFamilyQ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyQ).setStyle(p(fontFamilyQ, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.g28
    public final Typeface g(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyQ = q((gj2[]) list.get(0), contentResolver);
            if (fontFamilyQ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyQ);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyQ2 = q((gj2[]) list.get(i2), contentResolver);
                if (fontFamilyQ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyQ2);
                }
            }
            return customFallbackBuilder.setStyle(p(fontFamilyQ, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.g28
    public final Typeface h(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final FontFamily q(gj2[] gj2VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (gj2 gj2Var : gj2VarArr) {
            if (Objects.equals(gj2Var.a.getScheme(), "systemfont")) {
                fontBuild = r(gj2Var);
            } else {
                try {
                    Uri uri = gj2Var.a;
                    String str = gj2Var.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(gj2Var.c).setSlant(gj2Var.d ? 1 : 0).setTtcIndex(gj2Var.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font r(gj2 gj2Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
