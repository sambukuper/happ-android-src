package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k78 implements TextWatcher {
    public int X;
    public final /* synthetic */ EditText Y;
    public final /* synthetic */ TextInputLayout Z;

    public k78(TextInputLayout textInputLayout, EditText editText) {
        this.Z = textInputLayout;
        this.Y = editText;
        this.X = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.Z;
        textInputLayout.w(!textInputLayout.D1, false);
        if (textInputLayout.q0) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.y0) {
            textInputLayout.x(editable);
        }
        EditText editText = this.Y;
        int lineCount = editText.getLineCount();
        int i = this.X;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.w1;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.X = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
