.class public final Lbu8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:Lyt8;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Lvt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbu8;->p:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lbu8;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 102
    iput v0, p0, Lbu8;->h:F

    .line 103
    iput v0, p0, Lbu8;->i:F

    .line 104
    iput v0, p0, Lbu8;->j:F

    .line 105
    iput v0, p0, Lbu8;->k:F

    const/16 v0, 0xff

    .line 106
    iput v0, p0, Lbu8;->l:I

    const/4 v0, 0x0

    .line 107
    iput-object v0, p0, Lbu8;->m:Ljava/lang/String;

    .line 108
    iput-object v0, p0, Lbu8;->n:Ljava/lang/Boolean;

    .line 109
    new-instance v0, Lvt;

    const/4 v1, 0x0

    .line 110
    invoke-direct {v0, v1}, Ll97;-><init>(I)V

    .line 111
    iput-object v0, p0, Lbu8;->o:Lvt;

    .line 112
    new-instance v0, Lyt8;

    invoke-direct {v0}, Lyt8;-><init>()V

    iput-object v0, p0, Lbu8;->g:Lyt8;

    .line 113
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lbu8;->a:Landroid/graphics/Path;

    .line 114
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lbu8;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Lbu8;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbu8;->c:Landroid/graphics/Matrix;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lbu8;->h:F

    .line 13
    .line 14
    iput v0, p0, Lbu8;->i:F

    .line 15
    .line 16
    iput v0, p0, Lbu8;->j:F

    .line 17
    .line 18
    iput v0, p0, Lbu8;->k:F

    .line 19
    .line 20
    const/16 v0, 0xff

    .line 21
    .line 22
    iput v0, p0, Lbu8;->l:I

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lbu8;->m:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, p0, Lbu8;->n:Ljava/lang/Boolean;

    .line 28
    .line 29
    new-instance v0, Lvt;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Ll97;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lbu8;->o:Lvt;

    .line 36
    .line 37
    new-instance v1, Lyt8;

    .line 38
    .line 39
    iget-object v2, p1, Lbu8;->g:Lyt8;

    .line 40
    .line 41
    invoke-direct {v1, v2, v0}, Lyt8;-><init>(Lyt8;Lvt;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lbu8;->g:Lyt8;

    .line 45
    .line 46
    new-instance v1, Landroid/graphics/Path;

    .line 47
    .line 48
    iget-object v2, p1, Lbu8;->a:Landroid/graphics/Path;

    .line 49
    .line 50
    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lbu8;->a:Landroid/graphics/Path;

    .line 54
    .line 55
    new-instance v1, Landroid/graphics/Path;

    .line 56
    .line 57
    iget-object v2, p1, Lbu8;->b:Landroid/graphics/Path;

    .line 58
    .line 59
    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lbu8;->b:Landroid/graphics/Path;

    .line 63
    .line 64
    iget v1, p1, Lbu8;->h:F

    .line 65
    .line 66
    iput v1, p0, Lbu8;->h:F

    .line 67
    .line 68
    iget v1, p1, Lbu8;->i:F

    .line 69
    .line 70
    iput v1, p0, Lbu8;->i:F

    .line 71
    .line 72
    iget v1, p1, Lbu8;->j:F

    .line 73
    .line 74
    iput v1, p0, Lbu8;->j:F

    .line 75
    .line 76
    iget v1, p1, Lbu8;->k:F

    .line 77
    .line 78
    iput v1, p0, Lbu8;->k:F

    .line 79
    .line 80
    iget v1, p1, Lbu8;->l:I

    .line 81
    .line 82
    iput v1, p0, Lbu8;->l:I

    .line 83
    .line 84
    iget-object v1, p1, Lbu8;->m:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v1, p0, Lbu8;->m:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v1, p1, Lbu8;->m:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    invoke-virtual {v0, v1, p0}, Ll97;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_0
    iget-object p1, p1, Lbu8;->n:Ljava/lang/Boolean;

    .line 96
    .line 97
    iput-object p1, p0, Lbu8;->n:Ljava/lang/Boolean;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final a(Lyt8;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lyt8;->a:Landroid/graphics/Matrix;

    .line 4
    .line 5
    iget-object v6, v0, Lyt8;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lyt8;->a:Landroid/graphics/Matrix;

    .line 13
    .line 14
    iget-object v0, v0, Lyt8;->j:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 20
    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move v8, v7

    .line 24
    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ge v8, v0, :cond_16

    .line 29
    .line 30
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lzt8;

    .line 35
    .line 36
    instance-of v1, v0, Lyt8;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    check-cast v1, Lyt8;

    .line 42
    .line 43
    move-object/from16 v0, p0

    .line 44
    .line 45
    move-object/from16 v3, p3

    .line 46
    .line 47
    move/from16 v4, p4

    .line 48
    .line 49
    move/from16 v5, p5

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v5}, Lbu8;->a(Lyt8;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 52
    .line 53
    .line 54
    move-object v1, v0

    .line 55
    :goto_1
    move/from16 v9, p5

    .line 56
    .line 57
    move/from16 v18, v8

    .line 58
    .line 59
    goto/16 :goto_c

    .line 60
    .line 61
    :cond_0
    move-object/from16 v1, p0

    .line 62
    .line 63
    move-object/from16 v3, p3

    .line 64
    .line 65
    instance-of v4, v0, Lau8;

    .line 66
    .line 67
    if-eqz v4, :cond_14

    .line 68
    .line 69
    check-cast v0, Lau8;

    .line 70
    .line 71
    move/from16 v4, p4

    .line 72
    .line 73
    int-to-float v5, v4

    .line 74
    iget v9, v1, Lbu8;->j:F

    .line 75
    .line 76
    div-float/2addr v5, v9

    .line 77
    move/from16 v9, p5

    .line 78
    .line 79
    int-to-float v10, v9

    .line 80
    iget v11, v1, Lbu8;->k:F

    .line 81
    .line 82
    div-float/2addr v10, v11

    .line 83
    invoke-static {v5, v10}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    iget-object v12, v1, Lbu8;->c:Landroid/graphics/Matrix;

    .line 88
    .line 89
    invoke-virtual {v12, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v5, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 93
    .line 94
    .line 95
    const/4 v5, 0x4

    .line 96
    new-array v5, v5, [F

    .line 97
    .line 98
    fill-array-data v5, :array_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v5}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 102
    .line 103
    .line 104
    aget v10, v5, v7

    .line 105
    .line 106
    float-to-double v13, v10

    .line 107
    const/4 v10, 0x1

    .line 108
    aget v15, v5, v10

    .line 109
    .line 110
    move/from16 p2, v10

    .line 111
    .line 112
    move/from16 p1, v11

    .line 113
    .line 114
    float-to-double v10, v15

    .line 115
    invoke-static {v13, v14, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    .line 116
    .line 117
    .line 118
    move-result-wide v10

    .line 119
    double-to-float v10, v10

    .line 120
    const/4 v11, 0x2

    .line 121
    aget v13, v5, v11

    .line 122
    .line 123
    float-to-double v13, v13

    .line 124
    const/4 v15, 0x3

    .line 125
    move/from16 v16, v11

    .line 126
    .line 127
    aget v11, v5, v15

    .line 128
    .line 129
    move/from16 v17, v7

    .line 130
    .line 131
    move/from16 v18, v8

    .line 132
    .line 133
    float-to-double v7, v11

    .line 134
    invoke-static {v13, v14, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 135
    .line 136
    .line 137
    move-result-wide v7

    .line 138
    double-to-float v7, v7

    .line 139
    aget v8, v5, v17

    .line 140
    .line 141
    aget v11, v5, p2

    .line 142
    .line 143
    aget v13, v5, v16

    .line 144
    .line 145
    aget v5, v5, v15

    .line 146
    .line 147
    mul-float/2addr v8, v5

    .line 148
    mul-float/2addr v11, v13

    .line 149
    sub-float/2addr v8, v11

    .line 150
    invoke-static {v10, v7}, Ljava/lang/Math;->max(FF)F

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    const/4 v7, 0x0

    .line 155
    cmpl-float v10, v5, v7

    .line 156
    .line 157
    if-lez v10, :cond_1

    .line 158
    .line 159
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    div-float/2addr v8, v5

    .line 164
    goto :goto_2

    .line 165
    :cond_1
    move v8, v7

    .line 166
    :goto_2
    cmpl-float v5, v8, v7

    .line 167
    .line 168
    if-nez v5, :cond_2

    .line 169
    .line 170
    goto/16 :goto_c

    .line 171
    .line 172
    :cond_2
    iget-object v5, v1, Lbu8;->a:Landroid/graphics/Path;

    .line 173
    .line 174
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 175
    .line 176
    .line 177
    iget-object v10, v0, Lau8;->a:[Lkj5;

    .line 178
    .line 179
    if-eqz v10, :cond_3

    .line 180
    .line 181
    invoke-static {v10, v5}, Lyn0;->Q([Lkj5;Landroid/graphics/Path;)V

    .line 182
    .line 183
    .line 184
    :cond_3
    iget-object v10, v1, Lbu8;->b:Landroid/graphics/Path;

    .line 185
    .line 186
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 187
    .line 188
    .line 189
    instance-of v11, v0, Lwt8;

    .line 190
    .line 191
    if-eqz v11, :cond_5

    .line 192
    .line 193
    iget v0, v0, Lau8;->c:I

    .line 194
    .line 195
    if-nez v0, :cond_4

    .line 196
    .line 197
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_4
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 201
    .line 202
    :goto_3
    invoke-virtual {v10, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10, v5, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v10}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 209
    .line 210
    .line 211
    goto/16 :goto_c

    .line 212
    .line 213
    :cond_5
    check-cast v0, Lxt8;

    .line 214
    .line 215
    iget v11, v0, Lxt8;->i:F

    .line 216
    .line 217
    cmpl-float v13, v11, v7

    .line 218
    .line 219
    const/high16 v14, 0x3f800000    # 1.0f

    .line 220
    .line 221
    if-nez v13, :cond_6

    .line 222
    .line 223
    iget v13, v0, Lxt8;->j:F

    .line 224
    .line 225
    cmpl-float v13, v13, v14

    .line 226
    .line 227
    if-eqz v13, :cond_9

    .line 228
    .line 229
    :cond_6
    iget v13, v0, Lxt8;->k:F

    .line 230
    .line 231
    add-float/2addr v11, v13

    .line 232
    rem-float/2addr v11, v14

    .line 233
    iget v15, v0, Lxt8;->j:F

    .line 234
    .line 235
    add-float/2addr v15, v13

    .line 236
    rem-float/2addr v15, v14

    .line 237
    iget-object v13, v1, Lbu8;->f:Landroid/graphics/PathMeasure;

    .line 238
    .line 239
    if-nez v13, :cond_7

    .line 240
    .line 241
    new-instance v13, Landroid/graphics/PathMeasure;

    .line 242
    .line 243
    invoke-direct {v13}, Landroid/graphics/PathMeasure;-><init>()V

    .line 244
    .line 245
    .line 246
    iput-object v13, v1, Lbu8;->f:Landroid/graphics/PathMeasure;

    .line 247
    .line 248
    :cond_7
    move/from16 v14, v17

    .line 249
    .line 250
    invoke-virtual {v13, v5, v14}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 251
    .line 252
    .line 253
    iget-object v13, v1, Lbu8;->f:Landroid/graphics/PathMeasure;

    .line 254
    .line 255
    invoke-virtual {v13}, Landroid/graphics/PathMeasure;->getLength()F

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    mul-float/2addr v11, v13

    .line 260
    mul-float/2addr v15, v13

    .line 261
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 262
    .line 263
    .line 264
    cmpl-float v16, v11, v15

    .line 265
    .line 266
    iget-object v14, v1, Lbu8;->f:Landroid/graphics/PathMeasure;

    .line 267
    .line 268
    if-lez v16, :cond_8

    .line 269
    .line 270
    move/from16 v7, p2

    .line 271
    .line 272
    invoke-virtual {v14, v11, v13, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 273
    .line 274
    .line 275
    iget-object v11, v1, Lbu8;->f:Landroid/graphics/PathMeasure;

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    invoke-virtual {v11, v13, v15, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 279
    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_8
    move v13, v7

    .line 283
    move/from16 v7, p2

    .line 284
    .line 285
    invoke-virtual {v14, v11, v15, v5, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 286
    .line 287
    .line 288
    :goto_4
    invoke-virtual {v5, v13, v13}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 289
    .line 290
    .line 291
    :cond_9
    invoke-virtual {v10, v5, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 292
    .line 293
    .line 294
    iget-object v5, v0, Lxt8;->f:Lne;

    .line 295
    .line 296
    iget-object v7, v5, Lne;->c:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v7, Landroid/graphics/Shader;

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const/16 v14, 0xff

    .line 302
    .line 303
    const/high16 v15, 0x437f0000    # 255.0f

    .line 304
    .line 305
    if-eqz v7, :cond_a

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_a
    iget v7, v5, Lne;->b:I

    .line 309
    .line 310
    if-eqz v7, :cond_e

    .line 311
    .line 312
    :goto_5
    iget-object v7, v1, Lbu8;->e:Landroid/graphics/Paint;

    .line 313
    .line 314
    if-nez v7, :cond_b

    .line 315
    .line 316
    new-instance v7, Landroid/graphics/Paint;

    .line 317
    .line 318
    const/4 v11, 0x1

    .line 319
    const v16, 0xffffff

    .line 320
    .line 321
    .line 322
    invoke-direct {v7, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 323
    .line 324
    .line 325
    iput-object v7, v1, Lbu8;->e:Landroid/graphics/Paint;

    .line 326
    .line 327
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 328
    .line 329
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 330
    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_b
    const v16, 0xffffff

    .line 334
    .line 335
    .line 336
    :goto_6
    iget-object v7, v1, Lbu8;->e:Landroid/graphics/Paint;

    .line 337
    .line 338
    iget-object v11, v5, Lne;->c:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v11, Landroid/graphics/Shader;

    .line 341
    .line 342
    if-eqz v11, :cond_c

    .line 343
    .line 344
    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 348
    .line 349
    .line 350
    iget v5, v0, Lxt8;->h:F

    .line 351
    .line 352
    mul-float/2addr v5, v15

    .line 353
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 358
    .line 359
    .line 360
    move/from16 v19, v15

    .line 361
    .line 362
    goto :goto_7

    .line 363
    :cond_c
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 367
    .line 368
    .line 369
    iget v5, v5, Lne;->b:I

    .line 370
    .line 371
    iget v11, v0, Lxt8;->h:F

    .line 372
    .line 373
    sget-object v19, Leu8;->l0:Landroid/graphics/PorterDuff$Mode;

    .line 374
    .line 375
    move/from16 v19, v15

    .line 376
    .line 377
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 378
    .line 379
    .line 380
    move-result v15

    .line 381
    and-int v5, v5, v16

    .line 382
    .line 383
    int-to-float v15, v15

    .line 384
    mul-float/2addr v15, v11

    .line 385
    float-to-int v11, v15

    .line 386
    shl-int/lit8 v11, v11, 0x18

    .line 387
    .line 388
    or-int/2addr v5, v11

    .line 389
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 390
    .line 391
    .line 392
    :goto_7
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 393
    .line 394
    .line 395
    iget v5, v0, Lau8;->c:I

    .line 396
    .line 397
    if-nez v5, :cond_d

    .line 398
    .line 399
    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_d
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 403
    .line 404
    :goto_8
    invoke-virtual {v10, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3, v10, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 408
    .line 409
    .line 410
    goto :goto_9

    .line 411
    :cond_e
    move/from16 v19, v15

    .line 412
    .line 413
    const v16, 0xffffff

    .line 414
    .line 415
    .line 416
    :goto_9
    iget-object v5, v0, Lxt8;->d:Lne;

    .line 417
    .line 418
    iget-object v7, v5, Lne;->c:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v7, Landroid/graphics/Shader;

    .line 421
    .line 422
    if-eqz v7, :cond_f

    .line 423
    .line 424
    goto :goto_a

    .line 425
    :cond_f
    iget v7, v5, Lne;->b:I

    .line 426
    .line 427
    if-eqz v7, :cond_15

    .line 428
    .line 429
    :goto_a
    iget-object v7, v1, Lbu8;->d:Landroid/graphics/Paint;

    .line 430
    .line 431
    if-nez v7, :cond_10

    .line 432
    .line 433
    new-instance v7, Landroid/graphics/Paint;

    .line 434
    .line 435
    const/4 v11, 0x1

    .line 436
    invoke-direct {v7, v11}, Landroid/graphics/Paint;-><init>(I)V

    .line 437
    .line 438
    .line 439
    iput-object v7, v1, Lbu8;->d:Landroid/graphics/Paint;

    .line 440
    .line 441
    sget-object v11, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 442
    .line 443
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 444
    .line 445
    .line 446
    :cond_10
    iget-object v7, v1, Lbu8;->d:Landroid/graphics/Paint;

    .line 447
    .line 448
    iget-object v11, v0, Lxt8;->m:Landroid/graphics/Paint$Join;

    .line 449
    .line 450
    if-eqz v11, :cond_11

    .line 451
    .line 452
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 453
    .line 454
    .line 455
    :cond_11
    iget-object v11, v0, Lxt8;->l:Landroid/graphics/Paint$Cap;

    .line 456
    .line 457
    if-eqz v11, :cond_12

    .line 458
    .line 459
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 460
    .line 461
    .line 462
    :cond_12
    iget v11, v0, Lxt8;->n:F

    .line 463
    .line 464
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 465
    .line 466
    .line 467
    iget-object v11, v5, Lne;->c:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v11, Landroid/graphics/Shader;

    .line 470
    .line 471
    if-eqz v11, :cond_13

    .line 472
    .line 473
    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 477
    .line 478
    .line 479
    iget v5, v0, Lxt8;->g:F

    .line 480
    .line 481
    mul-float v5, v5, v19

    .line 482
    .line 483
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 488
    .line 489
    .line 490
    goto :goto_b

    .line 491
    :cond_13
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 495
    .line 496
    .line 497
    iget v5, v5, Lne;->b:I

    .line 498
    .line 499
    iget v11, v0, Lxt8;->g:F

    .line 500
    .line 501
    sget-object v12, Leu8;->l0:Landroid/graphics/PorterDuff$Mode;

    .line 502
    .line 503
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 504
    .line 505
    .line 506
    move-result v12

    .line 507
    and-int v5, v5, v16

    .line 508
    .line 509
    int-to-float v12, v12

    .line 510
    mul-float/2addr v12, v11

    .line 511
    float-to-int v11, v12

    .line 512
    shl-int/lit8 v11, v11, 0x18

    .line 513
    .line 514
    or-int/2addr v5, v11

    .line 515
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 516
    .line 517
    .line 518
    :goto_b
    invoke-virtual {v7, v13}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 519
    .line 520
    .line 521
    mul-float v11, p1, v8

    .line 522
    .line 523
    iget v0, v0, Lxt8;->e:F

    .line 524
    .line 525
    mul-float/2addr v0, v11

    .line 526
    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v3, v10, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 530
    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_14
    move/from16 v4, p4

    .line 534
    .line 535
    goto/16 :goto_1

    .line 536
    .line 537
    :cond_15
    :goto_c
    add-int/lit8 v8, v18, 0x1

    .line 538
    .line 539
    const/4 v7, 0x0

    .line 540
    goto/16 :goto_0

    .line 541
    .line 542
    :cond_16
    move-object/from16 v3, p3

    .line 543
    .line 544
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 545
    .line 546
    .line 547
    return-void

    .line 548
    nop

    .line 549
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public getAlpha()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbu8;->getRootAlpha()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-float p0, p0

    .line 6
    const/high16 v0, 0x437f0000    # 255.0f

    .line 7
    .line 8
    div-float/2addr p0, v0

    .line 9
    return p0
.end method

.method public getRootAlpha()I
    .locals 0

    .line 1
    iget p0, p0, Lbu8;->l:I

    .line 2
    .line 3
    return p0
.end method

.method public setAlpha(F)V
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float/2addr p1, v0

    .line 4
    float-to-int p1, p1

    .line 5
    invoke-virtual {p0, p1}, Lbu8;->setRootAlpha(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbu8;->l:I

    .line 2
    .line 3
    return-void
.end method
