package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xf6 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, wl7 wl7Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            ej4 ej4Var = hj8.b;
            Typeface typeface = (Typeface) ej4Var.a(hj8.b(resources, i, string, i3, i2));
            byte b2 = 9;
            if (typeface != null) {
                if (wl7Var != null) {
                    new Handler(Looper.getMainLooper()).post(new sc4(wl7Var, typeface, b2));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        ti2 ti2VarE = jb5.E(resources.getXml(i), resources);
                        if (ti2VarE != null) {
                            typefaceA = hj8.a(context, ti2VarE, resources, i, string, typedValue.assetCookie, i2, wl7Var, z);
                        } else if (wl7Var != null) {
                            wl7Var.r(-3);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceH = hj8.a.h(context, resources, i, string, i2);
                        if (typefaceH != null) {
                            ej4Var.b(hj8.b(resources, i, string, i4, i2), typefaceH);
                        }
                        if (wl7Var != null) {
                            if (typefaceH != null) {
                                new Handler(Looper.getMainLooper()).post(new sc4(wl7Var, typefaceH, b2));
                            } else {
                                wl7Var.r(-3);
                            }
                        }
                        typefaceA = typefaceH;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (wl7Var != null) {
                        wl7Var.r(-3);
                    }
                }
            }
        } else if (wl7Var != null) {
            wl7Var.r(-3);
        }
        if (typefaceA != null || wl7Var != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
