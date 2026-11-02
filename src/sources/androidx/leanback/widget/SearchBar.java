package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import defpackage.b36;
import defpackage.bt;
import defpackage.c56;
import defpackage.cz6;
import defpackage.h36;
import defpackage.if7;
import defpackage.p46;
import defpackage.pd3;
import defpackage.q46;
import defpackage.u36;
import defpackage.vy6;
import defpackage.we5;
import defpackage.wy6;
import defpackage.x46;
import defpackage.xy6;
import defpackage.y4;
import defpackage.yy6;
import defpackage.zy6;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends RelativeLayout {
    public static final /* synthetic */ int C0 = 0;
    public boolean A0;
    public final Context B0;
    public SearchEditText f0;
    public SpeechOrbView g0;
    public ImageView h0;
    public String i0;
    public String j0;
    public String k0;
    public Drawable l0;
    public final Handler m0;
    public final InputMethodManager n0;
    public boolean o0;
    public Drawable p0;
    public final int q0;
    public final int r0;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public SpeechRecognizer w0;
    public boolean x0;
    public SoundPool y0;
    public final SparseIntArray z0;

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m0 = new Handler();
        this.o0 = false;
        this.z0 = new SparseIntArray();
        this.A0 = false;
        this.B0 = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(q46.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(h36.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.i0 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.n0 = (InputMethodManager) context.getSystemService("input_method");
        this.r0 = resources.getColor(b36.lb_search_bar_text_speech_mode);
        this.q0 = resources.getColor(b36.lb_search_bar_text);
        this.v0 = resources.getInteger(p46.lb_search_bar_speech_mode_background_alpha);
        this.u0 = resources.getInteger(p46.lb_search_bar_text_mode_background_alpha);
        this.t0 = resources.getColor(b36.lb_search_bar_hint_speech_mode);
        this.s0 = resources.getColor(b36.lb_search_bar_hint);
    }

    public final void a() {
        if (this.A0) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.w0 == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            bt.i("android.permission.RECORD_AUDIO required for search");
            return;
        }
        this.A0 = true;
        this.f0.setText(_UrlKt.FRAGMENT_ENCODE_SET);
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.w0.setRecognitionListener(new a(this));
        this.x0 = true;
        this.w0.startListening(intent);
    }

    public final void b() {
        if (this.A0) {
            this.f0.setText(this.i0);
            this.f0.setHint(this.j0);
            this.A0 = false;
            if (this.w0 == null) {
                return;
            }
            this.g0.c();
            if (this.x0) {
                this.w0.cancel();
                this.x0 = false;
            }
            this.w0.setRecognitionListener(null);
        }
    }

    public final void c() {
        String string = getResources().getString(c56.lb_search_bar_hint);
        boolean zIsEmpty = TextUtils.isEmpty(this.k0);
        SpeechOrbView speechOrbView = this.g0;
        if (!zIsEmpty) {
            string = speechOrbView.isFocused() ? getResources().getString(c56.lb_search_bar_hint_with_title_speech, this.k0) : getResources().getString(c56.lb_search_bar_hint_with_title, this.k0);
        } else if (speechOrbView.isFocused()) {
            string = getResources().getString(c56.lb_search_bar_hint_speech);
        }
        this.j0 = string;
        SearchEditText searchEditText = this.f0;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.p0;
        if (z) {
            drawable.setAlpha(this.v0);
            boolean zIsFocused = this.g0.isFocused();
            SearchEditText searchEditText = this.f0;
            int i = this.t0;
            if (zIsFocused) {
                searchEditText.setTextColor(i);
                this.f0.setHintTextColor(i);
            } else {
                searchEditText.setTextColor(this.r0);
                this.f0.setHintTextColor(i);
            }
        } else {
            drawable.setAlpha(this.u0);
            this.f0.setTextColor(this.q0);
            this.f0.setHintTextColor(this.s0);
        }
        c();
    }

    public Drawable getBadgeDrawable() {
        return this.l0;
    }

    public CharSequence getHint() {
        return this.j0;
    }

    public String getTitle() {
        return this.k0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y0 = new SoundPool(2, 1, 0);
        int[] iArr = {x46.lb_voice_failure, x46.lb_voice_open, x46.lb_voice_no_input, x46.lb_voice_success};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            this.z0.put(i2, this.y0.load(this.B0, i2, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        this.y0.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.p0 = ((RelativeLayout) findViewById(u36.lb_search_bar_items)).getBackground();
        this.f0 = (SearchEditText) findViewById(u36.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(u36.lb_search_bar_badge);
        this.h0 = imageView;
        Drawable drawable = this.l0;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f0.setOnFocusChangeListener(new vy6(this, (byte) 0));
        this.f0.addTextChangedListener(new pd3(this, new wy6(this, (byte) 0)));
        this.f0.setOnKeyboardDismissListener(new we5(this, (byte) 21));
        this.f0.setOnEditorActionListener(new xy6(this, (byte) 0));
        this.f0.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(u36.lb_search_bar_speech_orb);
        this.g0 = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new y4(this, (byte) 4));
        this.g0.setOnFocusChangeListener(new vy6(this, (byte) 1));
        d(hasFocus());
        c();
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.l0 = drawable;
        ImageView imageView = this.h0;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            ImageView imageView2 = this.h0;
            if (drawable != null) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i) {
        this.g0.setNextFocusDownId(i);
        this.f0.setNextFocusDownId(i);
    }

    public void setSearchAffordanceColors(cz6 cz6Var) {
        SpeechOrbView speechOrbView = this.g0;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(cz6Var);
        }
    }

    public void setSearchAffordanceColorsInListening(cz6 cz6Var) {
        SpeechOrbView speechOrbView = this.g0;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(cz6Var);
        }
    }

    public void setSearchQuery(String str) {
        b();
        this.f0.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.i0, str)) {
            return;
        }
        this.i0 = str;
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        b();
        SpeechRecognizer speechRecognizer2 = this.w0;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.x0) {
                this.w0.cancel();
                this.x0 = false;
            }
        }
        this.w0 = speechRecognizer;
    }

    public void setTitle(String str) {
        this.k0 = str;
        c();
    }

    public void setPermissionListener(zy6 zy6Var) {
    }

    public void setSearchBarListener(yy6 yy6Var) {
    }

    @Deprecated
    public void setSpeechRecognitionCallback(if7 if7Var) {
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
