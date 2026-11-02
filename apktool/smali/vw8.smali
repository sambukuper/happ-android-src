.class public final Lvw8;
.super Landroid/view/View;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final r0:Lnu0;


# instance fields
.field public final f0:Lpv1;

.field public final g0:Lvm0;

.field public final h0:Lum0;

.field public i0:Z

.field public j0:Landroid/graphics/Outline;

.field public k0:Z

.field public l0:Lfi1;

.field public m0:Lz24;

.field public n0:Lgn2;

.field public o0:Lxt2;

.field public p0:F

.field public q0:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnu0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lnu0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvw8;->r0:Lnu0;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lpv1;Lvm0;Lum0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lvw8;->f0:Lpv1;

    .line 9
    .line 10
    iput-object p2, p0, Lvw8;->g0:Lvm0;

    .line 11
    .line 12
    iput-object p3, p0, Lvw8;->h0:Lum0;

    .line 13
    .line 14
    sget-object p1, Lvw8;->r0:Lnu0;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lvw8;->k0:Z

    .line 21
    .line 22
    sget-object p1, Lz39;->Z:Lii1;

    .line 23
    .line 24
    iput-object p1, p0, Lvw8;->l0:Lfi1;

    .line 25
    .line 26
    sget-object p1, Lz24;->X:Lz24;

    .line 27
    .line 28
    iput-object p1, p0, Lvw8;->m0:Lz24;

    .line 29
    .line 30
    sget-object p1, Lzt2;->a:Loy1;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object p1, Lti;->x0:Lti;

    .line 36
    .line 37
    iput-object p1, p0, Lvw8;->n0:Lgn2;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lvw8;->p0:F

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    cmpl-float v2, v2, v3

    .line 9
    .line 10
    const-wide v4, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/16 v6, 0x20

    .line 16
    .line 17
    iget-object v7, v0, Lvw8;->h0:Lum0;

    .line 18
    .line 19
    iget-object v8, v0, Lvw8;->g0:Lvm0;

    .line 20
    .line 21
    if-gtz v2, :cond_1

    .line 22
    .line 23
    iget v2, v0, Lvw8;->q0:F

    .line 24
    .line 25
    cmpl-float v2, v2, v3

    .line 26
    .line 27
    if-lez v2, :cond_0

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_0
    iget-object v2, v8, Lvm0;->a:Leb;

    .line 32
    .line 33
    iget-object v3, v2, Leb;->a:Landroid/graphics/Canvas;

    .line 34
    .line 35
    iput-object v1, v2, Leb;->a:Landroid/graphics/Canvas;

    .line 36
    .line 37
    iget-object v1, v0, Lvw8;->l0:Lfi1;

    .line 38
    .line 39
    iget-object v9, v0, Lvw8;->m0:Lz24;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    int-to-float v10, v10

    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    int-to-float v11, v11

    .line 51
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    int-to-long v12, v10

    .line 56
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    int-to-long v10, v10

    .line 61
    shl-long/2addr v12, v6

    .line 62
    and-long/2addr v4, v10

    .line 63
    or-long/2addr v4, v12

    .line 64
    iget-object v6, v0, Lvw8;->o0:Lxt2;

    .line 65
    .line 66
    iget-object v10, v0, Lvw8;->n0:Lgn2;

    .line 67
    .line 68
    iget-object v11, v7, Lum0;->Y:Llr;

    .line 69
    .line 70
    iget-object v12, v7, Lum0;->Y:Llr;

    .line 71
    .line 72
    invoke-virtual {v11}, Llr;->m()Lfi1;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    invoke-virtual {v12}, Llr;->o()Lz24;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    invoke-virtual {v12}, Llr;->k()Lsm0;

    .line 81
    .line 82
    .line 83
    move-result-object v14

    .line 84
    move-object/from16 p1, v14

    .line 85
    .line 86
    invoke-virtual {v12}, Llr;->p()J

    .line 87
    .line 88
    .line 89
    move-result-wide v14

    .line 90
    iget-object v0, v12, Llr;->Z:Ljava/lang/Object;

    .line 91
    .line 92
    move-object/from16 v16, v3

    .line 93
    .line 94
    move-object v3, v0

    .line 95
    check-cast v3, Lxt2;

    .line 96
    .line 97
    invoke-virtual {v12, v1}, Llr;->B(Lfi1;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v9}, Llr;->C(Lz24;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v2}, Llr;->A(Lsm0;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v4, v5}, Llr;->D(J)V

    .line 107
    .line 108
    .line 109
    iput-object v6, v12, Llr;->Z:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-virtual {v2}, Leb;->g()V

    .line 112
    .line 113
    .line 114
    :try_start_0
    invoke-interface {v10, v7}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Leb;->p()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v11}, Llr;->B(Lfi1;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v13}, Llr;->C(Lz24;)V

    .line 124
    .line 125
    .line 126
    move-object/from16 v1, p1

    .line 127
    .line 128
    invoke-virtual {v12, v1}, Llr;->A(Lsm0;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v14, v15}, Llr;->D(J)V

    .line 132
    .line 133
    .line 134
    iput-object v3, v12, Llr;->Z:Ljava/lang/Object;

    .line 135
    .line 136
    iget-object v0, v8, Lvm0;->a:Leb;

    .line 137
    .line 138
    move-object/from16 v1, v16

    .line 139
    .line 140
    iput-object v1, v0, Leb;->a:Landroid/graphics/Canvas;

    .line 141
    .line 142
    goto/16 :goto_1

    .line 143
    .line 144
    :catchall_0
    move-exception v0

    .line 145
    move-object/from16 v1, p1

    .line 146
    .line 147
    invoke-virtual {v2}, Leb;->p()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v11}, Llr;->B(Lfi1;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v13}, Llr;->C(Lz24;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v1}, Llr;->A(Lsm0;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v14, v15}, Llr;->D(J)V

    .line 160
    .line 161
    .line 162
    iput-object v3, v12, Llr;->Z:Ljava/lang/Object;

    .line 163
    .line 164
    throw v0

    .line 165
    :cond_1
    :goto_0
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    move-object/from16 v2, p0

    .line 170
    .line 171
    iget v3, v2, Lvw8;->p0:F

    .line 172
    .line 173
    iget v9, v2, Lvw8;->q0:F

    .line 174
    .line 175
    invoke-virtual {v1, v3, v9}, Landroid/graphics/Canvas;->translate(FF)V

    .line 176
    .line 177
    .line 178
    iget-object v3, v8, Lvm0;->a:Leb;

    .line 179
    .line 180
    iget-object v9, v3, Leb;->a:Landroid/graphics/Canvas;

    .line 181
    .line 182
    iput-object v1, v3, Leb;->a:Landroid/graphics/Canvas;

    .line 183
    .line 184
    iget-object v10, v2, Lvw8;->l0:Lfi1;

    .line 185
    .line 186
    iget-object v11, v2, Lvw8;->m0:Lz24;

    .line 187
    .line 188
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    int-to-float v12, v12

    .line 193
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    int-to-float v13, v13

    .line 198
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    int-to-long v14, v12

    .line 203
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    int-to-long v12, v12

    .line 208
    shl-long/2addr v14, v6

    .line 209
    and-long/2addr v4, v12

    .line 210
    or-long/2addr v4, v14

    .line 211
    iget-object v6, v2, Lvw8;->o0:Lxt2;

    .line 212
    .line 213
    iget-object v12, v2, Lvw8;->n0:Lgn2;

    .line 214
    .line 215
    iget-object v13, v7, Lum0;->Y:Llr;

    .line 216
    .line 217
    iget-object v14, v7, Lum0;->Y:Llr;

    .line 218
    .line 219
    invoke-virtual {v13}, Llr;->m()Lfi1;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    invoke-virtual {v14}, Llr;->o()Lz24;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    invoke-virtual {v14}, Llr;->k()Lsm0;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    move-object/from16 v16, v8

    .line 232
    .line 233
    move-object/from16 v17, v9

    .line 234
    .line 235
    invoke-virtual {v14}, Llr;->p()J

    .line 236
    .line 237
    .line 238
    move-result-wide v8

    .line 239
    move/from16 v18, v0

    .line 240
    .line 241
    iget-object v0, v14, Llr;->Z:Ljava/lang/Object;

    .line 242
    .line 243
    move-object v1, v0

    .line 244
    check-cast v1, Lxt2;

    .line 245
    .line 246
    invoke-virtual {v14, v10}, Llr;->B(Lfi1;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v14, v11}, Llr;->C(Lz24;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v14, v3}, Llr;->A(Lsm0;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v14, v4, v5}, Llr;->D(J)V

    .line 256
    .line 257
    .line 258
    iput-object v6, v14, Llr;->Z:Ljava/lang/Object;

    .line 259
    .line 260
    invoke-virtual {v3}, Leb;->g()V

    .line 261
    .line 262
    .line 263
    :try_start_1
    invoke-interface {v12, v7}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3}, Leb;->p()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v14, v13}, Llr;->B(Lfi1;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v14, v15}, Llr;->C(Lz24;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v14, v2}, Llr;->A(Lsm0;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v14, v8, v9}, Llr;->D(J)V

    .line 279
    .line 280
    .line 281
    iput-object v1, v14, Llr;->Z:Ljava/lang/Object;

    .line 282
    .line 283
    move-object/from16 v0, v16

    .line 284
    .line 285
    iget-object v0, v0, Lvm0;->a:Leb;

    .line 286
    .line 287
    move-object/from16 v1, v17

    .line 288
    .line 289
    iput-object v1, v0, Leb;->a:Landroid/graphics/Canvas;

    .line 290
    .line 291
    move-object/from16 v1, p1

    .line 292
    .line 293
    move/from16 v0, v18

    .line 294
    .line 295
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 296
    .line 297
    .line 298
    :goto_1
    const/4 v0, 0x0

    .line 299
    move-object/from16 v2, p0

    .line 300
    .line 301
    iput-boolean v0, v2, Lvw8;->i0:Z

    .line 302
    .line 303
    return-void

    .line 304
    :catchall_1
    move-exception v0

    .line 305
    invoke-virtual {v3}, Leb;->p()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v14, v13}, Llr;->B(Lfi1;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v14, v15}, Llr;->C(Lz24;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v14, v2}, Llr;->A(Lsm0;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v14, v8, v9}, Llr;->D(J)V

    .line 318
    .line 319
    .line 320
    iput-object v1, v14, Llr;->Z:Ljava/lang/Object;

    .line 321
    .line 322
    throw v0
.end method

.method public final forceLayout()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCanUseCompositingLayer$ui_graphics()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lvw8;->k0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getCanvasHolder()Lvm0;
    .locals 0

    .line 1
    iget-object p0, p0, Lvw8;->g0:Lvm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOwnerView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lvw8;->f0:Lpv1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hasOverlappingRendering()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lvw8;->k0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvw8;->i0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lvw8;->i0:Z

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setCanUseCompositingLayer$ui_graphics(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvw8;->k0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lvw8;->k0:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lvw8;->invalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setInvalidated(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lvw8;->i0:Z

    .line 2
    .line 3
    return-void
.end method
