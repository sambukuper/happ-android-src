package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tt2 extends ys0 {
    public final CharSequence w0;
    public final TextPaint x0;

    public tt2(CharSequence charSequence, TextPaint textPaint) {
        this.w0 = charSequence;
        this.x0 = textPaint;
    }

    @Override // defpackage.ys0
    public final int L(int i) {
        CharSequence charSequence = this.w0;
        return this.x0.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.ys0
    public final int O(int i) {
        CharSequence charSequence = this.w0;
        return this.x0.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
