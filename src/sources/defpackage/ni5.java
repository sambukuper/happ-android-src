package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ni5 extends h12 {
    public final int e;
    public EditText f;
    public final st0 g;

    public ni5(g12 g12Var, int i) {
        super(g12Var);
        this.e = p36.design_password_eye;
        this.g = new st0(this, (byte) 11);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.h12
    public final void b() {
        p();
    }

    @Override // defpackage.h12
    public final int c() {
        return h56.password_toggle_content_description;
    }

    @Override // defpackage.h12
    public final int d() {
        return this.e;
    }

    @Override // defpackage.h12
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.h12
    public final boolean j() {
        return true;
    }

    @Override // defpackage.h12
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.h12
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.h12
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.h12
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
