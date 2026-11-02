package com.blacksquircle.ui.editorkit.widget.internal;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.Toast;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import defpackage.m88;
import defpackage.n88;
import defpackage.p61;
import defpackage.x42;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/LineNumbersEditText;", "Lcom/blacksquircle/ui/editorkit/widget/internal/ScrollableEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", _UrlKt.FRAGMENT_ENCODE_SET, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", _UrlKt.FRAGMENT_ENCODE_SET, "text", "Ldn8;", "setTextContent", "(Ljava/lang/CharSequence;)V", _UrlKt.FRAGMENT_ENCODE_SET, "value", "k0", "Z", "getSoftKeyboard", "()Z", "setSoftKeyboard", "(Z)V", "softKeyboard", "l0", "getReadOnly", "setReadOnly", "readOnly", "Ln88;", "m0", "Ln88;", "getStructure", "()Ln88;", "structure", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LineNumbersEditText extends ScrollableEditText {

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public boolean softKeyboard;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public boolean readOnly;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public final n88 structure;
    public final x42 n0;
    public int o0;
    public int p0;
    public CharSequence q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineNumbersEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.structure = new n88(new SpannableStringBuilder());
        this.n0 = new x42(this, (byte) 2);
        this.q0 = _UrlKt.FRAGMENT_ENCODE_SET;
        setGravity(8388659);
        setInputType(655361);
    }

    public final void a(int i, int i2, CharSequence charSequence) {
        if (i < 0) {
            i = 0;
        }
        n88 n88Var = this.structure;
        SpannableStringBuilder spannableStringBuilder = n88Var.a;
        SpannableStringBuilder spannableStringBuilder2 = n88Var.a;
        ArrayList arrayList = n88Var.b;
        if (i2 > spannableStringBuilder.length()) {
            i2 = spannableStringBuilder2.length();
        }
        int length = charSequence.length() - (i2 - i);
        int iB = n88Var.b(i);
        for (int i3 = i; i3 < i2; i3++) {
            if (spannableStringBuilder2.charAt(i3) == '\n') {
                int i4 = 1 + iB;
                TextProcessor textProcessor = (TextProcessor) this;
                n88 n88Var2 = textProcessor.structure;
                if (i4 != 0) {
                    n88Var2.b.remove(i4);
                } else {
                    n88Var2.getClass();
                }
                Iterator it = textProcessor.G0.iterator();
                if (it.hasNext()) {
                    throw p61.k(it);
                }
            }
        }
        int iB2 = n88Var.b(i) + 1;
        if (1 <= iB2 && iB2 < arrayList.size()) {
            while (iB2 < arrayList.size()) {
                int iA = n88Var.a(iB2) + length;
                if (iB2 <= 0 || iA > 0) {
                    ((m88) arrayList.get(iB2)).a = iA;
                } else {
                    if (iB2 != 0) {
                        arrayList.remove(iB2);
                    }
                    iB2--;
                }
                iB2++;
            }
        }
        int length2 = charSequence.length();
        for (int i5 = 0; i5 < length2; i5++) {
            if (charSequence.charAt(i5) == '\n') {
                int i6 = i + i5;
                int iB3 = n88Var.b(i6) + 1;
                int i7 = i6 + 1;
                TextProcessor textProcessor2 = (TextProcessor) this;
                n88 n88Var3 = textProcessor2.structure;
                if (iB3 != 0) {
                    n88Var3.b.add(iB3, new m88(i7));
                } else {
                    n88Var3.getClass();
                }
                Iterator it2 = textProcessor2.G0.iterator();
                if (it2.hasNext()) {
                    throw p61.k(it2);
                }
            }
        }
        spannableStringBuilder2.replace(i, i2, charSequence);
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final boolean getSoftKeyboard() {
        return this.softKeyboard;
    }

    public final n88 getStructure() {
        return this.structure;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
        setFocusable(!z);
        setFocusableInTouchMode(!z);
    }

    public final void setSoftKeyboard(boolean z) {
        this.softKeyboard = z;
        setImeOptions(z ? 0 : 268435456);
    }

    public void setTextContent(CharSequence text) {
        n88 n88Var = this.structure;
        text.getClass();
        x42 x42Var = this.n0;
        removeTextChangedListener(x42Var);
        try {
            setText(text);
            a(0, n88Var.a.length(), text);
        } catch (Throwable th) {
            th.printStackTrace();
            setText(_UrlKt.FRAGMENT_ENCODE_SET);
            a(0, n88Var.a.length(), _UrlKt.FRAGMENT_ENCODE_SET);
            Toast.makeText(getContext(), th.getMessage(), 1).show();
        }
        addTextChangedListener(x42Var);
    }
}
