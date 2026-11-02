package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f12 {
    public final /* synthetic */ g12 a;

    public f12(g12 g12Var) {
        this.a = g12Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        g12 g12Var = this.a;
        e12 e12Var = g12Var.A0;
        if (g12Var.x0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = g12Var.x0;
        if (editText != null) {
            editText.removeTextChangedListener(e12Var);
            if (g12Var.x0.getOnFocusChangeListener() == g12Var.b().e()) {
                g12Var.x0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        g12Var.x0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(e12Var);
        }
        g12Var.b().l(g12Var.x0);
        g12Var.k(g12Var.b());
    }
}
