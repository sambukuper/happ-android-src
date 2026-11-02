package defpackage;

import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.TextAttribute;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bc {
    public static boolean a(TextAttribute textAttribute) {
        return textAttribute.isTextSuggestionSelected();
    }

    public static final void b(y07 y07Var, AccessibilityEvent accessibilityEvent) {
        t07 t07Var = y07Var.d;
        Object objG = t07Var.X.g(c17.M);
        if (objG == null) {
            objG = null;
        }
        ce3 ce3Var = (ce3) objG;
        Object objG2 = t07Var.X.g(c17.I);
        int i = ((f88) (objG2 != null ? objG2 : null)) != null ? 1 : 0;
        if (ce3Var != null && ce3Var.b) {
            i |= 4;
        }
        if (ce3Var != null && ce3Var.a) {
            i |= 2;
        }
        accessibilityEvent.setTextChangeTypes(i | accessibilityEvent.getTextChangeTypes());
    }
}
