.class public final Leu8;
.super Lvt8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final l0:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public Y:Lcu8;

.field public Z:Landroid/graphics/PorterDuffColorFilter;

.field public f0:Landroid/graphics/ColorFilter;

.field public g0:Z

.field public h0:Z

.field public final i0:[F

.field public final j0:Landroid/graphics/Matrix;

.field public final k0:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Leu8;->l0:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Leu8;->h0:Z

    .line 6
    .line 7
    const/16 v0, 0x9

    .line 8
    .line 9
    new-array v0, v0, [F

    .line 10
    .line 11
    iput-object v0, p0, Leu8;->i0:[F

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Leu8;->j0:Landroid/graphics/Matrix;

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Leu8;->k0:Landroid/graphics/Rect;

    .line 26
    .line 27
    new-instance v0, Lcu8;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iput-object v1, v0, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    sget-object v1, Leu8;->l0:Landroid/graphics/PorterDuff$Mode;

    .line 36
    .line 37
    iput-object v1, v0, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 38
    .line 39
    new-instance v1, Lbu8;

    .line 40
    .line 41
    invoke-direct {v1}, Lbu8;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, v0, Lcu8;->b:Lbu8;

    .line 45
    .line 46
    iput-object v0, p0, Leu8;->Y:Lcu8;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Lcu8;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Leu8;->h0:Z

    const/16 v0, 0x9

    .line 51
    new-array v0, v0, [F

    iput-object v0, p0, Leu8;->i0:[F

    .line 52
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Leu8;->j0:Landroid/graphics/Matrix;

    .line 53
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Leu8;->k0:Landroid/graphics/Rect;

    .line 54
    iput-object p1, p0, Leu8;->Y:Lcu8;

    .line 55
    iget-object v0, p1, Lcu8;->c:Landroid/content/res/ColorStateList;

    iget-object p1, p1, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, v0, p1}, Leu8;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Leu8;->Z:Landroid/graphics/PorterDuffColorFilter;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lvt8;->getState()[I

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, p0, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    new-instance p1, Landroid/graphics/PorterDuffColorFilter;

    .line 16
    .line 17
    invoke-direct {p1, p0, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final canApplyTheme()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v2, v0, Leu8;->k0:Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-lez v3, :cond_d

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-gtz v3, :cond_1

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_1
    iget-object v3, v0, Leu8;->f0:Landroid/graphics/ColorFilter;

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v3, v0, Leu8;->Z:Landroid/graphics/PorterDuffColorFilter;

    .line 37
    .line 38
    :cond_2
    iget-object v4, v0, Leu8;->j0:Landroid/graphics/Matrix;

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 41
    .line 42
    .line 43
    iget-object v5, v0, Leu8;->i0:[F

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->getValues([F)V

    .line 46
    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    aget v6, v5, v4

    .line 50
    .line 51
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/4 v7, 0x4

    .line 56
    aget v7, v5, v7

    .line 57
    .line 58
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/4 v8, 0x1

    .line 63
    aget v9, v5, v8

    .line 64
    .line 65
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    const/4 v10, 0x3

    .line 70
    aget v5, v5, v10

    .line 71
    .line 72
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    const/4 v10, 0x0

    .line 77
    cmpl-float v9, v9, v10

    .line 78
    .line 79
    const/high16 v11, 0x3f800000    # 1.0f

    .line 80
    .line 81
    if-nez v9, :cond_3

    .line 82
    .line 83
    cmpl-float v5, v5, v10

    .line 84
    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    :cond_3
    move v6, v11

    .line 88
    move v7, v6

    .line 89
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    int-to-float v5, v5

    .line 94
    mul-float/2addr v5, v6

    .line 95
    float-to-int v5, v5

    .line 96
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    int-to-float v6, v6

    .line 101
    mul-float/2addr v6, v7

    .line 102
    float-to-int v6, v6

    .line 103
    const/16 v7, 0x800

    .line 104
    .line 105
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-lez v5, :cond_d

    .line 114
    .line 115
    if-gtz v6, :cond_5

    .line 116
    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_5
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    iget v9, v2, Landroid/graphics/Rect;->left:I

    .line 124
    .line 125
    int-to-float v9, v9

    .line 126
    iget v12, v2, Landroid/graphics/Rect;->top:I

    .line 127
    .line 128
    int-to-float v12, v12

    .line 129
    invoke-virtual {v1, v9, v12}, Landroid/graphics/Canvas;->translate(FF)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Leu8;->isAutoMirrored()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_6

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-ne v9, v8, :cond_6

    .line 143
    .line 144
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    int-to-float v9, v9

    .line 149
    invoke-virtual {v1, v9, v10}, Landroid/graphics/Canvas;->translate(FF)V

    .line 150
    .line 151
    .line 152
    const/high16 v9, -0x40800000    # -1.0f

    .line 153
    .line 154
    invoke-virtual {v1, v9, v11}, Landroid/graphics/Canvas;->scale(FF)V

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-virtual {v2, v4, v4}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 158
    .line 159
    .line 160
    iget-object v9, v0, Leu8;->Y:Lcu8;

    .line 161
    .line 162
    iget-object v10, v9, Lcu8;->f:Landroid/graphics/Bitmap;

    .line 163
    .line 164
    if-eqz v10, :cond_7

    .line 165
    .line 166
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    if-ne v5, v10, :cond_7

    .line 171
    .line 172
    iget-object v10, v9, Lcu8;->f:Landroid/graphics/Bitmap;

    .line 173
    .line 174
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-ne v6, v10, :cond_7

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_7
    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 182
    .line 183
    invoke-static {v5, v6, v10}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    iput-object v10, v9, Lcu8;->f:Landroid/graphics/Bitmap;

    .line 188
    .line 189
    iput-boolean v8, v9, Lcu8;->k:Z

    .line 190
    .line 191
    :goto_0
    iget-boolean v9, v0, Leu8;->h0:Z

    .line 192
    .line 193
    iget-object v10, v0, Leu8;->Y:Lcu8;

    .line 194
    .line 195
    if-nez v9, :cond_8

    .line 196
    .line 197
    iget-object v9, v10, Lcu8;->f:Landroid/graphics/Bitmap;

    .line 198
    .line 199
    invoke-virtual {v9, v4}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 200
    .line 201
    .line 202
    new-instance v15, Landroid/graphics/Canvas;

    .line 203
    .line 204
    iget-object v4, v10, Lcu8;->f:Landroid/graphics/Bitmap;

    .line 205
    .line 206
    invoke-direct {v15, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 207
    .line 208
    .line 209
    iget-object v12, v10, Lcu8;->b:Lbu8;

    .line 210
    .line 211
    iget-object v13, v12, Lbu8;->g:Lyt8;

    .line 212
    .line 213
    sget-object v14, Lbu8;->p:Landroid/graphics/Matrix;

    .line 214
    .line 215
    move/from16 v16, v5

    .line 216
    .line 217
    move/from16 v17, v6

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v17}, Lbu8;->a(Lyt8;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_8
    move/from16 v16, v5

    .line 224
    .line 225
    move/from16 v17, v6

    .line 226
    .line 227
    iget-boolean v5, v10, Lcu8;->k:Z

    .line 228
    .line 229
    if-nez v5, :cond_9

    .line 230
    .line 231
    iget-object v5, v10, Lcu8;->g:Landroid/content/res/ColorStateList;

    .line 232
    .line 233
    iget-object v6, v10, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 234
    .line 235
    if-ne v5, v6, :cond_9

    .line 236
    .line 237
    iget-object v5, v10, Lcu8;->h:Landroid/graphics/PorterDuff$Mode;

    .line 238
    .line 239
    iget-object v6, v10, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 240
    .line 241
    if-ne v5, v6, :cond_9

    .line 242
    .line 243
    iget-boolean v5, v10, Lcu8;->j:Z

    .line 244
    .line 245
    iget-boolean v6, v10, Lcu8;->e:Z

    .line 246
    .line 247
    if-ne v5, v6, :cond_9

    .line 248
    .line 249
    iget v5, v10, Lcu8;->i:I

    .line 250
    .line 251
    iget-object v6, v10, Lcu8;->b:Lbu8;

    .line 252
    .line 253
    invoke-virtual {v6}, Lbu8;->getRootAlpha()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-ne v5, v6, :cond_9

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_9
    iget-object v5, v0, Leu8;->Y:Lcu8;

    .line 261
    .line 262
    iget-object v6, v5, Lcu8;->f:Landroid/graphics/Bitmap;

    .line 263
    .line 264
    invoke-virtual {v6, v4}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 265
    .line 266
    .line 267
    new-instance v15, Landroid/graphics/Canvas;

    .line 268
    .line 269
    iget-object v6, v5, Lcu8;->f:Landroid/graphics/Bitmap;

    .line 270
    .line 271
    invoke-direct {v15, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 272
    .line 273
    .line 274
    iget-object v12, v5, Lcu8;->b:Lbu8;

    .line 275
    .line 276
    iget-object v13, v12, Lbu8;->g:Lyt8;

    .line 277
    .line 278
    sget-object v14, Lbu8;->p:Landroid/graphics/Matrix;

    .line 279
    .line 280
    invoke-virtual/range {v12 .. v17}, Lbu8;->a(Lyt8;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 281
    .line 282
    .line 283
    iget-object v5, v0, Leu8;->Y:Lcu8;

    .line 284
    .line 285
    iget-object v6, v5, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 286
    .line 287
    iput-object v6, v5, Lcu8;->g:Landroid/content/res/ColorStateList;

    .line 288
    .line 289
    iget-object v6, v5, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 290
    .line 291
    iput-object v6, v5, Lcu8;->h:Landroid/graphics/PorterDuff$Mode;

    .line 292
    .line 293
    iget-object v6, v5, Lcu8;->b:Lbu8;

    .line 294
    .line 295
    invoke-virtual {v6}, Lbu8;->getRootAlpha()I

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    iput v6, v5, Lcu8;->i:I

    .line 300
    .line 301
    iget-boolean v6, v5, Lcu8;->e:Z

    .line 302
    .line 303
    iput-boolean v6, v5, Lcu8;->j:Z

    .line 304
    .line 305
    iput-boolean v4, v5, Lcu8;->k:Z

    .line 306
    .line 307
    :goto_1
    iget-object v0, v0, Leu8;->Y:Lcu8;

    .line 308
    .line 309
    iget-object v4, v0, Lcu8;->b:Lbu8;

    .line 310
    .line 311
    invoke-virtual {v4}, Lbu8;->getRootAlpha()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    const/16 v5, 0xff

    .line 316
    .line 317
    const/4 v6, 0x0

    .line 318
    if-ge v4, v5, :cond_a

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_a
    if-nez v3, :cond_b

    .line 322
    .line 323
    move-object v3, v6

    .line 324
    goto :goto_3

    .line 325
    :cond_b
    :goto_2
    iget-object v4, v0, Lcu8;->l:Landroid/graphics/Paint;

    .line 326
    .line 327
    if-nez v4, :cond_c

    .line 328
    .line 329
    new-instance v4, Landroid/graphics/Paint;

    .line 330
    .line 331
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 332
    .line 333
    .line 334
    iput-object v4, v0, Lcu8;->l:Landroid/graphics/Paint;

    .line 335
    .line 336
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 337
    .line 338
    .line 339
    :cond_c
    iget-object v4, v0, Lcu8;->l:Landroid/graphics/Paint;

    .line 340
    .line 341
    iget-object v5, v0, Lcu8;->b:Lbu8;

    .line 342
    .line 343
    invoke-virtual {v5}, Lbu8;->getRootAlpha()I

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 348
    .line 349
    .line 350
    iget-object v4, v0, Lcu8;->l:Landroid/graphics/Paint;

    .line 351
    .line 352
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 353
    .line 354
    .line 355
    iget-object v3, v0, Lcu8;->l:Landroid/graphics/Paint;

    .line 356
    .line 357
    :goto_3
    iget-object v0, v0, Lcu8;->f:Landroid/graphics/Bitmap;

    .line 358
    .line 359
    invoke-virtual {v1, v0, v6, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 363
    .line 364
    .line 365
    :cond_d
    :goto_4
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Leu8;->Y:Lcu8;

    .line 11
    .line 12
    iget-object p0, p0, Lcu8;->b:Lbu8;

    .line 13
    .line 14
    invoke-virtual {p0}, Lbu8;->getRootAlpha()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public final getChangingConfigurations()I
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Leu8;->Y:Lcu8;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcu8;->getChangingConfigurations()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Leu8;->f0:Landroid/graphics/ColorFilter;

    .line 11
    .line 12
    return-object p0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldu8;

    .line 6
    .line 7
    iget-object p0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, Ldu8;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v0, p0, Leu8;->Y:Lcu8;

    .line 18
    .line 19
    invoke-virtual {p0}, Leu8;->getChangingConfigurations()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, v0, Lcu8;->a:I

    .line 24
    .line 25
    iget-object p0, p0, Leu8;->Y:Lcu8;

    .line 26
    .line 27
    return-object p0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Leu8;->Y:Lcu8;

    .line 11
    .line 12
    iget-object p0, p0, Lcu8;->b:Lbu8;

    .line 13
    .line 14
    iget p0, p0, Lbu8;->i:F

    .line 15
    .line 16
    float-to-int p0, p0

    .line 17
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Leu8;->Y:Lcu8;

    .line 11
    .line 12
    iget-object p0, p0, Lcu8;->b:Lbu8;

    .line 13
    .line 14
    iget p0, p0, Lbu8;->h:F

    .line 15
    .line 16
    float-to-int p0, p0

    .line 17
    return p0
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    iget-object p0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, -0x3

    .line 11
    return p0
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1099
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1100
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1101
    invoke-virtual {p0, p1, p2, p3, v0}, Leu8;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    invoke-virtual {v5, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v5, v0, Leu8;->Y:Lcu8;

    .line 20
    .line 21
    new-instance v6, Lbu8;

    .line 22
    .line 23
    invoke-direct {v6}, Lbu8;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v6, v5, Lcu8;->b:Lbu8;

    .line 27
    .line 28
    sget-object v6, Li21;->a:[I

    .line 29
    .line 30
    invoke-static {v1, v4, v3, v6}, La28;->q(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v7, v0, Leu8;->Y:Lcu8;

    .line 35
    .line 36
    iget-object v8, v7, Lcu8;->b:Lbu8;

    .line 37
    .line 38
    const-string v9, "tintMode"

    .line 39
    .line 40
    invoke-static {v2, v9}, La28;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    const/4 v10, -0x1

    .line 45
    const/4 v11, 0x6

    .line 46
    if-nez v9, :cond_1

    .line 47
    .line 48
    move v9, v10

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v6, v11, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    :goto_0
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 55
    .line 56
    const/16 v13, 0x9

    .line 57
    .line 58
    const/4 v14, 0x3

    .line 59
    const/4 v15, 0x5

    .line 60
    if-eq v9, v14, :cond_3

    .line 61
    .line 62
    if-eq v9, v15, :cond_4

    .line 63
    .line 64
    if-eq v9, v13, :cond_2

    .line 65
    .line 66
    packed-switch v9, :pswitch_data_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :pswitch_0
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_1
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_2
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 83
    .line 84
    :cond_4
    :goto_1
    iput-object v12, v7, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 85
    .line 86
    invoke-static {v6, v2, v4}, La28;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    if-eqz v9, :cond_5

    .line 91
    .line 92
    iput-object v9, v7, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 93
    .line 94
    :cond_5
    iget-boolean v9, v7, Lcu8;->e:Z

    .line 95
    .line 96
    const-string v12, "http://schemas.android.com/apk/res/android"

    .line 97
    .line 98
    const-string v11, "autoMirrored"

    .line 99
    .line 100
    invoke-interface {v2, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    if-eqz v11, :cond_6

    .line 105
    .line 106
    invoke-virtual {v6, v15, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    :cond_6
    iput-boolean v9, v7, Lcu8;->e:Z

    .line 111
    .line 112
    iget v7, v8, Lbu8;->j:F

    .line 113
    .line 114
    const-string v9, "viewportWidth"

    .line 115
    .line 116
    invoke-interface {v2, v12, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    const/4 v11, 0x7

    .line 121
    if-eqz v9, :cond_7

    .line 122
    .line 123
    invoke-virtual {v6, v11, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    :cond_7
    iput v7, v8, Lbu8;->j:F

    .line 128
    .line 129
    iget v7, v8, Lbu8;->k:F

    .line 130
    .line 131
    const-string v9, "viewportHeight"

    .line 132
    .line 133
    invoke-interface {v2, v12, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    const/16 v15, 0x8

    .line 138
    .line 139
    if-eqz v9, :cond_8

    .line 140
    .line 141
    invoke-virtual {v6, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    :cond_8
    iput v7, v8, Lbu8;->k:F

    .line 146
    .line 147
    iget v9, v8, Lbu8;->j:F

    .line 148
    .line 149
    const/4 v11, 0x0

    .line 150
    cmpg-float v9, v9, v11

    .line 151
    .line 152
    if-lez v9, :cond_37

    .line 153
    .line 154
    cmpg-float v7, v7, v11

    .line 155
    .line 156
    if-lez v7, :cond_36

    .line 157
    .line 158
    iget v7, v8, Lbu8;->h:F

    .line 159
    .line 160
    invoke-virtual {v6, v14, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    iput v7, v8, Lbu8;->h:F

    .line 165
    .line 166
    iget v7, v8, Lbu8;->i:F

    .line 167
    .line 168
    const/4 v9, 0x2

    .line 169
    invoke-virtual {v6, v9, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    iput v7, v8, Lbu8;->i:F

    .line 174
    .line 175
    iget v13, v8, Lbu8;->h:F

    .line 176
    .line 177
    cmpg-float v13, v13, v11

    .line 178
    .line 179
    if-lez v13, :cond_35

    .line 180
    .line 181
    cmpg-float v7, v7, v11

    .line 182
    .line 183
    if-lez v7, :cond_34

    .line 184
    .line 185
    invoke-virtual {v8}, Lbu8;->getAlpha()F

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    const-string v13, "alpha"

    .line 190
    .line 191
    invoke-interface {v2, v12, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    const/4 v10, 0x4

    .line 196
    if-eqz v13, :cond_9

    .line 197
    .line 198
    invoke-virtual {v6, v10, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    :cond_9
    invoke-virtual {v8, v7}, Lbu8;->setAlpha(F)V

    .line 203
    .line 204
    .line 205
    const/4 v7, 0x0

    .line 206
    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    if-eqz v13, :cond_a

    .line 211
    .line 212
    iput-object v13, v8, Lbu8;->m:Ljava/lang/String;

    .line 213
    .line 214
    iget-object v10, v8, Lbu8;->o:Lvt;

    .line 215
    .line 216
    invoke-virtual {v10, v13, v8}, Ll97;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    :cond_a
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Leu8;->getChangingConfigurations()I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    iput v6, v5, Lcu8;->a:I

    .line 227
    .line 228
    const/4 v6, 0x1

    .line 229
    iput-boolean v6, v5, Lcu8;->k:Z

    .line 230
    .line 231
    iget-object v8, v0, Leu8;->Y:Lcu8;

    .line 232
    .line 233
    iget-object v10, v8, Lcu8;->b:Lbu8;

    .line 234
    .line 235
    new-instance v13, Ljava/util/ArrayDeque;

    .line 236
    .line 237
    invoke-direct {v13}, Ljava/util/ArrayDeque;-><init>()V

    .line 238
    .line 239
    .line 240
    iget-object v15, v10, Lbu8;->g:Lyt8;

    .line 241
    .line 242
    iget-object v10, v10, Lbu8;->o:Lvt;

    .line 243
    .line 244
    invoke-virtual {v13, v15}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 252
    .line 253
    .line 254
    move-result v19

    .line 255
    add-int/lit8 v7, v19, 0x1

    .line 256
    .line 257
    move/from16 v19, v6

    .line 258
    .line 259
    :goto_2
    if-eq v15, v6, :cond_32

    .line 260
    .line 261
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-ge v6, v7, :cond_b

    .line 266
    .line 267
    if-eq v15, v14, :cond_32

    .line 268
    .line 269
    :cond_b
    const-string v6, "group"

    .line 270
    .line 271
    if-ne v15, v9, :cond_30

    .line 272
    .line 273
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v15

    .line 277
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v21

    .line 281
    move-object/from16 v14, v21

    .line 282
    .line 283
    check-cast v14, Lyt8;

    .line 284
    .line 285
    if-eqz v14, :cond_2f

    .line 286
    .line 287
    iget-object v14, v14, Lyt8;->b:Ljava/util/ArrayList;

    .line 288
    .line 289
    const-string v9, "path"

    .line 290
    .line 291
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    const-string v11, "fillType"

    .line 296
    .line 297
    move/from16 v22, v7

    .line 298
    .line 299
    const-string v7, "pathData"

    .line 300
    .line 301
    if-eqz v9, :cond_20

    .line 302
    .line 303
    new-instance v6, Lxt8;

    .line 304
    .line 305
    invoke-direct {v6}, Lau8;-><init>()V

    .line 306
    .line 307
    .line 308
    const/4 v9, 0x0

    .line 309
    iput v9, v6, Lxt8;->e:F

    .line 310
    .line 311
    const/high16 v15, 0x3f800000    # 1.0f

    .line 312
    .line 313
    iput v15, v6, Lxt8;->g:F

    .line 314
    .line 315
    iput v15, v6, Lxt8;->h:F

    .line 316
    .line 317
    iput v9, v6, Lxt8;->i:F

    .line 318
    .line 319
    iput v15, v6, Lxt8;->j:F

    .line 320
    .line 321
    iput v9, v6, Lxt8;->k:F

    .line 322
    .line 323
    sget-object v15, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 324
    .line 325
    iput-object v15, v6, Lxt8;->l:Landroid/graphics/Paint$Cap;

    .line 326
    .line 327
    sget-object v9, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 328
    .line 329
    iput-object v9, v6, Lxt8;->m:Landroid/graphics/Paint$Join;

    .line 330
    .line 331
    move-object/from16 v19, v9

    .line 332
    .line 333
    const/high16 v9, 0x40800000    # 4.0f

    .line 334
    .line 335
    iput v9, v6, Lxt8;->n:F

    .line 336
    .line 337
    sget-object v9, Li21;->c:[I

    .line 338
    .line 339
    invoke-static {v1, v4, v3, v9}, La28;->q(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    invoke-interface {v2, v12, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    if-eqz v7, :cond_1e

    .line 348
    .line 349
    move-object/from16 v23, v15

    .line 350
    .line 351
    const/4 v7, 0x0

    .line 352
    invoke-virtual {v9, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    if-eqz v15, :cond_c

    .line 357
    .line 358
    iput-object v15, v6, Lau8;->b:Ljava/lang/String;

    .line 359
    .line 360
    :cond_c
    const/4 v7, 0x2

    .line 361
    invoke-virtual {v9, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v15

    .line 365
    if-eqz v15, :cond_d

    .line 366
    .line 367
    invoke-static {v15}, Lyn0;->B(Ljava/lang/String;)[Lkj5;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    iput-object v7, v6, Lau8;->a:[Lkj5;

    .line 372
    .line 373
    :cond_d
    const-string v7, "fillColor"

    .line 374
    .line 375
    const/4 v15, 0x1

    .line 376
    invoke-static {v9, v2, v4, v7, v15}, La28;->h(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lne;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    iput-object v7, v6, Lxt8;->f:Lne;

    .line 381
    .line 382
    iget v7, v6, Lxt8;->h:F

    .line 383
    .line 384
    const-string v15, "fillAlpha"

    .line 385
    .line 386
    invoke-interface {v2, v12, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v15

    .line 390
    if-eqz v15, :cond_e

    .line 391
    .line 392
    const/16 v15, 0xc

    .line 393
    .line 394
    invoke-virtual {v9, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    :cond_e
    iput v7, v6, Lxt8;->h:F

    .line 399
    .line 400
    const-string v7, "strokeLineCap"

    .line 401
    .line 402
    invoke-interface {v2, v12, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    if-eqz v7, :cond_f

    .line 407
    .line 408
    const/16 v7, 0x8

    .line 409
    .line 410
    const/4 v15, -0x1

    .line 411
    invoke-virtual {v9, v7, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 412
    .line 413
    .line 414
    move-result v18

    .line 415
    move/from16 v15, v18

    .line 416
    .line 417
    goto :goto_3

    .line 418
    :cond_f
    const/4 v15, -0x1

    .line 419
    :goto_3
    iget-object v7, v6, Lxt8;->l:Landroid/graphics/Paint$Cap;

    .line 420
    .line 421
    if-eqz v15, :cond_12

    .line 422
    .line 423
    move-object/from16 v24, v7

    .line 424
    .line 425
    const/4 v7, 0x1

    .line 426
    if-eq v15, v7, :cond_11

    .line 427
    .line 428
    const/4 v7, 0x2

    .line 429
    if-eq v15, v7, :cond_10

    .line 430
    .line 431
    move-object/from16 v15, v24

    .line 432
    .line 433
    goto :goto_4

    .line 434
    :cond_10
    sget-object v15, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 435
    .line 436
    goto :goto_4

    .line 437
    :cond_11
    sget-object v15, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 438
    .line 439
    goto :goto_4

    .line 440
    :cond_12
    move-object/from16 v15, v23

    .line 441
    .line 442
    :goto_4
    iput-object v15, v6, Lxt8;->l:Landroid/graphics/Paint$Cap;

    .line 443
    .line 444
    const-string v7, "strokeLineJoin"

    .line 445
    .line 446
    invoke-interface {v2, v12, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    if-eqz v7, :cond_13

    .line 451
    .line 452
    const/4 v7, -0x1

    .line 453
    const/16 v15, 0x9

    .line 454
    .line 455
    invoke-virtual {v9, v15, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 456
    .line 457
    .line 458
    move-result v16

    .line 459
    move/from16 v7, v16

    .line 460
    .line 461
    goto :goto_5

    .line 462
    :cond_13
    const/4 v7, -0x1

    .line 463
    :goto_5
    iget-object v15, v6, Lxt8;->m:Landroid/graphics/Paint$Join;

    .line 464
    .line 465
    if-eqz v7, :cond_16

    .line 466
    .line 467
    move-object/from16 v23, v15

    .line 468
    .line 469
    const/4 v15, 0x1

    .line 470
    if-eq v7, v15, :cond_15

    .line 471
    .line 472
    const/4 v15, 0x2

    .line 473
    if-eq v7, v15, :cond_14

    .line 474
    .line 475
    move-object/from16 v7, v23

    .line 476
    .line 477
    goto :goto_6

    .line 478
    :cond_14
    sget-object v7, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_15
    sget-object v7, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_16
    move-object/from16 v7, v19

    .line 485
    .line 486
    :goto_6
    iput-object v7, v6, Lxt8;->m:Landroid/graphics/Paint$Join;

    .line 487
    .line 488
    iget v7, v6, Lxt8;->n:F

    .line 489
    .line 490
    const-string v15, "strokeMiterLimit"

    .line 491
    .line 492
    invoke-interface {v2, v12, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v15

    .line 496
    if-eqz v15, :cond_17

    .line 497
    .line 498
    const/16 v15, 0xa

    .line 499
    .line 500
    invoke-virtual {v9, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 501
    .line 502
    .line 503
    move-result v7

    .line 504
    :cond_17
    iput v7, v6, Lxt8;->n:F

    .line 505
    .line 506
    const-string v7, "strokeColor"

    .line 507
    .line 508
    const/4 v15, 0x3

    .line 509
    invoke-static {v9, v2, v4, v7, v15}, La28;->h(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lne;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    iput-object v7, v6, Lxt8;->d:Lne;

    .line 514
    .line 515
    iget v7, v6, Lxt8;->g:F

    .line 516
    .line 517
    const-string v15, "strokeAlpha"

    .line 518
    .line 519
    invoke-interface {v2, v12, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v15

    .line 523
    if-eqz v15, :cond_18

    .line 524
    .line 525
    const/16 v15, 0xb

    .line 526
    .line 527
    invoke-virtual {v9, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 528
    .line 529
    .line 530
    move-result v7

    .line 531
    :cond_18
    iput v7, v6, Lxt8;->g:F

    .line 532
    .line 533
    iget v7, v6, Lxt8;->e:F

    .line 534
    .line 535
    const-string v15, "strokeWidth"

    .line 536
    .line 537
    invoke-interface {v2, v12, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v15

    .line 541
    if-eqz v15, :cond_19

    .line 542
    .line 543
    const/4 v15, 0x4

    .line 544
    invoke-virtual {v9, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 545
    .line 546
    .line 547
    move-result v7

    .line 548
    :cond_19
    iput v7, v6, Lxt8;->e:F

    .line 549
    .line 550
    iget v7, v6, Lxt8;->j:F

    .line 551
    .line 552
    const-string v15, "trimPathEnd"

    .line 553
    .line 554
    invoke-interface {v2, v12, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v15

    .line 558
    if-eqz v15, :cond_1a

    .line 559
    .line 560
    const/4 v15, 0x6

    .line 561
    invoke-virtual {v9, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 562
    .line 563
    .line 564
    move-result v7

    .line 565
    :cond_1a
    iput v7, v6, Lxt8;->j:F

    .line 566
    .line 567
    iget v7, v6, Lxt8;->k:F

    .line 568
    .line 569
    const-string v15, "trimPathOffset"

    .line 570
    .line 571
    invoke-interface {v2, v12, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v15

    .line 575
    if-eqz v15, :cond_1b

    .line 576
    .line 577
    const/4 v15, 0x7

    .line 578
    invoke-virtual {v9, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 579
    .line 580
    .line 581
    move-result v7

    .line 582
    :cond_1b
    iput v7, v6, Lxt8;->k:F

    .line 583
    .line 584
    iget v7, v6, Lxt8;->i:F

    .line 585
    .line 586
    const-string v15, "trimPathStart"

    .line 587
    .line 588
    invoke-interface {v2, v12, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v15

    .line 592
    if-eqz v15, :cond_1c

    .line 593
    .line 594
    const/4 v15, 0x5

    .line 595
    invoke-virtual {v9, v15, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 596
    .line 597
    .line 598
    move-result v7

    .line 599
    :cond_1c
    iput v7, v6, Lxt8;->i:F

    .line 600
    .line 601
    iget v7, v6, Lau8;->c:I

    .line 602
    .line 603
    invoke-interface {v2, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v11

    .line 607
    if-eqz v11, :cond_1d

    .line 608
    .line 609
    const/16 v11, 0xd

    .line 610
    .line 611
    invoke-virtual {v9, v11, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    :cond_1d
    iput v7, v6, Lau8;->c:I

    .line 616
    .line 617
    :cond_1e
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    invoke-virtual {v6}, Lau8;->getPathName()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v7

    .line 627
    if-eqz v7, :cond_1f

    .line 628
    .line 629
    invoke-virtual {v6}, Lau8;->getPathName()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v7

    .line 633
    invoke-virtual {v10, v7, v6}, Ll97;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    :cond_1f
    iget v6, v8, Lcu8;->a:I

    .line 637
    .line 638
    iput v6, v8, Lcu8;->a:I

    .line 639
    .line 640
    const/4 v9, 0x0

    .line 641
    const/4 v15, 0x1

    .line 642
    const/16 v16, 0x9

    .line 643
    .line 644
    const/16 v17, -0x1

    .line 645
    .line 646
    const/16 v18, 0x8

    .line 647
    .line 648
    const/16 v19, 0x0

    .line 649
    .line 650
    goto/16 :goto_c

    .line 651
    .line 652
    :cond_20
    const/16 v16, 0x9

    .line 653
    .line 654
    const/16 v17, -0x1

    .line 655
    .line 656
    const/16 v18, 0x8

    .line 657
    .line 658
    const-string v9, "clip-path"

    .line 659
    .line 660
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v9

    .line 664
    if-eqz v9, :cond_27

    .line 665
    .line 666
    new-instance v6, Lwt8;

    .line 667
    .line 668
    invoke-direct {v6}, Lau8;-><init>()V

    .line 669
    .line 670
    .line 671
    invoke-interface {v2, v12, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v7

    .line 675
    if-eqz v7, :cond_24

    .line 676
    .line 677
    sget-object v7, Li21;->d:[I

    .line 678
    .line 679
    invoke-static {v1, v4, v3, v7}, La28;->q(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 680
    .line 681
    .line 682
    move-result-object v7

    .line 683
    const/4 v9, 0x0

    .line 684
    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v15

    .line 688
    if-eqz v15, :cond_21

    .line 689
    .line 690
    iput-object v15, v6, Lau8;->b:Ljava/lang/String;

    .line 691
    .line 692
    :cond_21
    const/4 v15, 0x1

    .line 693
    invoke-virtual {v7, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v9

    .line 697
    if-eqz v9, :cond_22

    .line 698
    .line 699
    invoke-static {v9}, Lyn0;->B(Ljava/lang/String;)[Lkj5;

    .line 700
    .line 701
    .line 702
    move-result-object v9

    .line 703
    iput-object v9, v6, Lau8;->a:[Lkj5;

    .line 704
    .line 705
    :cond_22
    invoke-static {v2, v11}, La28;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 706
    .line 707
    .line 708
    move-result v9

    .line 709
    if-nez v9, :cond_23

    .line 710
    .line 711
    const/4 v11, 0x0

    .line 712
    goto :goto_7

    .line 713
    :cond_23
    const/4 v9, 0x0

    .line 714
    const/4 v15, 0x2

    .line 715
    invoke-virtual {v7, v15, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 716
    .line 717
    .line 718
    move-result v11

    .line 719
    :goto_7
    iput v11, v6, Lau8;->c:I

    .line 720
    .line 721
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 722
    .line 723
    .line 724
    :cond_24
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    invoke-virtual {v6}, Lau8;->getPathName()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v7

    .line 731
    if-eqz v7, :cond_25

    .line 732
    .line 733
    invoke-virtual {v6}, Lau8;->getPathName()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v7

    .line 737
    invoke-virtual {v10, v7, v6}, Ll97;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    :cond_25
    iget v6, v8, Lcu8;->a:I

    .line 741
    .line 742
    iput v6, v8, Lcu8;->a:I

    .line 743
    .line 744
    :cond_26
    const/4 v9, 0x0

    .line 745
    const/4 v15, 0x1

    .line 746
    goto/16 :goto_c

    .line 747
    .line 748
    :cond_27
    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    move-result v6

    .line 752
    if-eqz v6, :cond_26

    .line 753
    .line 754
    new-instance v6, Lyt8;

    .line 755
    .line 756
    invoke-direct {v6}, Lyt8;-><init>()V

    .line 757
    .line 758
    .line 759
    sget-object v7, Li21;->b:[I

    .line 760
    .line 761
    invoke-static {v1, v4, v3, v7}, La28;->q(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 762
    .line 763
    .line 764
    move-result-object v7

    .line 765
    iget v9, v6, Lyt8;->c:F

    .line 766
    .line 767
    const-string v11, "rotation"

    .line 768
    .line 769
    invoke-static {v2, v11}, La28;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 770
    .line 771
    .line 772
    move-result v11

    .line 773
    if-nez v11, :cond_28

    .line 774
    .line 775
    const/4 v11, 0x5

    .line 776
    goto :goto_8

    .line 777
    :cond_28
    const/4 v11, 0x5

    .line 778
    invoke-virtual {v7, v11, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 779
    .line 780
    .line 781
    move-result v9

    .line 782
    :goto_8
    iput v9, v6, Lyt8;->c:F

    .line 783
    .line 784
    iget v9, v6, Lyt8;->d:F

    .line 785
    .line 786
    const/4 v15, 0x1

    .line 787
    invoke-virtual {v7, v15, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 788
    .line 789
    .line 790
    move-result v9

    .line 791
    iput v9, v6, Lyt8;->d:F

    .line 792
    .line 793
    iget v9, v6, Lyt8;->e:F

    .line 794
    .line 795
    const/4 v11, 0x2

    .line 796
    invoke-virtual {v7, v11, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 797
    .line 798
    .line 799
    move-result v9

    .line 800
    iput v9, v6, Lyt8;->e:F

    .line 801
    .line 802
    iget v9, v6, Lyt8;->f:F

    .line 803
    .line 804
    const-string v11, "scaleX"

    .line 805
    .line 806
    invoke-interface {v2, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v11

    .line 810
    if-eqz v11, :cond_29

    .line 811
    .line 812
    const/4 v11, 0x3

    .line 813
    invoke-virtual {v7, v11, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 814
    .line 815
    .line 816
    move-result v9

    .line 817
    :cond_29
    iput v9, v6, Lyt8;->f:F

    .line 818
    .line 819
    iget v9, v6, Lyt8;->g:F

    .line 820
    .line 821
    const-string v11, "scaleY"

    .line 822
    .line 823
    invoke-interface {v2, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v11

    .line 827
    if-eqz v11, :cond_2a

    .line 828
    .line 829
    const/4 v11, 0x4

    .line 830
    invoke-virtual {v7, v11, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 831
    .line 832
    .line 833
    move-result v9

    .line 834
    goto :goto_9

    .line 835
    :cond_2a
    const/4 v11, 0x4

    .line 836
    :goto_9
    iput v9, v6, Lyt8;->g:F

    .line 837
    .line 838
    iget v9, v6, Lyt8;->h:F

    .line 839
    .line 840
    const-string v11, "translateX"

    .line 841
    .line 842
    invoke-interface {v2, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v11

    .line 846
    if-eqz v11, :cond_2b

    .line 847
    .line 848
    const/4 v11, 0x6

    .line 849
    invoke-virtual {v7, v11, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 850
    .line 851
    .line 852
    move-result v9

    .line 853
    goto :goto_a

    .line 854
    :cond_2b
    const/4 v11, 0x6

    .line 855
    :goto_a
    iput v9, v6, Lyt8;->h:F

    .line 856
    .line 857
    iget v9, v6, Lyt8;->i:F

    .line 858
    .line 859
    const-string v11, "translateY"

    .line 860
    .line 861
    invoke-interface {v2, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v11

    .line 865
    if-eqz v11, :cond_2c

    .line 866
    .line 867
    const/4 v11, 0x7

    .line 868
    invoke-virtual {v7, v11, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 869
    .line 870
    .line 871
    move-result v9

    .line 872
    goto :goto_b

    .line 873
    :cond_2c
    const/4 v11, 0x7

    .line 874
    :goto_b
    iput v9, v6, Lyt8;->i:F

    .line 875
    .line 876
    const/4 v9, 0x0

    .line 877
    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v11

    .line 881
    if-eqz v11, :cond_2d

    .line 882
    .line 883
    iput-object v11, v6, Lyt8;->k:Ljava/lang/String;

    .line 884
    .line 885
    :cond_2d
    invoke-virtual {v6}, Lyt8;->c()V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    invoke-virtual {v13, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v6}, Lyt8;->getGroupName()Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v7

    .line 901
    if-eqz v7, :cond_2e

    .line 902
    .line 903
    invoke-virtual {v6}, Lyt8;->getGroupName()Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v7

    .line 907
    invoke-virtual {v10, v7, v6}, Ll97;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    :cond_2e
    iget v6, v8, Lcu8;->a:I

    .line 911
    .line 912
    iput v6, v8, Lcu8;->a:I

    .line 913
    .line 914
    goto :goto_c

    .line 915
    :cond_2f
    move/from16 v22, v7

    .line 916
    .line 917
    const/4 v9, 0x0

    .line 918
    const/4 v15, 0x1

    .line 919
    const/16 v16, 0x9

    .line 920
    .line 921
    const/16 v17, -0x1

    .line 922
    .line 923
    const/16 v18, 0x8

    .line 924
    .line 925
    :goto_c
    move/from16 v20, v15

    .line 926
    .line 927
    const/4 v11, 0x3

    .line 928
    goto :goto_d

    .line 929
    :cond_30
    move/from16 v22, v7

    .line 930
    .line 931
    move v11, v14

    .line 932
    const/4 v9, 0x0

    .line 933
    const/16 v16, 0x9

    .line 934
    .line 935
    const/16 v17, -0x1

    .line 936
    .line 937
    const/16 v18, 0x8

    .line 938
    .line 939
    const/16 v20, 0x1

    .line 940
    .line 941
    if-ne v15, v11, :cond_31

    .line 942
    .line 943
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v7

    .line 947
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v6

    .line 951
    if-eqz v6, :cond_31

    .line 952
    .line 953
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    :cond_31
    :goto_d
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 957
    .line 958
    .line 959
    move-result v15

    .line 960
    move v14, v11

    .line 961
    move/from16 v6, v20

    .line 962
    .line 963
    move/from16 v7, v22

    .line 964
    .line 965
    const/4 v9, 0x2

    .line 966
    const/4 v11, 0x0

    .line 967
    goto/16 :goto_2

    .line 968
    .line 969
    :cond_32
    if-nez v19, :cond_33

    .line 970
    .line 971
    iget-object v1, v5, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 972
    .line 973
    iget-object v2, v5, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 974
    .line 975
    invoke-virtual {v0, v1, v2}, Leu8;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    iput-object v1, v0, Leu8;->Z:Landroid/graphics/PorterDuffColorFilter;

    .line 980
    .line 981
    return-void

    .line 982
    :cond_33
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 983
    .line 984
    const-string v1, "no path defined"

    .line 985
    .line 986
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    throw v0

    .line 990
    :cond_34
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 991
    .line 992
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    new-instance v2, Ljava/lang/StringBuilder;

    .line 997
    .line 998
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    .line 1004
    const-string v1, "<vector> tag requires height > 0"

    .line 1005
    .line 1006
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    throw v0

    .line 1017
    :cond_35
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1018
    .line 1019
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1024
    .line 1025
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    const-string v1, "<vector> tag requires width > 0"

    .line 1032
    .line 1033
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    throw v0

    .line 1044
    :cond_36
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1045
    .line 1046
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v1

    .line 1050
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1051
    .line 1052
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    const-string v1, "<vector> tag requires viewportHeight > 0"

    .line 1059
    .line 1060
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1068
    .line 1069
    .line 1070
    throw v0

    .line 1071
    :cond_37
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1072
    .line 1073
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1078
    .line 1079
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1083
    .line 1084
    .line 1085
    const-string v1, "<vector> tag requires viewportWidth > 0"

    .line 1086
    .line 1087
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1095
    .line 1096
    .line 1097
    throw v0

    .line 1098
    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invalidateSelf()V
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final isAutoMirrored()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Leu8;->Y:Lcu8;

    .line 11
    .line 12
    iget-boolean p0, p0, Lcu8;->e:Z

    .line 13
    .line 14
    return p0
.end method

.method public final isStateful()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, Leu8;->Y:Lcu8;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, v0, Lcu8;->b:Lbu8;

    .line 21
    .line 22
    iget-object v1, v0, Lbu8;->n:Ljava/lang/Boolean;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v0, Lbu8;->g:Lyt8;

    .line 27
    .line 28
    invoke-virtual {v1}, Lyt8;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, v0, Lbu8;->n:Ljava/lang/Boolean;

    .line 37
    .line 38
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    iget-object p0, p0, Leu8;->Y:Lcu8;

    .line 45
    .line 46
    iget-object p0, p0, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/4 p0, 0x0

    .line 58
    return p0

    .line 59
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 60
    return p0
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Leu8;->g0:Z

    .line 10
    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-ne v0, p0, :cond_4

    .line 18
    .line 19
    new-instance v0, Lcu8;

    .line 20
    .line 21
    iget-object v1, p0, Leu8;->Y:Lcu8;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    iput-object v2, v0, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    sget-object v2, Leu8;->l0:Landroid/graphics/PorterDuff$Mode;

    .line 30
    .line 31
    iput-object v2, v0, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    iget v2, v1, Lcu8;->a:I

    .line 36
    .line 37
    iput v2, v0, Lcu8;->a:I

    .line 38
    .line 39
    new-instance v2, Lbu8;

    .line 40
    .line 41
    iget-object v3, v1, Lcu8;->b:Lbu8;

    .line 42
    .line 43
    invoke-direct {v2, v3}, Lbu8;-><init>(Lbu8;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, v0, Lcu8;->b:Lbu8;

    .line 47
    .line 48
    iget-object v3, v1, Lcu8;->b:Lbu8;

    .line 49
    .line 50
    iget-object v3, v3, Lbu8;->e:Landroid/graphics/Paint;

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    new-instance v3, Landroid/graphics/Paint;

    .line 55
    .line 56
    iget-object v4, v1, Lcu8;->b:Lbu8;

    .line 57
    .line 58
    iget-object v4, v4, Lbu8;->e:Landroid/graphics/Paint;

    .line 59
    .line 60
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    iput-object v3, v2, Lbu8;->e:Landroid/graphics/Paint;

    .line 64
    .line 65
    :cond_1
    iget-object v2, v1, Lcu8;->b:Lbu8;

    .line 66
    .line 67
    iget-object v2, v2, Lbu8;->d:Landroid/graphics/Paint;

    .line 68
    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    iget-object v2, v0, Lcu8;->b:Lbu8;

    .line 72
    .line 73
    new-instance v3, Landroid/graphics/Paint;

    .line 74
    .line 75
    iget-object v4, v1, Lcu8;->b:Lbu8;

    .line 76
    .line 77
    iget-object v4, v4, Lbu8;->d:Landroid/graphics/Paint;

    .line 78
    .line 79
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 80
    .line 81
    .line 82
    iput-object v3, v2, Lbu8;->d:Landroid/graphics/Paint;

    .line 83
    .line 84
    :cond_2
    iget-object v2, v1, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 85
    .line 86
    iput-object v2, v0, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 87
    .line 88
    iget-object v2, v1, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 89
    .line 90
    iput-object v2, v0, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 91
    .line 92
    iget-boolean v1, v1, Lcu8;->e:Z

    .line 93
    .line 94
    iput-boolean v1, v0, Lcu8;->e:Z

    .line 95
    .line 96
    :cond_3
    iput-object v0, p0, Leu8;->Y:Lcu8;

    .line 97
    .line 98
    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, Leu8;->g0:Z

    .line 100
    .line 101
    :cond_4
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onStateChange([I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object v0, p0, Leu8;->Y:Lcu8;

    .line 11
    .line 12
    iget-object v1, v0, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v3, v0, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v1, v3}, Leu8;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Leu8;->Z:Landroid/graphics/PorterDuffColorFilter;

    .line 26
    .line 27
    invoke-virtual {p0}, Leu8;->invalidateSelf()V

    .line 28
    .line 29
    .line 30
    move v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :goto_0
    iget-object v3, v0, Lcu8;->b:Lbu8;

    .line 34
    .line 35
    iget-object v4, v3, Lbu8;->n:Ljava/lang/Boolean;

    .line 36
    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    iget-object v4, v3, Lbu8;->g:Lyt8;

    .line 40
    .line 41
    invoke-virtual {v4}, Lyt8;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iput-object v4, v3, Lbu8;->n:Ljava/lang/Boolean;

    .line 50
    .line 51
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v3, v0, Lcu8;->b:Lbu8;

    .line 58
    .line 59
    iget-object v3, v3, Lbu8;->g:Lyt8;

    .line 60
    .line 61
    invoke-virtual {v3, p1}, Lyt8;->b([I)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iget-boolean v3, v0, Lcu8;->k:Z

    .line 66
    .line 67
    or-int/2addr v3, p1

    .line 68
    iput-boolean v3, v0, Lcu8;->k:Z

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    invoke-virtual {p0}, Leu8;->invalidateSelf()V

    .line 73
    .line 74
    .line 75
    return v2

    .line 76
    :cond_3
    return v1
.end method

.method public final scheduleSelf(Ljava/lang/Runnable;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Leu8;->Y:Lcu8;

    .line 10
    .line 11
    iget-object v0, v0, Lcu8;->b:Lbu8;

    .line 12
    .line 13
    invoke-virtual {v0}, Lbu8;->getRootAlpha()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Leu8;->Y:Lcu8;

    .line 20
    .line 21
    iget-object v0, v0, Lcu8;->b:Lbu8;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lbu8;->setRootAlpha(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Leu8;->invalidateSelf()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final setAutoMirrored(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Leu8;->Y:Lcu8;

    .line 10
    .line 11
    iput-boolean p1, p0, Lcu8;->e:Z

    .line 12
    .line 13
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-object p1, p0, Leu8;->f0:Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    invoke-virtual {p0}, Leu8;->invalidateSelf()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setTint(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Leu8;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Leu8;->Y:Lcu8;

    .line 10
    .line 11
    iget-object v1, v0, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    if-eq v1, p1, :cond_1

    .line 14
    .line 15
    iput-object p1, v0, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    iget-object v0, v0, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Leu8;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Leu8;->Z:Landroid/graphics/PorterDuffColorFilter;

    .line 24
    .line 25
    invoke-virtual {p0}, Leu8;->invalidateSelf()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Leu8;->Y:Lcu8;

    .line 10
    .line 11
    iget-object v1, v0, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 12
    .line 13
    if-eq v1, p1, :cond_1

    .line 14
    .line 15
    iput-object p1, v0, Lcu8;->d:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    iget-object v0, v0, Lcu8;->c:Landroid/content/res/ColorStateList;

    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Leu8;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Leu8;->Z:Landroid/graphics/PorterDuffColorFilter;

    .line 24
    .line 25
    invoke-virtual {p0}, Leu8;->invalidateSelf()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final unscheduleSelf(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvt8;->X:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
