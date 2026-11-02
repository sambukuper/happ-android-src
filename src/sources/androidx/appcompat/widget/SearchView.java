package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import defpackage.a38;
import defpackage.cw8;
import defpackage.d46;
import defpackage.dz6;
import defpackage.e81;
import defpackage.ez6;
import defpackage.f70;
import defpackage.fz6;
import defpackage.gz6;
import defpackage.h66;
import defpackage.hz6;
import defpackage.i56;
import defpackage.iz6;
import defpackage.jq;
import defpackage.l36;
import defpackage.lw7;
import defpackage.ob4;
import defpackage.qv0;
import defpackage.ru0;
import defpackage.u46;
import defpackage.vy6;
import defpackage.w26;
import defpackage.x42;
import defpackage.xy6;
import defpackage.zv7;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements qv0 {
    public static final ru0 k1;
    public final ImageView A0;
    public final ImageView B0;
    public final View C0;
    public iz6 D0;
    public final Rect E0;
    public final Rect F0;
    public final int[] G0;
    public final int[] H0;
    public final ImageView I0;
    public final Drawable J0;
    public final int K0;
    public final int L0;
    public final Intent M0;
    public final Intent N0;
    public final CharSequence O0;
    public fz6 P0;
    public View.OnFocusChangeListener Q0;
    public View.OnClickListener R0;
    public boolean S0;
    public boolean T0;
    public e81 U0;
    public boolean V0;
    public CharSequence W0;
    public boolean X0;
    public boolean Y0;
    public int Z0;
    public boolean a1;
    public String b1;
    public CharSequence c1;
    public boolean d1;
    public int e1;
    public SearchableInfo f1;
    public Bundle g1;
    public final dz6 h1;
    public final dz6 i1;
    public final WeakHashMap j1;
    public final SearchAutoComplete u0;
    public final View v0;
    public final View w0;
    public final View x0;
    public final ImageView y0;
    public final ImageView z0;

    static {
        ru0 ru0Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            ru0 ru0Var2 = new ru0();
            ru0Var2.a = null;
            ru0Var2.b = null;
            ru0Var2.c = null;
            ru0.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                ru0Var2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                ru0Var2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                ru0Var2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            ru0Var = ru0Var2;
        }
        k1 = ru0Var;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new int[2];
        this.H0 = new int[2];
        this.h1 = new dz6(this, (byte) 0);
        byte b = 1;
        this.i1 = new dz6(this, b);
        this.j1 = new WeakHashMap();
        d dVar = new d(this);
        e eVar = new e(this);
        xy6 xy6Var = new xy6(this, b);
        jq jqVar = new jq(this, (byte) 2);
        ob4 ob4Var = new ob4(this, (byte) 3);
        x42 x42Var = new x42(this, (byte) 7);
        zv7 zv7VarR = zv7.r(i, 0, context, attributeSet, h66.SearchView);
        cw8.m(this, context, h66.SearchView, attributeSet, (TypedArray) zv7VarR.Y, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = h66.SearchView_layout;
        int i3 = u46.abc_search_view;
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        layoutInflaterFrom.inflate(typedArray.getResourceId(i2, i3), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(d46.search_src_text);
        this.u0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.v0 = findViewById(d46.search_edit_frame);
        View viewFindViewById = findViewById(d46.search_plate);
        this.w0 = viewFindViewById;
        View viewFindViewById2 = findViewById(d46.submit_area);
        this.x0 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(d46.search_button);
        this.y0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(d46.search_go_btn);
        this.z0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(d46.search_close_btn);
        this.A0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(d46.search_voice_btn);
        this.B0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(d46.search_mag_icon);
        this.I0 = imageView5;
        viewFindViewById.setBackground(zv7VarR.e(h66.SearchView_queryBackground));
        viewFindViewById2.setBackground(zv7VarR.e(h66.SearchView_submitBackground));
        imageView.setImageDrawable(zv7VarR.e(h66.SearchView_searchIcon));
        imageView2.setImageDrawable(zv7VarR.e(h66.SearchView_goIcon));
        imageView3.setImageDrawable(zv7VarR.e(h66.SearchView_closeIcon));
        imageView4.setImageDrawable(zv7VarR.e(h66.SearchView_voiceIcon));
        imageView5.setImageDrawable(zv7VarR.e(h66.SearchView_searchIcon));
        this.J0 = zv7VarR.e(h66.SearchView_searchHintIcon);
        a38.f(imageView, getResources().getString(i56.abc_searchview_description_search));
        this.K0 = typedArray.getResourceId(h66.SearchView_suggestionRowLayout, u46.abc_search_dropdown_item_icons_2line);
        this.L0 = typedArray.getResourceId(h66.SearchView_commitIcon, 0);
        imageView.setOnClickListener(dVar);
        imageView3.setOnClickListener(dVar);
        imageView2.setOnClickListener(dVar);
        imageView4.setOnClickListener(dVar);
        searchAutoComplete.setOnClickListener(dVar);
        searchAutoComplete.addTextChangedListener(x42Var);
        searchAutoComplete.setOnEditorActionListener(xy6Var);
        searchAutoComplete.setOnItemClickListener(jqVar);
        searchAutoComplete.setOnItemSelectedListener(ob4Var);
        searchAutoComplete.setOnKeyListener(eVar);
        searchAutoComplete.setOnFocusChangeListener(new vy6(this, (byte) 2));
        setIconifiedByDefault(typedArray.getBoolean(h66.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(h66.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.O0 = typedArray.getText(h66.SearchView_defaultQueryHint);
        this.W0 = typedArray.getText(h66.SearchView_queryHint);
        int i4 = typedArray.getInt(h66.SearchView_android_imeOptions, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = typedArray.getInt(h66.SearchView_android_inputType, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(typedArray.getBoolean(h66.SearchView_android_focusable, true));
        zv7VarR.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.M0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.N0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.C0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new f70(this, (byte) 1));
        }
        w(this.S0);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(l36.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(l36.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.u0;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.Y0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.u0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.Y0 = false;
    }

    public int getImeOptions() {
        return this.u0.getImeOptions();
    }

    public int getInputType() {
        return this.u0.getInputType();
    }

    public int getMaxWidth() {
        return this.Z0;
    }

    public CharSequence getQuery() {
        return this.u0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.W0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.O0 : getContext().getText(this.f1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.L0;
    }

    public int getSuggestionRowLayout() {
        return this.K0;
    }

    public e81 getSuggestionsAdapter() {
        return this.U0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.c1);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.g1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.g1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.u0;
        if (i >= 29) {
            f.a(searchAutoComplete);
            return;
        }
        ru0 ru0Var = k1;
        ru0Var.getClass();
        ru0.a();
        Method method = ru0Var.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        ru0.a();
        Method method2 = ru0Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.u0;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText(_UrlKt.FRAGMENT_ENCODE_SET);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.S0) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i) {
        String strH;
        Cursor cursor = this.U0.Z;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                try {
                    int i2 = lw7.z0;
                    String strH2 = lw7.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strH2 == null) {
                        strH2 = this.f1.getSuggestIntentAction();
                    }
                    if (strH2 == null) {
                        strH2 = "android.intent.action.SEARCH";
                    }
                    String strH3 = lw7.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strH3 == null) {
                        strH3 = this.f1.getSuggestIntentData();
                    }
                    if (strH3 != null && (strH = lw7.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strH3 = strH3 + "/" + Uri.encode(strH);
                    }
                    intentJ = j(strH2, strH3 == null ? null : Uri.parse(strH3), lw7.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), lw7.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException unused3) {
                    intentJ.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.u0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.u0.getText();
        Cursor cursor = this.U0.Z;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.U0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // defpackage.qv0
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.u0;
        searchAutoComplete.setText(_UrlKt.FRAGMENT_ENCODE_SET);
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.c1 = _UrlKt.FRAGMENT_ENCODE_SET;
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.e1);
        this.d1 = false;
    }

    @Override // defpackage.qv0
    public final void onActionViewExpanded() {
        if (this.d1) {
            return;
        }
        this.d1 = true;
        SearchAutoComplete searchAutoComplete = this.u0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.e1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText(_UrlKt.FRAGMENT_ENCODE_SET);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.h1);
        post(this.i1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.u0;
            int[] iArr = this.G0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.H0;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.E0;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.F0;
            rect2.set(i7, 0, i8, i9);
            iz6 iz6Var = this.D0;
            if (iz6Var == null) {
                iz6 iz6Var2 = new iz6(rect2, rect, searchAutoComplete);
                this.D0 = iz6Var2;
                setTouchDelegate(iz6Var2);
            } else {
                iz6Var.b.set(rect2);
                Rect rect3 = iz6Var.d;
                rect3.set(rect2);
                int i10 = -iz6Var.e;
                rect3.inset(i10, i10);
                iz6Var.c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.T0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.Z0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.Z0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.Z0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof hz6)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hz6 hz6Var = (hz6) parcelable;
        super.onRestoreInstanceState(hz6Var.X);
        w(hz6Var.Z);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        hz6 hz6Var = new hz6(super.onSaveInstanceState());
        hz6Var.Z = this.T0;
        return hz6Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.h1);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.u0;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.P0 != null) {
            text.toString();
        }
        if (this.f1 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.u0.getText());
        int i = (!zIsEmpty || (this.S0 && !this.d1)) ? 0 : 8;
        ImageView imageView = this.A0;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.Y0 || !isFocusable()) {
            return false;
        }
        if (this.T0) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.u0.requestFocus(i, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.u0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.w0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.x0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.g1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.u0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.R0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.S0 == z) {
            return;
        }
        this.S0 = z;
        w(z);
        t();
    }

    public void setImeOptions(int i) {
        this.u0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.u0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.Z0 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(fz6 fz6Var) {
        this.P0 = fz6Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.R0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.W0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.X0 = z;
        e81 e81Var = this.U0;
        if (e81Var instanceof lw7) {
            ((lw7) e81Var).r0 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.f1 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.u0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1.getImeOptions());
            int inputType = this.f1.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            e81 e81Var = this.U0;
            if (e81Var != null) {
                e81Var.b(null);
            }
            if (this.f1.getSuggestAuthority() != null) {
                lw7 lw7Var = new lw7(getContext(), this, this.f1, this.j1);
                this.U0 = lw7Var;
                searchAutoComplete.setAdapter(lw7Var);
                ((lw7) this.U0).r0 = this.X0 ? 2 : 1;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.f1;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1.getVoiceSearchLaunchWebSearch()) {
                intent = this.M0;
            } else if (this.f1.getVoiceSearchLaunchRecognizer()) {
                intent = this.N0;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, DnsOverHttps.MAX_RESPONSE_SIZE) == null) ? false : true;
        }
        this.a1 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.T0);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.V0 = z;
        w(this.T0);
    }

    public void setSuggestionsAdapter(e81 e81Var) {
        this.U0 = e81Var;
        this.u0.setAdapter(e81Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        boolean z = this.S0;
        SearchAutoComplete searchAutoComplete = this.u0;
        CharSequence charSequence2 = charSequence;
        if (z && (drawable = this.J0) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void u() {
        this.x0.setVisibility(((this.V0 || this.a1) && !this.T0 && (this.z0.getVisibility() == 0 || this.B0.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z) {
        boolean z2 = this.V0;
        this.z0.setVisibility((!z2 || !(z2 || this.a1) || this.T0 || !hasFocus() || (!z && this.a1)) ? 8 : 0);
    }

    public final void w(boolean z) {
        this.T0 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.u0.getText());
        this.y0.setVisibility(i2);
        v(!zIsEmpty);
        this.v0.setVisibility(z ? 8 : 0);
        ImageView imageView = this.I0;
        imageView.setVisibility((imageView.getDrawable() == null || this.S0) ? 8 : 0);
        r();
        if (this.a1 && !this.T0 && zIsEmpty) {
            this.z0.setVisibility(8);
            i = 0;
        }
        this.B0.setVisibility(i);
        u();
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public int j0;
        public SearchView k0;
        public boolean l0;
        public final g m0;

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.m0 = new g(this);
            this.j0 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                f.b(this);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            ru0 ru0Var = SearchView.k1;
            ru0Var.getClass();
            ru0.a();
            Method method = ru0Var.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.j0 <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.l0) {
                g gVar = this.m0;
                removeCallbacks(gVar);
                post(gVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.k0;
            searchView.w(searchView.T0);
            searchView.post(searchView.h1);
            if (searchView.u0.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.k0.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.k0.hasFocus() && getVisibility() == 0) {
                this.l0 = true;
                Context context = getContext();
                ru0 ru0Var = SearchView.k1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            g gVar = this.m0;
            if (!z) {
                this.l0 = false;
                removeCallbacks(gVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.l0 = true;
                    return;
                }
                this.l0 = false;
                removeCallbacks(gVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.k0 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.j0 = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, w26.autoCompleteTextViewStyle);
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(ez6 ez6Var) {
    }

    public void setOnSuggestionListener(gz6 gz6Var) {
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
