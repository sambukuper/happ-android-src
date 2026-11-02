package defpackage;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.TextAttribute;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class di7 implements InputConnection {
    public final t6 a;
    public final c15 b = new c15(0, new gn2[16]);
    public final InputConnection c;

    public di7(t6 t6Var, EditorInfo editorInfo) {
        this.a = t6Var;
        this.c = vr3.s(new ci7(this, false), editorInfo, new g55(this));
    }

    public final h48 a() {
        return ((kd8) this.a.f0).d();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((eb9) this.a.Y).Y++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.g();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return py1.a(this.c, inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.g(new q73(i, charSequence.toString(), (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : bc.a(textAttribute)));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        t6 t6Var = this.a;
        t6Var.g(new o73(i, i2, (m73) t6Var, (byte) 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        this.a.g(new n73(i, i2, (byte) 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((eb9) this.a.Y).k();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.g(new ya2((byte) 21));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), f88.d(a().f0), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        h48 h48VarA = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = h48VarA;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = h48VarA.Z.length();
        extractedText.partialStartOffset = -1;
        long j = h48VarA.f0;
        extractedText.selectionStart = f88.d(j);
        extractedText.selectionEnd = f88.c(j);
        extractedText.flags = !fm7.e0(h48VarA, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (f88.b(a().f0)) {
            return null;
        }
        h48 h48VarA = a();
        return h48VarA.Z.subSequence(f88.d(h48VarA.f0), f88.c(h48VarA.f0)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        h48 h48VarA = a();
        long j = h48VarA.f0;
        CharSequence charSequence = h48VarA.Z;
        int iC = f88.c(j);
        int iC2 = f88.c(h48VarA.f0);
        int length = iC2 + i;
        if (((iC2 ^ length) & (i ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iC, Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        h48 h48VarA = a();
        int iD = f88.d(h48VarA.f0);
        int i3 = iD - i;
        if (((i ^ iD) & (iD ^ i3)) < 0) {
            i3 = 0;
        }
        return h48VarA.Z.subSequence(Math.max(0, i3), f88.d(h48VarA.f0)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        byte b = 0;
        switch (i) {
            case R.id.selectAll:
                int length = a().Z.length();
                t6 t6Var = this.a;
                t6Var.g(new o73(t6Var, b, length, b));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        gn2 gn2Var = (gn2) this.a.h0;
        if (gn2Var != null) {
            gn2Var.B(new l73(i2));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int iZ;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return;
        }
        if (i >= 34) {
            t6 t6Var = this.a;
            iZ = u3.z((kd8) t6Var.f0, handwritingGesture, (y78) t6Var.j0, (dn2) t6Var.k0, (fw8) t6Var.l0);
        } else {
            iZ = 2;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new rh(intConsumer, iZ, (byte) 1));
        } else {
            intConsumer.accept(iZ);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i < 34 || i < 34) {
            return false;
        }
        t6 t6Var = this.a;
        return u3.A((kd8) t6Var.f0, previewableHandwritingGesture, (y78) t6Var.j0, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0074  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        og7 og7Var;
        q51 q51Var;
        CursorAnchorInfo cursorAnchorInfoA;
        f81 f81Var = (f81) this.a.i0;
        boolean z4 = false;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z7 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z7 || z4) {
                z = z4;
                z4 = z7;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z4 = true;
                } else {
                    z = z4;
                    z4 = true;
                }
                z2 = z4;
            }
            f81Var.f = z2;
            f81Var.g = z3;
            f81Var.h = z4;
            f81Var.i = z;
            if (z5 && (cursorAnchorInfoA = f81Var.a()) != null) {
                mj0 mj0Var = f81Var.c;
                mj0Var.W().updateCursorAnchorInfo((View) mj0Var.Y, cursorAnchorInfoA);
            }
            og7Var = f81Var.e;
            q51Var = null;
            if (!z6) {
                if (og7Var != null) {
                    og7Var.m(null);
                }
                f81Var.e = null;
                return true;
            }
            if (og7Var == null && og7Var.k()) {
                return true;
            }
            f81Var.e = w51.G(f81Var.d, null, e71.f0, new r5((Object) f81Var, q51Var, (byte) 7), 1);
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        f81Var.f = z2;
        f81Var.g = z3;
        f81Var.h = z4;
        f81Var.i = z;
        if (z5) {
            mj0 mj0Var2 = f81Var.c;
            mj0Var2.W().updateCursorAnchorInfo((View) mj0Var2.Y, cursorAnchorInfoA);
        }
        og7Var = f81Var.e;
        q51Var = null;
        if (!z6) {
            if (og7Var == null) {
            }
            f81Var.e = w51.G(f81Var.d, null, e71.f0, new r5((Object) f81Var, q51Var, (byte) 7), 1);
            return true;
        }
        if (og7Var != null) {
            og7Var.m(null);
        }
        f81Var.e = null;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        mj0 mj0Var = (mj0) this.a.g0;
        mj0Var.W().dispatchKeyEventFromInputMethod((View) mj0Var.Y, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        t6 t6Var = this.a;
        t6Var.g(new o73(i, i2, (m73) t6Var, (byte) 2));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bb  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        qe7 qe7Var;
        gi2 wc4Var;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String string = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        boolean z = false;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj instanceof BackgroundColorSpan) {
                    qe7Var = new qe7(0L, 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, z51.d(((BackgroundColorSpan) obj).getBackgroundColor()), (x38) null, (t67) null, 63487);
                } else if (obj instanceof ForegroundColorSpan) {
                    qe7Var = new qe7(z51.d(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65534);
                } else if (obj instanceof StrikethroughSpan) {
                    qe7Var = new qe7(0L, 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, x38.d, (t67) null, 61439);
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        qe7Var = new qe7(0L, 0L, dj2.i0, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65531);
                    } else if (style == 2) {
                        qe7Var = new qe7(0L, 0L, (dj2) null, new bj2(1), (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65527);
                    } else if (style != 3) {
                        qe7Var = null;
                    } else {
                        qe7Var = new qe7(0L, 0L, dj2.i0, new bj2(1), (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65523);
                    }
                } else if (obj instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                    String family = typefaceSpan.getFamily();
                    if (dh3.f(family, "cursive")) {
                        wc4Var = gi2.e;
                    } else if (dh3.f(family, "monospace")) {
                        wc4Var = gi2.d;
                    } else if (dh3.f(family, "sans-serif")) {
                        wc4Var = gi2.b;
                    } else if (dh3.f(family, "serif")) {
                        wc4Var = gi2.c;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 == null || family2.length() == 0) {
                            wc4Var = null;
                        } else {
                            Typeface typefaceCreate = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (dh3.f(typefaceCreate, typeface) || dh3.f(typefaceCreate, Typeface.create(typeface, 0))) {
                                typefaceCreate = null;
                            }
                            if (typefaceCreate != null) {
                                wc4Var = new wc4(new yr2((Object) typefaceCreate, (byte) 4));
                            } else {
                                wc4Var = null;
                            }
                        }
                    }
                    qe7Var = new qe7(0L, 0L, (dj2) null, (bj2) null, (cj2) null, wc4Var, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65503);
                } else if (obj instanceof UnderlineSpan) {
                    qe7Var = new qe7(0L, 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, x38.c, (t67) null, 61439);
                } else {
                    qe7Var = null;
                }
                if (qe7Var != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new pl(spanned.getSpanStart(obj), spanned.getSpanEnd(obj), qe7Var));
                }
            }
            arrayList = arrayList2;
        }
        this.a.g(new p73(string, arrayList, i, z));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        t6 t6Var = this.a;
        t6Var.g(new o73((Object) t6Var, i, i2, (byte) 0));
        ((gn2) t6Var.m0).B(Boolean.FALSE);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.a.g(new q73(i, charSequence.toString(), false));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.g(new p73(charSequence.toString(), null, i, (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : bc.a(textAttribute)));
        return true;
    }
}
