package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rz1 implements TextWatcher {
    public final EditText X;
    public qz1 Y;
    public boolean Z = true;

    public rz1(EditText editText) {
        this.X = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            yy1 yy1VarA = yy1.a();
            if (editableText == null) {
                length = 0;
            } else {
                yy1VarA.getClass();
                length = editableText.length();
            }
            yy1VarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.X;
        if (!editText.isInEditMode() && this.Z && yy1.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = yy1.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    yy1.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            yy1 yy1VarA = yy1.a();
            qz1 qz1Var = this.Y;
            if (qz1Var == null) {
                qz1Var = new qz1(editText);
                this.Y = qz1Var;
            }
            yy1VarA.h(qz1Var);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
