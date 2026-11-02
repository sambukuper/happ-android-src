.class public final synthetic Lp5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lp5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lp5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lp5;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lp5;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lokhttp3/internal/http2/Http2Connection;

    .line 11
    .line 12
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lokhttp3/internal/http2/Http2Stream;

    .line 15
    .line 16
    invoke-static {v0, p0}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->f(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Stream;)Ldn8;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ln03;

    .line 24
    .line 25
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljx4;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ln03;->d(Ljx4;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Ldn8;->a:Ldn8;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lmw2;

    .line 38
    .line 39
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Low2;

    .line 42
    .line 43
    iget-object v0, v0, Lmw2;->c:Ldn2;

    .line 44
    .line 45
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Low2;->a:Lrh5;

    .line 49
    .line 50
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Ldn8;->a:Ldn8;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ldn2;

    .line 61
    .line 62
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Landroid/app/Activity;

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    if-eqz p0, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_3
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lkr2;

    .line 83
    .line 84
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Llr2;

    .line 87
    .line 88
    iget-object v1, v0, Lkr2;->u:Lf63;

    .line 89
    .line 90
    new-instance v2, Ljr2;

    .line 91
    .line 92
    invoke-direct {v2, p0, v0, v1}, Ljr2;-><init>(Llr2;Lkr2;Lf63;)V

    .line 93
    .line 94
    .line 95
    return-object v2

    .line 96
    :pswitch_4
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lea6;

    .line 99
    .line 100
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Lci2;

    .line 103
    .line 104
    sget-object v1, Lzn5;->a:Lox1;

    .line 105
    .line 106
    invoke-static {p0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iput-object p0, v0, Lea6;->X:Ljava/lang/Object;

    .line 111
    .line 112
    sget-object p0, Ldn8;->a:Ldn8;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_5
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Lea6;

    .line 118
    .line 119
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, Lai2;

    .line 122
    .line 123
    invoke-virtual {p0}, Lai2;->a1()Ljh2;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    iput-object p0, v0, Lea6;->X:Ljava/lang/Object;

    .line 128
    .line 129
    sget-object p0, Ldn8;->a:Ldn8;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_6
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Le72;

    .line 135
    .line 136
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, Ljava/lang/String;

    .line 139
    .line 140
    new-instance v2, Ljava/net/URL;

    .line 141
    .line 142
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2, v1}, Le72;->e(Ljava/net/URL;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :pswitch_7
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Lu22;

    .line 153
    .line 154
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, Ljava/lang/String;

    .line 157
    .line 158
    new-instance v1, Lk22;

    .line 159
    .line 160
    iget-object v0, v0, Lu22;->a:[Ljava/lang/Enum;

    .line 161
    .line 162
    array-length v3, v0

    .line 163
    invoke-direct {v1, p0, v3}, Lk22;-><init>(Ljava/lang/String;I)V

    .line 164
    .line 165
    .line 166
    array-length p0, v0

    .line 167
    move v3, v2

    .line 168
    :goto_1
    if-ge v3, p0, :cond_2

    .line 169
    .line 170
    aget-object v4, v0, v3

    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v1, v4, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 177
    .line 178
    .line 179
    add-int/lit8 v3, v3, 0x1

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_2
    return-object v1

    .line 183
    :pswitch_8
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Ln38;

    .line 186
    .line 187
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast p0, Lh30;

    .line 190
    .line 191
    iget-object v0, v0, Ln38;->d:Lgn2;

    .line 192
    .line 193
    invoke-interface {v0, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    sget-object p0, Ldn8;->a:Ldn8;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_9
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Lh38;

    .line 202
    .line 203
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p0, Ldn2;

    .line 206
    .line 207
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    check-cast p0, Ly24;

    .line 212
    .line 213
    invoke-interface {v0, p0}, Lh38;->j(Ly24;)J

    .line 214
    .line 215
    .line 216
    move-result-wide v0

    .line 217
    invoke-static {v0, v1}, Lnr4;->M(J)J

    .line 218
    .line 219
    .line 220
    move-result-wide v0

    .line 221
    new-instance p0, Lhf3;

    .line 222
    .line 223
    invoke-direct {p0, v0, v1}, Lhf3;-><init>(J)V

    .line 224
    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_a
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Lp01;

    .line 230
    .line 231
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 232
    .line 233
    iget-object v0, v0, Lp01;->X:Llp2;

    .line 234
    .line 235
    iget-object v3, v0, Llp2;->c:Lyb7;

    .line 236
    .line 237
    invoke-virtual {v3}, Lyb7;->c()Lxb7;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    move v5, v2

    .line 242
    :goto_2
    :try_start_0
    iget v6, v3, Lyb7;->Y:I

    .line 243
    .line 244
    if-ge v5, v6, :cond_c

    .line 245
    .line 246
    invoke-virtual {v4, v5}, Lxb7;->l(I)Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-eqz v6, :cond_6

    .line 251
    .line 252
    invoke-virtual {v4, v5}, Lxb7;->n(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    if-eq v6, p0, :cond_5

    .line 257
    .line 258
    instance-of v7, v6, Lpp2;

    .line 259
    .line 260
    if-eqz v7, :cond_3

    .line 261
    .line 262
    check-cast v6, Lpp2;

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_3
    move-object v6, v1

    .line 266
    :goto_3
    if-eqz v6, :cond_4

    .line 267
    .line 268
    iget-object v6, v6, Lpp2;->a:Lvc6;

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_4
    move-object v6, v1

    .line 272
    :goto_4
    if-ne v6, p0, :cond_6

    .line 273
    .line 274
    :cond_5
    new-instance p0, Li85;

    .line 275
    .line 276
    invoke-direct {p0, v5, v1}, Li85;-><init>(ILjava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4}, Lxb7;->c()V

    .line 280
    .line 281
    .line 282
    move-object v1, p0

    .line 283
    goto :goto_a

    .line 284
    :catchall_0
    move-exception p0

    .line 285
    goto/16 :goto_c

    .line 286
    .line 287
    :cond_6
    :try_start_1
    iget-object v6, v4, Lxb7;->b:[I

    .line 288
    .line 289
    invoke-static {v6, v5}, Lac7;->d([II)I

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    add-int/lit8 v8, v5, 0x1

    .line 294
    .line 295
    iget v9, v4, Lxb7;->c:I

    .line 296
    .line 297
    if-ge v8, v9, :cond_7

    .line 298
    .line 299
    mul-int/lit8 v9, v8, 0x5

    .line 300
    .line 301
    add-int/lit8 v9, v9, 0x4

    .line 302
    .line 303
    aget v6, v6, v9

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_7
    iget v6, v4, Lxb7;->e:I

    .line 307
    .line 308
    :goto_5
    sub-int/2addr v6, v7

    .line 309
    move v7, v2

    .line 310
    :goto_6
    if-ge v7, v6, :cond_d

    .line 311
    .line 312
    invoke-virtual {v4, v5, v7}, Lxb7;->h(II)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    if-eq v9, p0, :cond_b

    .line 317
    .line 318
    instance-of v10, v9, Lpp2;

    .line 319
    .line 320
    if-eqz v10, :cond_8

    .line 321
    .line 322
    check-cast v9, Lpp2;

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_8
    move-object v9, v1

    .line 326
    :goto_7
    if-eqz v9, :cond_9

    .line 327
    .line 328
    iget-object v9, v9, Lpp2;->a:Lvc6;

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_9
    move-object v9, v1

    .line 332
    :goto_8
    if-ne v9, p0, :cond_a

    .line 333
    .line 334
    goto :goto_9

    .line 335
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_b
    :goto_9
    new-instance v1, Li85;

    .line 339
    .line 340
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-direct {v1, v5, p0}, Li85;-><init>(ILjava/lang/Integer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 345
    .line 346
    .line 347
    :cond_c
    invoke-virtual {v4}, Lxb7;->c()V

    .line 348
    .line 349
    .line 350
    goto :goto_a

    .line 351
    :cond_d
    move v5, v8

    .line 352
    goto :goto_2

    .line 353
    :goto_a
    if-eqz v1, :cond_e

    .line 354
    .line 355
    iget p0, v1, Li85;->a:I

    .line 356
    .line 357
    iget-object v1, v1, Li85;->b:Ljava/lang/Integer;

    .line 358
    .line 359
    invoke-virtual {v3}, Lyb7;->c()Lxb7;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    :try_start_2
    invoke-static {v2, p0, v1}, Lnr4;->V(Lxb7;ILjava/lang/Integer;)Ljava/util/ArrayList;

    .line 364
    .line 365
    .line 366
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 367
    invoke-virtual {v2}, Lxb7;->c()V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Llp2;->D()Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-static {p0, v1}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    goto :goto_b

    .line 379
    :catchall_1
    move-exception p0

    .line 380
    invoke-virtual {v2}, Lxb7;->c()V

    .line 381
    .line 382
    .line 383
    throw p0

    .line 384
    :cond_e
    sget-object p0, Ld02;->X:Ld02;

    .line 385
    .line 386
    :goto_b
    new-instance v1, Lrz0;

    .line 387
    .line 388
    iget-boolean v0, v0, Llp2;->C:Z

    .line 389
    .line 390
    invoke-direct {v1, p0, v0}, Lrz0;-><init>(Ljava/util/List;Z)V

    .line 391
    .line 392
    .line 393
    return-object v1

    .line 394
    :goto_c
    invoke-virtual {v4}, Lxb7;->c()V

    .line 395
    .line 396
    .line 397
    throw p0

    .line 398
    :pswitch_b
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v0, Lv82;

    .line 401
    .line 402
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast p0, Lzu3;

    .line 405
    .line 406
    new-instance v1, Lqg5;

    .line 407
    .line 408
    invoke-direct {v1, v0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    return-object p0

    .line 416
    :pswitch_c
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v0, Lx39;

    .line 419
    .line 420
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast p0, Ljava/util/UUID;

    .line 423
    .line 424
    iget-object v1, v0, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    new-instance v2, Lsc;

    .line 430
    .line 431
    const/16 v3, 0xa

    .line 432
    .line 433
    invoke-direct {v2, v0, p0, v3}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v2}, Lql6;->o(Ljava/lang/Runnable;)V

    .line 437
    .line 438
    .line 439
    iget-object p0, v0, Lx39;->j0:Lxy0;

    .line 440
    .line 441
    iget-object v1, v0, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 442
    .line 443
    iget-object v0, v0, Lx39;->m0:Ljava/util/List;

    .line 444
    .line 445
    invoke-static {p0, v1, v0}, Lax6;->b(Lxy0;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 446
    .line 447
    .line 448
    sget-object p0, Ldn8;->a:Ldn8;

    .line 449
    .line 450
    return-object p0

    .line 451
    :pswitch_d
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 454
    .line 455
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast p0, Lmf0;

    .line 458
    .line 459
    invoke-virtual {v0, p0}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 460
    .line 461
    .line 462
    sget-object p0, Ldn8;->a:Ldn8;

    .line 463
    .line 464
    return-object p0

    .line 465
    :pswitch_e
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v0, Lnf0;

    .line 468
    .line 469
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast p0, Lmf0;

    .line 472
    .line 473
    iget-object v0, v0, Lnf0;->Z:Landroid/hardware/camera2/CameraManager;

    .line 474
    .line 475
    invoke-virtual {v0, p0}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 476
    .line 477
    .line 478
    sget-object p0, Ldn8;->a:Ldn8;

    .line 479
    .line 480
    return-object p0

    .line 481
    :pswitch_f
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 484
    .line 485
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast p0, Lse0;

    .line 488
    .line 489
    invoke-virtual {v0, p0}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 490
    .line 491
    .line 492
    sget-object p0, Ldn8;->a:Ldn8;

    .line 493
    .line 494
    return-object p0

    .line 495
    :pswitch_10
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v0, Lic0;

    .line 498
    .line 499
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast p0, Ljc0;

    .line 502
    .line 503
    iget-object v0, v0, Lic0;->s0:Lgn2;

    .line 504
    .line 505
    invoke-interface {v0, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    sget-object p0, Ldn8;->a:Ldn8;

    .line 509
    .line 510
    return-object p0

    .line 511
    :pswitch_11
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, Ldn2;

    .line 514
    .line 515
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast p0, Li55;

    .line 518
    .line 519
    if-eqz v0, :cond_10

    .line 520
    .line 521
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    check-cast v0, Ls86;

    .line 526
    .line 527
    if-nez v0, :cond_f

    .line 528
    .line 529
    goto :goto_d

    .line 530
    :cond_f
    move-object v1, v0

    .line 531
    goto :goto_f

    .line 532
    :cond_10
    :goto_d
    invoke-virtual {p0}, Li55;->V0()Ljx4;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    iget-boolean v0, v0, Ljx4;->p0:Z

    .line 537
    .line 538
    if-eqz v0, :cond_11

    .line 539
    .line 540
    goto :goto_e

    .line 541
    :cond_11
    move-object p0, v1

    .line 542
    :goto_e
    if-eqz p0, :cond_12

    .line 543
    .line 544
    iget-wide v0, p0, Leo5;->Z:J

    .line 545
    .line 546
    invoke-static {v0, v1}, Lu15;->R(J)J

    .line 547
    .line 548
    .line 549
    move-result-wide v0

    .line 550
    const-wide/16 v2, 0x0

    .line 551
    .line 552
    invoke-static {v2, v3, v0, v1}, Lu70;->n(JJ)Ls86;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    :cond_12
    :goto_f
    return-object v1

    .line 557
    :pswitch_12
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v0, Lb88;

    .line 560
    .line 561
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast p0, Lql;

    .line 564
    .line 565
    if-eqz v0, :cond_16

    .line 566
    .line 567
    iget-object v1, v0, Lb88;->c:Lvd7;

    .line 568
    .line 569
    invoke-virtual {v1}, Lvd7;->isEmpty()Z

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    iget-object v4, v0, Lb88;->b:Lql;

    .line 574
    .line 575
    if-eqz v3, :cond_13

    .line 576
    .line 577
    goto :goto_11

    .line 578
    :cond_13
    new-instance v3, Lw28;

    .line 579
    .line 580
    invoke-direct {v3, v4}, Lw28;-><init>(Lql;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1}, Lvd7;->size()I

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    :goto_10
    if-ge v2, v4, :cond_14

    .line 588
    .line 589
    invoke-virtual {v1, v2}, Lvd7;->get(I)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v5

    .line 593
    check-cast v5, Lgn2;

    .line 594
    .line 595
    invoke-interface {v5, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    add-int/lit8 v2, v2, 0x1

    .line 599
    .line 600
    goto :goto_10

    .line 601
    :cond_14
    iget-object v4, v3, Lw28;->b:Lql;

    .line 602
    .line 603
    :goto_11
    iput-object v4, v0, Lb88;->b:Lql;

    .line 604
    .line 605
    if-nez v4, :cond_15

    .line 606
    .line 607
    goto :goto_12

    .line 608
    :cond_15
    move-object p0, v4

    .line 609
    :cond_16
    :goto_12
    return-object p0

    .line 610
    :pswitch_13
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v0, Lt09;

    .line 613
    .line 614
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast p0, Llh7;

    .line 617
    .line 618
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object p0

    .line 622
    check-cast p0, Ljava/lang/Boolean;

    .line 623
    .line 624
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 625
    .line 626
    .line 627
    move-result p0

    .line 628
    if-eqz p0, :cond_17

    .line 629
    .line 630
    check-cast v0, Ly74;

    .line 631
    .line 632
    iget-object p0, v0, Ly74;->c:Lrh5;

    .line 633
    .line 634
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    check-cast p0, Ljava/lang/Boolean;

    .line 639
    .line 640
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 641
    .line 642
    .line 643
    move-result p0

    .line 644
    if-eqz p0, :cond_17

    .line 645
    .line 646
    const/4 v2, 0x1

    .line 647
    :cond_17
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 648
    .line 649
    .line 650
    move-result-object p0

    .line 651
    return-object p0

    .line 652
    :pswitch_14
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v0, Lq10;

    .line 655
    .line 656
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast p0, Lp10;

    .line 659
    .line 660
    iget-object v0, v0, Lq10;->a:Le31;

    .line 661
    .line 662
    iget-object v1, v0, Le31;->c:Ljava/lang/Object;

    .line 663
    .line 664
    monitor-enter v1

    .line 665
    :try_start_3
    iget-object v2, v0, Le31;->d:Ljava/util/LinkedHashSet;

    .line 666
    .line 667
    invoke-virtual {v2, p0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result p0

    .line 671
    if-eqz p0, :cond_18

    .line 672
    .line 673
    iget-object p0, v0, Le31;->d:Ljava/util/LinkedHashSet;

    .line 674
    .line 675
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 676
    .line 677
    .line 678
    move-result p0

    .line 679
    if-eqz p0, :cond_18

    .line 680
    .line 681
    invoke-virtual {v0}, Le31;->d()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 682
    .line 683
    .line 684
    goto :goto_13

    .line 685
    :catchall_2
    move-exception p0

    .line 686
    goto :goto_14

    .line 687
    :cond_18
    :goto_13
    monitor-exit v1

    .line 688
    sget-object p0, Ldn8;->a:Ldn8;

    .line 689
    .line 690
    return-object p0

    .line 691
    :goto_14
    monitor-exit v1

    .line 692
    throw p0

    .line 693
    :pswitch_15
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v0, Ly00;

    .line 696
    .line 697
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast p0, Lp34;

    .line 700
    .line 701
    iget-object v1, v0, Ly00;->t0:Lx67;

    .line 702
    .line 703
    iget-object v2, p0, Lp34;->X:Lum0;

    .line 704
    .line 705
    invoke-interface {v2}, Lsv1;->e()J

    .line 706
    .line 707
    .line 708
    move-result-wide v2

    .line 709
    invoke-virtual {p0}, Lp34;->getLayoutDirection()Lz24;

    .line 710
    .line 711
    .line 712
    move-result-object v4

    .line 713
    invoke-interface {v1, v2, v3, v4, p0}, Lx67;->a(JLz24;Lfi1;)Lmb6;

    .line 714
    .line 715
    .line 716
    move-result-object p0

    .line 717
    iput-object p0, v0, Ly00;->y0:Lmb6;

    .line 718
    .line 719
    sget-object p0, Ldn8;->a:Ldn8;

    .line 720
    .line 721
    return-object p0

    .line 722
    :pswitch_16
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v0, Lfz0;

    .line 725
    .line 726
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast p0, Ldn2;

    .line 729
    .line 730
    iput-object p0, v0, Lfz0;->c:Ldn2;

    .line 731
    .line 732
    sget-object p0, Ldn8;->a:Ldn8;

    .line 733
    .line 734
    return-object p0

    .line 735
    :pswitch_17
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 736
    .line 737
    check-cast v0, Lsj;

    .line 738
    .line 739
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast p0, Laa6;

    .line 742
    .line 743
    invoke-static {v0, p0}, Lsj;->b(Lsj;Laa6;)Landroid/graphics/drawable/Drawable;

    .line 744
    .line 745
    .line 746
    move-result-object p0

    .line 747
    return-object p0

    .line 748
    :pswitch_18
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v0, Ljp0;

    .line 751
    .line 752
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 753
    .line 754
    invoke-interface {v0, p0}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    sget-object p0, Ldn8;->a:Ldn8;

    .line 758
    .line 759
    return-object p0

    .line 760
    :pswitch_19
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v0, Lea6;

    .line 763
    .line 764
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast p0, Ldn2;

    .line 767
    .line 768
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object p0

    .line 772
    iput-object p0, v0, Lea6;->X:Ljava/lang/Object;

    .line 773
    .line 774
    sget-object p0, Ldn8;->a:Ldn8;

    .line 775
    .line 776
    return-object p0

    .line 777
    :pswitch_1a
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v0, Lwx6;

    .line 780
    .line 781
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast p0, Lgc;

    .line 784
    .line 785
    iget-object v1, v0, Lwx6;->g0:Ljx6;

    .line 786
    .line 787
    iget-object v2, v0, Lwx6;->h0:Ljx6;

    .line 788
    .line 789
    iget-object v3, v0, Lwx6;->Z:Ljava/lang/Float;

    .line 790
    .line 791
    iget-object v4, v0, Lwx6;->f0:Ljava/lang/Float;

    .line 792
    .line 793
    const/4 v5, 0x0

    .line 794
    if-eqz v1, :cond_19

    .line 795
    .line 796
    if-eqz v3, :cond_19

    .line 797
    .line 798
    iget-object v6, v1, Ljx6;->a:Ldn2;

    .line 799
    .line 800
    invoke-interface {v6}, Ldn2;->invoke()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v6

    .line 804
    check-cast v6, Ljava/lang/Number;

    .line 805
    .line 806
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 807
    .line 808
    .line 809
    move-result v6

    .line 810
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 811
    .line 812
    .line 813
    move-result v3

    .line 814
    sub-float/2addr v6, v3

    .line 815
    goto :goto_15

    .line 816
    :cond_19
    move v6, v5

    .line 817
    :goto_15
    if-eqz v2, :cond_1a

    .line 818
    .line 819
    if-eqz v4, :cond_1a

    .line 820
    .line 821
    iget-object v3, v2, Ljx6;->a:Ldn2;

    .line 822
    .line 823
    invoke-interface {v3}, Ldn2;->invoke()Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v3

    .line 827
    check-cast v3, Ljava/lang/Number;

    .line 828
    .line 829
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 830
    .line 831
    .line 832
    move-result v3

    .line 833
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 834
    .line 835
    .line 836
    move-result v4

    .line 837
    sub-float/2addr v3, v4

    .line 838
    goto :goto_16

    .line 839
    :cond_1a
    move v3, v5

    .line 840
    :goto_16
    cmpg-float v4, v6, v5

    .line 841
    .line 842
    if-nez v4, :cond_1b

    .line 843
    .line 844
    cmpg-float v3, v3, v5

    .line 845
    .line 846
    if-nez v3, :cond_1b

    .line 847
    .line 848
    goto :goto_17

    .line 849
    :cond_1b
    iget v3, v0, Lwx6;->X:I

    .line 850
    .line 851
    invoke-virtual {p0, v3}, Lgc;->A(I)I

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    invoke-virtual {p0}, Lgc;->s()Lff3;

    .line 856
    .line 857
    .line 858
    move-result-object v4

    .line 859
    iget v5, p0, Lgc;->m0:I

    .line 860
    .line 861
    invoke-virtual {v4, v5}, Lff3;->b(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    check-cast v4, La17;

    .line 866
    .line 867
    if-eqz v4, :cond_1c

    .line 868
    .line 869
    :try_start_4
    iget-object v5, p0, Lgc;->o0:Lh4;

    .line 870
    .line 871
    if-eqz v5, :cond_1c

    .line 872
    .line 873
    invoke-virtual {p0, v4}, Lgc;->k(La17;)Landroid/graphics/Rect;

    .line 874
    .line 875
    .line 876
    move-result-object v4

    .line 877
    invoke-virtual {v5, v4}, Lh4;->l(Landroid/graphics/Rect;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    .line 878
    .line 879
    .line 880
    :catch_0
    :cond_1c
    invoke-virtual {p0}, Lgc;->s()Lff3;

    .line 881
    .line 882
    .line 883
    move-result-object v4

    .line 884
    iget v5, p0, Lgc;->n0:I

    .line 885
    .line 886
    invoke-virtual {v4, v5}, Lff3;->b(I)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    check-cast v4, La17;

    .line 891
    .line 892
    if-eqz v4, :cond_1d

    .line 893
    .line 894
    :try_start_5
    iget-object v5, p0, Lgc;->p0:Lh4;

    .line 895
    .line 896
    if-eqz v5, :cond_1d

    .line 897
    .line 898
    invoke-virtual {p0, v4}, Lgc;->k(La17;)Landroid/graphics/Rect;

    .line 899
    .line 900
    .line 901
    move-result-object v4

    .line 902
    invoke-virtual {v5, v4}, Lh4;->l(Landroid/graphics/Rect;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_1

    .line 903
    .line 904
    .line 905
    :catch_1
    :cond_1d
    iget-object v4, p0, Lgc;->f0:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 906
    .line 907
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 908
    .line 909
    .line 910
    invoke-virtual {p0}, Lgc;->s()Lff3;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    invoke-virtual {v4, v3}, Lff3;->b(I)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v4

    .line 918
    check-cast v4, La17;

    .line 919
    .line 920
    if-eqz v4, :cond_20

    .line 921
    .line 922
    iget-object v4, v4, La17;->a:Ly07;

    .line 923
    .line 924
    if-eqz v4, :cond_20

    .line 925
    .line 926
    iget-object v4, v4, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 927
    .line 928
    if-eqz v4, :cond_20

    .line 929
    .line 930
    if-eqz v1, :cond_1e

    .line 931
    .line 932
    iget-object v5, p0, Lgc;->r0:Lvz4;

    .line 933
    .line 934
    invoke-virtual {v5, v3, v1}, Lvz4;->h(ILjava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    :cond_1e
    if-eqz v2, :cond_1f

    .line 938
    .line 939
    iget-object v5, p0, Lgc;->s0:Lvz4;

    .line 940
    .line 941
    invoke-virtual {v5, v3, v2}, Lvz4;->h(ILjava/lang/Object;)V

    .line 942
    .line 943
    .line 944
    :cond_1f
    invoke-virtual {p0, v4}, Lgc;->w(Landroidx/compose/ui/node/LayoutNode;)V

    .line 945
    .line 946
    .line 947
    :cond_20
    :goto_17
    if-eqz v1, :cond_21

    .line 948
    .line 949
    iget-object p0, v1, Ljx6;->a:Ldn2;

    .line 950
    .line 951
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object p0

    .line 955
    check-cast p0, Ljava/lang/Float;

    .line 956
    .line 957
    iput-object p0, v0, Lwx6;->Z:Ljava/lang/Float;

    .line 958
    .line 959
    :cond_21
    if-eqz v2, :cond_22

    .line 960
    .line 961
    iget-object p0, v2, Ljx6;->a:Ldn2;

    .line 962
    .line 963
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object p0

    .line 967
    check-cast p0, Ljava/lang/Float;

    .line 968
    .line 969
    iput-object p0, v0, Lwx6;->f0:Ljava/lang/Float;

    .line 970
    .line 971
    :cond_22
    sget-object p0, Ldn8;->a:Ldn8;

    .line 972
    .line 973
    return-object p0

    .line 974
    :pswitch_1b
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 977
    .line 978
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast p0, Landroid/view/KeyEvent;

    .line 981
    .line 982
    invoke-static {v0, p0}, Landroidx/compose/ui/platform/AndroidComposeView;->f(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/KeyEvent;)Z

    .line 983
    .line 984
    .line 985
    move-result p0

    .line 986
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 987
    .line 988
    .line 989
    move-result-object p0

    .line 990
    return-object p0

    .line 991
    :pswitch_1c
    iget-object v0, p0, Lp5;->Y:Ljava/lang/Object;

    .line 992
    .line 993
    check-cast v0, Lvj2;

    .line 994
    .line 995
    iget-object p0, p0, Lp5;->Z:Ljava/lang/Object;

    .line 996
    .line 997
    check-cast p0, Ls5;

    .line 998
    .line 999
    invoke-virtual {v0, p0}, Lvj2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1003
    .line 1004
    return-object p0

    .line 1005
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
