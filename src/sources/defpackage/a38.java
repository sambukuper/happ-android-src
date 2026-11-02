package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a38 {
    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void b(View view, View view2, Resources resources) {
        int i;
        int i2;
        view.getClass();
        view2.getClass();
        Context context = view2.getContext();
        context.getClass();
        ColorDrawable colorDrawable = new ColorDrawable(os4.q(context, v26.colorBlackForegroundSpinner));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        colorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        colorDrawable.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect(0, iArr[1], view2.getWidth() - 1, view.getHeight() + iArr[1]);
        if (rect.right < view2.getWidth() && rect.bottom < view2.getHeight() && (i = rect.left) <= (i2 = rect.right)) {
            while (true) {
                int i3 = rect.top;
                int i4 = rect.bottom;
                if (i3 <= i4) {
                    while (true) {
                        bitmapCreateBitmap.setPixel(i, i3, 0);
                        if (i3 == i4) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        view2.setForeground(new BitmapDrawable(resources, bitmapCreateBitmap));
    }

    public static boolean c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = Build.MODEL;
            str2.getClass();
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (mm7.Z(upperCase, false, str)) {
                return true;
            }
        }
        return false;
    }

    public static void f(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            ue3.g0(view, charSequence);
            return;
        }
        yb8 yb8Var = yb8.m0;
        if (yb8Var != null && yb8Var.X == view) {
            yb8.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new yb8(view, charSequence);
            return;
        }
        yb8 yb8Var2 = yb8.n0;
        if (yb8Var2 != null && yb8Var2.X == view) {
            yb8Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public abstract void d(int i);

    public abstract void e(Typeface typeface, boolean z);
}
