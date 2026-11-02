.class public final synthetic Lbw2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Loi;

.field public final synthetic Y:Ly05;

.field public final synthetic Z:Ly05;

.field public final synthetic f0:Z

.field public final synthetic g0:Ldn2;

.field public final synthetic h0:Z

.field public final synthetic i0:Lzy0;


# direct methods
.method public synthetic constructor <init>(Loi;Ly05;Ly05;ZLdn2;ZLzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbw2;->X:Loi;

    .line 5
    .line 6
    iput-object p2, p0, Lbw2;->Y:Ly05;

    .line 7
    .line 8
    iput-object p3, p0, Lbw2;->Z:Ly05;

    .line 9
    .line 10
    iput-boolean p4, p0, Lbw2;->f0:Z

    .line 11
    .line 12
    iput-object p5, p0, Lbw2;->g0:Ldn2;

    .line 13
    .line 14
    iput-boolean p6, p0, Lbw2;->h0:Z

    .line 15
    .line 16
    iput-object p7, p0, Lbw2;->i0:Lzy0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v12, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    move p2, v12

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v1

    .line 20
    :goto_0
    and-int/2addr p1, v12

    .line 21
    invoke-virtual {v9, p1, p2}, Llp2;->N(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_f

    .line 26
    .line 27
    sget-object p1, Lpc;->f:Lox1;

    .line 28
    .line 29
    invoke-virtual {v9, p1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast p1, Lno1;

    .line 43
    .line 44
    invoke-interface {p1}, Lno1;->getWindow()Landroid/view/Window;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    sget-object p2, Ly01;->q:Lox1;

    .line 49
    .line 50
    invoke-virtual {v9, p2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    move-object v3, p2

    .line 55
    check-cast v3, Lbe7;

    .line 56
    .line 57
    sget-object p2, Ly01;->h:Lox1;

    .line 58
    .line 59
    invoke-virtual {v9, p2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    check-cast p2, Lfi1;

    .line 64
    .line 65
    sget-object p2, Lpc;->a:Lox1;

    .line 66
    .line 67
    invoke-virtual {v9, p2}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, Landroid/content/res/Configuration;

    .line 72
    .line 73
    sget-object v0, Lc29;->w:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-static {v9}, Lhw7;->b(Llp2;)Lc29;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v0, v0, Lc29;->c:Lhi;

    .line 80
    .line 81
    iget-object v0, v0, Lhi;->d:Lrh5;

    .line 82
    .line 83
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    const v0, 0x654515ec

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9, v0}, Llp2;->W(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v9}, Lhw7;->b(Llp2;)Lc29;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, Lc29;->c:Lhi;

    .line 106
    .line 107
    invoke-virtual {v0}, Lhi;->e()Lfe3;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget v0, v0, Lfe3;->d:I

    .line 112
    .line 113
    if-nez v0, :cond_1

    .line 114
    .line 115
    move v0, v12

    .line 116
    goto :goto_1

    .line 117
    :cond_1
    move v0, v1

    .line 118
    :goto_1
    invoke-virtual {v9, v1}, Llp2;->p(Z)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    const v0, 0x435dac69

    .line 123
    .line 124
    .line 125
    invoke-virtual {v9, v0}, Llp2;->W(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v9, v1}, Llp2;->p(Z)V

    .line 129
    .line 130
    .line 131
    move v0, v1

    .line 132
    :goto_2
    if-eqz v0, :cond_3

    .line 133
    .line 134
    iget p2, p2, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 135
    .line 136
    int-to-float p2, p2

    .line 137
    const/high16 v0, 0x40000000    # 2.0f

    .line 138
    .line 139
    div-float/2addr p2, v0

    .line 140
    goto :goto_3

    .line 141
    :cond_3
    const/4 p2, 0x0

    .line 142
    :goto_3
    iget-object v5, p0, Lbw2;->Z:Ly05;

    .line 143
    .line 144
    invoke-interface {v5}, Llh7;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    iget-object v4, p0, Lbw2;->X:Loi;

    .line 158
    .line 159
    invoke-virtual {v9, v4}, Llp2;->h(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    or-int/2addr v2, v6

    .line 164
    iget-object v6, p0, Lbw2;->Y:Ly05;

    .line 165
    .line 166
    invoke-virtual {v9, v6}, Llp2;->f(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    or-int/2addr v2, v7

    .line 171
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    sget-object v10, Lzz0;->a:Lbe;

    .line 176
    .line 177
    if-nez v2, :cond_4

    .line 178
    .line 179
    if-ne v7, v10, :cond_5

    .line 180
    .line 181
    :cond_4
    new-instance v2, Lwu1;

    .line 182
    .line 183
    const/4 v7, 0x0

    .line 184
    const/4 v8, 0x2

    .line 185
    invoke-direct/range {v2 .. v8}, Lwu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    move-object v7, v2

    .line 192
    :cond_5
    check-cast v7, Lrn2;

    .line 193
    .line 194
    invoke-static {v7, v9, v0}, Lu70;->h(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    if-nez v0, :cond_6

    .line 206
    .line 207
    if-ne v2, v10, :cond_7

    .line 208
    .line 209
    :cond_6
    new-instance v2, Ltb2;

    .line 210
    .line 211
    const/4 v0, 0x5

    .line 212
    invoke-direct {v2, p1, v0}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_7
    check-cast v2, Ldn2;

    .line 219
    .line 220
    invoke-static {v2, v9}, Lu70;->q(Ldn2;Llp2;)V

    .line 221
    .line 222
    .line 223
    sget-object p1, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 224
    .line 225
    sget-object v0, Lz91;->c:Lut8;

    .line 226
    .line 227
    invoke-static {p1, v0}, Lz91;->T(Lkx4;Lgn2;)Lkx4;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    sget-object v0, Lpz2;->l0:Lp50;

    .line 232
    .line 233
    invoke-static {v0, v1}, Lg80;->c(Lp50;Z)Lxr4;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget-wide v2, v9, Llp2;->T:J

    .line 238
    .line 239
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    invoke-virtual {v9}, Llp2;->l()Lkl5;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-static {v9, p1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    sget-object v5, Luz0;->j:Lpz2;

    .line 252
    .line 253
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v9}, Llp2;->Z()V

    .line 257
    .line 258
    .line 259
    iget-boolean v5, v9, Llp2;->S:Z

    .line 260
    .line 261
    if-eqz v5, :cond_8

    .line 262
    .line 263
    invoke-virtual {v9}, Llp2;->k()V

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_8
    invoke-virtual {v9}, Llp2;->j0()V

    .line 268
    .line 269
    .line 270
    :goto_4
    sget-object v5, Lpz2;->B0:Ldx0;

    .line 271
    .line 272
    invoke-static {v5, v9, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    sget-object v0, Lpz2;->A0:Ldx0;

    .line 276
    .line 277
    invoke-static {v0, v9, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 285
    .line 286
    invoke-static {v2, v9, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v9}, Lpn7;->l(Llp2;)V

    .line 290
    .line 291
    .line 292
    sget-object v0, Lpz2;->z0:Ldx0;

    .line 293
    .line 294
    invoke-static {v0, v9, p1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    new-instance p1, Ld80;

    .line 298
    .line 299
    sget-object v0, Lpz2;->i0:Lp50;

    .line 300
    .line 301
    invoke-direct {p1, v0, v12}, Ld80;-><init>(Lp50;Z)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v9, v4}, Llp2;->h(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    if-nez v0, :cond_9

    .line 313
    .line 314
    if-ne v2, v10, :cond_a

    .line 315
    .line 316
    :cond_9
    new-instance v2, Lvv2;

    .line 317
    .line 318
    invoke-direct {v2, v4, v1}, Lvv2;-><init>(Loi;B)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_a
    check-cast v2, Lgn2;

    .line 325
    .line 326
    invoke-static {p1, v2}, Ljm4;->I(Lkx4;Lgn2;)Lkx4;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    sget v0, Ln70;->a:F

    .line 331
    .line 332
    sget-object v0, Lch3;->e:Ljw0;

    .line 333
    .line 334
    invoke-static {v0, v9}, Lkw0;->c(Ljw0;Llp2;)J

    .line 335
    .line 336
    .line 337
    move-result-wide v2

    .line 338
    const v0, 0x3ea3d70a    # 0.32f

    .line 339
    .line 340
    .line 341
    invoke-static {v0, v2, v3}, Ldw0;->b(FJ)J

    .line 342
    .line 343
    .line 344
    move-result-wide v2

    .line 345
    sget-object v0, Lu70;->e:Lx03;

    .line 346
    .line 347
    invoke-static {p1, v2, v3, v0}, Lu15;->f(Lkx4;JLx67;)Lkx4;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    iget-boolean v0, p0, Lbw2;->f0:Z

    .line 352
    .line 353
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v9, v0}, Llp2;->g(Z)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    iget-object v6, p0, Lbw2;->g0:Ldn2;

    .line 366
    .line 367
    if-nez v3, :cond_b

    .line 368
    .line 369
    if-ne v5, v10, :cond_c

    .line 370
    .line 371
    :cond_b
    new-instance v5, Lew2;

    .line 372
    .line 373
    invoke-direct {v5, v6, v0}, Lew2;-><init>(Ldn2;Z)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v9, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_c
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 380
    .line 381
    invoke-static {p1, v2, v5}, Lyy7;->a(Lkx4;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lkx4;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-static {p1, v9, v1}, Lg80;->a(Lkx4;Llp2;I)V

    .line 386
    .line 387
    .line 388
    sget-object p1, Lnr4;->J:Ld77;

    .line 389
    .line 390
    invoke-static {p1, v9}, Lq77;->b(Ld77;Llp2;)Lx67;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    sget-object p1, Lep;->z:Lox1;

    .line 395
    .line 396
    invoke-virtual {v9, p1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    check-cast p1, Ldp;

    .line 401
    .line 402
    iget-object p1, p1, Ldp;->b:Luo;

    .line 403
    .line 404
    iget-wide v2, p1, Luo;->b:J

    .line 405
    .line 406
    sget p1, Ln70;->a:F

    .line 407
    .line 408
    sget-object v0, Lhx4;->X:Lhx4;

    .line 409
    .line 410
    invoke-static {v0, p1, v12}, Landroidx/compose/foundation/layout/b;->l(Lkx4;FI)Lkx4;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 415
    .line 416
    invoke-interface {p1, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    invoke-virtual {v9, v4}, Llp2;->h(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    invoke-virtual {v9}, Llp2;->K()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    if-nez v0, :cond_d

    .line 429
    .line 430
    if-ne v5, v10, :cond_e

    .line 431
    .line 432
    :cond_d
    new-instance v5, Lvv2;

    .line 433
    .line 434
    invoke-direct {v5, v4, v12}, Lvv2;-><init>(Loi;B)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v9, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    :cond_e
    check-cast v5, Lgn2;

    .line 441
    .line 442
    invoke-static {p1, v5}, Ljm4;->I(Lkx4;Lgn2;)Lkx4;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    new-instance p1, Lwv2;

    .line 447
    .line 448
    iget-boolean v4, p0, Lbw2;->h0:Z

    .line 449
    .line 450
    iget-object p0, p0, Lbw2;->i0:Lzy0;

    .line 451
    .line 452
    invoke-direct {p1, p2, v4, p0, v6}, Lwv2;-><init>(FZLzy0;Ldn2;)V

    .line 453
    .line 454
    .line 455
    const p0, -0x389c4d3b

    .line 456
    .line 457
    .line 458
    invoke-static {p0, p1, v9}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    const/high16 v10, 0xc00000

    .line 463
    .line 464
    const/16 v11, 0x78

    .line 465
    .line 466
    const-wide/16 v4, 0x0

    .line 467
    .line 468
    const/4 v6, 0x0

    .line 469
    const/4 v7, 0x0

    .line 470
    invoke-static/range {v0 .. v11}, Lay7;->a(Lkx4;Lx67;JJFFLzy0;Llp2;II)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v9, v12}, Llp2;->p(Z)V

    .line 474
    .line 475
    .line 476
    goto :goto_5

    .line 477
    :cond_f
    invoke-virtual {v9}, Llp2;->Q()V

    .line 478
    .line 479
    .line 480
    :goto_5
    sget-object p0, Ldn8;->a:Ldn8;

    .line 481
    .line 482
    return-object p0
.end method
