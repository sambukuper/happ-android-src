package com.blacksquircle.ui.editorkit.widget.internal;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText;
import defpackage.b61;
import defpackage.fl6;
import defpackage.h24;
import defpackage.hg;
import defpackage.hw0;
import defpackage.n88;
import defpackage.p32;
import defpackage.p61;
import defpackage.pa2;
import defpackage.qm7;
import defpackage.qy1;
import defpackage.w08;
import defpackage.wa;
import defpackage.wi;
import defpackage.xz7;
import defpackage.yr6;
import defpackage.yz7;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0011¨\u00061"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/SyntaxHighlightEditText;", "Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", _UrlKt.FRAGMENT_ENCODE_SET, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", _UrlKt.FRAGMENT_ENCODE_SET, "text", "Ldn8;", "setTextContent", "(Ljava/lang/CharSequence;)V", "lineNumber", "setErrorLine", "(I)V", "Lh24;", "value", "u0", "Lh24;", "getLanguage", "()Lh24;", "setLanguage", "(Lh24;)V", "language", "Lhw0;", "v0", "Lhw0;", "getColorScheme", "()Lhw0;", "setColorScheme", "(Lhw0;)V", "colorScheme", _UrlKt.FRAGMENT_ENCODE_SET, "w0", "Z", "getUseSpacesInsteadOfTabs", "()Z", "setUseSpacesInsteadOfTabs", "(Z)V", "useSpacesInsteadOfTabs", "x0", "I", "getTabWidth", "()I", "setTabWidth", "tabWidth", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SyntaxHighlightEditText extends UndoRedoEditText {
    public static final /* synthetic */ int F0 = 0;
    public qm7 A0;
    public yr6 B0;
    public int C0;
    public boolean D0;
    public boolean E0;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public h24 language;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public hw0 colorScheme;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public boolean useSpacesInsteadOfTabs;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public int tabWidth;
    public final ArrayList y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyntaxHighlightEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.colorScheme = qy1.a;
        this.useSpacesInsteadOfTabs = true;
        this.tabWidth = 4;
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        setFilters(new InputFilter[]{new InputFilter() { // from class: wz7
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                int i6 = SyntaxHighlightEditText.F0;
                if (i3 - i2 != 1 || i2 >= charSequence.length() || i4 >= spanned.length() || charSequence.charAt(i2) != '\t') {
                    return charSequence;
                }
                SyntaxHighlightEditText syntaxHighlightEditText = this.a;
                return syntaxHighlightEditText.useSpacesInsteadOfTabs ? mm7.V(syntaxHighlightEditText.tabWidth, " ") : "\t";
            }
        }});
    }

    public final void b() {
        yr6 yr6Var = this.B0;
        if (yr6Var != null) {
            ((ExecutorService) yr6Var.g0).shutdown();
        }
        this.B0 = null;
        yr6 yr6Var2 = new yr6(new hg(this, (byte) 5), new wi(this, (byte) 7));
        this.B0 = yr6Var2;
        ((ExecutorService) yr6Var2.g0).execute(new fl6((Object) yr6Var2, (byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    public final void c() {
        int lineForVertical;
        int lineForVertical2;
        int i;
        if (getLayout() != null) {
            Layout layout = getLayout();
            if (getLayout() == null || getLineHeight() == 0 || (lineForVertical = getLayout().getLineForVertical(getScrollY())) < 0) {
                lineForVertical = 0;
            } else if (lineForVertical >= getLineCount()) {
                lineForVertical = getLineCount() - 1;
            }
            int lineStart = layout.getLineStart(lineForVertical);
            Layout layout2 = getLayout();
            if (getLayout() == null || getLineHeight() == 0) {
                lineForVertical2 = 0;
            } else {
                lineForVertical2 = getLayout().getLineForVertical(getHeight() + getScrollY());
                if (lineForVertical2 < 0) {
                    lineForVertical2 = 0;
                } else if (lineForVertical2 >= getLineCount()) {
                    lineForVertical2 = getLineCount() - 1;
                }
            }
            int lineEnd = layout2.getLineEnd(lineForVertical2);
            this.D0 = true;
            Editable text = getText();
            text.getClass();
            for (yz7 yz7Var : (yz7[]) text.getSpans(0, getText().length(), yz7.class)) {
                getText().removeSpan(yz7Var);
            }
            for (xz7 xz7Var : this.y0) {
                boolean z = xz7Var.b >= 0 && xz7Var.c <= getText().length();
                int i2 = xz7Var.b;
                int i3 = xz7Var.c;
                boolean z2 = i2 <= i3;
                boolean z3 = (lineStart <= i2 && i2 <= lineEnd) || (i2 <= lineEnd && i3 >= lineStart);
                if (z && z2 && z3) {
                    Editable text2 = getText();
                    switch (xz7Var.a.ordinal()) {
                        case 0:
                            i = this.colorScheme.m;
                            break;
                        case 1:
                            i = this.colorScheme.n;
                            break;
                        case 2:
                            i = this.colorScheme.o;
                            break;
                        case 3:
                            i = this.colorScheme.p;
                            break;
                        case 4:
                            i = this.colorScheme.q;
                            break;
                        case 5:
                            i = this.colorScheme.r;
                            break;
                        case 6:
                            i = this.colorScheme.s;
                            break;
                        case 7:
                            i = this.colorScheme.t;
                            break;
                        case 8:
                            i = this.colorScheme.u;
                            break;
                        case 9:
                            i = this.colorScheme.v;
                            break;
                        case 10:
                            i = this.colorScheme.w;
                            break;
                        case 11:
                            i = this.colorScheme.x;
                            break;
                        case FileClientSessionCache.MAX_SIZE /* 12 */:
                            i = this.colorScheme.y;
                            break;
                        case 13:
                            i = this.colorScheme.z;
                            break;
                        case 14:
                            i = this.colorScheme.A;
                            break;
                        default:
                            b61.c();
                            return;
                    }
                    yz7 yz7Var2 = new yz7(new qm7(i));
                    int i4 = xz7Var.b;
                    if (i4 < lineStart) {
                        i4 = lineStart;
                    }
                    int i5 = xz7Var.c;
                    if (i5 > lineEnd) {
                        i5 = lineEnd;
                    }
                    text2.setSpan(yz7Var2, i4, i5, 33);
                }
            }
            this.D0 = false;
            Editable text3 = getText();
            text3.getClass();
            for (pa2 pa2Var : (pa2[]) text3.getSpans(0, getText().length(), pa2.class)) {
                getText().removeSpan(null);
            }
            if (this.A0 != null) {
                Iterator it = this.z0.iterator();
                if (it.hasNext()) {
                    throw p61.k(it);
                }
            }
            if (!this.useSpacesInsteadOfTabs) {
                Editable text4 = getText();
                text4.getClass();
                for (w08 w08Var : (w08[]) text4.getSpans(0, getText().length(), w08.class)) {
                    getText().removeSpan(w08Var);
                }
                Matcher matcher = Pattern.compile("\t").matcher(getText().subSequence(lineStart, lineEnd));
                while (matcher.find()) {
                    int iStart = matcher.start() + lineStart;
                    int iEnd = matcher.end() + lineStart;
                    if (iStart >= 0 && iEnd <= getText().length()) {
                        getText().setSpan(new w08(this.tabWidth), iStart, iEnd, 18);
                    }
                }
            }
            postInvalidate();
        }
    }

    public final hw0 getColorScheme() {
        return this.colorScheme;
    }

    public final h24 getLanguage() {
        return this.language;
    }

    public final int getTabWidth() {
        return this.tabWidth;
    }

    public final boolean getUseSpacesInsteadOfTabs() {
        return this.useSpacesInsteadOfTabs;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText, android.widget.TextView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        c();
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        c();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void setColorScheme(hw0 hw0Var) {
        hw0Var.getClass();
        this.colorScheme = hw0Var;
        TextProcessor textProcessor = (TextProcessor) this;
        hw0 hw0Var2 = textProcessor.colorScheme;
        textProcessor.A0 = new qm7(hw0Var2.k);
        textProcessor.setTextColor(hw0Var2.a);
        wa.F(textProcessor, textProcessor.colorScheme.b);
        textProcessor.setBackgroundColor(textProcessor.colorScheme.c);
        textProcessor.setHighlightColor(textProcessor.colorScheme.i);
        Iterator it = textProcessor.G0.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                c2.m();
            } else {
                textProcessor.getColorScheme();
                throw null;
            }
        }
    }

    public final void setErrorLine(int lineNumber) {
        if (lineNumber > 0) {
            int i = lineNumber - 1;
            int iA = getStructure().a(i);
            n88 structure = getStructure();
            int length = i == structure.b.size() - 1 ? structure.a.length() : structure.a(lineNumber) - 1;
            if (iA >= getText().length() || length >= getText().length() || iA <= -1 || length <= -1) {
                return;
            }
            this.E0 = true;
            getText().setSpan(new p32(), iA, length, 33);
        }
    }

    public final void setLanguage(h24 h24Var) {
        this.language = h24Var;
        TextProcessor textProcessor = (TextProcessor) this;
        textProcessor.b();
        Iterator it = textProcessor.G0.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                c2.m();
            } else {
                textProcessor.getLanguage();
                throw null;
            }
        }
    }

    public final void setTabWidth(int i) {
        this.tabWidth = i;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText, com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void setTextContent(CharSequence text) {
        text.getClass();
        this.y0.clear();
        this.z0.clear();
        super.setTextContent(text);
        b();
    }

    public final void setUseSpacesInsteadOfTabs(boolean z) {
        this.useSpacesInsteadOfTabs = z;
    }
}
