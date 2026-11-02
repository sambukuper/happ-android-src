package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import defpackage.n36;
import defpackage.vd0;
import defpackage.x46;
import java.util.ArrayList;
import java.util.regex.Matcher;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements RecognitionListener {
    public final /* synthetic */ SearchBar a;

    public a(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        switch (i) {
            case 1:
                int i2 = SearchBar.C0;
                break;
            case 2:
                int i3 = SearchBar.C0;
                break;
            case 3:
                int i4 = SearchBar.C0;
                break;
            case 4:
                int i5 = SearchBar.C0;
                break;
            case 5:
                int i6 = SearchBar.C0;
                break;
            case 6:
                int i7 = SearchBar.C0;
                break;
            case 7:
                int i8 = SearchBar.C0;
                break;
            case 8:
                int i9 = SearchBar.C0;
                break;
            case 9:
                int i10 = SearchBar.C0;
                break;
            default:
                int i11 = SearchBar.C0;
                break;
        }
        SearchBar searchBar = this.a;
        searchBar.b();
        searchBar.m0.post(new vd0(searchBar, x46.lb_voice_failure, (byte) 2));
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.size() == 0) {
            return;
        }
        String str = stringArrayList.get(0);
        String str2 = stringArrayList.size() > 1 ? stringArrayList.get(1) : null;
        SearchEditText searchEditText = this.a.f0;
        searchEditText.getClass();
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            Matcher matcher = StreamingTextView.k0.matcher(str2);
            while (matcher.find()) {
                int iStart = matcher.start() + length;
                spannableStringBuilder.setSpan(new c(searchEditText, str2.charAt(matcher.start()), iStart), iStart, matcher.end() + length, 33);
            }
        }
        searchEditText.i0 = Math.max(str.length(), searchEditText.i0);
        searchEditText.setText(new SpannedString(spannableStringBuilder));
        searchEditText.bringPointIntoView(searchEditText.length());
        ObjectAnimator objectAnimator = searchEditText.j0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        int streamPosition = searchEditText.getStreamPosition();
        int length2 = searchEditText.length();
        int i = length2 - streamPosition;
        if (i > 0) {
            if (searchEditText.j0 == null) {
                ObjectAnimator objectAnimator2 = new ObjectAnimator();
                searchEditText.j0 = objectAnimator2;
                objectAnimator2.setTarget(searchEditText);
                searchEditText.j0.setProperty(StreamingTextView.l0);
            }
            searchEditText.j0.setIntValues(streamPosition, length2);
            searchEditText.j0.setDuration(((long) i) * 50);
            searchEditText.j0.start();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        SearchBar searchBar = this.a;
        SpeechOrbView speechOrbView = searchBar.g0;
        speechOrbView.setOrbColors(speechOrbView.z0);
        speechOrbView.setOrbIcon(speechOrbView.getResources().getDrawable(n36.lb_ic_search_mic));
        speechOrbView.a(true);
        speechOrbView.r0 = false;
        speechOrbView.b();
        View view = speechOrbView.h0;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        speechOrbView.B0 = 0;
        speechOrbView.C0 = true;
        searchBar.m0.post(new vd0(searchBar, x46.lb_voice_open, (byte) 2));
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        SearchBar searchBar = this.a;
        if (stringArrayList != null) {
            String str = stringArrayList.get(0);
            searchBar.i0 = str;
            searchBar.f0.setText(str);
            TextUtils.isEmpty(searchBar.i0);
        }
        searchBar.b();
        searchBar.m0.post(new vd0(searchBar, x46.lb_voice_success, (byte) 2));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        this.a.g0.setSoundLevel(f < 0.0f ? 0 : (int) (f * 10.0f));
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }
}
