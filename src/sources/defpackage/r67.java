package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r67 extends CharacterStyle implements UpdateAppearance {
    public final q67 X;
    public final float Y;
    public final rh5 Z = z51.H(new ua7(9205357640488583168L));
    public final zi1 f0 = rd7.b(new hr5(this, 19));

    public r67(q67 q67Var, float f) {
        this.X = q67Var;
        this.Y = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        mb6.Z(textPaint, this.Y);
        textPaint.setShader((Shader) this.f0.getValue());
    }
}
