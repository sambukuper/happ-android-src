.class public final Lpj;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Laa6;

.field public final synthetic c:Lsd1;


# direct methods
.method public synthetic constructor <init>(Lsd1;Laa6;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lpj;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lpj;->c:Lsd1;

    .line 4
    .line 5
    iput-object p2, p0, Lpj;->b:Laa6;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, Lpj;->a:B

    .line 6
    .line 7
    sget-object v4, Ltr5;->X:Ltr5;

    .line 8
    .line 9
    iget-object v8, v0, Lpj;->b:Laa6;

    .line 10
    .line 11
    const-wide v9, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/16 v11, 0x20

    .line 17
    .line 18
    const/4 v12, 0x1

    .line 19
    iget-object v0, v0, Lpj;->c:Lsd1;

    .line 20
    .line 21
    packed-switch v2, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v13

    .line 32
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v14

    .line 36
    move-object v2, v0

    .line 37
    check-cast v2, Lhi7;

    .line 38
    .line 39
    iget-object v2, v2, Lhi7;->c:Lpd5;

    .line 40
    .line 41
    iget-object v15, v2, Lpd5;->b:Lta7;

    .line 42
    .line 43
    iget-object v3, v2, Lpd5;->c:Lpw6;

    .line 44
    .line 45
    sget-object v5, Ly63;->b:Lf4;

    .line 46
    .line 47
    invoke-static {v2, v5}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lta7;

    .line 52
    .line 53
    invoke-static {v13, v14, v15, v3, v2}, Lw79;->l(IILta7;Lpw6;Lta7;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 58
    .line 59
    shr-long v6, v2, v11

    .line 60
    .line 61
    long-to-int v15, v6

    .line 62
    and-long/2addr v2, v9

    .line 63
    long-to-int v2, v2

    .line 64
    if-lez v13, :cond_3

    .line 65
    .line 66
    if-lez v14, :cond_3

    .line 67
    .line 68
    if-ne v13, v15, :cond_0

    .line 69
    .line 70
    if-eq v14, v2, :cond_3

    .line 71
    .line 72
    :cond_0
    move-object v3, v0

    .line 73
    check-cast v3, Lhi7;

    .line 74
    .line 75
    iget-object v3, v3, Lhi7;->c:Lpd5;

    .line 76
    .line 77
    iget-object v6, v3, Lpd5;->c:Lpw6;

    .line 78
    .line 79
    invoke-static {v3, v5}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    move-object/from16 v18, v3

    .line 84
    .line 85
    check-cast v18, Lta7;

    .line 86
    .line 87
    move/from16 v16, v2

    .line 88
    .line 89
    move-object/from16 v17, v6

    .line 90
    .line 91
    invoke-static/range {v13 .. v18}, Lw79;->n(IIIILpw6;Lta7;)D

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    cmpg-double v5, v2, v19

    .line 96
    .line 97
    if-gez v5, :cond_1

    .line 98
    .line 99
    move v5, v12

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const/4 v5, 0x0

    .line 102
    :goto_0
    iput-boolean v5, v8, Laa6;->X:Z

    .line 103
    .line 104
    if-nez v5, :cond_2

    .line 105
    .line 106
    move-object v5, v0

    .line 107
    check-cast v5, Lhi7;

    .line 108
    .line 109
    iget-object v5, v5, Lhi7;->c:Lpd5;

    .line 110
    .line 111
    iget-object v5, v5, Lpd5;->d:Ltr5;

    .line 112
    .line 113
    if-ne v5, v4, :cond_3

    .line 114
    .line 115
    :cond_2
    int-to-double v4, v13

    .line 116
    mul-double/2addr v4, v2

    .line 117
    invoke-static {v4, v5}, Lnr4;->N(D)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    int-to-double v5, v14

    .line 122
    mul-double/2addr v2, v5

    .line 123
    invoke-static {v2, v3}, Lnr4;->N(D)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-virtual {v1, v4, v2}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V

    .line 128
    .line 129
    .line 130
    :cond_3
    check-cast v0, Lhi7;

    .line 131
    .line 132
    new-instance v2, Lei7;

    .line 133
    .line 134
    invoke-direct {v2, v0}, Lei7;-><init>(Lhi7;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2}, Landroid/graphics/ImageDecoder;->setOnPartialImageListener(Landroid/graphics/ImageDecoder$OnPartialImageListener;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, v0, Lhi7;->c:Lpd5;

    .line 141
    .line 142
    invoke-static {v0}, Lb73;->a(Lpd5;)Landroid/graphics/Bitmap$Config;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v2}, Lue3;->z(Landroid/graphics/Bitmap$Config;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_4

    .line 151
    .line 152
    const/4 v3, 0x3

    .line 153
    goto :goto_1

    .line 154
    :cond_4
    move v3, v12

    .line 155
    :goto_1
    invoke-virtual {v1, v3}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    .line 156
    .line 157
    .line 158
    sget-object v2, Lb73;->h:Lf4;

    .line 159
    .line 160
    invoke-static {v0, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    xor-int/2addr v2, v12

    .line 171
    invoke-virtual {v1, v2}, Landroid/graphics/ImageDecoder;->setMemorySizePolicy(I)V

    .line 172
    .line 173
    .line 174
    sget-object v2, Lb73;->c:Lf4;

    .line 175
    .line 176
    invoke-static {v0, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v3}, Lbt;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    if-eqz v3, :cond_5

    .line 185
    .line 186
    invoke-static {v0, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-static {v2}, Lbt;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v1, v2}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V

    .line 195
    .line 196
    .line 197
    :cond_5
    sget-object v2, Lb73;->d:Lf4;

    .line 198
    .line 199
    invoke-static {v0, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    xor-int/2addr v0, v12

    .line 210
    invoke-virtual {v1, v0}, Landroid/graphics/ImageDecoder;->setUnpremultipliedRequired(Z)V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :pswitch_0
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 215
    .line 216
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    move-object v2, v0

    .line 229
    check-cast v2, Lsj;

    .line 230
    .line 231
    iget-object v2, v2, Lsj;->b:Lpd5;

    .line 232
    .line 233
    iget-object v3, v2, Lpd5;->b:Lta7;

    .line 234
    .line 235
    iget-object v5, v2, Lpd5;->c:Lpw6;

    .line 236
    .line 237
    sget-object v6, Ly63;->b:Lf4;

    .line 238
    .line 239
    invoke-static {v2, v6}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    check-cast v2, Lta7;

    .line 244
    .line 245
    invoke-static {v13, v14, v3, v5, v2}, Lw79;->l(IILta7;Lpw6;Lta7;)J

    .line 246
    .line 247
    .line 248
    move-result-wide v2

    .line 249
    move-wide v15, v9

    .line 250
    shr-long v9, v2, v11

    .line 251
    .line 252
    long-to-int v5, v9

    .line 253
    and-long/2addr v2, v15

    .line 254
    long-to-int v2, v2

    .line 255
    if-lez v13, :cond_9

    .line 256
    .line 257
    if-lez v14, :cond_9

    .line 258
    .line 259
    if-ne v13, v5, :cond_6

    .line 260
    .line 261
    if-eq v14, v2, :cond_9

    .line 262
    .line 263
    :cond_6
    move-object v3, v0

    .line 264
    check-cast v3, Lsj;

    .line 265
    .line 266
    iget-object v3, v3, Lsj;->b:Lpd5;

    .line 267
    .line 268
    iget-object v7, v3, Lpd5;->c:Lpw6;

    .line 269
    .line 270
    invoke-static {v3, v6}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    move-object/from16 v18, v3

    .line 275
    .line 276
    check-cast v18, Lta7;

    .line 277
    .line 278
    move/from16 v16, v2

    .line 279
    .line 280
    move v15, v5

    .line 281
    move-object/from16 v17, v7

    .line 282
    .line 283
    invoke-static/range {v13 .. v18}, Lw79;->n(IIIILpw6;Lta7;)D

    .line 284
    .line 285
    .line 286
    move-result-wide v2

    .line 287
    cmpg-double v5, v2, v19

    .line 288
    .line 289
    if-gez v5, :cond_7

    .line 290
    .line 291
    move v5, v12

    .line 292
    goto :goto_2

    .line 293
    :cond_7
    const/4 v5, 0x0

    .line 294
    :goto_2
    iput-boolean v5, v8, Laa6;->X:Z

    .line 295
    .line 296
    if-nez v5, :cond_8

    .line 297
    .line 298
    move-object v5, v0

    .line 299
    check-cast v5, Lsj;

    .line 300
    .line 301
    iget-object v5, v5, Lsj;->b:Lpd5;

    .line 302
    .line 303
    iget-object v5, v5, Lpd5;->d:Ltr5;

    .line 304
    .line 305
    if-ne v5, v4, :cond_9

    .line 306
    .line 307
    :cond_8
    int-to-double v4, v13

    .line 308
    mul-double/2addr v4, v2

    .line 309
    invoke-static {v4, v5}, Lnr4;->N(D)I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    int-to-double v5, v14

    .line 314
    mul-double/2addr v2, v5

    .line 315
    invoke-static {v2, v3}, Lnr4;->N(D)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    invoke-virtual {v1, v4, v2}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V

    .line 320
    .line 321
    .line 322
    :cond_9
    check-cast v0, Lsj;

    .line 323
    .line 324
    iget-object v0, v0, Lsj;->b:Lpd5;

    .line 325
    .line 326
    invoke-static {v0}, Lb73;->a(Lpd5;)Landroid/graphics/Bitmap$Config;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-static {v2}, Lue3;->z(Landroid/graphics/Bitmap$Config;)Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    if-eqz v2, :cond_a

    .line 335
    .line 336
    const/4 v3, 0x3

    .line 337
    goto :goto_3

    .line 338
    :cond_a
    move v3, v12

    .line 339
    :goto_3
    invoke-virtual {v1, v3}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    .line 340
    .line 341
    .line 342
    sget-object v2, Lb73;->h:Lf4;

    .line 343
    .line 344
    invoke-static {v0, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    check-cast v2, Ljava/lang/Boolean;

    .line 349
    .line 350
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    xor-int/2addr v2, v12

    .line 355
    invoke-virtual {v1, v2}, Landroid/graphics/ImageDecoder;->setMemorySizePolicy(I)V

    .line 356
    .line 357
    .line 358
    sget-object v2, Lb73;->c:Lf4;

    .line 359
    .line 360
    invoke-static {v0, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-static {v3}, Lbt;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    if-eqz v3, :cond_b

    .line 369
    .line 370
    invoke-static {v0, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-static {v2}, Lbt;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {v1, v2}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V

    .line 379
    .line 380
    .line 381
    :cond_b
    sget-object v2, Lw63;->b:Lf4;

    .line 382
    .line 383
    invoke-static {v0, v2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    if-nez v0, :cond_c

    .line 388
    .line 389
    const/4 v0, 0x0

    .line 390
    invoke-virtual {v1, v0}, Landroid/graphics/ImageDecoder;->setPostProcessor(Landroid/graphics/PostProcessor;)V

    .line 391
    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_c
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 395
    .line 396
    .line 397
    :goto_4
    return-void

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
