package com.blacksquircle.ui.editorkit.widget.internal;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.c38;
import defpackage.cm8;
import defpackage.dm8;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText;", "Lcom/blacksquircle/ui/editorkit/widget/internal/LineNumbersEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", _UrlKt.FRAGMENT_ENCODE_SET, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", _UrlKt.FRAGMENT_ENCODE_SET, "text", "Ldn8;", "setTextContent", "(Ljava/lang/CharSequence;)V", "Ldm8;", "r0", "Ldm8;", "getUndoStack", "()Ldm8;", "setUndoStack", "(Ldm8;)V", "undoStack", "s0", "getRedoStack", "setRedoStack", "redoStack", "Lcm8;", "onUndoRedoChangedListener", "Lcm8;", "getOnUndoRedoChangedListener", "()Lcm8;", "setOnUndoRedoChangedListener", "(Lcm8;)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class UndoRedoEditText extends LineNumbersEditText {

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public dm8 undoStack;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public dm8 redoStack;
    public c38 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndoRedoEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.undoStack = new dm8();
        this.redoStack = new dm8();
    }

    public final cm8 getOnUndoRedoChangedListener() {
        return null;
    }

    public final dm8 getRedoStack() {
        return this.redoStack;
    }

    public final dm8 getUndoStack() {
        return this.undoStack;
    }

    public final void setRedoStack(dm8 dm8Var) {
        dm8Var.getClass();
        this.redoStack = dm8Var;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void setTextContent(CharSequence text) {
        text.getClass();
        super.setTextContent(text);
    }

    public final void setUndoStack(dm8 dm8Var) {
        dm8Var.getClass();
        this.undoStack = dm8Var;
    }

    public final void setOnUndoRedoChangedListener(cm8 cm8Var) {
    }
}
