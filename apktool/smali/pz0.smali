.class public final Lpz0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# instance fields
.field public final a:Ly07;

.field public final b:Llf3;

.field public final c:Lp41;

.field public final d:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final e:Lm51;

.field public final f:Lu03;


# direct methods
.method public constructor <init>(Ly07;Llf3;Lm51;Lp41;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpz0;->a:Ly07;

    .line 5
    .line 6
    iput-object p2, p0, Lpz0;->b:Llf3;

    .line 7
    .line 8
    iput-object p4, p0, Lpz0;->c:Lp41;

    .line 9
    .line 10
    iput-object p5, p0, Lpz0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 11
    .line 12
    new-instance p1, Lm51;

    .line 13
    .line 14
    iget-object p3, p3, Lm51;->Y:Ls61;

    .line 15
    .line 16
    sget-object p4, Lgp1;->Y:Lgp1;

    .line 17
    .line 18
    invoke-interface {p3, p4}, Ls61;->B0(Ls61;)Ls61;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-direct {p1, p3}, Lm51;-><init>(Ls61;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lpz0;->e:Lm51;

    .line 26
    .line 27
    new-instance p1, Lu03;

    .line 28
    .line 29
    invoke-virtual {p2}, Llf3;->b()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    new-instance p3, Loz0;

    .line 34
    .line 35
    const/4 p4, 0x0

    .line 36
    invoke-direct {p3, p0, p4}, Loz0;-><init>(Lpz0;Lq51;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, p2, p3}, Lu03;-><init>(ILoz0;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lpz0;->f:Lu03;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ScrollCaptureSession;Llf3;Ls51;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lnz0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lnz0;

    .line 7
    .line 8
    iget v1, v0, Lnz0;->l0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lnz0;->l0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lnz0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lnz0;-><init>(Lpz0;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lnz0;->j0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lnz0;->l0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iget-object v3, p0, Lpz0;->f:Lu03;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x2

    .line 34
    sget-object v6, Lc71;->X:Lc71;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v5, :cond_1

    .line 41
    .line 42
    iget p1, v0, Lnz0;->i0:I

    .line 43
    .line 44
    iget p2, v0, Lnz0;->h0:I

    .line 45
    .line 46
    iget-object v1, v0, Lnz0;->g0:Llf3;

    .line 47
    .line 48
    iget-object v0, v0, Lnz0;->f0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Landroid/view/ScrollCaptureSession;

    .line 51
    .line 52
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_2
    iget p1, v0, Lnz0;->i0:I

    .line 64
    .line 65
    iget p2, v0, Lnz0;->h0:I

    .line 66
    .line 67
    iget-object v1, v0, Lnz0;->g0:Llf3;

    .line 68
    .line 69
    iget-object v2, v0, Lnz0;->f0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Landroid/view/ScrollCaptureSession;

    .line 72
    .line 73
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move p3, p2

    .line 77
    move-object p2, v1

    .line 78
    move v1, p1

    .line 79
    move-object p1, v2

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget p3, p2, Llf3;->b:I

    .line 85
    .line 86
    iget v1, p2, Llf3;->d:I

    .line 87
    .line 88
    iput-object p1, v0, Lnz0;->f0:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object p2, v0, Lnz0;->g0:Llf3;

    .line 91
    .line 92
    iput p3, v0, Lnz0;->h0:I

    .line 93
    .line 94
    iput v1, v0, Lnz0;->i0:I

    .line 95
    .line 96
    iput v4, v0, Lnz0;->l0:I

    .line 97
    .line 98
    if-gt p3, v1, :cond_a

    .line 99
    .line 100
    sub-int v4, v1, p3

    .line 101
    .line 102
    iget v7, v3, Lu03;->a:I

    .line 103
    .line 104
    if-gt v4, v7, :cond_9

    .line 105
    .line 106
    div-int/2addr v4, v5

    .line 107
    add-int/2addr v4, p3

    .line 108
    div-int/2addr v7, v5

    .line 109
    sub-int/2addr v4, v7

    .line 110
    int-to-float v2, v4

    .line 111
    iget v4, v3, Lu03;->b:F

    .line 112
    .line 113
    sub-float/2addr v2, v4

    .line 114
    invoke-virtual {v3, v2, v0}, Lu03;->b(FLs51;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    sget-object v4, Ldn8;->a:Ldn8;

    .line 119
    .line 120
    if-ne v2, v6, :cond_4

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    move-object v2, v4

    .line 124
    :goto_1
    if-ne v2, v6, :cond_5

    .line 125
    .line 126
    move-object v4, v2

    .line 127
    :cond_5
    if-ne v4, v6, :cond_6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    :goto_2
    new-instance v2, Lh80;

    .line 131
    .line 132
    const/4 v4, 0x5

    .line 133
    invoke-direct {v2, v4}, Lh80;-><init>(B)V

    .line 134
    .line 135
    .line 136
    iput-object p1, v0, Lnz0;->f0:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object p2, v0, Lnz0;->g0:Llf3;

    .line 139
    .line 140
    iput p3, v0, Lnz0;->h0:I

    .line 141
    .line 142
    iput v1, v0, Lnz0;->i0:I

    .line 143
    .line 144
    iput v5, v0, Lnz0;->l0:I

    .line 145
    .line 146
    iget-object v4, v0, Ls51;->Y:Ls61;

    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {v4}, Lz68;->H(Ls61;)Lai;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {v4, v2, v0}, Lai;->a(Lgn2;Lq51;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-ne v0, v6, :cond_7

    .line 160
    .line 161
    :goto_3
    return-object v6

    .line 162
    :cond_7
    move-object v0, p1

    .line 163
    move p1, v1

    .line 164
    move-object v1, p2

    .line 165
    move p2, p3

    .line 166
    :goto_4
    iget p3, v3, Lu03;->b:F

    .line 167
    .line 168
    invoke-static {p3}, Lnr4;->O(F)I

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    sub-int/2addr p2, p3

    .line 173
    iget p3, v3, Lu03;->a:I

    .line 174
    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-static {p2, v2, p3}, Lx97;->n(III)I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    iget p3, v3, Lu03;->b:F

    .line 181
    .line 182
    invoke-static {p3}, Lnr4;->O(F)I

    .line 183
    .line 184
    .line 185
    move-result p3

    .line 186
    sub-int/2addr p1, p3

    .line 187
    iget p3, v3, Lu03;->a:I

    .line 188
    .line 189
    invoke-static {p1, v2, p3}, Lx97;->n(III)I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    iget p3, v1, Llf3;->a:I

    .line 194
    .line 195
    iget v1, v1, Llf3;->c:I

    .line 196
    .line 197
    if-ne p2, p1, :cond_8

    .line 198
    .line 199
    sget-object p0, Llf3;->e:Llf3;

    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_8
    invoke-virtual {v0}, Landroid/view/ScrollCaptureSession;->getSurface()Landroid/view/Surface;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 211
    .line 212
    .line 213
    int-to-float v4, p3

    .line 214
    neg-float v4, v4

    .line 215
    int-to-float v5, p2

    .line 216
    neg-float v5, v5

    .line 217
    invoke-virtual {v2, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 218
    .line 219
    .line 220
    iget-object v4, p0, Lpz0;->b:Llf3;

    .line 221
    .line 222
    iget v5, v4, Llf3;->a:I

    .line 223
    .line 224
    int-to-float v5, v5

    .line 225
    neg-float v5, v5

    .line 226
    iget v4, v4, Llf3;->b:I

    .line 227
    .line 228
    int-to-float v4, v4

    .line 229
    neg-float v4, v4

    .line 230
    invoke-virtual {v2, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 231
    .line 232
    .line 233
    iget-object p0, p0, Lpz0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {p0, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Landroid/view/ScrollCaptureSession;->getSurface()Landroid/view/Surface;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {p0, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 247
    .line 248
    .line 249
    iget p0, v3, Lu03;->b:F

    .line 250
    .line 251
    invoke-static {p0}, Lnr4;->O(F)I

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    new-instance v0, Llf3;

    .line 256
    .line 257
    add-int/2addr p2, p0

    .line 258
    add-int/2addr p1, p0

    .line 259
    invoke-direct {v0, p3, p2, v1, p1}, Llf3;-><init>(IIII)V

    .line 260
    .line 261
    .line 262
    return-object v0

    .line 263
    :catchall_0
    move-exception p0

    .line 264
    invoke-virtual {v0}, Landroid/view/ScrollCaptureSession;->getSurface()Landroid/view/Surface;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {p1, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 269
    .line 270
    .line 271
    throw p0

    .line 272
    :cond_9
    const-string p0, "Expected range ("

    .line 273
    .line 274
    const-string p1, ") to be \u2264 viewportSize="

    .line 275
    .line 276
    invoke-static {p0, v4, v7, p1}, Lpc6;->m(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    return-object v2

    .line 284
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    const-string p0, "Expected min="

    .line 288
    .line 289
    const-string p1, " \u2264 max="

    .line 290
    .line 291
    invoke-static {p0, p3, v1, p1}, Lu52;->l(Ljava/lang/String;IILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    return-object v2
.end method

.method public final onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    sget-object v0, Lr55;->Y:Lr55;

    .line 2
    .line 3
    new-instance v1, Lq0;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v3, v2}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    iget-object p0, p0, Lpz0;->e:Lm51;

    .line 13
    .line 14
    invoke-static {p0, v0, v3, v1, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 7

    .line 1
    new-instance v0, Lpi;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x1

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    const/4 p1, 0x3

    .line 14
    iget-object p3, v1, Lpz0;->e:Lm51;

    .line 15
    .line 16
    invoke-static {p3, p0, p0, v0, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ly0;

    .line 21
    .line 22
    const/16 p3, 0x11

    .line 23
    .line 24
    invoke-direct {p1, p2, p3}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lrm3;->D(Lgn2;)Lgq1;

    .line 28
    .line 29
    .line 30
    new-instance p1, Lqz0;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    invoke-direct {p1, p0, p3}, Lqz0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lpz0;->b:Llf3;

    .line 2
    .line 3
    invoke-static {p0}, Lpu;->S(Llf3;)Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p2, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onScrollCaptureStart(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lpz0;->f:Lu03;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput p2, p1, Lu03;->b:F

    .line 5
    .line 6
    iget-object p0, p0, Lpz0;->c:Lp41;

    .line 7
    .line 8
    iget-object p0, p0, Lp41;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lrh5;

    .line 11
    .line 12
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
