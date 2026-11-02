.class public final synthetic Lgq6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lgq6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 11
    iput-byte p4, p0, Lgq6;->X:B

    iput-object p2, p0, Lgq6;->Y:Ljava/lang/Object;

    iput-object p3, p0, Lgq6;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lgq6;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide v2, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lp49;

    .line 21
    .line 22
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lo49;

    .line 25
    .line 26
    check-cast p1, Lqr6;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lp49;->b:Loi1;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p0}, Lz91;->H(Lqr6;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Ldn8;->a:Ldn8;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ln49;

    .line 42
    .line 43
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ll49;

    .line 46
    .line 47
    check-cast p1, Lqr6;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Ln49;->b:Loi1;

    .line 53
    .line 54
    invoke-virtual {v0, p1, p0}, Lz91;->H(Lqr6;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Ldn8;->a:Ldn8;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_1
    const-string v0, "UPDATE workspec SET output=? WHERE id=?"

    .line 61
    .line 62
    iget-object v1, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lu91;

    .line 65
    .line 66
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Ljava/lang/String;

    .line 69
    .line 70
    check-cast p1, Lqr6;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v0}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :try_start_0
    sget-object v0, Lu91;->b:Lu91;

    .line 80
    .line 81
    invoke-static {v1}, Lwl7;->c0(Lu91;)[B

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {p1, v8, v0}, Lxr6;->j(I[B)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v6, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1}, Lxr6;->S0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 95
    .line 96
    .line 97
    sget-object p0, Ldn8;->a:Ldn8;

    .line 98
    .line 99
    return-object p0

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    move-object p0, v0

    .line 102
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 103
    .line 104
    .line 105
    throw p0

    .line 106
    :pswitch_2
    const-string v0, "UPDATE workspec SET state=? WHERE id=?"

    .line 107
    .line 108
    iget-object v1, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lu39;

    .line 111
    .line 112
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Ljava/lang/String;

    .line 115
    .line 116
    check-cast p1, Lqr6;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, v0}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    :try_start_1
    invoke-static {v1}, La28;->u(Lu39;)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    int-to-long v0, v0

    .line 130
    invoke-interface {v2, v8, v0, v1}, Lxr6;->i(IJ)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v2, v6, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Los4;->r(Lqr6;)I

    .line 140
    .line 141
    .line 142
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 143
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 144
    .line 145
    .line 146
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :catchall_1
    move-exception v0

    .line 152
    move-object p0, v0

    .line 153
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 154
    .line 155
    .line 156
    throw p0

    .line 157
    :pswitch_3
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ld49;

    .line 160
    .line 161
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p0, Lc49;

    .line 164
    .line 165
    check-cast p1, Lqr6;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v0, v0, Ld49;->b:Loi1;

    .line 171
    .line 172
    invoke-virtual {v0, p1, p0}, Lz91;->H(Lqr6;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    sget-object p0, Ldn8;->a:Ldn8;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_4
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lb49;

    .line 181
    .line 182
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p0, La49;

    .line 185
    .line 186
    check-cast p1, Lqr6;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    iget-object v0, v0, Lb49;->b:Loi1;

    .line 192
    .line 193
    invoke-virtual {v0, p1, p0}, Lz91;->H(Lqr6;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    sget-object p0, Ldn8;->a:Ldn8;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_5
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Lc29;

    .line 202
    .line 203
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p0, Landroid/view/View;

    .line 206
    .line 207
    check-cast p1, Leq1;

    .line 208
    .line 209
    invoke-virtual {v0, p0}, Lc29;->a(Landroid/view/View;)V

    .line 210
    .line 211
    .line 212
    new-instance p1, Lp00;

    .line 213
    .line 214
    const/16 v1, 0x8

    .line 215
    .line 216
    invoke-direct {p1, v0, p0, v1}, Lp00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    return-object p1

    .line 220
    :pswitch_6
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, Llr8;

    .line 223
    .line 224
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p0, Lrm3;

    .line 227
    .line 228
    check-cast p1, Ljava/lang/Throwable;

    .line 229
    .line 230
    iget-object p1, v0, Llr8;->k:Ljava/lang/Object;

    .line 231
    .line 232
    monitor-enter p1

    .line 233
    :try_start_2
    iget-object v0, v0, Llr8;->w:Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 236
    .line 237
    .line 238
    monitor-exit p1

    .line 239
    sget-object p0, Ldn8;->a:Ldn8;

    .line 240
    .line 241
    return-object p0

    .line 242
    :catchall_2
    move-exception v0

    .line 243
    move-object p0, v0

    .line 244
    monitor-exit p1

    .line 245
    throw p0

    .line 246
    :pswitch_7
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Lqo8;

    .line 249
    .line 250
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast p0, Lgn2;

    .line 253
    .line 254
    check-cast p1, Ljava/lang/Long;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iget p1, v0, Lqo8;->e:F

    .line 260
    .line 261
    iput v5, v0, Lqo8;->e:F

    .line 262
    .line 263
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    sget-object p0, Ldn8;->a:Ldn8;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_8
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Lce8;

    .line 276
    .line 277
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast p0, Lyd8;

    .line 280
    .line 281
    check-cast p1, Leq1;

    .line 282
    .line 283
    iget-object p1, v0, Lce8;->j:Lvd7;

    .line 284
    .line 285
    invoke-virtual {p1, p0}, Lvd7;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    new-instance p1, Lp00;

    .line 289
    .line 290
    const/4 v1, 0x7

    .line 291
    invoke-direct {p1, v0, p0, v1}, Lp00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 292
    .line 293
    .line 294
    return-object p1

    .line 295
    :pswitch_9
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Lce8;

    .line 298
    .line 299
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p0, Lsd8;

    .line 302
    .line 303
    check-cast p1, Leq1;

    .line 304
    .line 305
    new-instance p1, Lp00;

    .line 306
    .line 307
    const/4 v1, 0x6

    .line 308
    invoke-direct {p1, v0, p0, v1}, Lp00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 309
    .line 310
    .line 311
    return-object p1

    .line 312
    :pswitch_a
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Lce8;

    .line 315
    .line 316
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast p0, Lce8;

    .line 319
    .line 320
    check-cast p1, Leq1;

    .line 321
    .line 322
    iget-object p1, v0, Lce8;->k:Lvd7;

    .line 323
    .line 324
    invoke-virtual {p1, p0}, Lvd7;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    new-instance p1, Lp00;

    .line 328
    .line 329
    const/4 v1, 0x5

    .line 330
    invoke-direct {p1, v0, p0, v1}, Lp00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 331
    .line 332
    .line 333
    return-object p1

    .line 334
    :pswitch_b
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v0, Lb71;

    .line 337
    .line 338
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast p0, Lce8;

    .line 341
    .line 342
    check-cast p1, Leq1;

    .line 343
    .line 344
    sget-object p1, Le71;->f0:Le71;

    .line 345
    .line 346
    new-instance v1, Lrh7;

    .line 347
    .line 348
    invoke-direct {v1, p0, v7}, Lrh7;-><init>(Lce8;Lq51;)V

    .line 349
    .line 350
    .line 351
    invoke-static {v0, v7, p1, v1, v8}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 352
    .line 353
    .line 354
    new-instance p0, Lzf;

    .line 355
    .line 356
    invoke-direct {p0, v8}, Lzf;-><init>(B)V

    .line 357
    .line 358
    .line 359
    return-object p0

    .line 360
    :pswitch_c
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Lrs4;

    .line 363
    .line 364
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast p0, Luh3;

    .line 367
    .line 368
    invoke-virtual {p0, p1}, Luh3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-virtual {v0, p0}, Lqc4;->j(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    sget-object p0, Ldn8;->a:Ldn8;

    .line 376
    .line 377
    return-object p0

    .line 378
    :pswitch_d
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Lb88;

    .line 381
    .line 382
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast p0, Lpl;

    .line 385
    .line 386
    check-cast p1, Lpk6;

    .line 387
    .line 388
    iget-object v1, v0, Lb88;->b:Lql;

    .line 389
    .line 390
    iget-object v0, v0, Lb88;->a:Lrh5;

    .line 391
    .line 392
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    check-cast v6, Lx78;

    .line 397
    .line 398
    if-eqz v6, :cond_0

    .line 399
    .line 400
    iget-object v6, v6, Lx78;->a:Lw78;

    .line 401
    .line 402
    iget-object v6, v6, Lw78;->a:Lql;

    .line 403
    .line 404
    goto :goto_0

    .line 405
    :cond_0
    move-object v6, v7

    .line 406
    :goto_0
    invoke-static {v1, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-nez v1, :cond_2

    .line 411
    .line 412
    :cond_1
    :goto_1
    move-object v9, v7

    .line 413
    goto :goto_2

    .line 414
    :cond_2
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v0, Lx78;

    .line 419
    .line 420
    if-eqz v0, :cond_1

    .line 421
    .line 422
    iget-object v1, v0, Lx78;->b:Lbz4;

    .line 423
    .line 424
    invoke-static {p0, v0}, Lb88;->c(Lpl;Lx78;)Lpl;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    if-nez p0, :cond_3

    .line 429
    .line 430
    goto :goto_1

    .line 431
    :cond_3
    iget v6, p0, Lpl;->c:I

    .line 432
    .line 433
    iget p0, p0, Lpl;->b:I

    .line 434
    .line 435
    invoke-virtual {v0, p0, v6}, Lx78;->j(II)Llf;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    invoke-virtual {v0, p0}, Lx78;->b(I)Ls86;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    sub-int/2addr v6, v8

    .line 444
    invoke-virtual {v0, v6}, Lx78;->b(I)Ls86;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v1, p0}, Lbz4;->c(I)I

    .line 449
    .line 450
    .line 451
    move-result p0

    .line 452
    invoke-virtual {v1, v6}, Lbz4;->c(I)I

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-ne p0, v1, :cond_4

    .line 457
    .line 458
    iget p0, v0, Ls86;->a:F

    .line 459
    .line 460
    iget v0, v10, Ls86;->a:F

    .line 461
    .line 462
    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    .line 463
    .line 464
    .line 465
    move-result v5

    .line 466
    :cond_4
    iget p0, v10, Ls86;->b:F

    .line 467
    .line 468
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    int-to-long v0, v0

    .line 473
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 474
    .line 475
    .line 476
    move-result p0

    .line 477
    int-to-long v5, p0

    .line 478
    shl-long/2addr v0, v4

    .line 479
    and-long/2addr v2, v5

    .line 480
    or-long/2addr v0, v2

    .line 481
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    xor-long/2addr v0, v2

    .line 487
    invoke-virtual {v9, v0, v1}, Llf;->h(J)V

    .line 488
    .line 489
    .line 490
    :goto_2
    if-eqz v9, :cond_5

    .line 491
    .line 492
    new-instance v7, La88;

    .line 493
    .line 494
    invoke-direct {v7, v9}, La88;-><init>(Llf;)V

    .line 495
    .line 496
    .line 497
    :cond_5
    if-eqz v7, :cond_6

    .line 498
    .line 499
    invoke-virtual {p1, v7}, Lpk6;->k(Lx67;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {p1, v8}, Lpk6;->d(Z)V

    .line 503
    .line 504
    .line 505
    :cond_6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 506
    .line 507
    return-object p0

    .line 508
    :pswitch_e
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v0, Lpl;

    .line 511
    .line 512
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast p0, Lqa4;

    .line 515
    .line 516
    iget-object p0, p0, Lqa4;->b:Loh5;

    .line 517
    .line 518
    check-cast p1, Lw28;

    .line 519
    .line 520
    iget-object v2, v0, Lpl;->a:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v2, Lpa4;

    .line 523
    .line 524
    invoke-virtual {v2}, Lpa4;->a()Lc88;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    if-eqz v3, :cond_7

    .line 529
    .line 530
    iget-object v3, v3, Lc88;->a:Lqe7;

    .line 531
    .line 532
    goto :goto_3

    .line 533
    :cond_7
    move-object v3, v7

    .line 534
    :goto_3
    invoke-virtual {p0}, Loh5;->l()I

    .line 535
    .line 536
    .line 537
    move-result v4

    .line 538
    and-int/2addr v4, v8

    .line 539
    if-eqz v4, :cond_8

    .line 540
    .line 541
    invoke-virtual {v2}, Lpa4;->a()Lc88;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    if-eqz v4, :cond_8

    .line 546
    .line 547
    iget-object v4, v4, Lc88;->b:Lqe7;

    .line 548
    .line 549
    goto :goto_4

    .line 550
    :cond_8
    move-object v4, v7

    .line 551
    :goto_4
    if-eqz v3, :cond_9

    .line 552
    .line 553
    invoke-virtual {v3, v4}, Lqe7;->c(Lqe7;)Lqe7;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    :cond_9
    invoke-virtual {p0}, Loh5;->l()I

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    and-int/2addr v3, v6

    .line 562
    if-eqz v3, :cond_a

    .line 563
    .line 564
    invoke-virtual {v2}, Lpa4;->a()Lc88;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    if-eqz v3, :cond_a

    .line 569
    .line 570
    iget-object v3, v3, Lc88;->c:Lqe7;

    .line 571
    .line 572
    goto :goto_5

    .line 573
    :cond_a
    move-object v3, v7

    .line 574
    :goto_5
    if-eqz v4, :cond_b

    .line 575
    .line 576
    invoke-virtual {v4, v3}, Lqe7;->c(Lqe7;)Lqe7;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    :cond_b
    invoke-virtual {p0}, Loh5;->l()I

    .line 581
    .line 582
    .line 583
    move-result p0

    .line 584
    and-int/lit8 p0, p0, 0x4

    .line 585
    .line 586
    if-eqz p0, :cond_c

    .line 587
    .line 588
    invoke-virtual {v2}, Lpa4;->a()Lc88;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    if-eqz p0, :cond_c

    .line 593
    .line 594
    iget-object v7, p0, Lc88;->d:Lqe7;

    .line 595
    .line 596
    :cond_c
    if-eqz v3, :cond_d

    .line 597
    .line 598
    invoke-virtual {v3, v7}, Lqe7;->c(Lqe7;)Lqe7;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    :cond_d
    new-instance p0, Laa6;

    .line 603
    .line 604
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 605
    .line 606
    .line 607
    iget-object v2, p1, Lw28;->a:Lql;

    .line 608
    .line 609
    new-instance v3, Lv28;

    .line 610
    .line 611
    invoke-direct {v3, p0, v0, v7, v1}, Lv28;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v3}, Lql;->b(Lgn2;)Lql;

    .line 615
    .line 616
    .line 617
    move-result-object p0

    .line 618
    iput-object p0, p1, Lw28;->b:Lql;

    .line 619
    .line 620
    sget-object p0, Ldn8;->a:Ldn8;

    .line 621
    .line 622
    return-object p0

    .line 623
    :pswitch_f
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v0, Llh7;

    .line 626
    .line 627
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast p0, Ly05;

    .line 630
    .line 631
    check-cast p1, Lua7;

    .line 632
    .line 633
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    check-cast v0, Ljava/lang/Number;

    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    iget-wide v5, p1, Lua7;->a:J

    .line 644
    .line 645
    shr-long/2addr v5, v4

    .line 646
    long-to-int v1, v5

    .line 647
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    mul-float/2addr v1, v0

    .line 652
    iget-wide v5, p1, Lua7;->a:J

    .line 653
    .line 654
    and-long/2addr v5, v2

    .line 655
    long-to-int p1, v5

    .line 656
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 657
    .line 658
    .line 659
    move-result p1

    .line 660
    mul-float/2addr p1, v0

    .line 661
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    check-cast v0, Lua7;

    .line 666
    .line 667
    iget-wide v5, v0, Lua7;->a:J

    .line 668
    .line 669
    shr-long/2addr v5, v4

    .line 670
    long-to-int v0, v5

    .line 671
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    cmpg-float v0, v0, v1

    .line 676
    .line 677
    if-nez v0, :cond_e

    .line 678
    .line 679
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    check-cast v0, Lua7;

    .line 684
    .line 685
    iget-wide v5, v0, Lua7;->a:J

    .line 686
    .line 687
    and-long/2addr v5, v2

    .line 688
    long-to-int v0, v5

    .line 689
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    cmpg-float v0, v0, p1

    .line 694
    .line 695
    if-nez v0, :cond_e

    .line 696
    .line 697
    goto :goto_6

    .line 698
    :cond_e
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    int-to-long v0, v0

    .line 703
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 704
    .line 705
    .line 706
    move-result p1

    .line 707
    int-to-long v5, p1

    .line 708
    shl-long/2addr v0, v4

    .line 709
    and-long/2addr v2, v5

    .line 710
    or-long/2addr v0, v2

    .line 711
    new-instance p1, Lua7;

    .line 712
    .line 713
    invoke-direct {p1, v0, v1}, Lua7;-><init>(J)V

    .line 714
    .line 715
    .line 716
    invoke-interface {p0, p1}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    :goto_6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 720
    .line 721
    return-object p0

    .line 722
    :pswitch_10
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v0, Lmb6;

    .line 725
    .line 726
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast p0, La58;

    .line 729
    .line 730
    check-cast p1, Lsv1;

    .line 731
    .line 732
    invoke-virtual {p0}, La58;->a()J

    .line 733
    .line 734
    .line 735
    move-result-wide v1

    .line 736
    invoke-static {p1, v0, v1, v2}, Lx97;->u(Lsv1;Lmb6;J)V

    .line 737
    .line 738
    .line 739
    sget-object p0, Ldn8;->a:Ldn8;

    .line 740
    .line 741
    return-object p0

    .line 742
    :pswitch_11
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v0, Lx67;

    .line 745
    .line 746
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast p0, La58;

    .line 749
    .line 750
    check-cast p1, Ljc0;

    .line 751
    .line 752
    iget-object v1, p1, Ljc0;->X:Lea0;

    .line 753
    .line 754
    invoke-interface {v1}, Lea0;->e()J

    .line 755
    .line 756
    .line 757
    move-result-wide v1

    .line 758
    iget-object v3, p1, Ljc0;->X:Lea0;

    .line 759
    .line 760
    invoke-interface {v3}, Lea0;->getLayoutDirection()Lz24;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    invoke-interface {v0, v1, v2, v3, p1}, Lx67;->a(JLz24;Lfi1;)Lmb6;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    new-instance v1, Lgq6;

    .line 769
    .line 770
    const/16 v2, 0xc

    .line 771
    .line 772
    invoke-direct {v1, v0, p0, v2}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 773
    .line 774
    .line 775
    new-instance p0, Ly0;

    .line 776
    .line 777
    const/16 v0, 0xe

    .line 778
    .line 779
    invoke-direct {p0, v1, v0}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {p1, p0}, Ljc0;->a(Lgn2;)Lvk1;

    .line 783
    .line 784
    .line 785
    move-result-object p0

    .line 786
    return-object p0

    .line 787
    :pswitch_12
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v0, Ll08;

    .line 790
    .line 791
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast p0, Lj08;

    .line 794
    .line 795
    check-cast p1, Lqr6;

    .line 796
    .line 797
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    iget-object v0, v0, Ll08;->b:Loi1;

    .line 801
    .line 802
    invoke-virtual {v0, p1, p0}, Lz91;->H(Lqr6;Ljava/lang/Object;)V

    .line 803
    .line 804
    .line 805
    sget-object p0, Ldn8;->a:Ldn8;

    .line 806
    .line 807
    return-object p0

    .line 808
    :pswitch_13
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v0, Ljava/lang/String;

    .line 811
    .line 812
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast p0, Laa6;

    .line 815
    .line 816
    check-cast p1, Ljava/io/PrintWriter;

    .line 817
    .line 818
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    iget-boolean p0, p0, Laa6;->X:Z

    .line 823
    .line 824
    if-eqz p0, :cond_f

    .line 825
    .line 826
    const-string p0, "update"

    .line 827
    .line 828
    goto :goto_7

    .line 829
    :cond_f
    const-string p0, "set"

    .line 830
    .line 831
    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 832
    .line 833
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    const-string v1, " Front ["

    .line 840
    .line 841
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    const-string v0, "] "

    .line 848
    .line 849
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    const-string p0, " to NEW_VALUE"

    .line 856
    .line 857
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object p0

    .line 864
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    sget-object p0, Ldn8;->a:Ldn8;

    .line 868
    .line 869
    return-object p0

    .line 870
    :pswitch_14
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v0, Lqn7;

    .line 873
    .line 874
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast p0, Lgn2;

    .line 877
    .line 878
    check-cast p1, Ljava/lang/Boolean;

    .line 879
    .line 880
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 881
    .line 882
    .line 883
    move-result p1

    .line 884
    iget-object v0, v0, Lqn7;->f:Lb83;

    .line 885
    .line 886
    if-eqz v0, :cond_10

    .line 887
    .line 888
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 889
    .line 890
    .line 891
    move-result v0

    .line 892
    xor-int/2addr v0, v8

    .line 893
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 894
    .line 895
    .line 896
    move-result-object v7

    .line 897
    :cond_10
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 898
    .line 899
    invoke-static {v7, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v0

    .line 903
    if-eqz v0, :cond_11

    .line 904
    .line 905
    if-nez p1, :cond_11

    .line 906
    .line 907
    goto :goto_8

    .line 908
    :cond_11
    move v8, v1

    .line 909
    :goto_8
    new-instance p1, Lwo7;

    .line 910
    .line 911
    invoke-direct {p1, v1}, Lwo7;-><init>(Z)V

    .line 912
    .line 913
    .line 914
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 918
    .line 919
    .line 920
    move-result-object p0

    .line 921
    return-object p0

    .line 922
    :pswitch_15
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v0, Ljava/util/HashMap;

    .line 925
    .line 926
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast p0, Laj0;

    .line 929
    .line 930
    check-cast p1, Lhq8;

    .line 931
    .line 932
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    if-eqz v0, :cond_12

    .line 940
    .line 941
    check-cast v0, Lpl0;

    .line 942
    .line 943
    iget-object v1, v0, Lpl0;->a:Ler8;

    .line 944
    .line 945
    iget-object v0, v0, Lpl0;->b:Ler8;

    .line 946
    .line 947
    invoke-virtual {p1, p0, v1, v0}, Lhq8;->p(Laj0;Ler8;Ler8;)Ler8;

    .line 948
    .line 949
    .line 950
    move-result-object v7

    .line 951
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    goto :goto_9

    .line 955
    :cond_12
    const-string p0, "Required value was null."

    .line 956
    .line 957
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    :goto_9
    return-object v7

    .line 961
    :pswitch_16
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v0, Ljava/lang/Boolean;

    .line 964
    .line 965
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast p0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 968
    .line 969
    check-cast p1, Ljava/io/PrintWriter;

    .line 970
    .line 971
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 972
    .line 973
    .line 974
    move-result-object v1

    .line 975
    if-eqz p0, :cond_13

    .line 976
    .line 977
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->S()Z

    .line 978
    .line 979
    .line 980
    move-result p0

    .line 981
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 982
    .line 983
    .line 984
    move-result-object v7

    .line 985
    :cond_13
    new-instance p0, Ljava/lang/StringBuilder;

    .line 986
    .line 987
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 988
    .line 989
    .line 990
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    const-string v1, " Prepare to handle reset: "

    .line 994
    .line 995
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    const-string v0, ", "

    .line 1002
    .line 1003
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object p0

    .line 1013
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1017
    .line 1018
    return-object p0

    .line 1019
    :pswitch_17
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v0, Lsu/happ/proxyutility/dto/MetaParams;

    .line 1022
    .line 1023
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 1024
    .line 1025
    check-cast p0, Ljava/lang/String;

    .line 1026
    .line 1027
    move-object v1, p1

    .line 1028
    check-cast v1, Lqs7;

    .line 1029
    .line 1030
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->t0()Ljava/lang/Integer;

    .line 1034
    .line 1035
    .line 1036
    move-result-object p1

    .line 1037
    if-nez p1, :cond_14

    .line 1038
    .line 1039
    iget-object v2, v1, Lqs7;->a:Lis7;

    .line 1040
    .line 1041
    const/4 v7, 0x0

    .line 1042
    const/16 v8, 0x1d

    .line 1043
    .line 1044
    const/4 v3, 0x0

    .line 1045
    const/4 v4, 0x0

    .line 1046
    const/4 v5, 0x0

    .line 1047
    const/4 v6, 0x0

    .line 1048
    invoke-static/range {v2 .. v8}, Lis7;->a(Lis7;ZZIIZI)Lis7;

    .line 1049
    .line 1050
    .line 1051
    move-result-object p0

    .line 1052
    :goto_a
    move-object v2, p0

    .line 1053
    goto :goto_b

    .line 1054
    :cond_14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1055
    .line 1056
    .line 1057
    move-result v0

    .line 1058
    if-nez v0, :cond_15

    .line 1059
    .line 1060
    invoke-static {p0}, Lev7;->a(Ljava/lang/String;)V

    .line 1061
    .line 1062
    .line 1063
    iget-object v2, v1, Lqs7;->a:Lis7;

    .line 1064
    .line 1065
    const/4 v7, 0x0

    .line 1066
    const/16 v8, 0x1c

    .line 1067
    .line 1068
    const/4 v3, 0x0

    .line 1069
    const/4 v4, 0x0

    .line 1070
    const/4 v5, 0x0

    .line 1071
    const/4 v6, 0x0

    .line 1072
    invoke-static/range {v2 .. v8}, Lis7;->a(Lis7;ZZIIZI)Lis7;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p0

    .line 1076
    goto :goto_a

    .line 1077
    :cond_15
    sget-object v0, Lqs7;->Companion:Ljs7;

    .line 1078
    .line 1079
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1080
    .line 1081
    .line 1082
    sget-object v0, Lqs7;->l:Lkf3;

    .line 1083
    .line 1084
    iget v2, v0, Lif3;->X:I

    .line 1085
    .line 1086
    iget v0, v0, Lif3;->Y:I

    .line 1087
    .line 1088
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1089
    .line 1090
    .line 1091
    move-result v3

    .line 1092
    if-gt v2, v3, :cond_16

    .line 1093
    .line 1094
    if-gt v3, v0, :cond_16

    .line 1095
    .line 1096
    sget-object v0, Lev7;->a:Lvz7;

    .line 1097
    .line 1098
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1099
    .line 1100
    .line 1101
    move-result v0

    .line 1102
    invoke-static {v0, p0}, Lev7;->b(ILjava/lang/String;)V

    .line 1103
    .line 1104
    .line 1105
    iget-object v2, v1, Lqs7;->a:Lis7;

    .line 1106
    .line 1107
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1108
    .line 1109
    .line 1110
    move-result v5

    .line 1111
    const/4 v7, 0x0

    .line 1112
    const/16 v8, 0x18

    .line 1113
    .line 1114
    const/4 v3, 0x1

    .line 1115
    const/4 v4, 0x1

    .line 1116
    const/4 v6, 0x0

    .line 1117
    invoke-static/range {v2 .. v8}, Lis7;->a(Lis7;ZZIIZI)Lis7;

    .line 1118
    .line 1119
    .line 1120
    move-result-object p0

    .line 1121
    goto :goto_a

    .line 1122
    :cond_16
    iget-object v2, v1, Lqs7;->a:Lis7;

    .line 1123
    .line 1124
    const/4 v7, 0x0

    .line 1125
    const/16 v8, 0x1d

    .line 1126
    .line 1127
    const/4 v3, 0x0

    .line 1128
    const/4 v4, 0x0

    .line 1129
    const/4 v5, 0x0

    .line 1130
    const/4 v6, 0x0

    .line 1131
    invoke-static/range {v2 .. v8}, Lis7;->a(Lis7;ZZIIZI)Lis7;

    .line 1132
    .line 1133
    .line 1134
    move-result-object p0

    .line 1135
    goto :goto_a

    .line 1136
    :goto_b
    const/4 v11, 0x0

    .line 1137
    const/16 v12, 0x3fe

    .line 1138
    .line 1139
    const/4 v3, 0x0

    .line 1140
    const/4 v4, 0x0

    .line 1141
    const/4 v5, 0x0

    .line 1142
    const/4 v6, 0x0

    .line 1143
    const/4 v7, 0x0

    .line 1144
    const/4 v8, 0x0

    .line 1145
    const/4 v9, 0x0

    .line 1146
    const/4 v10, 0x0

    .line 1147
    invoke-static/range {v1 .. v12}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 1148
    .line 1149
    .line 1150
    move-result-object p0

    .line 1151
    return-object p0

    .line 1152
    :pswitch_18
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v0, Ljava/util/List;

    .line 1155
    .line 1156
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast p0, Lkh7;

    .line 1159
    .line 1160
    check-cast p1, Ljava/lang/Throwable;

    .line 1161
    .line 1162
    if-eqz p1, :cond_17

    .line 1163
    .line 1164
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1169
    .line 1170
    .line 1171
    move-result v2

    .line 1172
    if-eqz v2, :cond_18

    .line 1173
    .line 1174
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v2

    .line 1178
    check-cast v2, Lux0;

    .line 1179
    .line 1180
    invoke-virtual {v2, p1}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 1181
    .line 1182
    .line 1183
    goto :goto_c

    .line 1184
    :cond_17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1185
    .line 1186
    .line 1187
    move-result-object p1

    .line 1188
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1189
    .line 1190
    .line 1191
    move-result v1

    .line 1192
    if-eqz v1, :cond_18

    .line 1193
    .line 1194
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v1

    .line 1198
    check-cast v1, Lux0;

    .line 1199
    .line 1200
    sget-object v2, Ldn8;->a:Ldn8;

    .line 1201
    .line 1202
    invoke-virtual {v1, v2}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 1203
    .line 1204
    .line 1205
    goto :goto_d

    .line 1206
    :cond_18
    iget-object p1, p0, Lkh7;->d:Ljava/lang/Object;

    .line 1207
    .line 1208
    monitor-enter p1

    .line 1209
    :try_start_3
    iget-object p0, p0, Lkh7;->f:Ljava/util/ArrayList;

    .line 1210
    .line 1211
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1212
    .line 1213
    .line 1214
    monitor-exit p1

    .line 1215
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1216
    .line 1217
    return-object p0

    .line 1218
    :catchall_3
    move-exception v0

    .line 1219
    move-object p0, v0

    .line 1220
    monitor-exit p1

    .line 1221
    throw p0

    .line 1222
    :pswitch_19
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 1223
    .line 1224
    move-object v2, v0

    .line 1225
    check-cast v2, Leo5;

    .line 1226
    .line 1227
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 1228
    .line 1229
    check-cast p0, Lr97;

    .line 1230
    .line 1231
    move-object v1, p1

    .line 1232
    check-cast v1, Ldo5;

    .line 1233
    .line 1234
    iget-object v5, p0, Lr97;->K0:Lt16;

    .line 1235
    .line 1236
    const/4 v6, 0x4

    .line 1237
    const/4 v3, 0x0

    .line 1238
    const/4 v4, 0x0

    .line 1239
    invoke-static/range {v1 .. v6}, Ldo5;->k(Ldo5;Leo5;IILgn2;I)V

    .line 1240
    .line 1241
    .line 1242
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1243
    .line 1244
    return-object p0

    .line 1245
    :pswitch_1a
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 1246
    .line 1247
    check-cast v0, Lry6;

    .line 1248
    .line 1249
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 1250
    .line 1251
    check-cast p0, Lsy6;

    .line 1252
    .line 1253
    check-cast p1, Lfu1;

    .line 1254
    .line 1255
    iget-boolean v1, p1, Lfu1;->b:Z

    .line 1256
    .line 1257
    if-eqz v1, :cond_19

    .line 1258
    .line 1259
    const/high16 v1, -0x40800000    # -1.0f

    .line 1260
    .line 1261
    goto :goto_e

    .line 1262
    :cond_19
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1263
    .line 1264
    :goto_e
    iget-wide v2, p1, Lfu1;->a:J

    .line 1265
    .line 1266
    iget-object p0, p0, Lsy6;->d:Lsd5;

    .line 1267
    .line 1268
    sget-object p1, Lsd5;->Y:Lsd5;

    .line 1269
    .line 1270
    if-ne p0, p1, :cond_1a

    .line 1271
    .line 1272
    invoke-static {v5, v8, v2, v3}, Lz85;->a(FIJ)J

    .line 1273
    .line 1274
    .line 1275
    move-result-wide p0

    .line 1276
    goto :goto_f

    .line 1277
    :cond_1a
    invoke-static {v5, v6, v2, v3}, Lz85;->a(FIJ)J

    .line 1278
    .line 1279
    .line 1280
    move-result-wide p0

    .line 1281
    :goto_f
    invoke-static {v1, p0, p1}, Lz85;->g(FJ)J

    .line 1282
    .line 1283
    .line 1284
    move-result-wide p0

    .line 1285
    invoke-virtual {v0, v8, p0, p1}, Lry6;->a(IJ)J

    .line 1286
    .line 1287
    .line 1288
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1289
    .line 1290
    return-object p0

    .line 1291
    :pswitch_1b
    iget-object v0, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 1292
    .line 1293
    check-cast v0, Le15;

    .line 1294
    .line 1295
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 1296
    .line 1297
    check-cast p0, Lv09;

    .line 1298
    .line 1299
    check-cast p1, Lv09;

    .line 1300
    .line 1301
    new-instance v1, Lq42;

    .line 1302
    .line 1303
    invoke-direct {v1, p0, p1}, Lq42;-><init>(Lv09;Lv09;)V

    .line 1304
    .line 1305
    .line 1306
    iget-object p0, v0, Le15;->a:Lrh5;

    .line 1307
    .line 1308
    invoke-virtual {p0, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 1309
    .line 1310
    .line 1311
    sget-object p0, Ldn8;->a:Ldn8;

    .line 1312
    .line 1313
    return-object p0

    .line 1314
    :pswitch_1c
    sget-object v0, Lmr2;->Z:Lmr2;

    .line 1315
    .line 1316
    sget-object v1, Lmr2;->Y:Lmr2;

    .line 1317
    .line 1318
    iget-object v2, p0, Lgq6;->Y:Ljava/lang/Object;

    .line 1319
    .line 1320
    check-cast v2, Liq6;

    .line 1321
    .line 1322
    iget-object p0, p0, Lgq6;->Z:Ljava/lang/Object;

    .line 1323
    .line 1324
    check-cast p0, Ljava/util/Map;

    .line 1325
    .line 1326
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 1327
    .line 1328
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    iget-object v2, v2, Liq6;->d:Lh76;

    .line 1332
    .line 1333
    iget-object v2, v2, Lh76;->X:Loh7;

    .line 1334
    .line 1335
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v2

    .line 1339
    check-cast v2, Lfq6;

    .line 1340
    .line 1341
    iget-object v2, v2, Lfq6;->Z:Lsu/happ/proxyutility/dto/enums/ERoutingSettingsType;

    .line 1342
    .line 1343
    sget-object v3, Lhq6;->a:[I

    .line 1344
    .line 1345
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1346
    .line 1347
    .line 1348
    move-result v2

    .line 1349
    aget v2, v3, v2

    .line 1350
    .line 1351
    if-eq v2, v8, :cond_20

    .line 1352
    .line 1353
    if-eq v2, v6, :cond_1e

    .line 1354
    .line 1355
    const/4 v3, 0x3

    .line 1356
    if-ne v2, v3, :cond_1d

    .line 1357
    .line 1358
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v1

    .line 1362
    check-cast v1, Ljava/util/List;

    .line 1363
    .line 1364
    if-eqz v1, :cond_1b

    .line 1365
    .line 1366
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v2

    .line 1370
    invoke-virtual {v2, v1}, Lsu/happ/proxyutility/dto/RouteSettings;->D(Ljava/util/List;)V

    .line 1371
    .line 1372
    .line 1373
    :cond_1b
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1374
    .line 1375
    .line 1376
    move-result-object p0

    .line 1377
    check-cast p0, Ljava/util/List;

    .line 1378
    .line 1379
    if-eqz p0, :cond_1c

    .line 1380
    .line 1381
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v0

    .line 1385
    invoke-virtual {v0, p0}, Lsu/happ/proxyutility/dto/RouteSettings;->C(Ljava/util/List;)V

    .line 1386
    .line 1387
    .line 1388
    :cond_1c
    :goto_10
    move-object v7, p1

    .line 1389
    goto :goto_11

    .line 1390
    :cond_1d
    invoke-static {}, Lb61;->c()V

    .line 1391
    .line 1392
    .line 1393
    goto :goto_11

    .line 1394
    :cond_1e
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v1

    .line 1398
    check-cast v1, Ljava/util/List;

    .line 1399
    .line 1400
    if-eqz v1, :cond_1f

    .line 1401
    .line 1402
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v2

    .line 1406
    invoke-virtual {v2, v1}, Lsu/happ/proxyutility/dto/RouteSettings;->F(Ljava/util/List;)V

    .line 1407
    .line 1408
    .line 1409
    :cond_1f
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    move-result-object p0

    .line 1413
    check-cast p0, Ljava/util/List;

    .line 1414
    .line 1415
    if-eqz p0, :cond_1c

    .line 1416
    .line 1417
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    invoke-virtual {v0, p0}, Lsu/happ/proxyutility/dto/RouteSettings;->E(Ljava/util/List;)V

    .line 1422
    .line 1423
    .line 1424
    goto :goto_10

    .line 1425
    :cond_20
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    check-cast v1, Ljava/util/List;

    .line 1430
    .line 1431
    if-eqz v1, :cond_21

    .line 1432
    .line 1433
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v2

    .line 1437
    invoke-virtual {v2, v1}, Lsu/happ/proxyutility/dto/RouteSettings;->S(Ljava/util/List;)V

    .line 1438
    .line 1439
    .line 1440
    :cond_21
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1441
    .line 1442
    .line 1443
    move-result-object p0

    .line 1444
    check-cast p0, Ljava/util/List;

    .line 1445
    .line 1446
    if-eqz p0, :cond_1c

    .line 1447
    .line 1448
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v0

    .line 1452
    invoke-virtual {v0, p0}, Lsu/happ/proxyutility/dto/RouteSettings;->R(Ljava/util/List;)V

    .line 1453
    .line 1454
    .line 1455
    goto :goto_10

    .line 1456
    :goto_11
    return-object v7

    .line 1457
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
