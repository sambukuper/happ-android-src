package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import su.happ.proxyutility.feature.stories.StoryProgressView;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class wk2 extends kw8 {
    public static final /* synthetic */ int w0 = 0;
    public final AppCompatImageButton m0;
    public final HappTextButton n0;
    public final HappTextView o0;
    public final CircularProgressIndicator p0;
    public final ConstraintLayout q0;
    public final ViewPager2 r0;
    public final StoryProgressView s0;
    public final View t0;
    public final View u0;
    public pk7 v0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wk2(View view, AppCompatImageButton appCompatImageButton, HappTextButton happTextButton, HappTextView happTextView, CircularProgressIndicator circularProgressIndicator, ConstraintLayout constraintLayout, ViewPager2 viewPager2, StoryProgressView storyProgressView, View view2, View view3) {
        super(view, (Object) null);
        this.m0 = appCompatImageButton;
        this.n0 = happTextButton;
        this.o0 = happTextView;
        this.p0 = circularProgressIndicator;
        this.q0 = constraintLayout;
        this.r0 = viewPager2;
        this.s0 = storyProgressView;
        this.t0 = view2;
        this.u0 = view3;
    }
}
