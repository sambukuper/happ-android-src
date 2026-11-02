package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class i75 implements InputConnection {
    public final vj2 a;
    public di7 b;

    public i75(di7 di7Var, vj2 vj2Var) {
        this.a = vj2Var;
        this.b = di7Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.beginBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        di7 di7Var = this.b;
        if (di7Var != null) {
            if (di7Var != null) {
                di7Var.closeConnection();
                this.b = null;
            }
            this.a.B(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            di7Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return this.b != null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.commitText(charSequence, i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.deleteSurroundingText(i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.deleteSurroundingTextInCodePoints(i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        di7 di7Var = this.b;
        if (di7Var != null) {
            return di7Var.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.finishComposingText();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            return di7Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            return di7Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            return di7Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            return di7Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            return di7Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            di7Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.performEditorAction(i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        di7 di7Var = this.b;
        if (di7Var != null) {
            return di7Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.requestCursorUpdates(i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.setComposingRegion(i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.setComposingText(charSequence, i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        di7 di7Var = this.b;
        if (di7Var == null) {
            return false;
        }
        di7Var.setSelection(i, i2);
        return true;
    }
}
