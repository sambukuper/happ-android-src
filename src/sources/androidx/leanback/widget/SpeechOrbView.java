package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b36;
import defpackage.cz6;
import defpackage.n36;
import defpackage.q46;
import defpackage.s36;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {
    public cz6 A0;
    public int B0;
    public boolean C0;
    public final float y0;
    public cz6 z0;

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B0 = 0;
        this.C0 = false;
        Resources resources = context.getResources();
        this.y0 = resources.getFraction(s36.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.A0 = new cz6(resources.getColor(b36.lb_speech_orb_not_recording), resources.getColor(b36.lb_speech_orb_not_recording_pulsed), resources.getColor(b36.lb_speech_orb_not_recording_icon));
        this.z0 = new cz6(resources.getColor(b36.lb_speech_orb_recording), resources.getColor(b36.lb_speech_orb_recording), 0);
        c();
    }

    public final void c() {
        setOrbColors(this.A0);
        setOrbIcon(getResources().getDrawable(n36.lb_ic_search_mic_out));
        a(hasFocus());
        View view = this.h0;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.C0 = false;
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return q46.lb_speech_orb;
    }

    public void setListeningOrbColors(cz6 cz6Var) {
        this.z0 = cz6Var;
    }

    public void setNotListeningOrbColors(cz6 cz6Var) {
        this.A0 = cz6Var;
    }

    public void setSoundLevel(int i) {
        if (this.C0) {
            int i2 = this.B0;
            if (i > i2) {
                this.B0 = ((i - i2) / 2) + i2;
            } else {
                this.B0 = (int) (i2 * 0.7f);
            }
            float focusedZoom = (((this.y0 - getFocusedZoom()) * this.B0) / 100.0f) + 1.0f;
            View view = this.h0;
            view.setScaleX(focusedZoom);
            view.setScaleY(focusedZoom);
        }
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
