package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ah2 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final s86 a(View view, AndroidComposeView androidComposeView) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = b;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new s86(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    public static final Integer b(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final ug2 c(int i) {
        if (i == 1) {
            return new ug2(2);
        }
        if (i == 2) {
            return new ug2(1);
        }
        if (i == 17) {
            return new ug2(3);
        }
        if (i == 33) {
            return new ug2(5);
        }
        if (i == 66) {
            return new ug2(4);
        }
        if (i != 130) {
            return null;
        }
        return new ug2(6);
    }
}
