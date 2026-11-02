package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qn8 implements Spannable {
    public boolean X = false;
    public Spannable Y;

    public qn8(Spannable spannable) {
        this.Y = spannable;
    }

    public final void a() {
        Spannable spannable = this.Y;
        if (!this.X) {
            if ((Build.VERSION.SDK_INT < 28 ? new s18((byte) 8) : new pn8((byte) 8)).d(spannable)) {
                this.Y = new SpannableString(spannable);
            }
        }
        this.X = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.Y.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.Y.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.Y.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.Y.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.Y.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.Y.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.Y.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.Y.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.Y.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.Y.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.Y.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.Y.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.Y.toString();
    }
}
