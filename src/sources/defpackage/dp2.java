package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dp2 {
    public final int a;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public dp2(String str, String str2) throws Throwable {
        int iJ;
        int iJ2;
        int iGlCreateProgram;
        try {
            iJ = fp2.j(35633, str);
            try {
                iJ2 = fp2.j(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        fp2.b("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iJ);
                        fp2.b("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iJ2);
                        fp2.b("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.a = iGlCreateProgram;
                            a();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        if (iJ != -1) {
                            GLES20.glDeleteShader(iJ);
                        }
                        if (iJ2 != -1) {
                            GLES20.glDeleteShader(iJ2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (iJ != -1) {
                            GLES20.glDeleteShader(iJ);
                        }
                        if (iJ2 != -1) {
                            GLES20.glDeleteShader(iJ2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    e = e3;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                iJ2 = -1;
                iGlCreateProgram = iJ2;
                if (iJ != -1) {
                    GLES20.glDeleteShader(iJ);
                }
                if (iJ2 != -1) {
                    GLES20.glDeleteShader(iJ2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e5) {
            e = e5;
            iJ = -1;
            iJ2 = -1;
        }
    }

    public final void a() {
        int i = this.a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.d = iGlGetAttribLocation;
        fp2.e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.b = iGlGetUniformLocation;
        fp2.e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.c = iGlGetUniformLocation2;
        fp2.e(iGlGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.a);
        fp2.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        fp2.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) fp2.h);
        fp2.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        fp2.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.c, 1.0f);
        fp2.b("glUniform1f");
    }
}
