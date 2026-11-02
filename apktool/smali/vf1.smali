.class public final Lvf1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lvf1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lvf1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvf1;->a:Lvf1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lma7;Llp2;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    iget v1, v0, Lma7;->g:F

    .line 6
    .line 7
    const v2, 0x7f677649

    .line 8
    .line 9
    .line 10
    invoke-virtual {v5, v2}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v5, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v9, 0x4

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move v2, v9

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v8

    .line 24
    :goto_0
    or-int v10, p3, v2

    .line 25
    .line 26
    and-int/lit8 v2, v10, 0x3

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    if-eq v2, v8, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v11

    .line 34
    :goto_1
    and-int/lit8 v3, v10, 0x1

    .line 35
    .line 36
    invoke-virtual {v5, v3, v2}, Llp2;->N(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_10

    .line 41
    .line 42
    iget-object v13, v0, Lma7;->i:Lkc8;

    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_f

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const v2, 0x7fffffff

    .line 55
    .line 56
    .line 57
    and-int/2addr v1, v2

    .line 58
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 59
    .line 60
    if-ge v1, v2, :cond_f

    .line 61
    .line 62
    invoke-virtual {v5, v13}, Llp2;->f(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-virtual {v5, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    or-int/2addr v1, v2

    .line 72
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v14, Lzz0;->a:Lbe;

    .line 77
    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    if-ne v2, v14, :cond_3

    .line 81
    .line 82
    :cond_2
    new-instance v1, Lf3;

    .line 83
    .line 84
    const/16 v2, 0x9

    .line 85
    .line 86
    invoke-direct {v1, v0, v2}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Lrd7;->b(Ldn2;)Lzi1;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v5, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    check-cast v2, Llh7;

    .line 97
    .line 98
    invoke-interface {v2}, Llh7;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ldw0;

    .line 103
    .line 104
    iget-wide v1, v1, Ldw0;->a:J

    .line 105
    .line 106
    sget-object v3, Lly4;->Z:Lly4;

    .line 107
    .line 108
    invoke-static {v3, v5}, Lw39;->q0(Lly4;Llp2;)Lwf7;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const/4 v6, 0x0

    .line 113
    const/16 v7, 0xc

    .line 114
    .line 115
    const/4 v4, 0x0

    .line 116
    invoke-static/range {v1 .. v7}, Loa7;->a(JLwf7;Ljava/lang/String;Llp2;II)Llh7;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    new-instance v2, Lsb;

    .line 121
    .line 122
    invoke-direct {v2, v0, v8}, Lsb;-><init>(Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    const v3, -0x62e0c0ee

    .line 126
    .line 127
    .line 128
    invoke-static {v3, v2, v5}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 129
    .line 130
    .line 131
    move-result-object v16

    .line 132
    const v2, 0x292236d1

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, v2}, Llp2;->W(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v11}, Llp2;->p(Z)V

    .line 139
    .line 140
    .line 141
    iget-object v2, v0, Lma7;->a:Lkx4;

    .line 142
    .line 143
    sget-object v3, Lhx4;->X:Lhx4;

    .line 144
    .line 145
    invoke-interface {v2, v3}, Lkx4;->y(Lkx4;)Lkx4;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v5, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    if-nez v4, :cond_4

    .line 158
    .line 159
    if-ne v6, v14, :cond_5

    .line 160
    .line 161
    :cond_4
    new-instance v6, Lsf1;

    .line 162
    .line 163
    invoke-direct {v6, v1, v11}, Lsf1;-><init>(Llh7;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_5
    check-cast v6, Lgn2;

    .line 170
    .line 171
    invoke-static {v2, v6}, Lw79;->r(Lkx4;Lgn2;)Lkx4;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    if-ne v2, v14, :cond_6

    .line 180
    .line 181
    new-instance v2, Lh80;

    .line 182
    .line 183
    const/16 v4, 0xb

    .line 184
    .line 185
    invoke-direct {v2, v4}, Lh80;-><init>(B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_6
    check-cast v2, Lgn2;

    .line 192
    .line 193
    invoke-static {v1, v11, v2}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    if-ne v2, v14, :cond_7

    .line 202
    .line 203
    sget-object v2, Luf1;->b:Luf1;

    .line 204
    .line 205
    invoke-virtual {v5, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_7
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 209
    .line 210
    sget-object v4, Ldn8;->a:Ldn8;

    .line 211
    .line 212
    invoke-static {v1, v4, v2}, Lyy7;->a(Lkx4;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lkx4;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    sget-object v2, Lpz2;->Z:Lp50;

    .line 217
    .line 218
    invoke-static {v2, v11}, Lg80;->c(Lp50;Z)Lxr4;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-static {v5}, Lkm4;->I(Llp2;)I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    invoke-virtual {v5}, Llp2;->l()Lkl5;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    invoke-static {v5, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    sget-object v7, Luz0;->j:Lpz2;

    .line 235
    .line 236
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5}, Llp2;->Z()V

    .line 240
    .line 241
    .line 242
    iget-boolean v7, v5, Llp2;->S:Z

    .line 243
    .line 244
    if-eqz v7, :cond_8

    .line 245
    .line 246
    invoke-virtual {v5}, Llp2;->k()V

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_8
    invoke-virtual {v5}, Llp2;->j0()V

    .line 251
    .line 252
    .line 253
    :goto_2
    sget-object v7, Lpz2;->B0:Ldx0;

    .line 254
    .line 255
    invoke-static {v7, v5, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 259
    .line 260
    invoke-static {v2, v5, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 264
    .line 265
    iget-boolean v6, v5, Llp2;->S:Z

    .line 266
    .line 267
    if-nez v6, :cond_9

    .line 268
    .line 269
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-nez v6, :cond_a

    .line 282
    .line 283
    :cond_9
    invoke-static {v4, v5, v4, v2}, Lp61;->v(ILlp2;ILdx0;)V

    .line 284
    .line 285
    .line 286
    :cond_a
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 287
    .line 288
    invoke-static {v2, v5, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iget-object v1, v0, Lma7;->h:Lv09;

    .line 292
    .line 293
    invoke-static {v3, v1}, Lz51;->Y(Lkx4;Lv09;)Lkx4;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-static {v1}, Lw39;->l(Lkx4;)Lkx4;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    sget-object v2, Lzo;->a:Lox1;

    .line 302
    .line 303
    and-int/lit8 v2, v10, 0xe

    .line 304
    .line 305
    if-ne v2, v9, :cond_b

    .line 306
    .line 307
    const/4 v11, 0x1

    .line 308
    :cond_b
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    if-nez v11, :cond_c

    .line 313
    .line 314
    if-ne v2, v14, :cond_d

    .line 315
    .line 316
    :cond_c
    new-instance v2, Ltf1;

    .line 317
    .line 318
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v5, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_d
    check-cast v2, Lre2;

    .line 325
    .line 326
    iget-wide v3, v13, Lkc8;->c:J

    .line 327
    .line 328
    iget-wide v6, v13, Lkc8;->d:J

    .line 329
    .line 330
    iget-wide v9, v13, Lkc8;->e:J

    .line 331
    .line 332
    iget-wide v12, v13, Lkc8;->f:J

    .line 333
    .line 334
    iget-object v11, v0, Lma7;->b:Lzy0;

    .line 335
    .line 336
    move-wide/from16 v17, v6

    .line 337
    .line 338
    move-wide v7, v12

    .line 339
    const/4 v6, 0x1

    .line 340
    iget-object v12, v0, Lma7;->c:Lo88;

    .line 341
    .line 342
    iget-object v13, v0, Lma7;->d:Lo88;

    .line 343
    .line 344
    iget-object v15, v0, Lma7;->e:Lzy0;

    .line 345
    .line 346
    iget v6, v0, Lma7;->g:F

    .line 347
    .line 348
    move-object/from16 v20, v1

    .line 349
    .line 350
    invoke-virtual {v5}, Llp2;->K()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    if-ne v1, v14, :cond_e

    .line 355
    .line 356
    new-instance v1, Lw01;

    .line 357
    .line 358
    const/16 v14, 0xc

    .line 359
    .line 360
    invoke-direct {v1, v14}, Lw01;-><init>(B)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_e
    move-object v14, v1

    .line 367
    check-cast v14, Ldn2;

    .line 368
    .line 369
    const/4 v1, 0x1

    .line 370
    const/16 v19, 0x0

    .line 371
    .line 372
    move v0, v1

    .line 373
    move-object/from16 v1, v20

    .line 374
    .line 375
    move-wide/from16 v21, v17

    .line 376
    .line 377
    move-object/from16 v18, v5

    .line 378
    .line 379
    move/from16 v17, v6

    .line 380
    .line 381
    move-wide/from16 v5, v21

    .line 382
    .line 383
    invoke-static/range {v1 .. v19}, Lzo;->c(Lkx4;Lre2;JJJJLzy0;Lo88;Lo88;Ldn2;Lzy0;Lzy0;FLlp2;I)V

    .line 384
    .line 385
    .line 386
    move-object/from16 v5, v18

    .line 387
    .line 388
    invoke-virtual {v5, v0}, Llp2;->p(Z)V

    .line 389
    .line 390
    .line 391
    goto :goto_3

    .line 392
    :cond_f
    const-string v0, "The expandedHeight is expected to be specified and finite"

    .line 393
    .line 394
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :cond_10
    invoke-virtual {v5}, Llp2;->Q()V

    .line 399
    .line 400
    .line 401
    :goto_3
    invoke-virtual {v5}, Llp2;->r()Lj86;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    if-eqz v0, :cond_11

    .line 406
    .line 407
    new-instance v1, Li9;

    .line 408
    .line 409
    const/4 v2, 0x6

    .line 410
    move-object/from16 v3, p0

    .line 411
    .line 412
    move-object/from16 v4, p1

    .line 413
    .line 414
    move/from16 v5, p3

    .line 415
    .line 416
    invoke-direct {v1, v2, v5, v3, v4}, Li9;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    iput-object v1, v0, Lj86;->d:Lrn2;

    .line 420
    .line 421
    :cond_11
    return-void
.end method
