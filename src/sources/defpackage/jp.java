package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jp {
    public final /* synthetic */ byte a;
    public Object b;
    public Serializable c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Object g;

    public jp(Object obj, jp jpVar, jx5 jx5Var, boolean z, boolean z2, boolean z3) {
        this.a = (byte) 2;
        this.g = obj;
        this.b = jpVar;
        jx5 jx5Var2 = (jx5Var == null || jx5Var.c()) ? null : jx5Var;
        this.c = jx5Var2;
        if (z) {
            if (jx5Var2 == null) {
                bt.q("Cannot pass true for 'explName' if name is null/empty");
                throw null;
            }
            if (jx5Var.X.isEmpty()) {
                z = false;
            }
        }
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public jp a(jp jpVar) {
        jp jpVar2 = (jp) this.b;
        return jpVar2 == null ? f(jpVar) : f(jpVar2.a(jpVar));
    }

    public void b() {
        CompoundButton compoundButton = (CompoundButton) this.g;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.d) {
                    drawableMutate.setTintList((ColorStateList) this.b);
                }
                if (this.e) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void c() {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.g;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.d) {
                    drawableMutate.setTintList((ColorStateList) this.b);
                }
                if (this.e) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.g;
        zv7 zv7VarR = zv7.r(i, 0, compoundButton.getContext(), attributeSet, h66.CompoundButton);
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        cw8.m(compoundButton, compoundButton.getContext(), h66.CompoundButton, attributeSet, (TypedArray) zv7VarR.Y, i);
        try {
            if (typedArray.hasValue(h66.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(h66.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(u70.O(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(h66.CompoundButton_android_button)) {
                        compoundButton.setButtonDrawable(u70.O(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(h66.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(h66.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(u70.O(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(h66.CompoundButton_buttonTint)) {
                compoundButton.setButtonTintList(zv7VarR.c(h66.CompoundButton_buttonTint));
            }
            if (typedArray.hasValue(h66.CompoundButton_buttonTintMode)) {
                compoundButton.setButtonTintMode(dw1.c(typedArray.getInt(h66.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            zv7VarR.v();
        }
    }

    public jp e() {
        jp jpVar = (jp) this.b;
        if (jpVar == null) {
            return this;
        }
        jp jpVarE = jpVar.e();
        if (((jx5) this.c) != null) {
            return ((jx5) jpVarE.c) == null ? f(null) : f(jpVarE);
        }
        if (((jx5) jpVarE.c) == null) {
            boolean z = this.e;
            if (z == jpVarE.e) {
                return f(jpVarE);
            }
            if (z) {
                return f(null);
            }
        }
        return jpVarE;
    }

    public jp f(jp jpVar) {
        if (jpVar == ((jp) this.b)) {
            return this;
        }
        return new jp(this.g, jpVar, (jx5) this.c, this.d, this.e, this.f);
    }

    public jp g() {
        jp jpVarG;
        boolean z = this.f;
        jp jpVar = (jp) this.b;
        if (!z) {
            return (jpVar == null || (jpVarG = jpVar.g()) == jpVar) ? this : f(jpVarG);
        }
        if (jpVar == null) {
            return null;
        }
        return jpVar.g();
    }

    public jp h() {
        if (((jp) this.b) == null) {
            return this;
        }
        return new jp(this.g, null, (jx5) this.c, this.d, this.e, this.f);
    }

    public jp i() {
        jp jpVar = (jp) this.b;
        jp jpVarI = jpVar == null ? null : jpVar.i();
        return this.e ? f(jpVarI) : jpVarI;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                String str = this.g.toString() + "[visible=" + this.e + ",ignore=" + this.f + ",explicitName=" + this.d + "]";
                jp jpVar = (jp) this.b;
                if (jpVar == null) {
                    return str;
                }
                return str + ", " + jpVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jp(TextView textView, byte b) {
        this.a = b;
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = textView;
    }
}
