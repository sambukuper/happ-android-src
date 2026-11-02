package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rq {
    public static final ej4 a = new ej4(30);
    public static Paint b;

    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static String b(TextView textView) {
        return textView.getFontVariationSettings();
    }

    public static void c(TextView textView, int i, int i2, int i3) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, 0);
    }

    public static void d(TextView textView, int[] iArr) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
    }

    public static void e(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        textView.setFontVariationSettings(str);
    }
}
