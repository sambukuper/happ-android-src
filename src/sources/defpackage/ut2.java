package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ut2 extends ys0 {
    public final BreakIterator w0;

    public ut2(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.w0 = characterInstance;
    }

    @Override // defpackage.ys0
    public final int L(int i) {
        return this.w0.following(i);
    }

    @Override // defpackage.ys0
    public final int O(int i) {
        return this.w0.preceding(i);
    }
}
